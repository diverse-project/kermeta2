//*******************************************************************************
// Copyright (c) 2005-2010 
// IRISA, INRIA, Université de Rennes 1
// 
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0 
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html
// 
// Contributors:
//   INRIA
// ******************************************************************************/

SYNTAXDEF kmt
FOR <http://www.kermeta.org/kermeta/2_0_0//kermeta>
START org.kermeta.language.structure.Object,org.kermeta.language.structure.MultiplicityElement,org.kermeta.language.structure.ModelingUnit,org.kermeta.language.structure.TypeDefinitionContainer,org.kermeta.language.structure.Model


IMPORTS {
	org.kermeta.language:<http://www.kermeta.org/kermeta/2_0_0//kermeta/language>
	org.kermeta.language.behavior:<http://www.kermeta.org/kermeta/2_0_0//kermeta/language/behavior>
	org.kermeta.language.structure:<http://www.kermeta.org/kermeta/2_0_0//kermeta/language/structure>
}

OPTIONS {	
	//licenceHeader ="platform:/resource/org.reuseware/licence.txt";
	tokenspace = "1";
	defaultTokenName = "IDENTIFIER";
	//generateCodeFromGeneratorModel = "false";
	memoize = "true";
	usePredefinedTokens = "false";
}

TOKENS {
	DEFINE SL_COMMENT $'//'(~('\n'|'\r'|'\uffff'))* $ COLLECT IN comments;
	DEFINE ML_COMMENT $'/*'.*'*/'$ COLLECT IN comments;

	DEFINE BOOLEAN_LITERAL $'true'|'false'$;
	
	DEFINE CHARACTER_LITERAL $'\''('\\'('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')|('\\''u'('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F'))|('\\'('0'..'3')('0'..'7')('0'..'7')|'\\'('0'..'7')('0'..'7')|'\\'('0'..'7'))|~('\''|'\\'))'\''$;
	DEFINE STRING_LITERAL $'"'('\\'('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')|('\\''u'('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F'))|'\\'('0'..'7')|~('\\'|'"'))*'"'$;
	
	DEFINE IDENTIFIER $('\u0024'|'\u0041'..'\u005a'|'\u005f'|'\u0061'..'\u007a'|'\u00a2'..'\u00a5'|'\u00aa'|'\u00b5'|'\u00ba'|'\u00c0'..'\u00d6'|'\u00d8'..'\u00f6'|'\u00f8'..'\u0236'|'\u0250'..'\u02c1'|'\u02c6'..'\u02d1'|'\u02e0'..'\u02e4'|'\u02ee'|'\u037a'|'\u0386'|'\u0388'..'\u038a'|'\u038c'|'\u038e'..'\u03a1'|'\u03a3'..'\u03ce'|'\u03d0'..'\u03f5'|'\u03f7'..'\u03fb'|'\u0400'..'\u0481'|'\u048a'..'\u04ce'|'\u04d0'..'\u04f5'|'\u04f8'..'\u04f9'|'\u0500'..'\u050f'|'\u0531'..'\u0556'|'\u0559'|'\u0561'..'\u0587'|'\u05d0'..'\u05ea'|'\u05f0'..'\u05f2'|'\u0621'..'\u063a'|'\u0640'..'\u064a'|'\u066e'..'\u066f'|'\u0671'..'\u06d3'|'\u06d5'|'\u06e5'..'\u06e6'|'\u06ee'..'\u06ef'|'\u06fa'..'\u06fc'|'\u06ff'|'\u0710'|'\u0712'..'\u072f'|'\u074d'..'\u074f'|'\u0780'..'\u07a5'|'\u07b1'|'\u0904'..'\u0939'|'\u093d'|'\u0950'|'\u0958'..'\u0961'|'\u0985'..'\u098c'|'\u098f'..'\u0990'|'\u0993'..'\u09a8'|'\u09aa'..'\u09b0'|'\u09b2'|'\u09b6'..'\u09b9'|'\u09bd'|'\u09dc'..'\u09dd'|'\u09df'..'\u09e1'|'\u09f0'..'\u09f3'|'\u0a05'..'\u0a0a'|'\u0a0f'..'\u0a10'|'\u0a13'..'\u0a28'|'\u0a2a'..'\u0a30'|'\u0a32'..'\u0a33'|'\u0a35'..'\u0a36'|'\u0a38'..'\u0a39'|'\u0a59'..'\u0a5c'|'\u0a5e'|'\u0a72'..'\u0a74'|'\u0a85'..'\u0a8d'|'\u0a8f'..'\u0a91'|'\u0a93'..'\u0aa8'|'\u0aaa'..'\u0ab0'|'\u0ab2'..'\u0ab3'|'\u0ab5'..'\u0ab9'|'\u0abd'|'\u0ad0'|'\u0ae0'..'\u0ae1'|'\u0af1'|'\u0b05'..'\u0b0c'|'\u0b0f'..'\u0b10'|'\u0b13'..'\u0b28'|'\u0b2a'..'\u0b30'|'\u0b32'..'\u0b33'|'\u0b35'..'\u0b39'|'\u0b3d'|'\u0b5c'..'\u0b5d'|'\u0b5f'..'\u0b61'|'\u0b71'|'\u0b83'|'\u0b85'..'\u0b8a'|'\u0b8e'..'\u0b90'|'\u0b92'..'\u0b95'|'\u0b99'..'\u0b9a'|'\u0b9c'|'\u0b9e'..'\u0b9f'|'\u0ba3'..'\u0ba4'|'\u0ba8'..'\u0baa'|'\u0bae'..'\u0bb5'|'\u0bb7'..'\u0bb9'|'\u0bf9'|'\u0c05'..'\u0c0c'|'\u0c0e'..'\u0c10'|'\u0c12'..'\u0c28'|'\u0c2a'..'\u0c33'|'\u0c35'..'\u0c39'|'\u0c60'..'\u0c61'|'\u0c85'..'\u0c8c'|'\u0c8e'..'\u0c90'|'\u0c92'..'\u0ca8'|'\u0caa'..'\u0cb3'|'\u0cb5'..'\u0cb9'|'\u0cbd'|'\u0cde'|'\u0ce0'..'\u0ce1'|'\u0d05'..'\u0d0c'|'\u0d0e'..'\u0d10'|'\u0d12'..'\u0d28'|'\u0d2a'..'\u0d39'|'\u0d60'..'\u0d61'|'\u0d85'..'\u0d96'|'\u0d9a'..'\u0db1'|'\u0db3'..'\u0dbb'|'\u0dbd'|'\u0dc0'..'\u0dc6'|'\u0e01'..'\u0e30'|'\u0e32'..'\u0e33'|'\u0e3f'..'\u0e46'|'\u0e81'..'\u0e82'|'\u0e84'|'\u0e87'..'\u0e88'|'\u0e8a'|'\u0e8d'|'\u0e94'..'\u0e97'|'\u0e99'..'\u0e9f'|'\u0ea1'..'\u0ea3'|'\u0ea5'|'\u0ea7'|'\u0eaa'..'\u0eab'|'\u0ead'..'\u0eb0'|'\u0eb2'..'\u0eb3'|'\u0ebd'|'\u0ec0'..'\u0ec4'|'\u0ec6'|'\u0edc'..'\u0edd'|'\u0f00'|'\u0f40'..'\u0f47'|'\u0f49'..'\u0f6a'|'\u0f88'..'\u0f8b'|'\u1000'..'\u1021'|'\u1023'..'\u1027'|'\u1029'..'\u102a'|'\u1050'..'\u1055'|'\u10a0'..'\u10c5'|'\u10d0'..'\u10f8'|'\u1100'..'\u1159'|'\u115f'..'\u11a2'|'\u11a8'..'\u11f9'|'\u1200'..'\u1206'|'\u1208'..'\u1246'|'\u1248'|'\u124a'..'\u124d'|'\u1250'..'\u1256'|'\u1258'|'\u125a'..'\u125d'|'\u1260'..'\u1286'|'\u1288'|'\u128a'..'\u128d'|'\u1290'..'\u12ae'|'\u12b0'|'\u12b2'..'\u12b5'|'\u12b8'..'\u12be'|'\u12c0'|'\u12c2'..'\u12c5'|'\u12c8'..'\u12ce'|'\u12d0'..'\u12d6'|'\u12d8'..'\u12ee'|'\u12f0'..'\u130e'|'\u1310'|'\u1312'..'\u1315'|'\u1318'..'\u131e'|'\u1320'..'\u1346'|'\u1348'..'\u135a'|'\u13a0'..'\u13f4'|'\u1401'..'\u166c'|'\u166f'..'\u1676'|'\u1681'..'\u169a'|'\u16a0'..'\u16ea'|'\u16ee'..'\u16f0'|'\u1700'..'\u170c'|'\u170e'..'\u1711'|'\u1720'..'\u1731'|'\u1740'..'\u1751'|'\u1760'..'\u176c'|'\u176e'..'\u1770'|'\u1780'..'\u17b3'|'\u17d7'|'\u17db'..'\u17dc'|'\u1820'..'\u1877'|'\u1880'..'\u18a8'|'\u1900'..'\u191c'|'\u1950'..'\u196d'|'\u1970'..'\u1974'|'\u1d00'..'\u1d6b'|'\u1e00'..'\u1e9b'|'\u1ea0'..'\u1ef9'|'\u1f00'..'\u1f15'|'\u1f18'..'\u1f1d'|'\u1f20'..'\u1f45'|'\u1f48'..'\u1f4d'|'\u1f50'..'\u1f57'|'\u1f59'|'\u1f5b'|'\u1f5d'|'\u1f5f'..'\u1f7d'|'\u1f80'..'\u1fb4'|'\u1fb6'..'\u1fbc'|'\u1fbe'|'\u1fc2'..'\u1fc4'|'\u1fc6'..'\u1fcc'|'\u1fd0'..'\u1fd3'|'\u1fd6'..'\u1fdb'|'\u1fe0'..'\u1fec'|'\u1ff2'..'\u1ff4'|'\u1ff6'..'\u1ffc'|'\u203f'..'\u2040'|'\u2054'|'\u2071'|'\u207f'|'\u20a0'..'\u20b1'|'\u2102'|'\u2107'|'\u210a'..'\u2113'|'\u2115'|'\u2119'..'\u211d'|'\u2124'|'\u2126'|'\u2128'|'\u212a'..'\u212d'|'\u212f'..'\u2131'|'\u2133'..'\u2139'|'\u213d'..'\u213f'|'\u2145'..'\u2149'|'\u2160'..'\u2183'|'\u3005'..'\u3007'|'\u3021'..'\u3029'|'\u3031'..'\u3035'|'\u3038'..'\u303c'|'\u3041'..'\u3096'|'\u309d'..'\u309f'|'\u30a1'..'\u30ff'|'\u3105'..'\u312c'|'\u3131'..'\u318e'|'\u31a0'..'\u31b7'|'\u31f0'..'\u31ff'|'\u3400'..'\u4db5'|'\u4e00'..'\u9fa5'|'\ua000'..'\ua48c'|'\uac00'..'\ud7a3'|'\ud800'..'\udbff'|'\uf900'..'\ufa2d'|'\ufa30'..'\ufa6a'|'\ufb00'..'\ufb06'|'\ufb13'..'\ufb17'|'\ufb1d'|'\ufb1f'..'\ufb28'|'\ufb2a'..'\ufb36'|'\ufb38'..'\ufb3c'|'\ufb3e'|'\ufb40'..'\ufb41'|'\ufb43'..'\ufb44'|'\ufb46'..'\ufbb1'|'\ufbd3'..'\ufd3d'|'\ufd50'..'\ufd8f'|'\ufd92'..'\ufdc7'|'\ufdf0'..'\ufdfc'|'\ufe33'..'\ufe34'|'\ufe4d'..'\ufe4f'|'\ufe69'|'\ufe70'..'\ufe74'|'\ufe76'..'\ufefc'|'\uff04'|'\uff21'..'\uff3a'|'\uff3f'|'\uff41'..'\uff5a'|'\uff65'..'\uffbe'|'\uffc2'..'\uffc7'|'\uffca'..'\uffcf'|'\uffd2'..'\uffd7'|'\uffda'..'\uffdc'|'\uffe0'..'\uffe1'|'\uffe5'..'\uffe6')('\u0000'..'\u0008'|'\u000e'..'\u001b'|'\u0024'|'\u0030'..'\u0039'|'\u0041'..'\u005a'|'\u005f'|'\u0061'..'\u007a'|'\u007f'..'\u009f'|'\u00a2'..'\u00a5'|'\u00aa'|'\u00ad'|'\u00b5'|'\u00ba'|'\u00c0'..'\u00d6'|'\u00d8'..'\u00f6'|'\u00f8'..'\u0236'|'\u0250'..'\u02c1'|'\u02c6'..'\u02d1'|'\u02e0'..'\u02e4'|'\u02ee'|'\u0300'..'\u0357'|'\u035d'..'\u036f'|'\u037a'|'\u0386'|'\u0388'..'\u038a'|'\u038c'|'\u038e'..'\u03a1'|'\u03a3'..'\u03ce'|'\u03d0'..'\u03f5'|'\u03f7'..'\u03fb'|'\u0400'..'\u0481'|'\u0483'..'\u0486'|'\u048a'..'\u04ce'|'\u04d0'..'\u04f5'|'\u04f8'..'\u04f9'|'\u0500'..'\u050f'|'\u0531'..'\u0556'|'\u0559'|'\u0561'..'\u0587'|'\u0591'..'\u05a1'|'\u05a3'..'\u05b9'|'\u05bb'..'\u05bd'|'\u05bf'|'\u05c1'..'\u05c2'|'\u05c4'|'\u05d0'..'\u05ea'|'\u05f0'..'\u05f2'|'\u0600'..'\u0603'|'\u0610'..'\u0615'|'\u0621'..'\u063a'|'\u0640'..'\u0658'|'\u0660'..'\u0669'|'\u066e'..'\u06d3'|'\u06d5'..'\u06dd'|'\u06df'..'\u06e8'|'\u06ea'..'\u06fc'|'\u06ff'|'\u070f'..'\u074a'|'\u074d'..'\u074f'|'\u0780'..'\u07b1'|'\u0901'..'\u0939'|'\u093c'..'\u094d'|'\u0950'..'\u0954'|'\u0958'..'\u0963'|'\u0966'..'\u096f'|'\u0981'..'\u0983'|'\u0985'..'\u098c'|'\u098f'..'\u0990'|'\u0993'..'\u09a8'|'\u09aa'..'\u09b0'|'\u09b2'|'\u09b6'..'\u09b9'|'\u09bc'..'\u09c4'|'\u09c7'..'\u09c8'|'\u09cb'..'\u09cd'|'\u09d7'|'\u09dc'..'\u09dd'|'\u09df'..'\u09e3'|'\u09e6'..'\u09f3'|'\u0a01'..'\u0a03'|'\u0a05'..'\u0a0a'|'\u0a0f'..'\u0a10'|'\u0a13'..'\u0a28'|'\u0a2a'..'\u0a30'|'\u0a32'..'\u0a33'|'\u0a35'..'\u0a36'|'\u0a38'..'\u0a39'|'\u0a3c'|'\u0a3e'..'\u0a42'|'\u0a47'..'\u0a48'|'\u0a4b'..'\u0a4d'|'\u0a59'..'\u0a5c'|'\u0a5e'|'\u0a66'..'\u0a74'|'\u0a81'..'\u0a83'|'\u0a85'..'\u0a8d'|'\u0a8f'..'\u0a91'|'\u0a93'..'\u0aa8'|'\u0aaa'..'\u0ab0'|'\u0ab2'..'\u0ab3'|'\u0ab5'..'\u0ab9'|'\u0abc'..'\u0ac5'|'\u0ac7'..'\u0ac9'|'\u0acb'..'\u0acd'|'\u0ad0'|'\u0ae0'..'\u0ae3'|'\u0ae6'..'\u0aef'|'\u0af1'|'\u0b01'..'\u0b03'|'\u0b05'..'\u0b0c'|'\u0b0f'..'\u0b10'|'\u0b13'..'\u0b28'|'\u0b2a'..'\u0b30'|'\u0b32'..'\u0b33'|'\u0b35'..'\u0b39'|'\u0b3c'..'\u0b43'|'\u0b47'..'\u0b48'|'\u0b4b'..'\u0b4d'|'\u0b56'..'\u0b57'|'\u0b5c'..'\u0b5d'|'\u0b5f'..'\u0b61'|'\u0b66'..'\u0b6f'|'\u0b71'|'\u0b82'..'\u0b83'|'\u0b85'..'\u0b8a'|'\u0b8e'..'\u0b90'|'\u0b92'..'\u0b95'|'\u0b99'..'\u0b9a'|'\u0b9c'|'\u0b9e'..'\u0b9f'|'\u0ba3'..'\u0ba4'|'\u0ba8'..'\u0baa'|'\u0bae'..'\u0bb5'|'\u0bb7'..'\u0bb9'|'\u0bbe'..'\u0bc2'|'\u0bc6'..'\u0bc8'|'\u0bca'..'\u0bcd'|'\u0bd7'|'\u0be7'..'\u0bef'|'\u0bf9'|'\u0c01'..'\u0c03'|'\u0c05'..'\u0c0c'|'\u0c0e'..'\u0c10'|'\u0c12'..'\u0c28'|'\u0c2a'..'\u0c33'|'\u0c35'..'\u0c39'|'\u0c3e'..'\u0c44'|'\u0c46'..'\u0c48'|'\u0c4a'..'\u0c4d'|'\u0c55'..'\u0c56'|'\u0c60'..'\u0c61'|'\u0c66'..'\u0c6f'|'\u0c82'..'\u0c83'|'\u0c85'..'\u0c8c'|'\u0c8e'..'\u0c90'|'\u0c92'..'\u0ca8'|'\u0caa'..'\u0cb3'|'\u0cb5'..'\u0cb9'|'\u0cbc'..'\u0cc4'|'\u0cc6'..'\u0cc8'|'\u0cca'..'\u0ccd'|'\u0cd5'..'\u0cd6'|'\u0cde'|'\u0ce0'..'\u0ce1'|'\u0ce6'..'\u0cef'|'\u0d02'..'\u0d03'|'\u0d05'..'\u0d0c'|'\u0d0e'..'\u0d10'|'\u0d12'..'\u0d28'|'\u0d2a'..'\u0d39'|'\u0d3e'..'\u0d43'|'\u0d46'..'\u0d48'|'\u0d4a'..'\u0d4d'|'\u0d57'|'\u0d60'..'\u0d61'|'\u0d66'..'\u0d6f'|'\u0d82'..'\u0d83'|'\u0d85'..'\u0d96'|'\u0d9a'..'\u0db1'|'\u0db3'..'\u0dbb'|'\u0dbd'|'\u0dc0'..'\u0dc6'|'\u0dca'|'\u0dcf'..'\u0dd4'|'\u0dd6'|'\u0dd8'..'\u0ddf'|'\u0df2'..'\u0df3'|'\u0e01'..'\u0e3a'|'\u0e3f'..'\u0e4e'|'\u0e50'..'\u0e59'|'\u0e81'..'\u0e82'|'\u0e84'|'\u0e87'..'\u0e88'|'\u0e8a'|'\u0e8d'|'\u0e94'..'\u0e97'|'\u0e99'..'\u0e9f'|'\u0ea1'..'\u0ea3'|'\u0ea5'|'\u0ea7'|'\u0eaa'..'\u0eab'|'\u0ead'..'\u0eb9'|'\u0ebb'..'\u0ebd'|'\u0ec0'..'\u0ec4'|'\u0ec6'|'\u0ec8'..'\u0ecd'|'\u0ed0'..'\u0ed9'|'\u0edc'..'\u0edd'|'\u0f00'|'\u0f18'..'\u0f19'|'\u0f20'..'\u0f29'|'\u0f35'|'\u0f37'|'\u0f39'|'\u0f3e'..'\u0f47'|'\u0f49'..'\u0f6a'|'\u0f71'..'\u0f84'|'\u0f86'..'\u0f8b'|'\u0f90'..'\u0f97'|'\u0f99'..'\u0fbc'|'\u0fc6'|'\u1000'..'\u1021'|'\u1023'..'\u1027'|'\u1029'..'\u102a'|'\u102c'..'\u1032'|'\u1036'..'\u1039'|'\u1040'..'\u1049'|'\u1050'..'\u1059'|'\u10a0'..'\u10c5'|'\u10d0'..'\u10f8'|'\u1100'..'\u1159'|'\u115f'..'\u11a2'|'\u11a8'..'\u11f9'|'\u1200'..'\u1206'|'\u1208'..'\u1246'|'\u1248'|'\u124a'..'\u124d'|'\u1250'..'\u1256'|'\u1258'|'\u125a'..'\u125d'|'\u1260'..'\u1286'|'\u1288'|'\u128a'..'\u128d'|'\u1290'..'\u12ae'|'\u12b0'|'\u12b2'..'\u12b5'|'\u12b8'..'\u12be'|'\u12c0'|'\u12c2'..'\u12c5'|'\u12c8'..'\u12ce'|'\u12d0'..'\u12d6'|'\u12d8'..'\u12ee'|'\u12f0'..'\u130e'|'\u1310'|'\u1312'..'\u1315'|'\u1318'..'\u131e'|'\u1320'..'\u1346'|'\u1348'..'\u135a'|'\u1369'..'\u1371'|'\u13a0'..'\u13f4'|'\u1401'..'\u166c'|'\u166f'..'\u1676'|'\u1681'..'\u169a'|'\u16a0'..'\u16ea'|'\u16ee'..'\u16f0'|'\u1700'..'\u170c'|'\u170e'..'\u1714'|'\u1720'..'\u1734'|'\u1740'..'\u1753'|'\u1760'..'\u176c'|'\u176e'..'\u1770'|'\u1772'..'\u1773'|'\u1780'..'\u17d3'|'\u17d7'|'\u17db'..'\u17dd'|'\u17e0'..'\u17e9'|'\u180b'..'\u180d'|'\u1810'..'\u1819'|'\u1820'..'\u1877'|'\u1880'..'\u18a9'|'\u1900'..'\u191c'|'\u1920'..'\u192b'|'\u1930'..'\u193b'|'\u1946'..'\u196d'|'\u1970'..'\u1974'|'\u1d00'..'\u1d6b'|'\u1e00'..'\u1e9b'|'\u1ea0'..'\u1ef9'|'\u1f00'..'\u1f15'|'\u1f18'..'\u1f1d'|'\u1f20'..'\u1f45'|'\u1f48'..'\u1f4d'|'\u1f50'..'\u1f57'|'\u1f59'|'\u1f5b'|'\u1f5d'|'\u1f5f'..'\u1f7d'|'\u1f80'..'\u1fb4'|'\u1fb6'..'\u1fbc'|'\u1fbe'|'\u1fc2'..'\u1fc4'|'\u1fc6'..'\u1fcc'|'\u1fd0'..'\u1fd3'|'\u1fd6'..'\u1fdb'|'\u1fe0'..'\u1fec'|'\u1ff2'..'\u1ff4'|'\u1ff6'..'\u1ffc'|'\u200c'..'\u200f'|'\u202a'..'\u202e'|'\u203f'..'\u2040'|'\u2054'|'\u2060'..'\u2063'|'\u206a'..'\u206f'|'\u2071'|'\u207f'|'\u20a0'..'\u20b1'|'\u20d0'..'\u20dc'|'\u20e1'|'\u20e5'..'\u20ea'|'\u2102'|'\u2107'|'\u210a'..'\u2113'|'\u2115'|'\u2119'..'\u211d'|'\u2124'|'\u2126'|'\u2128'|'\u212a'..'\u212d'|'\u212f'..'\u2131'|'\u2133'..'\u2139'|'\u213d'..'\u213f'|'\u2145'..'\u2149'|'\u2160'..'\u2183'|'\u3005'..'\u3007'|'\u3021'..'\u302f'|'\u3031'..'\u3035'|'\u3038'..'\u303c'|'\u3041'..'\u3096'|'\u3099'..'\u309a'|'\u309d'..'\u309f'|'\u30a1'..'\u30ff'|'\u3105'..'\u312c'|'\u3131'..'\u318e'|'\u31a0'..'\u31b7'|'\u31f0'..'\u31ff'|'\u3400'..'\u4db5'|'\u4e00'..'\u9fa5'|'\ua000'..'\ua48c'|'\uac00'..'\ud7a3'|'\ud800'..'\udfff'|'\uf900'..'\ufa2d'|'\ufa30'..'\ufa6a'|'\ufb00'..'\ufb06'|'\ufb13'..'\ufb17'|'\ufb1d'..'\ufb28'|'\ufb2a'..'\ufb36'|'\ufb38'..'\ufb3c'|'\ufb3e'|'\ufb40'..'\ufb41'|'\ufb43'..'\ufb44'|'\ufb46'..'\ufbb1'|'\ufbd3'..'\ufd3d'|'\ufd50'..'\ufd8f'|'\ufd92'..'\ufdc7'|'\ufdf0'..'\ufdfc'|'\ufe00'..'\ufe0f'|'\ufe20'..'\ufe23'|'\ufe33'..'\ufe34'|'\ufe4d'..'\ufe4f'|'\ufe69'|'\ufe70'..'\ufe74'|'\ufe76'..'\ufefc'|'\ufeff'|'\uff04'|'\uff10'..'\uff19'|'\uff21'..'\uff3a'|'\uff3f'|'\uff41'..'\uff5a'|'\uff65'..'\uffbe'|'\uffc2'..'\uffc7'|'\uffca'..'\uffcf'|'\uffd2'..'\uffd7'|'\uffda'..'\uffdc'|'\uffe0'..'\uffe1'|'\uffe5'..'\uffe6'|'\ufff9'..'\ufffb')*$;
	
	
	DEFINE FLOAT_LITERAL $('0'..'9')+ '.' ('0'..'9')* (('e'|'E'|'p'|'P') ('+'|'-')? ('0'..'9')+)? ('f'|'F') | ('.' ('0'..'9')+ (('e'|'E'|'p'|'P') ('+'|'-')? ('0'..'9')+)?) ('f'|'F') | (('0'..'9')+ (('e'|'E'|'p'|'P') ('+'|'-')? ('0'..'9')+) ('f'|'F') | ('0'..'9')+ ('f'|'F'))$;
	DEFINE INTEGER_LITERAL $('0'|'1'..'9''0'..'9'*)$;
	
	
	DEFINE WHITESPACE $(' '|'\t'|'\f')$;
	DEFINE LINEBREAKS $('\r\n'|'\r'|'\n')$;
}
			
			
			TOKENSTYLES {
				"Assignment" COLOR #7F0055, BOLD;
				"tag" COLOR #7F0055, BOLD;
				"ownedTags" COLOR #7F0055, BOLD;
				"containedType" COLOR #7F0055, BOLD;
				"staticType" COLOR #7F0055, BOLD;
				"target" COLOR #7F0055, BOLD;
				"value" COLOR #7F0055, BOLD;
				"Block" COLOR #7F0055, BOLD;
				"statement" COLOR #7F0055, BOLD;
				"rescueBlock" COLOR #7F0055, BOLD;
				"CallVariable" COLOR #7F0055, BOLD;
				"parameters" COLOR #7F0055, BOLD;
				"name" COLOR #7F0055, BOLD;
				"staticTypeVariableBindings" COLOR #7F0055, BOLD;
				"CallFeature" COLOR #7F0055, BOLD;
				"staticProperty" COLOR #7F0055, BOLD;
				"staticOperation" COLOR #7F0055, BOLD;
				"staticEnumLiteral" COLOR #7F0055, BOLD;
				"CallSuperOperation" COLOR #7F0055, BOLD;
				"CallResult" COLOR #7F0055, BOLD;
				"CallValue" COLOR #7F0055, BOLD;
				"Conditional" COLOR #7F0055, BOLD;
				"thenBody" COLOR #7F0055, BOLD;
				"elseBody" COLOR #7F0055, BOLD;
				"condition" COLOR #7F0055, BOLD;
				"Raise" COLOR #7F0055, BOLD;
				"expression" COLOR #7F0055, BOLD;
				"Rescue" COLOR #7F0055, BOLD;
				"body" COLOR #7F0055, BOLD;
				"exceptionType" COLOR #7F0055, BOLD;
				"exceptionName" COLOR #7F0055, BOLD;
				"TypeReference" COLOR #7F0055, BOLD;
				"type" COLOR #7F0055, BOLD;
				"lower" COLOR #7F0055, BOLD;
				"upper" COLOR #7F0055, BOLD;
				"EmptyExpression" COLOR #7F0055, BOLD;
				"JavaStaticCall" COLOR #7F0055, BOLD;
				"jclass" COLOR #7F0055, BOLD;
				"jmethod" COLOR #7F0055, BOLD;
				"LambdaExpression" COLOR #7F0055, BOLD;
				"LambdaParameter" COLOR #7F0055, BOLD;
				"IntegerLiteral" COLOR #7F0055, BOLD;
				"StringLiteral" COLOR #7F0055, BOLD;
				"BooleanLiteral" COLOR #7F0055, BOLD;
				"TypeLiteral" COLOR #7F0055, BOLD;
				"typeref" COLOR #7F0055, BOLD;
				"VoidLiteral" COLOR #7F0055, BOLD;
				"Loop" COLOR #7F0055, BOLD;
				"initialization" COLOR #7F0055, BOLD;
				"stopCondition" COLOR #7F0055, BOLD;
				"SelfExpression" COLOR #7F0055, BOLD;
				"VariableDecl" COLOR #7F0055, BOLD;
				"identifier" COLOR #7F0055, BOLD;
				"Object" COLOR #7F0055, BOLD;
				"Operation" COLOR #7F0055, BOLD;
				"raisedException" COLOR #7F0055, BOLD;
				"ownedParameter" COLOR #7F0055, BOLD;
				"pre" COLOR #7F0055, BOLD;
				"post" COLOR #7F0055, BOLD;
				"superOperation" COLOR #7F0055, BOLD;
				"ownedUnresolvedOperations" COLOR #7F0055, BOLD;
				"owningClass" COLOR #7F0055, BOLD;
				"typeParameter" COLOR #7F0055, BOLD;
				"Property" COLOR #7F0055, BOLD;
				"opposite" COLOR #7F0055, BOLD;
				"default" COLOR #7F0055, BOLD;
				"getterBody" COLOR #7F0055, BOLD;
				"setterBody" COLOR #7F0055, BOLD;
				"ownedUnresolvedProperties" COLOR #7F0055, BOLD;
				"EnumerationLiteral" COLOR #7F0055, BOLD;
				"enumeration" COLOR #7F0055, BOLD;
				"TypeVariableBinding" COLOR #7F0055, BOLD;
				"variable" COLOR #7F0055, BOLD;
				"MultiplicityElement" COLOR #7F0055, BOLD;
				"TypeDefinition" COLOR #7F0055, BOLD;
				"Class" COLOR #7F0055, BOLD;
				"typeContainer" COLOR #7F0055, BOLD;
				"virtualTypeBinding" COLOR #7F0055, BOLD;
				"typeParamBinding" COLOR #7F0055, BOLD;
				"typeDefinition" COLOR #7F0055, BOLD;
				"ownedAttribute" COLOR #7F0055, BOLD;
				"ownedOperation" COLOR #7F0055, BOLD;
				"superClass" COLOR #7F0055, BOLD;
				"Enumeration" COLOR #7F0055, BOLD;
				"ownedLiteral" COLOR #7F0055, BOLD;
				"Package" COLOR #7F0055, BOLD;
				"ownedTypeDefinition" COLOR #7F0055, BOLD;
				"nestedPackage" COLOR #7F0055, BOLD;
				"nestingPackage" COLOR #7F0055, BOLD;
				"uri" COLOR #7F0055, BOLD;
				"Parameter" COLOR #7F0055, BOLD;
				"operation" COLOR #7F0055, BOLD;
				"PrimitiveType" COLOR #7F0055, BOLD;
				"instanceType" COLOR #7F0055, BOLD;
				"Tag" COLOR #7F0055, BOLD;
				"object" COLOR #7F0055, BOLD;
				"Constraint" COLOR #7F0055, BOLD;
				"stereotype" COLOR #7F0055, BOLD;
				"language" COLOR #7F0055, BOLD;
				"invOwner" COLOR #7F0055, BOLD;
				"preOwner" COLOR #7F0055, BOLD;
				"postOwner" COLOR #7F0055, BOLD;
				"ClassDefinition" COLOR #7F0055, BOLD;
				"inv" COLOR #7F0055, BOLD;
				"superType" COLOR #7F0055, BOLD;
				"ModelingUnit" COLOR #7F0055, BOLD;
				"packages" COLOR #7F0055, BOLD;
				"namespacePrefix" COLOR #7F0055, BOLD;
				"requires" COLOR #7F0055, BOLD;
				"usings" COLOR #7F0055, BOLD;
				"TypeDefinitionContainer" COLOR #7F0055, BOLD;
				"Require" COLOR #7F0055, BOLD;
				"Using" COLOR #7F0055, BOLD;
				"qualifiedName" COLOR #7F0055, BOLD;
				"ObjectTypeVariable" COLOR #7F0055, BOLD;
				"supertype" COLOR #7F0055, BOLD;
				"ModelType" COLOR #7F0055, BOLD;
				"includedTypeDefinition" COLOR #7F0055, BOLD;
				"ownedPackages" COLOR #7F0055, BOLD;
				"ModelTypeVariable" COLOR #7F0055, BOLD;
				"virtualType" COLOR #7F0055, BOLD;
				"VirtualType" COLOR #7F0055, BOLD;
				"classDefinition" COLOR #7F0055, BOLD;
				"modelType" COLOR #7F0055, BOLD;
				"Model" COLOR #7F0055, BOLD;
				"contents" COLOR #7F0055, BOLD;
				"UnresolvedType" COLOR #7F0055, BOLD;
				"typeIdentifier" COLOR #7F0055, BOLD;
				"UnresolvedProperty" COLOR #7F0055, BOLD;
				"propertyIdentifier" COLOR #7F0055, BOLD;
				"UnresolvedOperation" COLOR #7F0055, BOLD;
				"operationIdentifier" COLOR #7F0055, BOLD;
				"ProductType" COLOR #7F0055, BOLD;
				"FunctionType" COLOR #7F0055, BOLD;
				"left" COLOR #7F0055, BOLD;
				"right" COLOR #7F0055, BOLD;
				"VoidType" COLOR #7F0055, BOLD;
			}
			
			
			RULES {
				org.kermeta.language.behavior.Assignment ::=isCast[]? "Assignment"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "target"  ":" target | "value"  ":" value )* "}"  ;
				org.kermeta.language.behavior.Block ::= "Block"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "statement"  ":" statement | "rescueBlock"  ":" rescueBlock )* "}"  ;
				org.kermeta.language.behavior.CallVariable ::=isAtpre[]? "CallVariable"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "parameters"  ":" parameters | "name"  ":" name[STRING_LITERAL] | "staticTypeVariableBindings"  ":" staticTypeVariableBindings[] )* "}"  ;
				org.kermeta.language.behavior.CallFeature ::=isAtpre[]? "CallFeature"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "parameters"  ":" parameters | "name"  ":" name[STRING_LITERAL] | "staticTypeVariableBindings"  ":" staticTypeVariableBindings[]| "target"  ":" target | "staticProperty"  ":" staticProperty[]| "staticOperation"  ":" staticOperation[]| "staticEnumLiteral"  ":" staticEnumLiteral[] )* "}"  ;
				org.kermeta.language.behavior.CallSuperOperation ::= "CallSuperOperation"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "parameters"  ":" parameters | "name"  ":" name[STRING_LITERAL] | "staticTypeVariableBindings"  ":" staticTypeVariableBindings[] )* "}"  ;
				org.kermeta.language.behavior.CallResult ::=isAtpre[]? "CallResult"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "parameters"  ":" parameters | "name"  ":" name[STRING_LITERAL] | "staticTypeVariableBindings"  ":" staticTypeVariableBindings[] )* "}"  ;
				org.kermeta.language.behavior.CallValue ::= "CallValue"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "parameters"  ":" parameters | "name"  ":" name[STRING_LITERAL] | "staticTypeVariableBindings"  ":" staticTypeVariableBindings[] )* "}"  ;
				org.kermeta.language.behavior.Conditional ::= "Conditional"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "thenBody"  ":" thenBody | "elseBody"  ":" elseBody | "condition"  ":" condition )* "}"  ;
				org.kermeta.language.behavior.Raise ::= "Raise"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "expression"  ":" expression )* "}"  ;
				org.kermeta.language.behavior.Rescue ::= "Rescue"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "body"  ":" body | "exceptionType"  ":" exceptionType | "exceptionName"  ":" exceptionName[STRING_LITERAL] )* "}"  ;
				org.kermeta.language.behavior.TypeReference ::=isOrdered[]?isUnique[]? "TypeReference"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "name"  ":" name[STRING_LITERAL] | "type"  ":" type[]| "lower"  ":" lower[INTEGER_LITERAL]| "upper"  ":" upper[INTEGER_LITERAL] )* "}"  ;
				org.kermeta.language.behavior.EmptyExpression ::= "EmptyExpression"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[] )* "}"  ;
				org.kermeta.language.behavior.JavaStaticCall ::= "JavaStaticCall"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "parameters"  ":" parameters | "jclass"  ":" jclass[STRING_LITERAL] | "jmethod"  ":" jmethod[STRING_LITERAL] )* "}"  ;
				org.kermeta.language.behavior.LambdaExpression ::= "LambdaExpression"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "parameters"  ":" parameters | "body"  ":" body )* "}"  ;
				org.kermeta.language.behavior.LambdaParameter ::= "LambdaParameter"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name[STRING_LITERAL] | "type"  ":" type )* "}"  ;
				org.kermeta.language.behavior.IntegerLiteral ::= "IntegerLiteral"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "value"  ":" value[INTEGER_LITERAL] )* "}"  ;
				org.kermeta.language.behavior.StringLiteral ::= "StringLiteral"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "value"  ":" value[STRING_LITERAL] )* "}"  ;
				org.kermeta.language.behavior.BooleanLiteral ::=value[]? "BooleanLiteral"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[] )* "}"  ;
				org.kermeta.language.behavior.TypeLiteral ::= "TypeLiteral"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "typeref"  ":" typeref )* "}"  ;
				org.kermeta.language.behavior.VoidLiteral ::= "VoidLiteral"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[] )* "}"  ;
				org.kermeta.language.behavior.Loop ::= "Loop"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "initialization"  ":" initialization | "body"  ":" body | "stopCondition"  ":" stopCondition )* "}"  ;
				org.kermeta.language.behavior.SelfExpression ::= "SelfExpression"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[] )* "}"  ;
				org.kermeta.language.behavior.VariableDecl ::= "VariableDecl"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "initialization"  ":" initialization | "identifier"  ":" identifier[STRING_LITERAL] | "type"  ":" type )* "}"  ;
				org.kermeta.language.structure.Object ::= "Object"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags )* "}"  ;
				org.kermeta.language.structure.Operation ::=isOrdered[]?isUnique[]?isAbstract[]? "Operation"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "name"  ":" name[STRING_LITERAL] | "type"  ":" type[]| "lower"  ":" lower[INTEGER_LITERAL]| "upper"  ":" upper[INTEGER_LITERAL]| "raisedException"  ":" raisedException[]| "ownedParameter"  ":" ownedParameter | "pre"  ":" pre | "post"  ":" post | "body"  ":" body | "superOperation"  ":" superOperation[]| "ownedUnresolvedOperations"  ":" ownedUnresolvedOperations | "owningClass"  ":" owningClass[]| "typeParameter"  ":" typeParameter[] )* "}"  ;
				org.kermeta.language.structure.Property ::=isOrdered[]?isUnique[]?isReadOnly[]?isComposite[]?isDerived[]?isID[]?isGetterAbstract[]?isSetterAbstract[]? "Property"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "name"  ":" name[STRING_LITERAL] | "type"  ":" type[]| "lower"  ":" lower[INTEGER_LITERAL]| "upper"  ":" upper[INTEGER_LITERAL]| "opposite"  ":" opposite[]| "default"  ":" default[STRING_LITERAL] | "getterBody"  ":" getterBody | "setterBody"  ":" setterBody | "ownedUnresolvedProperties"  ":" ownedUnresolvedProperties | "owningClass"  ":" owningClass[] )* "}"  ;
				org.kermeta.language.structure.EnumerationLiteral ::= "EnumerationLiteral"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name[STRING_LITERAL] | "enumeration"  ":" enumeration[] )* "}"  ;
				org.kermeta.language.structure.TypeVariableBinding ::= "TypeVariableBinding"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "variable"  ":" variable[]| "type"  ":" type[] )* "}"  ;
				org.kermeta.language.structure.MultiplicityElement ::=isOrdered[]?isUnique[]? "MultiplicityElement"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "name"  ":" name[STRING_LITERAL] | "type"  ":" type[]| "lower"  ":" lower[INTEGER_LITERAL]| "upper"  ":" upper[INTEGER_LITERAL] )* "}"  ;
				org.kermeta.language.structure.TypeDefinition ::=isAspect[]? "TypeDefinition"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name[STRING_LITERAL] )* "}"  ;
