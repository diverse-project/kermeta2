SYNTAXDEF kermeta
FOR <http://www.kermeta.org/kermeta/2_0_0//kermeta> <platform:/resource/org.kermeta.language.model/build/ecore/kermeta.genmodel>
START structure.ModelingUnit, structure.Model, structure.MultiplicityElement 

IMPORTS{
	language: <http://www.kermeta.org/kermeta/2_0_0//kermeta/language> <platform:/resource/org.kermeta.language.model/build/ecore/kermeta.genmodel>
	structure : <http://www.kermeta.org/kermeta/2_0_0//kermeta/language/structure> <platform:/resource/org.kermeta.language.model/build/ecore/kermeta.genmodel> 
	bv : <http://www.kermeta.org/kermeta/2_0_0//kermeta/language/behavior> <platform:/resource/org.kermeta.language.model/build/ecore/kermeta.genmodel>
}
   
OPTIONS {
	overrideEditorConfiguration = "false";
	basePackage = "org.kermeta.language.emftexteditor";
	generateCodeFromGeneratorModel = "false";
	tokenspace = "1";
	srcFolder = "src/main/java";
	srcGenFolder = "src/main/java-gen";
	defaultTokenName = "STRING";
}   

TOKENS{
		DEFINE SL_COMMENT$'//'(~('\n'|'\r'))*$;
		DEFINE ML_COMMENT $'/*'.*'*/'$ ;
		DEFINE INTEGER$('-')?('1'..'9')('0'..'9')*|'0'$;
		DEFINE FLOAT$('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
		DEFINE BOOLEAN$'true'|'false'$;
		DEFINE STRING_LITERAL $('"'('\\'('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')|('\\''u'('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F'))|'\\'('0'..'7')|~('\\'|'"'))*'"')|('kermeta')$;
		DEFINE STRING$('0'..'9'|'a'..'z'(('_'|'-')('a'..'z'))*|'A'..'Z'(('_'|'-')('A'..'Z'))* |'A'..'Z' ('_'|'-')? ('a'..'z') |'a'..'z' ('_'|'-')? ('A'..'Z'))+$;
		DEFINE QUALIFIEDNAME $('0'..'9'|'a'..'z'|'A'..'Z')+ ('::' ('0'..'9'|'a'..'z'|'A'..'Z')+ )+ $;
		DEFINE CASTED$'?'$;
}

TOKENSTYLES{
	"SL_COMMENT"  COLOR #348017;
	"ML_COMMENT"  COLOR #348017;
	"STRING_LITERAL" COLOR #6698FF;
	"package" COLOR #2554C7, BOLD;
	"class" COLOR #2554C7, BOLD;
	"operation" COLOR #2554C7, BOLD;
	"aspect" COLOR #2554C7, BOLD;
	"is" COLOR #2554C7, BOLD;
	"do" COLOR #2554C7, BOLD;
	"end" COLOR #2554C7, BOLD;
	"raise" COLOR #2554C7, BOLD;
	"rescue" COLOR #2554C7, BOLD;
	"init" COLOR #2554C7, BOLD;
	"var" COLOR #2554C7, BOLD;
	"from" COLOR #2554C7, BOLD;
	"until" COLOR #2554C7, BOLD;
	"loop" COLOR #2554C7, BOLD;
	"if" COLOR #2554C7, BOLD;
	"then" COLOR #2554C7, BOLD;
	"else" COLOR #2554C7, BOLD;
	"enumeration" COLOR #2554C7, BOLD;
	"attribute" COLOR #2554C7, BOLD;
	"kermeta" COLOR #000000 ;
	":" COLOR #000000 ;
	"::" COLOR #000000 ;	
}

RULES{

//STRUCTURE
	structure.ModelingUnit ::= 
	"package" namespacePrefix[]
	(requires)* (usings)* (packages)* ;		
      
   	structure.Using ::=  
   	"using" (qualifiedName[QUALIFIEDNAME]|qualifiedName[]) !0;
   
   	structure.Require ::= 
   	"require" uri[STRING_LITERAL] !0;
   
   	structure.Package ::=  
   	(
	   	("package" name[] | "package" uri[] #0"::"#0 name[])
	   	//"package" (uri[](#0"::"uri[])*#0"::") name[])
	   	(
		   (!0ownedTypeDefinition)+!0 
		   |
		   "{" 
		   		(!1nestedPackage)*!0
		   "}" 
		   |
		   "{"
		   		(!1ownedTypeDefinition)+!0
		   "}"
	   	)? !0
   	) | ((!0ownedTypeDefinition)+!0 )
   	;
   
   	
   	structure.ClassDefinition ::=  
   	("aspect")? ("abstract")? "class" name[] 
   	("inherits" superType[] ("," superType[] )* )?
	   "{" 
	   		(!1inv)*!0 
	   		(!1ownedAttribute)*!0 
	   		(!1ownedOperation)*!0
	   "}" !0;
   
 	structure.Property ::= 
   	(("attribute" | "reference") name[] (":" type[])?| "property" name[] (":" type[])? getterBody setterBody );
   
   	structure.Operation::=  
   	pre* post* 
   	"operation" name[] 
   	//TODO find a way to handle 0 space or 1 space between token and ":"
   						"("	( ownedParameter (#0":"type[])? ("," ownedParameter (#0":" type[])?)* )? ")" 
   						(#0":" type[] 
   						)?  "is" 
   	(!0body:bv.Block| "abstract") ;
   
   	structure.Parameter ::=  
   	name[] ":" type[];
   
   	structure.Class::= 
   	typeDefinition[] ;
	
	structure.Enumeration ::= 
  	"enumeration" name[] "{" (ownedLiteral";" (ownedLiteral";")*) "}"!0;
   
   	structure.EnumerationLiteral ::=  
   	name[];
   
   	structure.Constraint ::= 
   	stereotype[] language[] ;

	//By default - TODO
	structure.Object::= "Object"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags  )* "}"  ;
	
	structure.Model::= "Model"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags  )* "}"  ;
	
	structure.ModelType::=isAspect[]? "ModelType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "typeContainer"  ":" typeContainer[]| "name"  ":" name[] | "includedTypeDefinition"  ":" includedTypeDefinition[] )* "}"  ;
	
	structure.TypeVariableBinding::= "TypeVariableBinding"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "variable"  ":" variable[]| "type"  ":" type[] )* "}"  ;
	
	structure.MultiplicityElement::=isOrdered[]?isUnique[]? "MultiplicityElement"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "name"  ":" name[] | "type"  ":" type[]| "lower"  ":" lower[INTEGER]| "upper"  ":" upper[INTEGER] )* "}"  ;
	
	structure.TypeDefinition::=isAspect[]? "TypeDefinition"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name[]  )* "}"  ;
	
	structure.PrimitiveType::=isAspect[]? "PrimitiveType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "typeContainer"  ":" typeContainer[]| "name"  ":" name[] | "containedType"  ":" containedType | "instanceType"  ":" instanceType[] )* "}"  ;
	
	structure.Tag::= "Tag"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name[] | "value"  ":" value[] | "object"  ":" object[] )* "}"  ;
	
	//structure.Filter::= "Filter"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "qualifiedName"  ":" qualifiedName[QUALIFIEDNAME]  )* "}"  ;
	
	structure.ObjectTypeVariable::= "ObjectTypeVariable"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "typeContainer"  ":" typeContainer[]| "name"  ":" name[] | "supertype"  ":" supertype[] )* "}"  ;
	
	structure.ModelTypeVariable::= "ModelTypeVariable"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "typeContainer"  ":" typeContainer[]| "name"  ":" name[] | "supertype"  ":" supertype[]| "virtualType"  ":" virtualType  )* "}"  ;
	
	structure.VirtualType::= "VirtualType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "typeContainer"  ":" typeContainer[]| "name"  ":" name[] | "supertype"  ":" supertype[]| "classDefinition"  ":" classDefinition[]| "modelType"  ":" modelType[]| "typeParamBinding"  ":" typeParamBinding  )* "}"  ;
	
	structure.ProductType::= "ProductType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "typeContainer"  ":" typeContainer[]| "type"  ":" type[] )* "}"  ;
	
	structure.FunctionType::= "FunctionType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "typeContainer"  ":" typeContainer[]| "left"  ":" left[]| "right"  ":" right[] )* "}"  ;
	
	structure.VoidType::= "VoidType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "typeContainer"  ":" typeContainer[] )* "}"  ;
	
   	
