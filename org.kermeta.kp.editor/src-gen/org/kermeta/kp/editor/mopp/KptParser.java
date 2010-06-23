// $ANTLR 3.1.1

	package org.kermeta.kp.editor.mopp;


import org.antlr.runtime.*;
import java.util.HashMap;
public class KptParser extends KptANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "QUOTED_34_34", "NSURI", "TEXT", "SL_COMMENT", "ML_COMMENT", "INTEGER", "FLOAT", "MAVEN", "WHITESPACE", "LINEBREAK", "'KermetaProject'", "':'", "'version'", "': '", "'group'", "'{'", "'}'", "'source'", "'='", "'from'", "'dependency'", "'weaver-directive'", "'merger-option'", "'('", "')'", "'ref'", "'['", "']'"
    };
    public static final int MAVEN=11;
    public static final int INTEGER=9;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int WHITESPACE=12;
    public static final int FLOAT=10;
    public static final int TEXT=6;
    public static final int EOF=-1;
    public static final int ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int SL_COMMENT=7;
    public static final int NSURI=5;
    public static final int QUOTED_34_34=4;
    public static final int LINEBREAK=13;

    // delegates
    // delegators


        public KptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public KptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[33+1];
             
             
        }
        

    public String[] getTokenNames() { return KptParser.tokenNames; }
    public String getGrammarFileName() { return "/home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g"; }


    	private org.kermeta.kp.editor.IKptTokenResolverFactory tokenResolverFactory = new org.kermeta.kp.editor.mopp.KptTokenResolverFactory();
    	@SuppressWarnings("unused")
    	
    	private int lastPosition;
    	private org.kermeta.kp.editor.mopp.KptTokenResolveResult tokenResolveResult = new org.kermeta.kp.editor.mopp.KptTokenResolveResult();
    	private boolean rememberExpectedElements = false;
    	private java.lang.Object parseToIndexTypeObject;
    	private int lastTokenIndex = 0;
    	private java.util.List<org.kermeta.kp.editor.mopp.KptExpectedTerminal> expectedElements = new java.util.ArrayList<org.kermeta.kp.editor.mopp.KptExpectedTerminal>();
    	private int mismatchedTokenRecoveryTries = 0;
    	private java.util.Map<?, ?> options;
    	//helper lists to allow a lexer to pass errors to its parser
    	protected java.util.List<org.antlr.runtime.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime.RecognitionException>());
    	protected java.util.List<java.lang.Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<java.lang.Integer>());
    	private int stopIncludingHiddenTokens;
    	private int stopExcludingHiddenTokens;
    	private java.util.Collection<org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>> postParseCommands;
    	private boolean terminateParsing;
    	private int tokenIndexOfLastCompleteElement;
    	private int expectedElementsIndexOfLastCompleteElement;
    	
    	protected void addErrorToResource(final java.lang.String errorMessage, final int line, final int charPositionInLine, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>() {
    			public boolean execute(org.kermeta.kp.editor.IKptTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for
    					// code completion
    					return true;
    				}
    				resource.addProblem(new org.kermeta.kp.editor.IKptProblem() {
    					public org.kermeta.kp.editor.KptEProblemType getType() {
    						return org.kermeta.kp.editor.KptEProblemType.ERROR;
    					}
    					public java.lang.String getMessage() {
    						return errorMessage;
    					}
    				}, line, charPositionInLine, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	public void addExpectedElement(org.kermeta.kp.editor.mopp.KptExpectedTerminal expectedElement) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		setPosition(expectedElement, input.index());
    		this.expectedElements.add(expectedElement);
    	}
    	
    	protected void addMapEntry(org.eclipse.emf.ecore.EObject element, org.eclipse.emf.ecore.EStructuralFeature structuralFeature, org.kermeta.kp.editor.mopp.KptDummyEObject dummy) {
    		java.lang.Object value = element.eGet(structuralFeature);
    		java.lang.Object mapKey = dummy.getValueByName("key");
    		java.lang.Object mapValue = dummy.getValueByName("value");
    		if (value instanceof org.eclipse.emf.common.util.EMap<?, ?>) {
    			org.eclipse.emf.common.util.EMap<java.lang.Object, java.lang.Object> valueMap = org.kermeta.kp.editor.util.KptMapUtil.castToEMap(value);
    			if (mapKey != null && mapValue != null) {
    				valueMap.put(mapKey, mapValue);
    			}
    		}
    	}
    	
    	@SuppressWarnings("unchecked")
    	
    	private boolean addObjectToList(org.eclipse.emf.ecore.EObject element, int featureID, java.lang.Object proxy) {
    		return ((java.util.List<java.lang.Object>) element.eGet(element.eClass().getEStructuralFeature(featureID))).add(proxy);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject apply(org.eclipse.emf.ecore.EObject target, java.util.List<org.eclipse.emf.ecore.EObject> dummyEObjects) {
    		org.eclipse.emf.ecore.EObject currentTarget = target;
    		for (org.eclipse.emf.ecore.EObject object : dummyEObjects) {
    			assert(object instanceof org.kermeta.kp.editor.mopp.KptDummyEObject);
    			org.kermeta.kp.editor.mopp.KptDummyEObject dummy = (org.kermeta.kp.editor.mopp.KptDummyEObject) object;
    			org.eclipse.emf.ecore.EObject newEObject = dummy.applyTo(currentTarget);
    			currentTarget = newEObject;
    		}
    		return currentTarget;
    	}
    	
    	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
    	}
    	
    	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
    		postParseCommands.add(new org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>() {
    			public boolean execute(org.kermeta.kp.editor.IKptTextResource resource) {
    				org.kermeta.kp.editor.IKptLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for
    					// code completion
    					return true;
    				}
    				locationMap.setCharStart(target, locationMap.getCharStart(source));
    				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
    				locationMap.setColumn(target, locationMap.getColumn(source));
    				locationMap.setLine(target, locationMap.getLine(source));
    				return true;
    			}
    		});
    	}
    	
    	protected void copyLocalizationInfos(final org.antlr.runtime.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
    		postParseCommands.add(new org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>() {
    			public boolean execute(org.kermeta.kp.editor.IKptTextResource resource) {
    				org.kermeta.kp.editor.IKptLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for
    					// code completion
    					return true;
    				}
    				if (source == null) {
    					return true;
    				}
    				locationMap.setCharStart(target, source.getStartIndex());
    				locationMap.setCharEnd(target, source.getStopIndex());
    				locationMap.setColumn(target, source.getCharPositionInLine());
    				locationMap.setLine(target, source.getLine());
    				return true;
    			}
    		});
    	}
    	
    	public org.kermeta.kp.editor.IKptTextParser createInstance(java.io.InputStream actualInputStream, java.lang.String encoding) {
    		try {
    			if (encoding == null) {
    				return new KptParser(new org.antlr.runtime.CommonTokenStream(new KptLexer(new org.antlr.runtime.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new KptParser(new org.antlr.runtime.CommonTokenStream(new KptLexer(new org.antlr.runtime.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			org.kermeta.kp.editor.mopp.KptPlugin.logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	// This default constructor is only used to call createInstance() on it
    	public KptParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((KptLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((KptLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		java.lang.Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == org.kermeta.kp.KermetaProject.class) {
    				return parse_org_kermeta_kp_KermetaProject();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.SourceFolder.class) {
    				return parse_org_kermeta_kp_SourceFolder();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.SourceFile.class) {
    				return parse_org_kermeta_kp_SourceFile();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.SourceNSURI.class) {
    				return parse_org_kermeta_kp_SourceNSURI();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.SourceQuery.class) {
    				return parse_org_kermeta_kp_SourceQuery();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.Dependency.class) {
    				return parse_org_kermeta_kp_Dependency();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.WeaveDirective.class) {
    				return parse_org_kermeta_kp_WeaveDirective();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.Option.class) {
    				return parse_org_kermeta_kp_Option();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.StringExpression.class) {
    				return parse_org_kermeta_kp_StringExpression();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.MixExpression.class) {
    				return parse_org_kermeta_kp_MixExpression();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.NamedElement.class) {
    				return parse_org_kermeta_kp_NamedElement();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.KermetaProjectRef.class) {
    				return parse_org_kermeta_kp_KermetaProjectRef();
    			}
    		}
    		throw new org.kermeta.kp.editor.mopp.KptUnexpectedContentTypeException(typeObject);
    	}
    	
    	private org.kermeta.kp.editor.mopp.KptTokenResolveResult getFreshTokenResolveResult() {
    		tokenResolveResult.clear();
    		return tokenResolveResult;
    	}
    	
    	public int getMismatchedTokenRecoveryTries() {
    		return mismatchedTokenRecoveryTries;
    	}
    	
    	public java.lang.Object getMissingSymbol(org.antlr.runtime.IntStream arg0, org.antlr.runtime.RecognitionException arg1, int arg2, org.antlr.runtime.BitSet arg3) {
    		mismatchedTokenRecoveryTries++;
    		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
    	}
    	
    	protected java.util.Map<?,?> getOptions() {
    		return options;
    	}
    	
    	public org.kermeta.kp.editor.mopp.KptMetaInformation getMetaInformation() {
    		return new org.kermeta.kp.editor.mopp.KptMetaInformation();
    	}
    	
    	public java.lang.Object getParseToIndexTypeObject() {
    		return parseToIndexTypeObject;
    	}
    	
    	protected org.kermeta.kp.editor.mopp.KptReferenceResolverSwitch getReferenceResolverSwitch() {
    		return (org.kermeta.kp.editor.mopp.KptReferenceResolverSwitch) getMetaInformation().getReferenceResolverSwitch();
    	}
    	
    	protected java.lang.Object getTypeObject() {
    		java.lang.Object typeObject = getParseToIndexTypeObject();
    		if (typeObject != null) {
    			return typeObject;
    		}
    		java.util.Map<?,?> options = getOptions();
    		if (options != null) {
    			typeObject = options.get(org.kermeta.kp.editor.IKptOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	// Implementation that calls {@link #doParse()}  and handles the thrown
    	// RecognitionExceptions.
    	public org.kermeta.kp.editor.IKptParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>>();
    		org.kermeta.kp.editor.mopp.KptParseResult parseResult = new org.kermeta.kp.editor.mopp.KptParseResult();
    		try {
    			org.eclipse.emf.ecore.EObject result =  doParse();
    			if (lexerExceptions.isEmpty()) {
    				parseResult.setRoot(result);
    			}
    		} catch (org.antlr.runtime.RecognitionException re) {
    			reportError(re);
    		} catch (java.lang.IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				//? can be caused if a null is set on EMF models where not allowed;
    				//? this will just happen if other errors occurred before
    			} else {
    				iae.printStackTrace();
    			}
    		}
    		for (org.antlr.runtime.RecognitionException re : lexerExceptions) {
    			reportLexicalError(re);
    		}
    		parseResult.getPostParseCommands().addAll(postParseCommands);
    		return parseResult;
    	}
    	
    	public java.util.List<org.kermeta.kp.editor.mopp.KptExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.kermeta.kp.editor.IKptTextResource dummyResource) {
    		rememberExpectedElements = true;
    		parseToIndexTypeObject = type;
    		final org.antlr.runtime.CommonTokenStream tokenStream = (org.antlr.runtime.CommonTokenStream) getTokenStream();
    		org.kermeta.kp.editor.IKptParseResult result = parse();
    		if (result != null) {
    			org.eclipse.emf.ecore.EObject root = result.getRoot();
    			if (root != null) {
    				dummyResource.getContents().add(root);
    			}
    			for (org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<org.kermeta.kp.editor.mopp.KptExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<org.kermeta.kp.editor.mopp.KptExpectedTerminal>();
    		java.util.List<org.kermeta.kp.editor.mopp.KptExpectedTerminal> newFollowSet = new java.util.ArrayList<org.kermeta.kp.editor.mopp.KptExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			org.kermeta.kp.editor.mopp.KptExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 66;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			org.antlr.runtime.CommonToken nextToken = (org.antlr.runtime.CommonToken) tokenStream.get(i);
    			if (nextToken.getChannel() == 99) {
    				// hidden tokens do not reduce the follow set
    			} else {
    				// now that we have found the next visible token the position for that expected terminals
    				// can be set
    				for (org.kermeta.kp.editor.mopp.KptExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are kept
    				for (org.kermeta.kp.editor.mopp.KptExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenName().equals(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<org.kermeta.kp.editor.IKptExpectedElement> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (org.kermeta.kp.editor.IKptExpectedElement newFollower : newFollowers) {
    							org.kermeta.kp.editor.mopp.KptExpectedTerminal newFollowTerminal = new org.kermeta.kp.editor.mopp.KptExpectedTerminal(newFollower, followSetID);
    							newFollowSet.add(newFollowTerminal);
    							expectedElements.add(newFollowTerminal);
    						}
    					}
    				}
    				currentFollowSet.clear();
    				currentFollowSet.addAll(newFollowSet);
    			}
    			followSetID++;
    		}
    		// after the last token in the stream we must set the position for the elements that were
    		// added during the last iteration of the loop
    		for (org.kermeta.kp.editor.mopp.KptExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(org.kermeta.kp.editor.mopp.KptExpectedTerminal expectedElement, int tokenIndex) {
    		int currentIndex = java.lang.Math.max(0, tokenIndex);
    		for (int index = lastTokenIndex; index < currentIndex; index++) {
    			if (index >= input.size()) {
    				break;
    			}
    			org.antlr.runtime.CommonToken tokenAtIndex = (org.antlr.runtime.CommonToken) input.get(index);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = java.lang.Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    	}
    	
    	public java.lang.Object recoverFromMismatchedToken(org.antlr.runtime.IntStream input, int ttype, org.antlr.runtime.BitSet follow) throws org.antlr.runtime.RecognitionException {
    		if (!rememberExpectedElements) {
    			return super.recoverFromMismatchedToken(input, ttype, follow);
    		} else {
    			return null;
    		}
    	}
    	protected <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(final org.kermeta.kp.editor.mopp.KptContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, final ContainerType element, final org.eclipse.emf.ecore.EReference reference, final String id, final org.eclipse.emf.ecore.EObject proxy) {
    		postParseCommands.add(new org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>() {
    			public boolean execute(org.kermeta.kp.editor.IKptTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for
    					// code completion
    					return true;
    				}
    				resource.registerContextDependentProxy(factory, element, reference, id, proxy);
    				return true;
    			}
    		});
    	}
    	
    	// Translates errors thrown by the parser into human readable messages.
    	public void reportError(final org.antlr.runtime.RecognitionException e)  {
    		java.lang.String message = e.getMessage();
    		if (e instanceof org.antlr.runtime.MismatchedTokenException) {
    			org.antlr.runtime.MismatchedTokenException mte = (org.antlr.runtime.MismatchedTokenException) e;
    			java.lang.String tokenName = "<unknown>";
    			if (mte.expecting == Token.EOF) {
    				tokenName = "EOF";
    			} else {
    				tokenName = getTokenNames()[mte.expecting];
    				tokenName = org.kermeta.kp.editor.util.KptStringUtil.formatTokenName(tokenName);
    			}
    			message = "Syntax error on token \"" + e.token.getText() + "\", \"" + tokenName + "\" expected";
    		} else if (e instanceof org.antlr.runtime.MismatchedTreeNodeException) {
    			org.antlr.runtime.MismatchedTreeNodeException mtne = (org.antlr.runtime.MismatchedTreeNodeException) e;
    			java.lang.String tokenName = "<unknown>";
    			if (mtne.expecting == Token.EOF) {
    				tokenName = "EOF";
    			} else {
    				tokenName = getTokenNames()[mtne.expecting];
    			}
    			message = "mismatched tree node: "+"xxx" +"; expecting " + tokenName;
    		} else if (e instanceof org.antlr.runtime.NoViableAltException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
    		} else if (e instanceof org.antlr.runtime.EarlyExitException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime.MismatchedSetException) {
    			org.antlr.runtime.MismatchedSetException mse = (org.antlr.runtime.MismatchedSetException) e;
    			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime.MismatchedNotSetException) {
    			org.antlr.runtime.MismatchedNotSetException mse = (org.antlr.runtime.MismatchedNotSetException) e;
    			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime.FailedPredicateException) {
    			org.antlr.runtime.FailedPredicateException fpe = (org.antlr.runtime.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText+"}?";
    		}
    		// the resource may be null if the parse is used for code completion
    		final java.lang.String finalMessage = message;
    		if (e.token instanceof org.antlr.runtime.CommonToken) {
    			final org.antlr.runtime.CommonToken ct = (org.antlr.runtime.CommonToken) e.token;
    			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
    		} else {
    			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
    		}
    	}
    	
    	// Translates errors thrown by the lexer into human readable messages.
    	public void reportLexicalError(final org.antlr.runtime.RecognitionException e)  {
    		java.lang.String message = "";
    		if (e instanceof org.antlr.runtime.MismatchedTokenException) {
    			org.antlr.runtime.MismatchedTokenException mte = (org.antlr.runtime.MismatchedTokenException) e;
    			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
    		} else if (e instanceof org.antlr.runtime.NoViableAltException) {
    			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime.EarlyExitException) {
    			org.antlr.runtime.EarlyExitException eee = (org.antlr.runtime.EarlyExitException) e;
    			message ="required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
    		} else if (e instanceof org.antlr.runtime.MismatchedSetException) {
    			org.antlr.runtime.MismatchedSetException mse = (org.antlr.runtime.MismatchedSetException) e;
    			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime.MismatchedNotSetException) {
    			org.antlr.runtime.MismatchedNotSetException mse = (org.antlr.runtime.MismatchedNotSetException) e;
    			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime.MismatchedRangeException) {
    			org.antlr.runtime.MismatchedRangeException mre = (org.antlr.runtime.MismatchedRangeException) e;
    			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
    		} else if (e instanceof org.antlr.runtime.FailedPredicateException) {
    			org.antlr.runtime.FailedPredicateException fpe = (org.antlr.runtime.FailedPredicateException) e;
    			message ="rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
    		}
    		addErrorToResource(message, e.index, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
    	}
    	
    	public void setOptions(java.util.Map<?,?> options) {
    		this.options = options;
    	}
    	
    	public void terminate() {
    		terminateParsing = true;
    	}
    	
    	protected void completedElement(Object element) {
    		if (element instanceof org.eclipse.emf.ecore.EObject) {
    			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
    			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
    		}
    	}
    	
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_0 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("KermetaProject");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_1 = new org.kermeta.kp.editor.mopp.KptExpectedCsString(":");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_2 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__NAME), "QUOTED_34_34");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_3 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("version");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_4 = new org.kermeta.kp.editor.mopp.KptExpectedCsString(": ");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_5 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__VERSION), "QUOTED_34_34");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_6 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("group");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_7 = new org.kermeta.kp.editor.mopp.KptExpectedCsString(":");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_8 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__GROUP), "QUOTED_34_34");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_9 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("{");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_10 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("dependency");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_11 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("dependency");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_12 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("source");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_13 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("source");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_14 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("source");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_15 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("source");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_16 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("weaver-directive");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_17 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("merger-option");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_18 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("}");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_19 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("ref");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_20 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("=");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_21 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getSourceFolder().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__FOLDER_NAME), "QUOTED_34_34");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_22 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("=");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_23 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getSourceFile().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__URI), "QUOTED_34_34");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_24 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("=");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_25 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getSourceNSURI().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__URI), "NSURI");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_26 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("from");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_27 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getSourceNSURI().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__FROM), "QUOTED_34_34");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_28 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("=");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_29 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getSourceQuery().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__QUERY), "QUOTED_34_34");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_30 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("from");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_31 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getSourceQuery().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__FROM), "QUOTED_34_34");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_32 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getDependency().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), "QUOTED_34_34");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_33 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("=");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_34 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getDependency().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), "QUOTED_34_34");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_35 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getDependency().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), "QUOTED_34_34");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_36 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getWeaveDirective().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__NAME), "QUOTED_34_34");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_37 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("=");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_38 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getStringExpression().getEStructuralFeature(org.kermeta.kp.KpPackage.STRING_EXPRESSION__VALUE), "QUOTED_34_34");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_39 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("(");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_40 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getOption().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__NAME), "QUOTED_34_34");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_41 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("=");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_42 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getOption().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__VALUE), "QUOTED_34_34");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_43 = new org.kermeta.kp.editor.mopp.KptExpectedCsString(")");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_44 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getNamedElement().getEStructuralFeature(org.kermeta.kp.KpPackage.NAMED_ELEMENT__NAME), "TEXT");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_45 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("{");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_46 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProjectRef().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__GROUP), "QUOTED_34_34");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_47 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("}");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_48 = new org.kermeta.kp.editor.mopp.KptExpectedCsString(":");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_49 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProjectRef().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__NAME), "QUOTED_34_34");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_50 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("[");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_51 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProjectRef().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__VERSION), "QUOTED_34_34");
    	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_52 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("]");
    	
    	public static void wire0() {
    		TERMINAL_0.addFollower(TERMINAL_1);
    		TERMINAL_1.addFollower(TERMINAL_2);
    		TERMINAL_2.addFollower(TERMINAL_3);
    		TERMINAL_3.addFollower(TERMINAL_4);
    		TERMINAL_4.addFollower(TERMINAL_5);
    		TERMINAL_5.addFollower(TERMINAL_6);
    		TERMINAL_6.addFollower(TERMINAL_7);
    		TERMINAL_7.addFollower(TERMINAL_8);
    		TERMINAL_8.addFollower(TERMINAL_9);
    		TERMINAL_9.addFollower(TERMINAL_10);
    		TERMINAL_9.addFollower(TERMINAL_11);
    		TERMINAL_9.addFollower(TERMINAL_12);
    		TERMINAL_9.addFollower(TERMINAL_13);
    		TERMINAL_9.addFollower(TERMINAL_14);
    		TERMINAL_9.addFollower(TERMINAL_15);
    		TERMINAL_9.addFollower(TERMINAL_16);
    		TERMINAL_9.addFollower(TERMINAL_17);
    		TERMINAL_9.addFollower(TERMINAL_18);
    		TERMINAL_18.addFollower(TERMINAL_19);
    		TERMINAL_12.addFollower(TERMINAL_20);
    		TERMINAL_20.addFollower(TERMINAL_21);
    		TERMINAL_21.addFollower(TERMINAL_10);
    		TERMINAL_21.addFollower(TERMINAL_11);
    		TERMINAL_21.addFollower(TERMINAL_12);
    		TERMINAL_21.addFollower(TERMINAL_13);
    		TERMINAL_21.addFollower(TERMINAL_14);
    		TERMINAL_21.addFollower(TERMINAL_15);
    		TERMINAL_21.addFollower(TERMINAL_16);
    		TERMINAL_21.addFollower(TERMINAL_17);
    		TERMINAL_21.addFollower(TERMINAL_18);
    		TERMINAL_13.addFollower(TERMINAL_22);
    		TERMINAL_22.addFollower(TERMINAL_23);
    		TERMINAL_23.addFollower(TERMINAL_10);
    		TERMINAL_23.addFollower(TERMINAL_11);
    		TERMINAL_23.addFollower(TERMINAL_12);
    		TERMINAL_23.addFollower(TERMINAL_13);
    		TERMINAL_23.addFollower(TERMINAL_14);
    		TERMINAL_23.addFollower(TERMINAL_15);
    		TERMINAL_23.addFollower(TERMINAL_16);
    		TERMINAL_23.addFollower(TERMINAL_17);
    		TERMINAL_23.addFollower(TERMINAL_18);
    		TERMINAL_14.addFollower(TERMINAL_24);
    		TERMINAL_24.addFollower(TERMINAL_25);
    		TERMINAL_25.addFollower(TERMINAL_26);
    		TERMINAL_26.addFollower(TERMINAL_27);
    		TERMINAL_27.addFollower(TERMINAL_10);
    		TERMINAL_27.addFollower(TERMINAL_11);
    		TERMINAL_27.addFollower(TERMINAL_12);
    		TERMINAL_27.addFollower(TERMINAL_13);
    		TERMINAL_27.addFollower(TERMINAL_14);
    		TERMINAL_27.addFollower(TERMINAL_15);
    		TERMINAL_27.addFollower(TERMINAL_16);
    		TERMINAL_27.addFollower(TERMINAL_17);
    		TERMINAL_27.addFollower(TERMINAL_18);
    		TERMINAL_15.addFollower(TERMINAL_28);
    		TERMINAL_28.addFollower(TERMINAL_29);
    		TERMINAL_29.addFollower(TERMINAL_30);
    		TERMINAL_30.addFollower(TERMINAL_31);
    		TERMINAL_31.addFollower(TERMINAL_10);
    		TERMINAL_31.addFollower(TERMINAL_11);
    		TERMINAL_31.addFollower(TERMINAL_12);
    		TERMINAL_31.addFollower(TERMINAL_13);
    		TERMINAL_31.addFollower(TERMINAL_14);
    		TERMINAL_31.addFollower(TERMINAL_15);
    		TERMINAL_31.addFollower(TERMINAL_16);
    		TERMINAL_31.addFollower(TERMINAL_17);
    		TERMINAL_31.addFollower(TERMINAL_18);
    		TERMINAL_10.addFollower(TERMINAL_32);
    		TERMINAL_32.addFollower(TERMINAL_33);
    		TERMINAL_33.addFollower(TERMINAL_34);
    		TERMINAL_34.addFollower(TERMINAL_10);
    		TERMINAL_34.addFollower(TERMINAL_11);
    		TERMINAL_34.addFollower(TERMINAL_12);
    		TERMINAL_34.addFollower(TERMINAL_13);
    		TERMINAL_34.addFollower(TERMINAL_14);
    		TERMINAL_34.addFollower(TERMINAL_15);
    		TERMINAL_34.addFollower(TERMINAL_16);
    		TERMINAL_34.addFollower(TERMINAL_17);
    		TERMINAL_34.addFollower(TERMINAL_18);
    		TERMINAL_11.addFollower(TERMINAL_35);
    		TERMINAL_35.addFollower(TERMINAL_10);
    		TERMINAL_35.addFollower(TERMINAL_11);
    		TERMINAL_35.addFollower(TERMINAL_12);
    		TERMINAL_35.addFollower(TERMINAL_13);
    		TERMINAL_35.addFollower(TERMINAL_14);
    		TERMINAL_35.addFollower(TERMINAL_15);
    		TERMINAL_35.addFollower(TERMINAL_16);
    		TERMINAL_35.addFollower(TERMINAL_17);
    		TERMINAL_35.addFollower(TERMINAL_18);
    		TERMINAL_16.addFollower(TERMINAL_36);
    		TERMINAL_16.addFollower(TERMINAL_37);
    		TERMINAL_36.addFollower(TERMINAL_37);
    		TERMINAL_37.addFollower(TERMINAL_38);
    		TERMINAL_37.addFollower(TERMINAL_39);
    		TERMINAL_17.addFollower(TERMINAL_40);
    		TERMINAL_17.addFollower(TERMINAL_41);
    		TERMINAL_40.addFollower(TERMINAL_41);
    		TERMINAL_41.addFollower(TERMINAL_42);
    		TERMINAL_42.addFollower(TERMINAL_10);
    		TERMINAL_42.addFollower(TERMINAL_11);
    		TERMINAL_42.addFollower(TERMINAL_12);
    		TERMINAL_42.addFollower(TERMINAL_13);
    		TERMINAL_42.addFollower(TERMINAL_14);
    		TERMINAL_42.addFollower(TERMINAL_15);
    		TERMINAL_42.addFollower(TERMINAL_16);
    		TERMINAL_42.addFollower(TERMINAL_17);
    		TERMINAL_42.addFollower(TERMINAL_18);
    		TERMINAL_38.addFollower(TERMINAL_38);
    		TERMINAL_38.addFollower(TERMINAL_39);
    		TERMINAL_39.addFollower(TERMINAL_38);
    		TERMINAL_39.addFollower(TERMINAL_39);
    		TERMINAL_43.addFollower(TERMINAL_38);
    		TERMINAL_43.addFollower(TERMINAL_39);
    		TERMINAL_19.addFollower(TERMINAL_45);
    		TERMINAL_45.addFollower(TERMINAL_46);
    		TERMINAL_45.addFollower(TERMINAL_47);
    		TERMINAL_46.addFollower(TERMINAL_48);
    		TERMINAL_48.addFollower(TERMINAL_49);
    		TERMINAL_49.addFollower(TERMINAL_50);
    		TERMINAL_49.addFollower(TERMINAL_46);
    		TERMINAL_49.addFollower(TERMINAL_47);
    		TERMINAL_50.addFollower(TERMINAL_51);
    		TERMINAL_51.addFollower(TERMINAL_52);
    		TERMINAL_52.addFollower(TERMINAL_46);
    		TERMINAL_52.addFollower(TERMINAL_47);
    	}
    	// wire the terminals
    	static {
    		wire0();
    	}



    // $ANTLR start "start"
    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:665:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_org_kermeta_kp_KermetaProject ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        org.kermeta.kp.KermetaProject c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:666:1: ( (c0= parse_org_kermeta_kp_KermetaProject ) EOF )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:667:2: (c0= parse_org_kermeta_kp_KermetaProject ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_0, 0));
              		expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
              	
            }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:672:2: (c0= parse_org_kermeta_kp_KermetaProject )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:673:3: c0= parse_org_kermeta_kp_KermetaProject
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_KermetaProject_in_start82);
            c0=parse_org_kermeta_kp_KermetaProject();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {
               element = c0; 
            }

            }

            match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return element;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "start"


    // $ANTLR start "parse_org_kermeta_kp_KermetaProject"
    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:678:1: parse_org_kermeta_kp_KermetaProject returns [org.kermeta.kp.KermetaProject element = null] : a0= 'KermetaProject' a1= ':' (a2= QUOTED_34_34 ) a3= 'version' a4= ': ' (a5= QUOTED_34_34 ) a6= 'group' a7= ':' (a8= QUOTED_34_34 ) a9= '{' ( ( (a10_0= parse_org_kermeta_kp_Dependency ) | (a11_0= parse_org_kermeta_kp_Source ) | (a12_0= parse_org_kermeta_kp_WeaveDirective ) | (a13_0= parse_org_kermeta_kp_Option ) ) )* a14= '}' (a15_0= parse_org_kermeta_kp_KermetaProjectRef ) ;
    public final org.kermeta.kp.KermetaProject parse_org_kermeta_kp_KermetaProject() throws RecognitionException {
        org.kermeta.kp.KermetaProject element =  null;
        int parse_org_kermeta_kp_KermetaProject_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a14=null;
        org.kermeta.kp.Dependency a10_0 = null;

        org.kermeta.kp.Source a11_0 = null;

        org.kermeta.kp.WeaveDirective a12_0 = null;

        org.kermeta.kp.Option a13_0 = null;

        org.kermeta.kp.KermetaProjectRef a15_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:681:1: (a0= 'KermetaProject' a1= ':' (a2= QUOTED_34_34 ) a3= 'version' a4= ': ' (a5= QUOTED_34_34 ) a6= 'group' a7= ':' (a8= QUOTED_34_34 ) a9= '{' ( ( (a10_0= parse_org_kermeta_kp_Dependency ) | (a11_0= parse_org_kermeta_kp_Source ) | (a12_0= parse_org_kermeta_kp_WeaveDirective ) | (a13_0= parse_org_kermeta_kp_Option ) ) )* a14= '}' (a15_0= parse_org_kermeta_kp_KermetaProjectRef ) )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:682:2: a0= 'KermetaProject' a1= ':' (a2= QUOTED_34_34 ) a3= 'version' a4= ': ' (a5= QUOTED_34_34 ) a6= 'group' a7= ':' (a8= QUOTED_34_34 ) a9= '{' ( ( (a10_0= parse_org_kermeta_kp_Dependency ) | (a11_0= parse_org_kermeta_kp_Source ) | (a12_0= parse_org_kermeta_kp_WeaveDirective ) | (a13_0= parse_org_kermeta_kp_Option ) ) )* a14= '}' (a15_0= parse_org_kermeta_kp_KermetaProjectRef )
            {
            a0=(Token)match(input,14,FOLLOW_14_in_parse_org_kermeta_kp_KermetaProject112); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_1, 1));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_org_kermeta_kp_KermetaProject126); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_2, 2));
              	
            }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:706:2: (a2= QUOTED_34_34 )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:707:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject144); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			}
              			if (a2 != null) {
              				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__NAME), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_3, 3));
              	
            }
            a3=(Token)match(input,16,FOLLOW_16_in_parse_org_kermeta_kp_KermetaProject165); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_4, 4));
              	
            }
            a4=(Token)match(input,17,FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject179); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_5, 5));
              	
            }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:763:2: (a5= QUOTED_34_34 )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:764:3: a5= QUOTED_34_34
            {
            a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject197); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			}
              			if (a5 != null) {
              				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__VERSION), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a5).getLine(), ((org.antlr.runtime.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a5).getStartIndex(), ((org.antlr.runtime.CommonToken) a5).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__VERSION), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_6, 6));
              	
            }
            a6=(Token)match(input,18,FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject218); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_7, 7));
              	
            }
            a7=(Token)match(input,15,FOLLOW_15_in_parse_org_kermeta_kp_KermetaProject232); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_8, 8));
              	
            }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:820:2: (a8= QUOTED_34_34 )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:821:3: a8= QUOTED_34_34
            {
            a8=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject250); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			}
              			if (a8 != null) {
              				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__GROUP), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a8).getLine(), ((org.antlr.runtime.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a8).getStartIndex(), ((org.antlr.runtime.CommonToken) a8).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__GROUP), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a8, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_9, 9));
              	
            }
            a9=(Token)match(input,19,FOLLOW_19_in_parse_org_kermeta_kp_KermetaProject271); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_10, 10));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_11, 10));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_12, 10));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_13, 10));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_14, 10));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_15, 10));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_16, 10));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_17, 10));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_18, 10));
              	
            }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:873:2: ( ( (a10_0= parse_org_kermeta_kp_Dependency ) | (a11_0= parse_org_kermeta_kp_Source ) | (a12_0= parse_org_kermeta_kp_WeaveDirective ) | (a13_0= parse_org_kermeta_kp_Option ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21||(LA2_0>=24 && LA2_0<=26)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:874:3: ( (a10_0= parse_org_kermeta_kp_Dependency ) | (a11_0= parse_org_kermeta_kp_Source ) | (a12_0= parse_org_kermeta_kp_WeaveDirective ) | (a13_0= parse_org_kermeta_kp_Option ) )
            	    {
            	    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:874:3: ( (a10_0= parse_org_kermeta_kp_Dependency ) | (a11_0= parse_org_kermeta_kp_Source ) | (a12_0= parse_org_kermeta_kp_WeaveDirective ) | (a13_0= parse_org_kermeta_kp_Option ) )
            	    int alt1=4;
            	    switch ( input.LA(1) ) {
            	    case 24:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt1=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:875:4: (a10_0= parse_org_kermeta_kp_Dependency )
            	            {
            	            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:875:4: (a10_0= parse_org_kermeta_kp_Dependency )
            	            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:876:5: a10_0= parse_org_kermeta_kp_Dependency
            	            {
            	            pushFollow(FOLLOW_parse_org_kermeta_kp_Dependency_in_parse_org_kermeta_kp_KermetaProject300);
            	            a10_0=parse_org_kermeta_kp_Dependency();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              					}
            	              					if (a10_0 != null) {
            	              						if (a10_0 != null) {
            	              							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEPENDENCIES, a10_0);
            	              							completedElement(a10_0);
            	              						}
            	              						collectHiddenTokens(element);
            	              						copyLocalizationInfos(a10_0, element); 					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_10, 11));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_11, 11));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_12, 11));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_13, 11));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_14, 11));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_15, 11));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_16, 11));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_17, 11));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_18, 11));
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:906:8: (a11_0= parse_org_kermeta_kp_Source )
            	            {
            	            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:906:8: (a11_0= parse_org_kermeta_kp_Source )
            	            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:907:5: a11_0= parse_org_kermeta_kp_Source
            	            {
            	            pushFollow(FOLLOW_parse_org_kermeta_kp_Source_in_parse_org_kermeta_kp_KermetaProject342);
            	            a11_0=parse_org_kermeta_kp_Source();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              					}
            	              					if (a11_0 != null) {
            	              						if (a11_0 != null) {
            	              							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__SOURCES, a11_0);
            	              							completedElement(a11_0);
            	              						}
            	              						collectHiddenTokens(element);
            	              						copyLocalizationInfos(a11_0, element); 					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_10, 12));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_11, 12));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_12, 12));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_13, 12));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_14, 12));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_15, 12));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_16, 12));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_17, 12));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_18, 12));
            	              			
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:937:8: (a12_0= parse_org_kermeta_kp_WeaveDirective )
            	            {
            	            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:937:8: (a12_0= parse_org_kermeta_kp_WeaveDirective )
            	            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:938:5: a12_0= parse_org_kermeta_kp_WeaveDirective
            	            {
            	            pushFollow(FOLLOW_parse_org_kermeta_kp_WeaveDirective_in_parse_org_kermeta_kp_KermetaProject384);
            	            a12_0=parse_org_kermeta_kp_WeaveDirective();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              					}
            	              					if (a12_0 != null) {
            	              						if (a12_0 != null) {
            	              							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__WEAVE_DIRECTIVES, a12_0);
            	              							completedElement(a12_0);
            	              						}
            	              						collectHiddenTokens(element);
            	              						copyLocalizationInfos(a12_0, element); 					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_10, 13));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_11, 13));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_12, 13));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_13, 13));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_14, 13));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_15, 13));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_16, 13));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_17, 13));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_18, 13));
            	              			
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:968:8: (a13_0= parse_org_kermeta_kp_Option )
            	            {
            	            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:968:8: (a13_0= parse_org_kermeta_kp_Option )
            	            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:969:5: a13_0= parse_org_kermeta_kp_Option
            	            {
            	            pushFollow(FOLLOW_parse_org_kermeta_kp_Option_in_parse_org_kermeta_kp_KermetaProject426);
            	            a13_0=parse_org_kermeta_kp_Option();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              					}
            	              					if (a13_0 != null) {
            	              						if (a13_0 != null) {
            	              							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__OPTIONS, a13_0);
            	              							completedElement(a13_0);
            	              						}
            	              						collectHiddenTokens(element);
            	              						copyLocalizationInfos(a13_0, element); 					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_10, 14));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_11, 14));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_12, 14));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_13, 14));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_14, 14));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_15, 14));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_16, 14));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_17, 14));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_18, 14));
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_10, 15));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_11, 15));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_12, 15));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_13, 15));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_14, 15));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_15, 15));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_16, 15));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_17, 15));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_18, 15));
              	
            }
            a14=(Token)match(input,20,FOLLOW_20_in_parse_org_kermeta_kp_KermetaProject467); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a14, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_19, 16));
              	
            }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1025:2: (a15_0= parse_org_kermeta_kp_KermetaProjectRef )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1026:3: a15_0= parse_org_kermeta_kp_KermetaProjectRef
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_KermetaProjectRef_in_parse_org_kermeta_kp_KermetaProject485);
            a15_0=parse_org_kermeta_kp_KermetaProjectRef();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			}
              			if (a15_0 != null) {
              				if (a15_0 != null) {
              					addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__REF, a15_0);
              					completedElement(a15_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a15_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, parse_org_kermeta_kp_KermetaProject_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_KermetaProject"


    // $ANTLR start "parse_org_kermeta_kp_SourceFolder"
    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1048:1: parse_org_kermeta_kp_SourceFolder returns [org.kermeta.kp.SourceFolder element = null] : a0= 'source' a1= '=' (a2= QUOTED_34_34 ) ;
    public final org.kermeta.kp.SourceFolder parse_org_kermeta_kp_SourceFolder() throws RecognitionException {
        org.kermeta.kp.SourceFolder element =  null;
        int parse_org_kermeta_kp_SourceFolder_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1051:1: (a0= 'source' a1= '=' (a2= QUOTED_34_34 ) )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1052:2: a0= 'source' a1= '=' (a2= QUOTED_34_34 )
            {
            a0=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_SourceFolder518); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFolder();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_20, 18));
              	
            }
            a1=(Token)match(input,22,FOLLOW_22_in_parse_org_kermeta_kp_SourceFolder532); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFolder();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_21, 19));
              	
            }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1076:2: (a2= QUOTED_34_34 )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1077:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceFolder550); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFolder();
              			}
              			if (a2 != null) {
              				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__FOLDER_NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__FOLDER_NAME), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_10, 20));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_11, 20));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_12, 20));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_13, 20));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_14, 20));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_15, 20));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_16, 20));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_17, 20));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_18, 20));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, parse_org_kermeta_kp_SourceFolder_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_SourceFolder"


    // $ANTLR start "parse_org_kermeta_kp_SourceFile"
    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1119:1: parse_org_kermeta_kp_SourceFile returns [org.kermeta.kp.SourceFile element = null] : a0= 'source' a1= '=' (a2= QUOTED_34_34 ) ;
    public final org.kermeta.kp.SourceFile parse_org_kermeta_kp_SourceFile() throws RecognitionException {
        org.kermeta.kp.SourceFile element =  null;
        int parse_org_kermeta_kp_SourceFile_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1122:1: (a0= 'source' a1= '=' (a2= QUOTED_34_34 ) )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1123:2: a0= 'source' a1= '=' (a2= QUOTED_34_34 )
            {
            a0=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_SourceFile586); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFile();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_22, 21));
              	
            }
            a1=(Token)match(input,22,FOLLOW_22_in_parse_org_kermeta_kp_SourceFile600); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFile();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_23, 22));
              	
            }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1147:2: (a2= QUOTED_34_34 )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1148:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceFile618); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFile();
              			}
              			if (a2 != null) {
              				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__URI), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__URI), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_10, 23));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_11, 23));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_12, 23));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_13, 23));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_14, 23));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_15, 23));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_16, 23));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_17, 23));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_18, 23));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, parse_org_kermeta_kp_SourceFile_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_SourceFile"


    // $ANTLR start "parse_org_kermeta_kp_SourceNSURI"
    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1190:1: parse_org_kermeta_kp_SourceNSURI returns [org.kermeta.kp.SourceNSURI element = null] : a0= 'source' a1= '=' (a2= NSURI ) a3= 'from' (a4= QUOTED_34_34 ) ;
    public final org.kermeta.kp.SourceNSURI parse_org_kermeta_kp_SourceNSURI() throws RecognitionException {
        org.kermeta.kp.SourceNSURI element =  null;
        int parse_org_kermeta_kp_SourceNSURI_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1193:1: (a0= 'source' a1= '=' (a2= NSURI ) a3= 'from' (a4= QUOTED_34_34 ) )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1194:2: a0= 'source' a1= '=' (a2= NSURI ) a3= 'from' (a4= QUOTED_34_34 )
            {
            a0=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_SourceNSURI654); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_24, 24));
              	
            }
            a1=(Token)match(input,22,FOLLOW_22_in_parse_org_kermeta_kp_SourceNSURI668); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_25, 25));
              	
            }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1218:2: (a2= NSURI )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1219:3: a2= NSURI
            {
            a2=(Token)match(input,NSURI,FOLLOW_NSURI_in_parse_org_kermeta_kp_SourceNSURI686); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
              			}
              			if (a2 != null) {
              				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NSURI");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__URI), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__URI), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_26, 26));
              	
            }
            a3=(Token)match(input,23,FOLLOW_23_in_parse_org_kermeta_kp_SourceNSURI707); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_27, 27));
              	
            }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1263:2: (a4= QUOTED_34_34 )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1264:3: a4= QUOTED_34_34
            {
            a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceNSURI725); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
              			}
              			if (a4 != null) {
              				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__FROM), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				org.kermeta.kp.Dependency proxy = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new org.kermeta.kp.editor.mopp.KptContextDependentURIFragmentFactory<org.kermeta.kp.ImportedSource, org.kermeta.kp.Dependency>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getImportedSourceFromReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__FROM), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__FROM), proxy);
              					completedElement(proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_10, 28));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_11, 28));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_12, 28));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_13, 28));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_14, 28));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_15, 28));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_16, 28));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_17, 28));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_18, 28));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, parse_org_kermeta_kp_SourceNSURI_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_SourceNSURI"


    // $ANTLR start "parse_org_kermeta_kp_SourceQuery"
    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1310:1: parse_org_kermeta_kp_SourceQuery returns [org.kermeta.kp.SourceQuery element = null] : a0= 'source' a1= '=' (a2= QUOTED_34_34 ) a3= 'from' (a4= QUOTED_34_34 ) ;
    public final org.kermeta.kp.SourceQuery parse_org_kermeta_kp_SourceQuery() throws RecognitionException {
        org.kermeta.kp.SourceQuery element =  null;
        int parse_org_kermeta_kp_SourceQuery_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1313:1: (a0= 'source' a1= '=' (a2= QUOTED_34_34 ) a3= 'from' (a4= QUOTED_34_34 ) )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1314:2: a0= 'source' a1= '=' (a2= QUOTED_34_34 ) a3= 'from' (a4= QUOTED_34_34 )
            {
            a0=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_SourceQuery761); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_28, 29));
              	
            }
            a1=(Token)match(input,22,FOLLOW_22_in_parse_org_kermeta_kp_SourceQuery775); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_29, 30));
              	
            }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1338:2: (a2= QUOTED_34_34 )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1339:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceQuery793); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
              			}
              			if (a2 != null) {
              				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__QUERY), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__QUERY), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_30, 31));
              	
            }
            a3=(Token)match(input,23,FOLLOW_23_in_parse_org_kermeta_kp_SourceQuery814); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_31, 32));
              	
            }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1383:2: (a4= QUOTED_34_34 )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1384:3: a4= QUOTED_34_34
            {
            a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceQuery832); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
              			}
              			if (a4 != null) {
              				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__FROM), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				org.kermeta.kp.Dependency proxy = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new org.kermeta.kp.editor.mopp.KptContextDependentURIFragmentFactory<org.kermeta.kp.ImportedSource, org.kermeta.kp.Dependency>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getImportedSourceFromReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__FROM), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__FROM), proxy);
              					completedElement(proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_10, 33));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_11, 33));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_12, 33));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_13, 33));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_14, 33));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_15, 33));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_16, 33));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_17, 33));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_18, 33));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, parse_org_kermeta_kp_SourceQuery_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_SourceQuery"


    // $ANTLR start "parse_org_kermeta_kp_Dependency"
    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1430:1: parse_org_kermeta_kp_Dependency returns [org.kermeta.kp.Dependency element = null] : (a0= 'dependency' (a1= QUOTED_34_34 ) a2= '=' (a3= QUOTED_34_34 ) | a4= 'dependency' (a5= QUOTED_34_34 ) );
    public final org.kermeta.kp.Dependency parse_org_kermeta_kp_Dependency() throws RecognitionException {
        org.kermeta.kp.Dependency element =  null;
        int parse_org_kermeta_kp_Dependency_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1433:1: (a0= 'dependency' (a1= QUOTED_34_34 ) a2= '=' (a3= QUOTED_34_34 ) | a4= 'dependency' (a5= QUOTED_34_34 ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==QUOTED_34_34) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==EOF||(LA3_2>=20 && LA3_2<=21)||(LA3_2>=24 && LA3_2<=26)) ) {
                        alt3=2;
                    }
                    else if ( (LA3_2==22) ) {
                        alt3=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1434:2: a0= 'dependency' (a1= QUOTED_34_34 ) a2= '=' (a3= QUOTED_34_34 )
                    {
                    a0=(Token)match(input,24,FOLLOW_24_in_parse_org_kermeta_kp_Dependency868); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      		}
                      		collectHiddenTokens(element);
                      		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_32, 34));
                      	
                    }
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1446:2: (a1= QUOTED_34_34 )
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1447:3: a1= QUOTED_34_34
                    {
                    a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency886); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (terminateParsing) {
                      				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
                      			}
                      			if (element == null) {
                      				element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      			}
                      			if (a1 != null) {
                      				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      				tokenResolver.setOptions(getOptions());
                      				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
                      				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), result);
                      				java.lang.Object resolvedObject = result.getResolvedToken();
                      				if (resolvedObject == null) {
                      					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
                      				}
                      				java.lang.String resolved = (java.lang.String)resolvedObject;
                      				if (resolved != null) {
                      					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), resolved);
                      					completedElement(resolved);
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
                      			}
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_33, 35));
                      	
                    }
                    a2=(Token)match(input,22,FOLLOW_22_in_parse_org_kermeta_kp_Dependency907); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      		}
                      		collectHiddenTokens(element);
                      		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_34, 36));
                      	
                    }
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1491:2: (a3= QUOTED_34_34 )
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1492:3: a3= QUOTED_34_34
                    {
                    a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency925); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (terminateParsing) {
                      				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
                      			}
                      			if (element == null) {
                      				element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      			}
                      			if (a3 != null) {
                      				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      				tokenResolver.setOptions(getOptions());
                      				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
                      				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), result);
                      				java.lang.Object resolvedObject = result.getResolvedToken();
                      				if (resolvedObject == null) {
                      					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
                      				}
                      				String resolved = (String) resolvedObject;
                      				org.kermeta.kp.KermetaProjectRef proxy = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
                      				collectHiddenTokens(element);
                      				registerContextDependentProxy(new org.kermeta.kp.editor.mopp.KptContextDependentURIFragmentFactory<org.kermeta.kp.Dependency, org.kermeta.kp.KermetaProjectRef>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDependencyDepRefReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), resolved, proxy);
                      				if (proxy != null) {
                      					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), proxy);
                      					completedElement(proxy);
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, proxy);
                      			}
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_10, 37));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_11, 37));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_12, 37));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_13, 37));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_14, 37));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_15, 37));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_16, 37));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_17, 37));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_18, 37));
                      	
                    }

                    }
                    break;
                case 2 :
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1537:4: a4= 'dependency' (a5= QUOTED_34_34 )
                    {
                    a4=(Token)match(input,24,FOLLOW_24_in_parse_org_kermeta_kp_Dependency950); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      		}
                      		collectHiddenTokens(element);
                      		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_35, 38));
                      	
                    }
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1549:2: (a5= QUOTED_34_34 )
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1550:3: a5= QUOTED_34_34
                    {
                    a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency968); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (terminateParsing) {
                      				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
                      			}
                      			if (element == null) {
                      				element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      			}
                      			if (a5 != null) {
                      				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      				tokenResolver.setOptions(getOptions());
                      				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
                      				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), result);
                      				java.lang.Object resolvedObject = result.getResolvedToken();
                      				if (resolvedObject == null) {
                      					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a5).getLine(), ((org.antlr.runtime.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a5).getStartIndex(), ((org.antlr.runtime.CommonToken) a5).getStopIndex());
                      				}
                      				String resolved = (String) resolvedObject;
                      				org.kermeta.kp.KermetaProjectRef proxy = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
                      				collectHiddenTokens(element);
                      				registerContextDependentProxy(new org.kermeta.kp.editor.mopp.KptContextDependentURIFragmentFactory<org.kermeta.kp.Dependency, org.kermeta.kp.KermetaProjectRef>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDependencyDepRefReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), resolved, proxy);
                      				if (proxy != null) {
                      					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), proxy);
                      					completedElement(proxy);
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, proxy);
                      			}
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_10, 39));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_11, 39));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_12, 39));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_13, 39));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_14, 39));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_15, 39));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_16, 39));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_17, 39));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_18, 39));
                      	
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parse_org_kermeta_kp_Dependency_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_Dependency"


    // $ANTLR start "parse_org_kermeta_kp_WeaveDirective"
    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1596:1: parse_org_kermeta_kp_WeaveDirective returns [org.kermeta.kp.WeaveDirective element = null] : a0= 'weaver-directive' ( (a1= QUOTED_34_34 ) )? a2= '=' (a3_0= parse_org_kermeta_kp_Expression ) (a4_0= parse_org_kermeta_kp_Expression ) ;
    public final org.kermeta.kp.WeaveDirective parse_org_kermeta_kp_WeaveDirective() throws RecognitionException {
        org.kermeta.kp.WeaveDirective element =  null;
        int parse_org_kermeta_kp_WeaveDirective_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        org.kermeta.kp.Expression a3_0 = null;

        org.kermeta.kp.Expression a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1599:1: (a0= 'weaver-directive' ( (a1= QUOTED_34_34 ) )? a2= '=' (a3_0= parse_org_kermeta_kp_Expression ) (a4_0= parse_org_kermeta_kp_Expression ) )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1600:2: a0= 'weaver-directive' ( (a1= QUOTED_34_34 ) )? a2= '=' (a3_0= parse_org_kermeta_kp_Expression ) (a4_0= parse_org_kermeta_kp_Expression )
            {
            a0=(Token)match(input,25,FOLLOW_25_in_parse_org_kermeta_kp_WeaveDirective1004); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_36, 40));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_37, 40));
              	
            }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1613:2: ( (a1= QUOTED_34_34 ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==QUOTED_34_34) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1614:3: (a1= QUOTED_34_34 )
                    {
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1614:3: (a1= QUOTED_34_34 )
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1615:4: a1= QUOTED_34_34
                    {
                    a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_WeaveDirective1027); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
                      				}
                      				if (a1 != null) {
                      					org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      					tokenResolver.setOptions(getOptions());
                      					org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__NAME), result);
                      					java.lang.Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String)resolvedObject;
                      					if (resolved != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__NAME), resolved);
                      						completedElement(resolved);
                      					}
                      					collectHiddenTokens(element);
                      					copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_37, 41));
              	
            }
            a2=(Token)match(input,22,FOLLOW_22_in_parse_org_kermeta_kp_WeaveDirective1057); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_38, 42));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_39, 42));
              	
            }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1661:2: (a3_0= parse_org_kermeta_kp_Expression )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1662:3: a3_0= parse_org_kermeta_kp_Expression
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_WeaveDirective1075);
            a3_0=parse_org_kermeta_kp_Expression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
              			}
              			if (a3_0 != null) {
              				if (a3_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__MIX), a3_0);
              					completedElement(a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_38, 43));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_39, 43));
              	
            }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1684:2: (a4_0= parse_org_kermeta_kp_Expression )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1685:3: a4_0= parse_org_kermeta_kp_Expression
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_WeaveDirective1097);
            a4_0=parse_org_kermeta_kp_Expression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
              			}
              			if (a4_0 != null) {
              				if (a4_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__TARGET), a4_0);
              					completedElement(a4_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a4_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_10, 44));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_11, 44));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_12, 44));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_13, 44));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_14, 44));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_15, 44));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_16, 44));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_17, 44));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_18, 44));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parse_org_kermeta_kp_WeaveDirective_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_WeaveDirective"


    // $ANTLR start "parse_org_kermeta_kp_Option"
    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1716:1: parse_org_kermeta_kp_Option returns [org.kermeta.kp.Option element = null] : a0= 'merger-option' ( (a1= QUOTED_34_34 ) )? a2= '=' (a3= QUOTED_34_34 ) ;
    public final org.kermeta.kp.Option parse_org_kermeta_kp_Option() throws RecognitionException {
        org.kermeta.kp.Option element =  null;
        int parse_org_kermeta_kp_Option_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1719:1: (a0= 'merger-option' ( (a1= QUOTED_34_34 ) )? a2= '=' (a3= QUOTED_34_34 ) )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1720:2: a0= 'merger-option' ( (a1= QUOTED_34_34 ) )? a2= '=' (a3= QUOTED_34_34 )
            {
            a0=(Token)match(input,26,FOLLOW_26_in_parse_org_kermeta_kp_Option1130); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_40, 45));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_41, 45));
              	
            }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1733:2: ( (a1= QUOTED_34_34 ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==QUOTED_34_34) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1734:3: (a1= QUOTED_34_34 )
                    {
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1734:3: (a1= QUOTED_34_34 )
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1735:4: a1= QUOTED_34_34
                    {
                    a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Option1153); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
                      				}
                      				if (a1 != null) {
                      					org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      					tokenResolver.setOptions(getOptions());
                      					org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__NAME), result);
                      					java.lang.Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String)resolvedObject;
                      					if (resolved != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__NAME), resolved);
                      						completedElement(resolved);
                      					}
                      					collectHiddenTokens(element);
                      					copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_41, 46));
              	
            }
            a2=(Token)match(input,22,FOLLOW_22_in_parse_org_kermeta_kp_Option1183); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_42, 47));
              	
            }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1780:2: (a3= QUOTED_34_34 )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1781:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Option1201); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
              			}
              			if (a3 != null) {
              				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__VALUE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__VALUE), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_10, 48));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_11, 48));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_12, 48));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_13, 48));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_14, 48));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_15, 48));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_16, 48));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_17, 48));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_18, 48));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, parse_org_kermeta_kp_Option_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_Option"


    // $ANTLR start "parse_org_kermeta_kp_StringExpression"
    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1823:1: parse_org_kermeta_kp_StringExpression returns [org.kermeta.kp.StringExpression element = null] : (a0= QUOTED_34_34 ) ;
    public final org.kermeta.kp.StringExpression parse_org_kermeta_kp_StringExpression() throws RecognitionException {
        org.kermeta.kp.StringExpression element =  null;
        int parse_org_kermeta_kp_StringExpression_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1826:1: ( (a0= QUOTED_34_34 ) )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1827:2: (a0= QUOTED_34_34 )
            {
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1827:2: (a0= QUOTED_34_34 )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1828:3: a0= QUOTED_34_34
            {
            a0=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_StringExpression1241); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createStringExpression();
              			}
              			if (a0 != null) {
              				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.STRING_EXPRESSION__VALUE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.STRING_EXPRESSION__VALUE), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_38, 49));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_39, 49));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, parse_org_kermeta_kp_StringExpression_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_StringExpression"


    // $ANTLR start "parse_org_kermeta_kp_MixExpression"
    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1863:1: parse_org_kermeta_kp_MixExpression returns [org.kermeta.kp.MixExpression element = null] : a0= '(' (a1_0= parse_org_kermeta_kp_Expression ) (a2_0= parse_org_kermeta_kp_Expression ) a3= ')' ;
    public final org.kermeta.kp.MixExpression parse_org_kermeta_kp_MixExpression() throws RecognitionException {
        org.kermeta.kp.MixExpression element =  null;
        int parse_org_kermeta_kp_MixExpression_StartIndex = input.index();
        Token a0=null;
        Token a3=null;
        org.kermeta.kp.Expression a1_0 = null;

        org.kermeta.kp.Expression a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1866:1: (a0= '(' (a1_0= parse_org_kermeta_kp_Expression ) (a2_0= parse_org_kermeta_kp_Expression ) a3= ')' )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1867:2: a0= '(' (a1_0= parse_org_kermeta_kp_Expression ) (a2_0= parse_org_kermeta_kp_Expression ) a3= ')'
            {
            a0=(Token)match(input,27,FOLLOW_27_in_parse_org_kermeta_kp_MixExpression1277); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_38, 50));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_39, 50));
              	
            }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1880:2: (a1_0= parse_org_kermeta_kp_Expression )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1881:3: a1_0= parse_org_kermeta_kp_Expression
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_MixExpression1295);
            a1_0=parse_org_kermeta_kp_Expression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
              			}
              			if (a1_0 != null) {
              				if (a1_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.MIX_EXPRESSION__LEFT), a1_0);
              					completedElement(a1_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a1_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_38, 51));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_39, 51));
              	
            }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1903:2: (a2_0= parse_org_kermeta_kp_Expression )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1904:3: a2_0= parse_org_kermeta_kp_Expression
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_MixExpression1317);
            a2_0=parse_org_kermeta_kp_Expression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.MIX_EXPRESSION__RIGHT), a2_0);
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_43, 52));
              	
            }
            a3=(Token)match(input,28,FOLLOW_28_in_parse_org_kermeta_kp_MixExpression1335); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_38, 53));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_39, 53));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, parse_org_kermeta_kp_MixExpression_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_MixExpression"


    // $ANTLR start "parse_org_kermeta_kp_NamedElement"
    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1940:1: parse_org_kermeta_kp_NamedElement returns [org.kermeta.kp.NamedElement element = null] : ( (a0= TEXT ) | c0= parse_org_kermeta_kp_KermetaProject | c1= parse_org_kermeta_kp_Dependency | c2= parse_org_kermeta_kp_WeaveDirective | c3= parse_org_kermeta_kp_Option | c4= parse_org_kermeta_kp_KermetaProjectRef );
    public final org.kermeta.kp.NamedElement parse_org_kermeta_kp_NamedElement() throws RecognitionException {
        org.kermeta.kp.NamedElement element =  null;
        int parse_org_kermeta_kp_NamedElement_StartIndex = input.index();
        Token a0=null;
        org.kermeta.kp.KermetaProject c0 = null;

        org.kermeta.kp.Dependency c1 = null;

        org.kermeta.kp.WeaveDirective c2 = null;

        org.kermeta.kp.Option c3 = null;

        org.kermeta.kp.KermetaProjectRef c4 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1943:1: ( (a0= TEXT ) | c0= parse_org_kermeta_kp_KermetaProject | c1= parse_org_kermeta_kp_Dependency | c2= parse_org_kermeta_kp_WeaveDirective | c3= parse_org_kermeta_kp_Option | c4= parse_org_kermeta_kp_KermetaProjectRef )
            int alt6=6;
            switch ( input.LA(1) ) {
            case TEXT:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            case 25:
                {
                alt6=4;
                }
                break;
            case 26:
                {
                alt6=5;
                }
                break;
            case 29:
                {
                alt6=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1944:2: (a0= TEXT )
                    {
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1944:2: (a0= TEXT )
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1945:3: a0= TEXT
                    {
                    a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_kermeta_kp_NamedElement1368); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (terminateParsing) {
                      				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
                      			}
                      			if (element == null) {
                      				element = org.kermeta.kp.KpFactory.eINSTANCE.createNamedElement();
                      			}
                      			if (a0 != null) {
                      				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      				tokenResolver.setOptions(getOptions());
                      				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
                      				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.NAMED_ELEMENT__NAME), result);
                      				java.lang.Object resolvedObject = result.getResolvedToken();
                      				if (resolvedObject == null) {
                      					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
                      				}
                      				java.lang.String resolved = (java.lang.String)resolvedObject;
                      				if (resolved != null) {
                      					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.NAMED_ELEMENT__NAME), resolved);
                      					completedElement(resolved);
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
                      			}
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      	
                    }

                    }
                    break;
                case 2 :
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1978:2: c0= parse_org_kermeta_kp_KermetaProject
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_KermetaProject_in_parse_org_kermeta_kp_NamedElement1394);
                    c0=parse_org_kermeta_kp_KermetaProject();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 3 :
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1979:4: c1= parse_org_kermeta_kp_Dependency
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_Dependency_in_parse_org_kermeta_kp_NamedElement1404);
                    c1=parse_org_kermeta_kp_Dependency();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 4 :
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1980:4: c2= parse_org_kermeta_kp_WeaveDirective
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_WeaveDirective_in_parse_org_kermeta_kp_NamedElement1414);
                    c2=parse_org_kermeta_kp_WeaveDirective();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 5 :
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1981:4: c3= parse_org_kermeta_kp_Option
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_Option_in_parse_org_kermeta_kp_NamedElement1424);
                    c3=parse_org_kermeta_kp_Option();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 6 :
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1982:4: c4= parse_org_kermeta_kp_KermetaProjectRef
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_KermetaProjectRef_in_parse_org_kermeta_kp_NamedElement1434);
                    c4=parse_org_kermeta_kp_KermetaProjectRef();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, parse_org_kermeta_kp_NamedElement_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_NamedElement"


    // $ANTLR start "parse_org_kermeta_kp_KermetaProjectRef"
    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1986:1: parse_org_kermeta_kp_KermetaProjectRef returns [org.kermeta.kp.KermetaProjectRef element = null] : a0= 'ref' a1= '{' ( ( (a2= QUOTED_34_34 ) a3= ':' (a4= QUOTED_34_34 ) ( (a5= '[' (a6= QUOTED_34_34 ) a7= ']' ) )? ) )* a8= '}' ;
    public final org.kermeta.kp.KermetaProjectRef parse_org_kermeta_kp_KermetaProjectRef() throws RecognitionException {
        org.kermeta.kp.KermetaProjectRef element =  null;
        int parse_org_kermeta_kp_KermetaProjectRef_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1989:1: (a0= 'ref' a1= '{' ( ( (a2= QUOTED_34_34 ) a3= ':' (a4= QUOTED_34_34 ) ( (a5= '[' (a6= QUOTED_34_34 ) a7= ']' ) )? ) )* a8= '}' )
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:1990:2: a0= 'ref' a1= '{' ( ( (a2= QUOTED_34_34 ) a3= ':' (a4= QUOTED_34_34 ) ( (a5= '[' (a6= QUOTED_34_34 ) a7= ']' ) )? ) )* a8= '}'
            {
            a0=(Token)match(input,29,FOLLOW_29_in_parse_org_kermeta_kp_KermetaProjectRef1459); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_45, 55));
              	
            }
            a1=(Token)match(input,19,FOLLOW_19_in_parse_org_kermeta_kp_KermetaProjectRef1473); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_46, 56));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_47, 56));
              	
            }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2015:2: ( ( (a2= QUOTED_34_34 ) a3= ':' (a4= QUOTED_34_34 ) ( (a5= '[' (a6= QUOTED_34_34 ) a7= ']' ) )? ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==QUOTED_34_34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2016:3: ( (a2= QUOTED_34_34 ) a3= ':' (a4= QUOTED_34_34 ) ( (a5= '[' (a6= QUOTED_34_34 ) a7= ']' ) )? )
            	    {
            	    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2016:3: ( (a2= QUOTED_34_34 ) a3= ':' (a4= QUOTED_34_34 ) ( (a5= '[' (a6= QUOTED_34_34 ) a7= ']' ) )? )
            	    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2017:4: (a2= QUOTED_34_34 ) a3= ':' (a4= QUOTED_34_34 ) ( (a5= '[' (a6= QUOTED_34_34 ) a7= ']' ) )?
            	    {
            	    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2017:4: (a2= QUOTED_34_34 )
            	    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2018:5: a2= QUOTED_34_34
            	    {
            	    a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef1502); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
            	      					}
            	      					if (a2 != null) {
            	      						org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	      						tokenResolver.setOptions(getOptions());
            	      						org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
            	      						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__GROUP), result);
            	      						java.lang.Object resolvedObject = result.getResolvedToken();
            	      						if (resolvedObject == null) {
            	      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
            	      						}
            	      						java.lang.String resolved = (java.lang.String)resolvedObject;
            	      						if (resolved != null) {
            	      							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__GROUP), resolved);
            	      							completedElement(resolved);
            	      						}
            	      						collectHiddenTokens(element);
            	      						copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_48, 57));
            	      			
            	    }
            	    a3=(Token)match(input,15,FOLLOW_15_in_parse_org_kermeta_kp_KermetaProjectRef1535); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
            	      				}
            	      				collectHiddenTokens(element);
            	      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_49, 58));
            	      			
            	    }
            	    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2062:4: (a4= QUOTED_34_34 )
            	    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2063:5: a4= QUOTED_34_34
            	    {
            	    a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef1561); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
            	      					}
            	      					if (a4 != null) {
            	      						org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	      						tokenResolver.setOptions(getOptions());
            	      						org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
            	      						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__NAME), result);
            	      						java.lang.Object resolvedObject = result.getResolvedToken();
            	      						if (resolvedObject == null) {
            	      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
            	      						}
            	      						java.lang.String resolved = (java.lang.String)resolvedObject;
            	      						if (resolved != null) {
            	      							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__NAME), resolved);
            	      							completedElement(resolved);
            	      						}
            	      						collectHiddenTokens(element);
            	      						copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_50, 59));
            	      				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_46, 59));
            	      				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_47, 59));
            	      			
            	    }
            	    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2097:4: ( (a5= '[' (a6= QUOTED_34_34 ) a7= ']' ) )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==30) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2098:5: (a5= '[' (a6= QUOTED_34_34 ) a7= ']' )
            	            {
            	            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2098:5: (a5= '[' (a6= QUOTED_34_34 ) a7= ']' )
            	            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2099:6: a5= '[' (a6= QUOTED_34_34 ) a7= ']'
            	            {
            	            a5=(Token)match(input,30,FOLLOW_30_in_parse_org_kermeta_kp_KermetaProjectRef1607); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
            	              						}
            	              						collectHiddenTokens(element);
            	              						copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_51, 60));
            	              					
            	            }
            	            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2111:6: (a6= QUOTED_34_34 )
            	            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2112:7: a6= QUOTED_34_34
            	            {
            	            a6=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef1641); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              							if (terminateParsing) {
            	              								throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
            	              							}
            	              							if (element == null) {
            	              								element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
            	              							}
            	              							if (a6 != null) {
            	              								org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	              								tokenResolver.setOptions(getOptions());
            	              								org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
            	              								tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__VERSION), result);
            	              								java.lang.Object resolvedObject = result.getResolvedToken();
            	              								if (resolvedObject == null) {
            	              									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a6).getLine(), ((org.antlr.runtime.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a6).getStartIndex(), ((org.antlr.runtime.CommonToken) a6).getStopIndex());
            	              								}
            	              								java.lang.String resolved = (java.lang.String)resolvedObject;
            	              								if (resolved != null) {
            	              									element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__VERSION), resolved);
            	              									completedElement(resolved);
            	              								}
            	              								collectHiddenTokens(element);
            	              								copyLocalizationInfos((org.antlr.runtime.CommonToken) a6, element);
            	              							}
            	              						
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_52, 61));
            	              					
            	            }
            	            a7=(Token)match(input,31,FOLLOW_31_in_parse_org_kermeta_kp_KermetaProjectRef1686); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
            	              						}
            	              						collectHiddenTokens(element);
            	              						copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_46, 62));
            	              						addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_47, 62));
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_46, 63));
            	      				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_47, 63));
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_46, 64));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_47, 64));
              	
            }
            a8=(Token)match(input,20,FOLLOW_20_in_parse_org_kermeta_kp_KermetaProjectRef1748); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, parse_org_kermeta_kp_KermetaProjectRef_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_KermetaProjectRef"


    // $ANTLR start "parse_org_kermeta_kp_Source"
    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2186:1: parse_org_kermeta_kp_Source returns [org.kermeta.kp.Source element = null] : (c0= parse_org_kermeta_kp_SourceFolder | c1= parse_org_kermeta_kp_SourceFile | c2= parse_org_kermeta_kp_SourceNSURI | c3= parse_org_kermeta_kp_SourceQuery );
    public final org.kermeta.kp.Source parse_org_kermeta_kp_Source() throws RecognitionException {
        org.kermeta.kp.Source element =  null;
        int parse_org_kermeta_kp_Source_StartIndex = input.index();
        org.kermeta.kp.SourceFolder c0 = null;

        org.kermeta.kp.SourceFile c1 = null;

        org.kermeta.kp.SourceNSURI c2 = null;

        org.kermeta.kp.SourceQuery c3 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2187:1: (c0= parse_org_kermeta_kp_SourceFolder | c1= parse_org_kermeta_kp_SourceFile | c2= parse_org_kermeta_kp_SourceNSURI | c3= parse_org_kermeta_kp_SourceQuery )
            int alt9=4;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==22) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==QUOTED_34_34) ) {
                        int LA9_3 = input.LA(4);

                        if ( (LA9_3==23) ) {
                            alt9=4;
                        }
                        else if ( (synpred15_Kpt()) ) {
                            alt9=1;
                        }
                        else if ( (synpred16_Kpt()) ) {
                            alt9=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return element;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA9_2==NSURI) ) {
                        alt9=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2188:2: c0= parse_org_kermeta_kp_SourceFolder
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_SourceFolder_in_parse_org_kermeta_kp_Source1773);
                    c0=parse_org_kermeta_kp_SourceFolder();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2189:4: c1= parse_org_kermeta_kp_SourceFile
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_SourceFile_in_parse_org_kermeta_kp_Source1783);
                    c1=parse_org_kermeta_kp_SourceFile();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 3 :
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2190:4: c2= parse_org_kermeta_kp_SourceNSURI
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_SourceNSURI_in_parse_org_kermeta_kp_Source1793);
                    c2=parse_org_kermeta_kp_SourceNSURI();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 4 :
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2191:4: c3= parse_org_kermeta_kp_SourceQuery
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_SourceQuery_in_parse_org_kermeta_kp_Source1803);
                    c3=parse_org_kermeta_kp_SourceQuery();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, parse_org_kermeta_kp_Source_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_Source"


    // $ANTLR start "parse_org_kermeta_kp_Expression"
    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2195:1: parse_org_kermeta_kp_Expression returns [org.kermeta.kp.Expression element = null] : (c0= parse_org_kermeta_kp_StringExpression | c1= parse_org_kermeta_kp_MixExpression );
    public final org.kermeta.kp.Expression parse_org_kermeta_kp_Expression() throws RecognitionException {
        org.kermeta.kp.Expression element =  null;
        int parse_org_kermeta_kp_Expression_StartIndex = input.index();
        org.kermeta.kp.StringExpression c0 = null;

        org.kermeta.kp.MixExpression c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }
            // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2196:1: (c0= parse_org_kermeta_kp_StringExpression | c1= parse_org_kermeta_kp_MixExpression )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==QUOTED_34_34) ) {
                alt10=1;
            }
            else if ( (LA10_0==27) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2197:2: c0= parse_org_kermeta_kp_StringExpression
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_StringExpression_in_parse_org_kermeta_kp_Expression1824);
                    c0=parse_org_kermeta_kp_StringExpression();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2198:4: c1= parse_org_kermeta_kp_MixExpression
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_MixExpression_in_parse_org_kermeta_kp_Expression1834);
                    c1=parse_org_kermeta_kp_MixExpression();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, parse_org_kermeta_kp_Expression_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_Expression"

    // $ANTLR start synpred15_Kpt
    public final void synpred15_Kpt_fragment() throws RecognitionException {   
        org.kermeta.kp.SourceFolder c0 = null;


        // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2188:2: (c0= parse_org_kermeta_kp_SourceFolder )
        // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2188:2: c0= parse_org_kermeta_kp_SourceFolder
        {
        pushFollow(FOLLOW_parse_org_kermeta_kp_SourceFolder_in_synpred15_Kpt1773);
        c0=parse_org_kermeta_kp_SourceFolder();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_Kpt

    // $ANTLR start synpred16_Kpt
    public final void synpred16_Kpt_fragment() throws RecognitionException {   
        org.kermeta.kp.SourceFile c1 = null;


        // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2189:4: (c1= parse_org_kermeta_kp_SourceFile )
        // /home/hrambelo/application/Eclipse/64/EEmfText/workspace/org.kermeta.kp.editor/src-gen/org/kermeta/kp/editor/mopp/Kpt.g:2189:4: c1= parse_org_kermeta_kp_SourceFile
        {
        pushFollow(FOLLOW_parse_org_kermeta_kp_SourceFile_in_synpred16_Kpt1783);
        c1=parse_org_kermeta_kp_SourceFile();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_Kpt

    // Delegated rules

    public final boolean synpred16_Kpt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_Kpt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_Kpt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_Kpt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_parse_org_kermeta_kp_KermetaProject_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_parse_org_kermeta_kp_KermetaProject112 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_org_kermeta_kp_KermetaProject126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject144 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_org_kermeta_kp_KermetaProject165 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject197 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject218 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_org_kermeta_kp_KermetaProject232 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject250 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_parse_org_kermeta_kp_KermetaProject271 = new BitSet(new long[]{0x0000000007300000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Dependency_in_parse_org_kermeta_kp_KermetaProject300 = new BitSet(new long[]{0x0000000007300000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Source_in_parse_org_kermeta_kp_KermetaProject342 = new BitSet(new long[]{0x0000000007300000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_WeaveDirective_in_parse_org_kermeta_kp_KermetaProject384 = new BitSet(new long[]{0x0000000007300000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Option_in_parse_org_kermeta_kp_KermetaProject426 = new BitSet(new long[]{0x0000000007300000L});
    public static final BitSet FOLLOW_20_in_parse_org_kermeta_kp_KermetaProject467 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_KermetaProjectRef_in_parse_org_kermeta_kp_KermetaProject485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_SourceFolder518 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_org_kermeta_kp_SourceFolder532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceFolder550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_SourceFile586 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_org_kermeta_kp_SourceFile600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceFile618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_SourceNSURI654 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_org_kermeta_kp_SourceNSURI668 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NSURI_in_parse_org_kermeta_kp_SourceNSURI686 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_org_kermeta_kp_SourceNSURI707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceNSURI725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_SourceQuery761 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_org_kermeta_kp_SourceQuery775 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceQuery793 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_org_kermeta_kp_SourceQuery814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceQuery832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_org_kermeta_kp_Dependency868 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency886 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_org_kermeta_kp_Dependency907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_org_kermeta_kp_Dependency950 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_parse_org_kermeta_kp_WeaveDirective1004 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_WeaveDirective1027 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_org_kermeta_kp_WeaveDirective1057 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_WeaveDirective1075 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_WeaveDirective1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_org_kermeta_kp_Option1130 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Option1153 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_org_kermeta_kp_Option1183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Option1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_StringExpression1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_parse_org_kermeta_kp_MixExpression1277 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_MixExpression1295 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_MixExpression1317 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_parse_org_kermeta_kp_MixExpression1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_kermeta_kp_NamedElement1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_KermetaProject_in_parse_org_kermeta_kp_NamedElement1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Dependency_in_parse_org_kermeta_kp_NamedElement1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_WeaveDirective_in_parse_org_kermeta_kp_NamedElement1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Option_in_parse_org_kermeta_kp_NamedElement1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_KermetaProjectRef_in_parse_org_kermeta_kp_NamedElement1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_parse_org_kermeta_kp_KermetaProjectRef1459 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_parse_org_kermeta_kp_KermetaProjectRef1473 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef1502 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_org_kermeta_kp_KermetaProjectRef1535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef1561 = new BitSet(new long[]{0x0000000040100010L});
    public static final BitSet FOLLOW_30_in_parse_org_kermeta_kp_KermetaProjectRef1607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef1641 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_org_kermeta_kp_KermetaProjectRef1686 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_parse_org_kermeta_kp_KermetaProjectRef1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_SourceFolder_in_parse_org_kermeta_kp_Source1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_SourceFile_in_parse_org_kermeta_kp_Source1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_SourceNSURI_in_parse_org_kermeta_kp_Source1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_SourceQuery_in_parse_org_kermeta_kp_Source1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_StringExpression_in_parse_org_kermeta_kp_Expression1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_MixExpression_in_parse_org_kermeta_kp_Expression1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_SourceFolder_in_synpred15_Kpt1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_SourceFile_in_synpred16_Kpt1783 = new BitSet(new long[]{0x0000000000000002L});

}