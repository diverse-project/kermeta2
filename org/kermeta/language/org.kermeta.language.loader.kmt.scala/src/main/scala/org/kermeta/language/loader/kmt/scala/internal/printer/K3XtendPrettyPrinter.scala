package org.kermeta.language.loader.kmt.scala.internal.printer

import scala.collection.JavaConversions.asScalaBuffer
import scala.io.Source
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.kermeta.language.behavior._
import org.kermeta.language.structure._
import org.kermeta.language.util.ModelingUnit
import org.kermeta.language.loader.kmt.scala.internal.lexer.KMLexer
import org.kermeta.language.loader.kmt.scala.internal.parser.KParser

object K3XtendPrettyPrinter {

  def main(args: Array[String]): Unit = {

    var res = new StringBuffer
    //print(loadKM("/home/barais/workspaces/compiloV2/org.kermeta.language.loader.kmt.scala/parsed.km"), res)
    //println(res.toString)

    var inputFileName = "sample.kmt"
    if (args.length > 0 && args(0) != null) {
      inputFileName = args(0)
    }
    val inputFile = new java.io.File(inputFileName)
    val outputFile = new java.io.File(inputFileName + ".xtend")

    val input = Source.fromFile(inputFile).getLines().reduceLeft[String](_ + '\n' + _)

    val parser = new KParser()

    val result = parser.parse(input)

    result match {

      case Some(_@ res) => {

        val buffer = new StringBuffer()
        K3XtendPrettyPrinter.print(res, buffer)
        println(buffer.toString)

        val pw = new java.io.PrintWriter(outputFile)
        try {
          pw.write(buffer.toString)
        } finally {
          pw.close()
        }

      }
      case None => println(parser.lastNoSucess)
    }

  }

  def loadKM(fileName: String): ModelingUnit = {
    var rs = new ResourceSetImpl()
    var f = rs.getResourceFactoryRegistry()
    var m = f.getExtensionToFactoryMap()
    m.put("km", new XMIResourceFactoryImpl())
    //    rs.getPackageRegistry().put(KmPackage.eNS_URI, KmPackage.eINSTANCE);
    var uri = URI.createFileURI(fileName)
    var resource = rs.getResource(uri, true)
    var mu: ModelingUnit = null;
    if (resource.isLoaded() && resource.getContents().size() > 0) {
      mu = resource.getContents().get(0).asInstanceOf[ModelingUnit]
    }
    return mu;
  }