//BEHAVIOUR
	bv.Block ::= 
	"do" 
   		(!1statement:bv.VariableDecl|statement:bv.Loop|statement:bv.Conditional|
   		statement:bv.Assignment|statement:bv.CallFeature|statement:bv.CallVariable|
   		statement:bv.CallSuperOperation|statement:bv.CallResult|statement:bv.JavaStaticCall|statement:bv.EmptyExpression|
   		statement:bv.Block)*!0 
   		(!1rescueBlock)*!0
	"end";
   
	bv.Rescue ::=
	"rescue" ("("exceptionName[] ":" exceptionType")")? 
	(!1body)?!0 ;
   
	bv.TypeReference ::= 
	type[]; 
   
	bv.Raise ::= 
	"raise" expression ;
   
	bv.BooleanLiteral ::= 
	value[BOOLEAN];
   
	bv.IntegerLiteral ::=  
	value[INTEGER];
   
	bv.StringLiteral ::= 
	value[STRING_LITERAL];
   
	bv.Conditional ::=   
	"if"	(condition:bv.CallFeature|condition:bv.Conditional) 
	"then" 
			(!1thenBody:bv.BooleanLiteral|thenBody:bv.Block|thenBody:bv.Assignment|thenBody:bv.CallFeature|thenBody:bv.CallSuperOperation|thenBody:bv.CallResult|
			thenBody:bv.CallVariable|thenBody:bv.CallValue|thenBody:bv.VariableDecl)!0 
	("else" !1elseBody:bv.BooleanLiteral|elseBody:bv.Block|elseBody:bv.Assignment|elseBody:bv.CallFeature|elseBody:bv.CallSuperOperation|elseBody:bv.CallResult|elseBody:bv.VariableDecl
			elseBody:bv.CallVariable|elseBody:bv.CallValue)?!0 
	"end" ; 
   
	bv.Loop ::=  
	"from" (initialization)? 
	!0"until" stopCondition 
   	(	
   		!0"loop" 
   		(!1body)!0
   	)? ; 
   
   	bv.VariableDecl ::= 
   	"var" identifier[]  ":" type ("init" initialization)?; 
   
   	bv.TypeLiteral ::= 
   	typeref ;
   
   	bv.CallResult ::=
   	//TODO find a way to handle escaped keyword 
   //("~")?"result" ;
   "result" ;
   
   	bv.CallSuperOperation ::=  
   	"super("(parameters(","parameters)*)?")" ;
   
   	bv.Assignment ::= 
   	((target:bv.CallFeature|target:bv.CallVariable|target:bv.CallResult) (":="| isCast[CASTED]"=") 
   	
   	(value:bv.CallFeature| value:bv.SelfExpression|
   	value:bv.CallSuperOperation|value:bv.CallResult|
   	value:bv.CallValue|value:bv.CallVariable|value:bv.VoidLiteral|
   	value:bv.IntegerLiteral|value:bv.BooleanLiteral|value:bv.StringLiteral) );
   	
   	bv.CallVariable::= 
   		name[];
   
   	bv.SelfExpression ::=   
   	"self" ;
   
   	bv.CallFeature ::=   
 	"("(target:bv.BooleanLiteral|target:bv.CallVariable|target:bv.JavaStaticCall|target:bv.SelfExpression|target:bv.StringLiteral|target:bv.IntegerLiteral)
   	#0 	("."staticProperty[] | "."staticOperation[]"("(parameters(","parameters)*)?")"|"."staticEnumLiteral[]| "."staticOperation[] )* "==" parameters ")" |
   	
 	(target:bv.BooleanLiteral|target:bv.CallVariable|target:bv.JavaStaticCall|target:bv.SelfExpression|target:bv.StringLiteral|target:bv.IntegerLiteral)
   	#0 	("."staticProperty[] | "."staticOperation[]"("(parameters(","parameters)*)?")"|"."staticEnumLiteral[]| "."staticOperation[] )* "==" parameters | 	
 	
 	(target:bv.BooleanLiteral|target:bv.CallVariable|target:bv.JavaStaticCall|target:bv.SelfExpression|target:bv.StringLiteral|target:bv.IntegerLiteral)
   	#0 	("."staticProperty[] | "."staticOperation[]"("(parameters(","parameters)*)?")"|"."staticEnumLiteral[]| "."staticOperation[] )* (("+"|"-"|"/"|"*") parameters)* | 

	"("(target:bv.BooleanLiteral|target:bv.CallVariable|target:bv.JavaStaticCall|target:bv.SelfExpression|target:bv.StringLiteral|target:bv.IntegerLiteral)
   	#0 	("."staticProperty[] | "."staticOperation[]"("(parameters(","parameters)*)?")"|"."staticEnumLiteral[]| "."staticOperation[] )* (("+"|"-"|"/"|"*") parameters)* ")" (("+"|"-"|"/"|"*") parameters)* 
	;	

	//By default - TODO
	bv.CallValue::= "CallValue"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "parameters"  ":" parameters | "name"  ":" name[] | "staticTypeVariableBindings"  ":" staticTypeVariableBindings[] )* "}"  ;
	
	bv.EmptyExpression::= "EmptyExpression"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[] )* "}"  ;
	
	bv.JavaStaticCall::= "JavaStaticCall"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "parameters"  ":" parameters | "jclass"  ":" jclass[] | "jmethod"  ":" jmethod[]  )* "}"  ;
	
	bv.LambdaExpression::= "LambdaExpression"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "parameters"  ":" parameters | "body"  ":" body  )* "}"  ;
	
	bv.LambdaParameter::= "LambdaParameter"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name[] | "type"  ":" type  )* "}"  ;
	
	bv.VoidLiteral::= "Void";
	   
}