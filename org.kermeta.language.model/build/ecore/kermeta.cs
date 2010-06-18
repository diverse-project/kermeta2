 SYNTAXDEF kermeta
FOR <http://www.kermeta.org/kermeta/2_0_0//kermeta>
START org.kermeta.language.structure.Object,org.kermeta.language.structure.MultiplicityElement,org.kermeta.language.structure.TypedElement,org.kermeta.language.structure.NamedElement,org.kermeta.language.structure.ModelingUnit,org.kermeta.language.structure.Model

IMPORTS{
	org.kermeta.language:<http://www.kermeta.org/kermeta/2_0_0//kermeta/language>
	org.kermeta.language.behavior:<http://www.kermeta.org/kermeta/2_0_0//kermeta/language/behavior>
	org.kermeta.language.structure:<http://www.kermeta.org/kermeta/2_0_0//kermeta/language/structure>
}

TOKENS{
	DEFINE COMMENT$'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE INTEGER$('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT$('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
}

TOKENSTYLES{
	"Raise" COLOR #7F0055, BOLD;
	"tag" COLOR #7F0055, BOLD;
	"ownedTags" COLOR #7F0055, BOLD;
	"containedType" COLOR #7F0055, BOLD;
	"staticType" COLOR #7F0055, BOLD;
	"expression" COLOR #7F0055, BOLD;
	"Rescue" COLOR #7F0055, BOLD;
	"body" COLOR #7F0055, BOLD;
	"exceptionType" COLOR #7F0055, BOLD;
	"exceptionName" COLOR #7F0055, BOLD;
	"Block" COLOR #7F0055, BOLD;
	"rescueBlock" COLOR #7F0055, BOLD;
	"statement" COLOR #7F0055, BOLD;
	"TypeReference" COLOR #7F0055, BOLD;
	"name" COLOR #7F0055, BOLD;
	"type" COLOR #7F0055, BOLD;
	"lower" COLOR #7F0055, BOLD;
	"upper" COLOR #7F0055, BOLD;
	"Loop" COLOR #7F0055, BOLD;
	"initialization" COLOR #7F0055, BOLD;
	"stopCondition" COLOR #7F0055, BOLD;
	"IntegerLiteral" COLOR #7F0055, BOLD;
	"value" COLOR #7F0055, BOLD;
	"StringLiteral" COLOR #7F0055, BOLD;
	"BooleanLiteral" COLOR #7F0055, BOLD;
	"TypeLiteral" COLOR #7F0055, BOLD;
	"typeref" COLOR #7F0055, BOLD;
	"VoidLiteral" COLOR #7F0055, BOLD;
	"JavaStaticCall" COLOR #7F0055, BOLD;
	"parameters" COLOR #7F0055, BOLD;
	"jclass" COLOR #7F0055, BOLD;
	"jmethod" COLOR #7F0055, BOLD;
	"Conditional" COLOR #7F0055, BOLD;
	"thenBody" COLOR #7F0055, BOLD;
	"elseBody" COLOR #7F0055, BOLD;
	"condition" COLOR #7F0055, BOLD;
	"CallFeature" COLOR #7F0055, BOLD;
	"staticTypeVariableBindings" COLOR #7F0055, BOLD;
	"staticProperty" COLOR #7F0055, BOLD;
	"staticOperation" COLOR #7F0055, BOLD;
	"staticEnumLiteral" COLOR #7F0055, BOLD;
	"target" COLOR #7F0055, BOLD;
	"CallExpression" COLOR #7F0055, BOLD;
	"CallVariable" COLOR #7F0055, BOLD;
	"CallSuperOperation" COLOR #7F0055, BOLD;
	"CallResult" COLOR #7F0055, BOLD;
	"CallValue" COLOR #7F0055, BOLD;
	"EmptyExpression" COLOR #7F0055, BOLD;
	"LambdaExpression" COLOR #7F0055, BOLD;
	"LambdaParameter" COLOR #7F0055, BOLD;
	"Assignment" COLOR #7F0055, BOLD;
	"VariableDecl" COLOR #7F0055, BOLD;
	"identifier" COLOR #7F0055, BOLD;
	"SelfExpression" COLOR #7F0055, BOLD;
	"Object" COLOR #7F0055, BOLD;
	"Operation" COLOR #7F0055, BOLD;
	"superOperation" COLOR #7F0055, BOLD;
	"pre" COLOR #7F0055, BOLD;
	"post" COLOR #7F0055, BOLD;
	"owningClass" COLOR #7F0055, BOLD;
	"typeParameter" COLOR #7F0055, BOLD;
	"raisedException" COLOR #7F0055, BOLD;
	"ownedParameter" COLOR #7F0055, BOLD;
	"Property" COLOR #7F0055, BOLD;
	"getterBody" COLOR #7F0055, BOLD;
	"setterBody" COLOR #7F0055, BOLD;
	"opposite" COLOR #7F0055, BOLD;
	"default" COLOR #7F0055, BOLD;
	"EnumerationLiteral" COLOR #7F0055, BOLD;
	"enumeration" COLOR #7F0055, BOLD;
	"TypeVariableBinding" COLOR #7F0055, BOLD;
	"variable" COLOR #7F0055, BOLD;
	"MultiplicityElement" COLOR #7F0055, BOLD;
	"TypeDefinition" COLOR #7F0055, BOLD;
	"ClassDefinition" COLOR #7F0055, BOLD;
	"inv" COLOR #7F0055, BOLD;
	"ownedAttribute" COLOR #7F0055, BOLD;
	"ownedOperation" COLOR #7F0055, BOLD;
	"superType" COLOR #7F0055, BOLD;
	"TypedElement" COLOR #7F0055, BOLD;
	"TypeVariable" COLOR #7F0055, BOLD;
	"typeContainer" COLOR #7F0055, BOLD;
	"supertype" COLOR #7F0055, BOLD;
	"ProductType" COLOR #7F0055, BOLD;
	"FunctionType" COLOR #7F0055, BOLD;
	"left" COLOR #7F0055, BOLD;
	"right" COLOR #7F0055, BOLD;
	"PrimitiveType" COLOR #7F0055, BOLD;
	"instanceType" COLOR #7F0055, BOLD;
	"NamedElement" COLOR #7F0055, BOLD;
	"Constraint" COLOR #7F0055, BOLD;
	"stereotype" COLOR #7F0055, BOLD;
	"language" COLOR #7F0055, BOLD;
	"invOwner" COLOR #7F0055, BOLD;
	"preOwner" COLOR #7F0055, BOLD;
	"postOwner" COLOR #7F0055, BOLD;
	"ObjectTypeVariable" COLOR #7F0055, BOLD;
	"Class" COLOR #7F0055, BOLD;
	"typeParamBinding" COLOR #7F0055, BOLD;
	"typeDefinition" COLOR #7F0055, BOLD;
	"virtualTypeBinding" COLOR #7F0055, BOLD;
	"superClass" COLOR #7F0055, BOLD;
	"Package" COLOR #7F0055, BOLD;
	"ownedTypeDefinition" COLOR #7F0055, BOLD;
	"nestedPackage" COLOR #7F0055, BOLD;
	"nestingPackage" COLOR #7F0055, BOLD;
	"uri" COLOR #7F0055, BOLD;
	"VoidType" COLOR #7F0055, BOLD;
	"DataType" COLOR #7F0055, BOLD;
	"Require" COLOR #7F0055, BOLD;
	"Using" COLOR #7F0055, BOLD;
	"qualifiedName" COLOR #7F0055, BOLD;
	"UnresolvedType" COLOR #7F0055, BOLD;
	"typeIdentifier" COLOR #7F0055, BOLD;
	"Tag" COLOR #7F0055, BOLD;
	"object" COLOR #7F0055, BOLD;
	"ModelingUnit" COLOR #7F0055, BOLD;
	"packages" COLOR #7F0055, BOLD;
	"requires" COLOR #7F0055, BOLD;
	"usings" COLOR #7F0055, BOLD;
	"namespacePrefix" COLOR #7F0055, BOLD;
	"ModelType" COLOR #7F0055, BOLD;
	"includedTypeDefinition" COLOR #7F0055, BOLD;
	"ModelTypeVariable" COLOR #7F0055, BOLD;
	"virtualType" COLOR #7F0055, BOLD;
	"VirtualType" COLOR #7F0055, BOLD;
	"classDefinition" COLOR #7F0055, BOLD;
	"modelType" COLOR #7F0055, BOLD;
	"Model" COLOR #7F0055, BOLD;
	"contents" COLOR #7F0055, BOLD;
	"Enumeration" COLOR #7F0055, BOLD;
	"ownedLiteral" COLOR #7F0055, BOLD;
	"Parameter" COLOR #7F0055, BOLD;
	"operation" COLOR #7F0055, BOLD;
}

RULES{
	
	org.kermeta.language.behavior.Raise::= "Raise"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "expression"  ":" expression  )* "}"  ;
	
	org.kermeta.language.behavior.Rescue::= "Rescue"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "body"  ":" body | "exceptionType"  ":" exceptionType | "exceptionName"  ":" exceptionName['"','"']  )* "}"  ;
	
	org.kermeta.language.behavior.Block::= "Block"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "rescueBlock"  ":" rescueBlock | "statement"  ":" statement  )* "}"  ;
	
	org.kermeta.language.behavior.TypeReference::=isOrdered[]?isUnique[]? "TypeReference"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "name"  ":" name['"','"'] | "type"  ":" type[]| "lower"  ":" lower[INTEGER]| "upper"  ":" upper[INTEGER] )* "}"  ;
	
	org.kermeta.language.behavior.Loop::= "Loop"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "initialization"  ":" initialization | "body"  ":" body | "stopCondition"  ":" stopCondition  )* "}"  ;
	
	org.kermeta.language.behavior.IntegerLiteral::= "IntegerLiteral"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "value"  ":" value[INTEGER] )* "}"  ;
	
	org.kermeta.language.behavior.StringLiteral::= "StringLiteral"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "value"  ":" value['"','"']  )* "}"  ;
	
	org.kermeta.language.behavior.BooleanLiteral::=value[]? "BooleanLiteral"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[] )* "}"  ;
	
	org.kermeta.language.behavior.TypeLiteral::= "TypeLiteral"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "typeref"  ":" typeref  )* "}"  ;
	
	org.kermeta.language.behavior.VoidLiteral::= "VoidLiteral"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[] )* "}"  ;
	
	org.kermeta.language.behavior.JavaStaticCall::= "JavaStaticCall"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "parameters"  ":" parameters | "jclass"  ":" jclass['"','"'] | "jmethod"  ":" jmethod['"','"']  )* "}"  ;
	
	org.kermeta.language.behavior.Conditional::= "Conditional"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "thenBody"  ":" thenBody | "elseBody"  ":" elseBody | "condition"  ":" condition  )* "}"  ;
	
	org.kermeta.language.behavior.CallFeature::=isAtpre[]? "CallFeature"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "staticTypeVariableBindings"  ":" staticTypeVariableBindings[]| "parameters"  ":" parameters | "name"  ":" name['"','"'] | "staticProperty"  ":" staticProperty[]| "staticOperation"  ":" staticOperation[]| "staticEnumLiteral"  ":" staticEnumLiteral[]| "target"  ":" target  )* "}"  ;
	
	org.kermeta.language.behavior.CallExpression::= "CallExpression"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "staticTypeVariableBindings"  ":" staticTypeVariableBindings[]| "parameters"  ":" parameters | "name"  ":" name['"','"']  )* "}"  ;
	
	org.kermeta.language.behavior.CallVariable::=isAtpre[]? "CallVariable"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "staticTypeVariableBindings"  ":" staticTypeVariableBindings[]| "parameters"  ":" parameters | "name"  ":" name['"','"']  )* "}"  ;
	
	org.kermeta.language.behavior.CallSuperOperation::= "CallSuperOperation"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "staticTypeVariableBindings"  ":" staticTypeVariableBindings[]| "parameters"  ":" parameters | "name"  ":" name['"','"']  )* "}"  ;
	
	org.kermeta.language.behavior.CallResult::=isAtpre[]? "CallResult"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "staticTypeVariableBindings"  ":" staticTypeVariableBindings[]| "parameters"  ":" parameters | "name"  ":" name['"','"']  )* "}"  ;
	
	org.kermeta.language.behavior.CallValue::= "CallValue"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "staticTypeVariableBindings"  ":" staticTypeVariableBindings[]| "parameters"  ":" parameters | "name"  ":" name['"','"']  )* "}"  ;
	
	org.kermeta.language.behavior.EmptyExpression::= "EmptyExpression"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[] )* "}"  ;
	
	org.kermeta.language.behavior.LambdaExpression::= "LambdaExpression"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "parameters"  ":" parameters | "body"  ":" body  )* "}"  ;
	
	org.kermeta.language.behavior.LambdaParameter::= "LambdaParameter"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name['"','"'] | "type"  ":" type  )* "}"  ;
	
	org.kermeta.language.behavior.Assignment::=isCast[]? "Assignment"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "target"  ":" target | "value"  ":" value  )* "}"  ;
	
	org.kermeta.language.behavior.VariableDecl::= "VariableDecl"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "initialization"  ":" initialization | "identifier"  ":" identifier['"','"'] | "type"  ":" type  )* "}"  ;
	
	org.kermeta.language.behavior.SelfExpression::= "SelfExpression"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[] )* "}"  ;
	
	org.kermeta.language.structure.Object::= "Object"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags  )* "}"  ;
	
	org.kermeta.language.structure.Operation::=isOrdered[]?isUnique[]?isAbstract[]? "Operation"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "name"  ":" name['"','"'] | "type"  ":" type[]| "lower"  ":" lower[INTEGER]| "upper"  ":" upper[INTEGER]| "body"  ":" body | "superOperation"  ":" superOperation[]| "pre"  ":" pre | "post"  ":" post | "owningClass"  ":" owningClass[]| "typeParameter"  ":" typeParameter[]| "raisedException"  ":" raisedException[]| "ownedParameter"  ":" ownedParameter  )* "}"  ;
	
	org.kermeta.language.structure.Property::=isOrdered[]?isUnique[]?isGetterAbstract[]?isSetterAbstract[]?isReadOnly[]?isComposite[]?isDerived[]?isID[]? "Property"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "name"  ":" name['"','"'] | "type"  ":" type[]| "lower"  ":" lower[INTEGER]| "upper"  ":" upper[INTEGER]| "getterBody"  ":" getterBody | "setterBody"  ":" setterBody | "owningClass"  ":" owningClass[]| "opposite"  ":" opposite[]| "default"  ":" default['"','"']  )* "}"  ;
	
	org.kermeta.language.structure.EnumerationLiteral::= "EnumerationLiteral"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name['"','"'] | "enumeration"  ":" enumeration[] )* "}"  ;
	
	org.kermeta.language.structure.TypeVariableBinding::= "TypeVariableBinding"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "variable"  ":" variable[]| "type"  ":" type[] )* "}"  ;
	
	org.kermeta.language.structure.MultiplicityElement::=isOrdered[]?isUnique[]? "MultiplicityElement"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "name"  ":" name['"','"'] | "type"  ":" type[]| "lower"  ":" lower[INTEGER]| "upper"  ":" upper[INTEGER] )* "}"  ;
	
	org.kermeta.language.structure.TypeDefinition::=isAspect[]? "TypeDefinition"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name['"','"']  )* "}"  ;
	
	org.kermeta.language.structure.ClassDefinition::=isAspect[]?isAbstract[]? "ClassDefinition"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "name"  ":" name['"','"'] | "typeParameter"  ":" typeParameter | "inv"  ":" inv | "ownedAttribute"  ":" ownedAttribute | "ownedOperation"  ":" ownedOperation | "superType"  ":" superType[] )* "}"  ;
	
	org.kermeta.language.structure.TypedElement::= "TypedElement"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "name"  ":" name['"','"'] | "type"  ":" type[] )* "}"  ;
	
	org.kermeta.language.structure.TypeVariable::= "TypeVariable"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "typeContainer"  ":" typeContainer[]| "name"  ":" name['"','"'] | "supertype"  ":" supertype[] )* "}"  ;
	
	org.kermeta.language.structure.ProductType::= "ProductType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "typeContainer"  ":" typeContainer[]| "type"  ":" type[] )* "}"  ;
	
	org.kermeta.language.structure.FunctionType::= "FunctionType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "typeContainer"  ":" typeContainer[]| "left"  ":" left[]| "right"  ":" right[] )* "}"  ;
	
	org.kermeta.language.structure.PrimitiveType::=isAspect[]? "PrimitiveType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "name"  ":" name['"','"'] | "typeContainer"  ":" typeContainer[]| "instanceType"  ":" instanceType[] )* "}"  ;
	
	org.kermeta.language.structure.NamedElement::= "NamedElement"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name['"','"']  )* "}"  ;
	
	org.kermeta.language.structure.Constraint::= "Constraint"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name['"','"'] | "body"  ":" body | "stereotype"  ":" stereotype[]| "language"  ":" language[]| "invOwner"  ":" invOwner[]| "preOwner"  ":" preOwner[]| "postOwner"  ":" postOwner[] )* "}"  ;
	
	org.kermeta.language.structure.ObjectTypeVariable::= "ObjectTypeVariable"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "typeContainer"  ":" typeContainer[]| "name"  ":" name['"','"'] | "supertype"  ":" supertype[] )* "}"  ;
	
	org.kermeta.language.structure.Class::=isAbstract[]? "Class"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "typeContainer"  ":" typeContainer[]| "typeParamBinding"  ":" typeParamBinding | "typeDefinition"  ":" typeDefinition[]| "virtualTypeBinding"  ":" virtualTypeBinding | "name"  ":" name['"','"']  )* "}"  ;
	
	org.kermeta.language.structure.Package::= "Package"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name['"','"'] | "ownedTypeDefinition"  ":" ownedTypeDefinition | "nestedPackage"  ":" nestedPackage | "nestingPackage"  ":" nestingPackage[]| "uri"  ":" uri['"','"']  )* "}"  ;
	
	org.kermeta.language.structure.VoidType::= "VoidType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "typeContainer"  ":" typeContainer[] )* "}"  ;
	
	org.kermeta.language.structure.DataType::=isAspect[]? "DataType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name['"','"'] | "typeContainer"  ":" typeContainer[] )* "}"  ;
	
	org.kermeta.language.structure.Require::= "Require"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "uri"  ":" uri['"','"']  )* "}"  ;
	
	org.kermeta.language.structure.Using::= "Using"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "qualifiedName"  ":" qualifiedName['"','"']  )* "}"  ;
	
	org.kermeta.language.structure.UnresolvedType::= "UnresolvedType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "typeContainer"  ":" typeContainer[]| "typeIdentifier"  ":" typeIdentifier['"','"']  )* "}"  ;
	
	org.kermeta.language.structure.Tag::= "Tag"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "object"  ":" object[]| "name"  ":" name['"','"'] | "value"  ":" value['"','"']  )* "}"  ;
	
	org.kermeta.language.structure.ModelingUnit::= "ModelingUnit"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "packages"  ":" packages | "requires"  ":" requires | "usings"  ":" usings | "namespacePrefix"  ":" namespacePrefix['"','"']  )* "}"  ;
	
	org.kermeta.language.structure.ModelType::=isAspect[]? "ModelType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "typeContainer"  ":" typeContainer[]| "name"  ":" name['"','"'] | "includedTypeDefinition"  ":" includedTypeDefinition[] )* "}"  ;
	
	org.kermeta.language.structure.ModelTypeVariable::= "ModelTypeVariable"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "typeContainer"  ":" typeContainer[]| "name"  ":" name['"','"'] | "supertype"  ":" supertype[]| "virtualType"  ":" virtualType  )* "}"  ;
	
	org.kermeta.language.structure.VirtualType::= "VirtualType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "typeContainer"  ":" typeContainer[]| "name"  ":" name['"','"'] | "supertype"  ":" supertype[]| "classDefinition"  ":" classDefinition[]| "modelType"  ":" modelType[]| "typeParamBinding"  ":" typeParamBinding  )* "}"  ;
	
	org.kermeta.language.structure.Model::= "Model"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags  )* "}"  ;
	
	org.kermeta.language.structure.Enumeration::=isAspect[]? "Enumeration"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name['"','"'] | "typeContainer"  ":" typeContainer[]| "ownedLiteral"  ":" ownedLiteral  )* "}"  ;
	
	org.kermeta.language.structure.Parameter::=isOrdered[]?isUnique[]? "Parameter"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "name"  ":" name['"','"'] | "type"  ":" type[]| "lower"  ":" lower[INTEGER]| "upper"  ":" upper[INTEGER]| "operation"  ":" operation[] )* "}"  ;
	
}