  /**
   * full pretty printer
   */
  def print(mu: ModelingUnit, res: java.lang.StringBuffer): Unit = {
    mu.getMetamodels.foreach { mm =>
      print(mm, res)
    }
  }
  def print(o: EObject, res: java.lang.StringBuffer): Unit = {
    o match {
      case mm: Metamodel => {
        res.append("//metamodel " + mm.getName() + "\n")
        mm.getPackages().foreach(p => print(p, res))
        mm.getReferencedMetamodels().foreach(muRef => print(muRef, res))
        //res.append("\n}\n")
      }
      /*case m: ModelingUnit => {
        m.getPackages.foreach(p => print(p, res))
        m.getOwnedTypeDefinition.foreach(p => print(p, res))
      }*/
      case p: Package => {
        p.getKOwnedTags.foreach { tag =>
          print(tag, res)
        }
        res.append("package " + p.getName() + " \n")

        res.append("import fr.inria.triskell.k3.Aspect")

        p.getNestedPackage.foreach(e => print(e, res))
        p.getOwnedTypeDefinition.foreach(e => print(e, res))
        res.append("\n//------ end of package " + p.getName() + " ------\n")
      }
      case pt: PrimitiveType => {
        pt.getKOwnedTags.foreach { tag =>
          res.append("\t")
          print(tag, res)
        }
        res.append("\t")
        res.append("alias " + pt.getName() + " : ")
        print(pt.getInstanceType, res)
        res.append("\n")
      }
      case c: Class => {
        if (c.getTypeDefinition().getName().equals("kermeta::standard::Void"))
          res.append("void")
        else
          res.append(c.getTypeDefinition().getName())
        if (!c.getTypeParamBinding().isEmpty()) {
          res.append("<")
          var i: Int = 0;
          c.getTypeParamBinding().foreach { tpb =>
            if (i == 0) {
              print(tpb, res)
            } else {
              res.append(", ")
              print(tpb, res)
            }
            i = i + 1
          }
          res.append(">")
        }
      }
      case c: ClassDefinition => {
        c.getKOwnedTags.foreach { tag =>
          res.append("\n\t")
          print(tag, res)
        }
        res.append("\n\t")
        if (c.getIsSingleton)
          res.append("@Singleton\n")
        if (c.getIsAspect) {
          res.append("@Aspect(className=typeof(" + c.getName() + "))\n\t")
          res.append("public ")
          if (c.getIsAbstract)
            res.append("abstract ")
          res.append("class " + c.getName() + "Aspect")
        } else {
          res.append("public ")
          if (c.getIsAbstract)
            res.append("abstract ")
          res.append("class " + c.getName())
        }
        //Generic parameters
        if (c.getTypeParameter.size() > 0) {
          res.append("<")
          var i: Int = 0;
          c.getTypeParameter.foreach { tp =>
            if (i == 0) {
              res.append(tp.getName)
            } else {
              res.append(", " + tp.getName)
            }
            tp.getSupertype match {
              case urt: UnresolvedType => res.append(" : " + urt.getTypeIdentifier)
              case (_) =>
            }
            i = i + 1
          }
          res.append(">")
        }

        for (i <- 0 until c.getSuperType().size()) {
          i match {
            case 0 => {
              res.append(" extends ")
              print(c.getSuperType().get(i), res)
            }
            case 1 => {
              res.append(" implements ")
              print(c.getSuperType().get(i), res)
            }
            case _ => {
              res.append(", ")
              print(c.getSuperType().get(i), res)
            }
          }

        }

        res.append(" {\n")
        //c.getTypeParameter.foreach{ tp => res.append("," + tp.getName)}
        c.getOwnedAttribute.foreach { att => print(att, res) }
        c.getOwnedOperation.foreach { op => print(op, res) }
        //TODO Generic
        //TODO Invariant
        res.append("\n\t}\n")
      }
      case p: Property => {
        p.getKOwnedTags.foreach { tag =>
          res.append("\t\t")
          print(tag, res)
        }
        if (p.getIsComposite)
          res.append("\n\t\t// attribute ")
        else {
          if (p.getIsDerived) {
            res.append("\n\t\t// property ")
          } else
            res.append("\n\t\t// reference ")
        }
        if (p.getIsReadOnly)
          res.append("readonly ")

        res.append(p.getName + " : ")
        printMultiplicityElementTypeType(p, res)

        // do the xtend now
        res.append("\n\t\tpublic ")
        printMultiplicityElementTypeType(p, res)
        res.append(" " + p.getName)
        //TODO opposite
        //TODO getter setter for derived
        res.append("\n")

        if (p.getIsDerived) {

          if (p.getGetterBody != null) {
            res.append("\t\t\t/* getter is ")
            res.append(print(p.getGetterBody, res))
            res.append("*/")
          }
          if (p.getSetterBody != null) {
            res.append("\t\t\t/* setter is ")
            res.append(print(p.getSetterBody, res))
            res.append("*/")
          }
        }

      }
      case op: Operation => {
        op.getKOwnedTags.foreach { tag =>
          res.append("\t\t")
          print(tag, res)
        }
        res.append("\n\t\tdef ")
        val sbReturnType = new StringBuffer
        printMultiplicityElementTypeType(op, sbReturnType)
        if (sbReturnType.toString().equals("kermeta::standard::Void"))
          res.append("void")
        else
          res.append(sbReturnType.toString)
        res.append(" " + op.getName)

        if (op.getTypeParameter.size() > 0) {
          res.append("<")
          var i = 0
          op.getTypeParameter.foreach(tp => {
            if (i != 0)
              res.append(", ")
            res.append(tp.getName)
            tp.getSupertype match {
              case urt: UnresolvedType => res.append(" : " + urt.getTypeIdentifier)
              case (_) =>
            }
            i = i + 1
          })
          res.append(">")
        }

        res.append("(")
        var i = 0
        op.getOwnedParameter.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        res.append(")")
        //TODO lower upper superoperation
        op.getPre.foreach(p => {
          res.append("\n\t\t\t/* pre " + p.getName + "is")
          print(p.getBody, res)
          res.append(" */")
        })
        op.getPost.foreach(p => {
          res.append("\n\t\t\t/* post " + p.getName + "is")
          print(p.getBody, res)
          res.append(" */")

        })
        //res.append("\n\t\t ")
        if (op.getIsAbstract != null && op.getIsAbstract)
          res.append("/* abstract */")
        else {
          printBlock(op.getBody.asInstanceOf[Block], res, !sbReturnType.toString().equals("kermeta::standard::Void"), sbReturnType.toString())
          //TODO pre post
        }
        //RaiseException
        res.append("\n")
      }

      case p: Parameter => {
        printMultiplicityElementTypeType(p, res)
        res.append(" " + p.getName)
      }
      case p: UnresolvedType => {
        res.append(p.getTypeIdentifier)
        if (p.getGenerics.size > 0)
          res.append("<")
        var i = 0
        p.getGenerics.foreach(g => {
          if (i != 0)
            res.append(", ")
          print(g, res)
          i = i + 1
        })
        if (p.getGenerics.size > 0)
          res.append(">")
      }

      case b: Block => {
        printBlock(b, res, false, "")
      }

      case v: VariableDecl => {
        res.append("var ")
        printMultiplicityElementTypeType(v.getType, res)
        res.append(" " + v.getIdentifier)
        if (v.getInitialization != null) {
          res.append(" = ")
          print(v.getInitialization, res)
        }
      }

      case c: Conditional => {
        res.append("if (")
        print(c.getCondition, res)
        res.append(")  \n")
        print(c.getThenBody, res)
        if (c.getElseBody != null) {
          res.append("\n\t\t\t else ")
          print(c.getElseBody, res)
        }
        // res.append("\n\t\t\t } \n")

      }

      case l: Loop => {
        if (l.getInitialization != null) {
          res.append("\t\t\t from ")
          print(l.getInitialization, res)
        }
        res.append(" \n\t\t\tuntil ")
        print(l.getStopCondition, res)
        res.append(" \n\t\t\tloop ")
        print(l.getBody, res)
        res.append(" \n\t\t\tend\n ")

      }

      case l: LambdaExpression => {
        res.append("{")
        var i = 0
        l.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        res.append("|")
        print(l.getBody, res)
        res.append("\t\t\t}")
      }
      case p: LambdaParameter => {
        res.append(p.getName)
        if (p.getType != null && !p.getType.isInstanceOf[UnresolvedInferredType]) {
          p.getType match {
            case tr: TypeReference => {
              tr.getType() match {
                case uit: UnresolvedInferredType => {}
                case _ => {
                  res.append(" : ")
                  print(p.getType, res)

                }
              }
            }
            case _ => {
              res.append(" : ")
              print(p.getType, res)

            }
          }
        }
      }
      case p: TypeReference => {
        if (!p.getType.isInstanceOf[UnresolvedInferredType])
          print(p.getType, res)
      }

      case i: IntegerLiteral => {
        res.append(i.getValue)
      }
      case i: StringLiteral => {
        var lit = i.getValue.replaceAll("\\\\", "\\\\\\\\")
        lit = lit.replaceAll("\n", "\\\\n")
        lit = lit.replaceAll("\t", "\\\\t")
        lit = lit.replaceAll("\r", "\\\\r")
        lit = lit.replaceAll("\f", "\\\\f")
        lit = lit.replaceAll("\"", "\\\\\"")
        lit = lit.replaceAll("\'", "\\\\\'")
        res.append("\"" + lit + "\"")
      }
      case i: BooleanLiteral => {
        res.append(i.getValue)
      }

      case i: VoidLiteral => {
        res.append("void")

      }
      case f: FunctionType => {
        res.append("<")

        print(f.getLeft, res)
        res.append("->")
        print(f.getRight, res)

        res.append(">")
      }

      case u: UnresolvedCall => {
        val callName = u.getName
        var operatorNotation = false
        if (u.getTarget != null) {
          callName match {
            case "new" => {
              res.append("new ")
              print(u.getTarget, res)
            }
            case "plus" if u.getParameters.size == 1 => {
              operatorNotation = true
              print(u.getTarget, res)
              res.append(" + ")
            }
            case "minus" if u.getParameters.size == 1 => {
              operatorNotation = true
              print(u.getTarget, res)
              res.append(" - ")
            }
            case _ => {
              print(u.getTarget, res)
              res.append(".")
              res.append(u.getName)
            }
          }
        } else {
          res.append(u.getName)
        }

        var j = 0
        if (u.getGenerics.size > 0)
          res.append("<")
        u.getGenerics.foreach(p => {
          if (j != 0) res.append(", ")
          print(p, res)
          j = j + 1
        })
        if (u.getGenerics.size > 0)
          res.append(">")

        var i = 0
        if (u.getParameters.size > 0 && !operatorNotation)
          res.append("(")
        u.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        if (u.getParameters.size > 0 && !operatorNotation) {
          res.append(")")
        }
      }
      case c: CallSuperOperation => {
        res.append("super." + c.getName)
        var i = 0
        if (c.getParameters.size > 0)
          res.append("(")
        c.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        if (c.getParameters.size > 0) {
          res.append(")")
        }
      }
      case c: CallOperation => {
        print(c.getTarget, res)
        res.append("." + c.getName)
        var i = 0
        if (c.getParameters.size > 0)
          res.append("(")
        c.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        if (c.getParameters.size > 0) {
          res.append(")")
        }

      }
      case c: SelfExpression => {
        res.append("_self")

      }

      case c: ProductType => {
        res.append("[")
        var i = 0
        c.getType.foreach(p => {
          if (i != 0)
            res.append(",")
          print(p, res)
          i = i + 1
        })
        res.append("]")
      }

      case c: Assignment => {
        if (c.getIsCast != null && c.getIsCast) {
          //res.append("?=")
          res.append("if (")
          print(c.getTarget, res)
          res.append(" instanceof /*MyClass*/) {")
          print(c.getTarget, res)
          res.append(" = (/*MyClass*/)")
          print(c.getValue, res)
          res.append("} // kermeta conditional cast ?= \n\t\t\telse ")
          print(c.getTarget, res)
          res.append("=null")
        } else {
          print(c.getTarget, res)
          res.append(" = ")
          print(c.getValue, res)
        }

      }

      case c: CallProperty => {
        print(c.getTarget, res)
        res.append("." + c.getName)
        var i = 0
        if (c.getParameters.size > 0)
          res.append("(")
        c.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        if (c.getParameters.size > 0) {
          res.append(")")
        }
      }

      case c: CallResult => {
        res.append("result")
      }
      case c: CallVariable => {
        print(c.getStaticType, res)
        res.append("." + c.getName)
        var i = 0
        if (c.getParameters.size > 0)
          res.append("(")
        c.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        if (c.getParameters.size > 0) {
          res.append(")")
        }
      }

      case c: EnumerationLiteral => {
        res.append(c.getName + "; ")
      }

      case c: Enumeration => {
        res.append("enum " + c.getName + " {")
        c.getOwnedLiteral.foreach(p => print(p, res))
        res.append("}\n")
      }

      case c: Rescue => {
        res.append("(" + c.getExceptionName + " : ")
        print(c.getExceptionType, res)
        res.append(")\n\tdo\n")
        c.getBody.foreach { exp =>
          {
            print(exp, res)
            res.append("\n")
          }
        }
        res.append("\tend\n")
      }

      case c: CallEnumLiteral => {
        print(c.getStaticEnumLiteral, res)
        res.append("." + c.getName)
        var i = 0
        if (c.getParameters.size > 0)
          res.append("(")
        c.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        if (c.getParameters.size > 0) {
          res.append(")")
        }

      }
      case c: CallValue => {
        res.append(c.getName)
        var i = 0

        if (c.getParameters.size > 0)
          res.append("(")
        c.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        if (c.getParameters.size > 0) {
          res.append(")")
        }

      }
      case otv: ObjectTypeVariable => {
        res.append(otv.getName)
        if (otv.getSupertype() != null) {
          res.append(" : ")
          print(otv.getSupertype(), res)
        }
      }

      case tvb: TypeVariableBinding => {
        print(tvb.getVariable(), res)
      }
      case t: Tag => {
        if (t.getName.equals("documentation")) {
          res.append("/** ")
          res.append(t.getValue)
          res.append(" */")
        } else if (!t.getName().equals("traceability_text_reference")) {
          res.append("/* @")
          res.append(t.getName)
          res.append(" \"")
          res.append(t.getValue)
          res.append("\" */")
        }
      }

      case j: JavaStaticCall => {
        res.append("extern ")
        res.append(j.getJclass)
        res.append(".")
        res.append(j.getJmethod)
        res.append("(")
        var i = 0
        j.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        res.append(")")
      }

      case o: EObject => res.append("todo " + o.getClass)
    }
    return ;
  }