//				org.kermeta.language.structure.Class ::=isAbstract[]? "Class"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "typeContainer"  ":" typeContainer[]| "virtualTypeBinding"  ":" virtualTypeBinding | "typeParamBinding"  ":" typeParamBinding | "typeDefinition"  ":" typeDefinition[]| "ownedAttribute"  ":" ownedAttribute[]| "ownedOperation"  ":" ownedOperation[]| "superClass"  ":" superClass[]| "name"  ":" name[STRING_LITERAL] )* "}"  ;
				org.kermeta.language.structure.Class ::=isAbstract[]? "Class"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "typeContainer"  ":" typeContainer[]| "virtualTypeBinding"  ":" virtualTypeBinding | "typeParamBinding"  ":" typeParamBinding | "typeDefinition"  ":" typeDefinition[]| "name"  ":" name[STRING_LITERAL] )* "}"  ;
				org.kermeta.language.structure.Enumeration ::=isAspect[]? "Enumeration"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "typeContainer"  ":" typeContainer[]| "name"  ":" name[STRING_LITERAL] | "ownedLiteral"  ":" ownedLiteral )* "}"  ;
				org.kermeta.language.structure.Package ::= "Package"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name[STRING_LITERAL] | "ownedTypeDefinition"  ":" ownedTypeDefinition | "nestedPackage"  ":" nestedPackage | "nestingPackage"  ":" nestingPackage[]| "uri"  ":" uri[STRING_LITERAL] )* "}"  ;
				org.kermeta.language.structure.Parameter ::=isOrdered[]?isUnique[]? "Parameter"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "name"  ":" name[STRING_LITERAL] | "type"  ":" type[]| "lower"  ":" lower[INTEGER_LITERAL]| "upper"  ":" upper[INTEGER_LITERAL]| "operation"  ":" operation[] )* "}"  ;
				org.kermeta.language.structure.PrimitiveType ::=isAspect[]? "PrimitiveType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "typeContainer"  ":" typeContainer[]| "name"  ":" name[STRING_LITERAL] | "containedType"  ":" containedType | "instanceType"  ":" instanceType[] )* "}"  ;
				org.kermeta.language.structure.Tag ::= "Tag"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name[STRING_LITERAL] | "value"  ":" value[STRING_LITERAL] | "object"  ":" object[] )* "}"  ;
				org.kermeta.language.structure.Constraint ::= "Constraint"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name[STRING_LITERAL] | "body"  ":" body | "stereotype"  ":" stereotype[]| "language"  ":" language[]| "invOwner"  ":" invOwner[]| "preOwner"  ":" preOwner[]| "postOwner"  ":" postOwner[] )* "}"  ;
				org.kermeta.language.structure.ClassDefinition ::=isAspect[]?isAbstract[]? "ClassDefinition"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name[STRING_LITERAL] | "typeParameter"  ":" typeParameter | "containedType"  ":" containedType | "inv"  ":" inv | "ownedAttribute"  ":" ownedAttribute | "ownedOperation"  ":" ownedOperation | "superType"  ":" superType[] )* "}"  ;
				org.kermeta.language.structure.ModelingUnit ::= "ModelingUnit"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name[STRING_LITERAL] | "ownedTypeDefinition"  ":" ownedTypeDefinition | "packages"  ":" packages | "namespacePrefix"  ":" namespacePrefix[STRING_LITERAL] | "requires"  ":" requires | "usings"  ":" usings )* "}"  ;
				org.kermeta.language.structure.TypeDefinitionContainer ::= "TypeDefinitionContainer"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name[STRING_LITERAL] | "ownedTypeDefinition"  ":" ownedTypeDefinition )* "}"  ;
				org.kermeta.language.structure.Require ::= "Require"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "uri"  ":" uri[STRING_LITERAL] )* "}"  ;
				org.kermeta.language.structure.Using ::= "Using"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "qualifiedName"  ":" qualifiedName[STRING_LITERAL] )* "}"  ;
				org.kermeta.language.structure.ObjectTypeVariable ::= "ObjectTypeVariable"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "typeContainer"  ":" typeContainer[]| "name"  ":" name[STRING_LITERAL] | "supertype"  ":" supertype[] )* "}"  ;
				org.kermeta.language.structure.ModelType ::=isAspect[]? "ModelType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "typeContainer"  ":" typeContainer[]| "name"  ":" name[STRING_LITERAL] | "includedTypeDefinition"  ":" includedTypeDefinition[]| "ownedPackages"  ":" ownedPackages )* "}"  ;
				org.kermeta.language.structure.ModelTypeVariable ::= "ModelTypeVariable"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "typeContainer"  ":" typeContainer[]| "name"  ":" name[STRING_LITERAL] | "supertype"  ":" supertype[]| "virtualType"  ":" virtualType )* "}"  ;
				org.kermeta.language.structure.VirtualType ::= "VirtualType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "typeContainer"  ":" typeContainer[]| "name"  ":" name[STRING_LITERAL] | "supertype"  ":" supertype[]| "classDefinition"  ":" classDefinition[]| "modelType"  ":" modelType[]| "typeParamBinding"  ":" typeParamBinding )* "}"  ;
				org.kermeta.language.structure.Model ::= "Model"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags  )* "}"  ;
				org.kermeta.language.structure.UnresolvedType ::= "UnresolvedType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "typeContainer"  ":" typeContainer[]| "typeIdentifier"  ":" typeIdentifier[STRING_LITERAL] )* "}"  ;
				org.kermeta.language.structure.UnresolvedProperty ::= "UnresolvedProperty"  "{" ( "propertyIdentifier"  ":" propertyIdentifier[STRING_LITERAL]  )* "}"  ;
				org.kermeta.language.structure.UnresolvedOperation ::= "UnresolvedOperation"  "{" ( "operationIdentifier"  ":" operationIdentifier[STRING_LITERAL]  )* "}"  ;
				org.kermeta.language.structure.ProductType ::= "ProductType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "typeContainer"  ":" typeContainer[]| "type"  ":" type[] )* "}"  ;
				org.kermeta.language.structure.FunctionType ::= "FunctionType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "typeContainer"  ":" typeContainer[]| "left"  ":" left[]| "right"  ":" right[] )* "}"  ;
				org.kermeta.language.structure.VoidType ::= "VoidType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "typeContainer"  ":" typeContainer[] )* "}"  ;
			}