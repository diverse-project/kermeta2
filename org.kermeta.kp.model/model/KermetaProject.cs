SYNTAXDEF kpt
FOR <http://www.kermeta.org/kp/1.0.0>
START KermetaProject
OPTIONS { basePackage="org.kermeta.kp.editor"; }

TOKENS{
	DEFINE SL_COMMENT$'//'(~('\n'|'\r'))*$;
	DEFINE ML_COMMENT $'/*'.*'*/'$ ;
	DEFINE INTEGER$('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT$('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
	DEFINE MAVEN$'"'('A'..'Z')*'"'$;
	DEFINE NSURI$('A'..'Z')(('_')?('A'..'Z'))*$;
	//DEFINE PROJECT$('a'..'z')('a'..'z')*(.)('a'..'z')('a'..'z')*$;
}

TOKENSTYLES{
	"dependence" COLOR #A22000, BOLD;
	"weaver-directive" COLOR #007F55, BOLD;
	"in" COLOR #2554C7, ITALIC;
	"merger-option" COLOR #CC8000, BOLD;
	"SL_COMMENT" COLOR #348017;
	"ML_COMMENT" COLOR #348017;
	"MAVEN" COLOR #2554C7, BOLD;
	"NSURI" COLOR #2554C7, BOLD;
}

RULES{
	
	KermetaProject::= 
	"KermetaProject" ":" name['"','"'] !1
	"version" ": " version['"','"'] !1
	"group"  ":" group['"','"'] !1
	"{"
		(dependencies | sources | weaveDirectives | options )*
	"}"
	ref 
	;
	
	SourceFolder::=  
	"source" "=" folderName['"','"']   
	;
	
	SourceFile::= 
	"source" "=" uri['"','"'] 
	;
	
	SourceNSURI::=  
	"source" "=" uri[NSURI]  "from" from['"','"']  
	;
	
	SourceQuery::=  
	"source" "=" query['"','"'] "from" from['"','"']  
	;
	
	Dependency::=  
	"dependency" name['"','"'] "=" depRef['"','"'] | "dependency" depRef['"','"'] 
	;
	
	WeaveDirective::= 
	"weaver-directive" name['"','"']? "="  mix target   
	;
	
	Option::= 
	"merger-option" name['"','"']? "=" value['"','"'] 
	;
	
	StringExpression::= 
	value['"','"']
	;
	 
	MixExpression::= 
	"(" left  right ")" 
	;
	
	NamedElement ::= 
	name[] 
	;
	
	KermetaProjectRef ::= 
	"ref" "{" (group['"','"']  ":" name['"','"'] ("[" version['"','"'] "]")?)* "}" 
	;
	
}