  def printBlock(b: Block, res: java.lang.StringBuffer, needResult: Boolean, resultType: String): Unit = {
    res.append(" {\n")
    if (needResult)
      res.append("\t\t\tvar " + resultType + " result\n")
    b.getStatement.foreach(s => {
      res.append("\t\t\t")
      print(s, res)
      res.append("\n")
    })

    if (b.getRescueBlock.size != 0) {
      b.getRescueBlock.foreach(s => {
        res.append("rescue ")
        print(s, res)
        res.append("\n")
      })
    }
    if (needResult)
      res.append("\t\t\treturn result\n")
    res.append("\t\t\t}\n")
  }

  /**
   * operation dedicated to print the type part of a MultiplicityElement
   */
  def printMultiplicityElementTypeType(me: MultiplicityElement, res: java.lang.StringBuffer): Unit = {
    val modifier = CollectionModifier(me.getIsOrdered, me.getIsUnique)
    if (me.getUpper != 1) {
      modifier match {
        case CollectionModifier(false, false) => res.append("bag ")
        case CollectionModifier(false, true) => res.append("seq ")
        case CollectionModifier(true, false) => res.append("set ")
        case CollectionModifier(true, true) =>
      }
    }
    me.getType match {
      case en: Enumeration => {
        res.append(en.getName())
      }
      case _ => {
        print(me.getType, res)
      }
    }

    if ((me.getUpper != 1) || me.getLower != 0) {
      res.append("[")
      res.append(me.getLower)
      res.append("..")
      res.append(("" + me.getUpper).replace("-1", "*"))
      res.append("]")
    }
  }
  case class CollectionModifier(isOrdered: Boolean, isUnique: Boolean)
}



