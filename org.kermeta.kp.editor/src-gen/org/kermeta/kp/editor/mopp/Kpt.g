grammar Kpt;

options {
	superClass = KptANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package org.kermeta.kp.editor.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime.RecognitionException>();
	public java.util.List<java.lang.Integer> lexerExceptionsPosition = new java.util.ArrayList<java.lang.Integer>();
	
	public void reportError(org.antlr.runtime.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime.ANTLRStringStream) input).index());
	}
}
@header{
	package org.kermeta.kp.editor.mopp;
}

@members{
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
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_10 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("source");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_11 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("source");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_12 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("source");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_13 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("source");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_14 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("dependency");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_15 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("dependency");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_16 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("merger-option");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_17 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("weaver-directive");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_18 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("}");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_19 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("ref");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_20 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("{");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_21 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProjectRef().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__GROUP), "QUOTED_34_34");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_22 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("}");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_23 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("=");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_24 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getSourceFolder().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__FOLDER_NAME), "QUOTED_34_34");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_25 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("=");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_26 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getSourceFile().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__URI), "QUOTED_34_34");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_27 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("=");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_28 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getSourceNSURI().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__URI), "NSURI");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_29 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("from");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_30 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getSourceNSURI().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__FROM), "QUOTED_34_34");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_31 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("=");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_32 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getSourceQuery().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__QUERY), "QUOTED_34_34");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_33 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("from");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_34 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getSourceQuery().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__FROM), "QUOTED_34_34");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_35 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getDependency().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), "QUOTED_34_34");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_36 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("=");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_37 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getDependency().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), "QUOTED_34_34");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_38 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getDependency().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), "QUOTED_34_34");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_39 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getWeaveDirective().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__NAME), "QUOTED_34_34");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_40 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("=");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_41 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getStringExpression().getEStructuralFeature(org.kermeta.kp.KpPackage.STRING_EXPRESSION__VALUE), "QUOTED_34_34");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_42 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("(");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_43 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getOption().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__NAME), "QUOTED_34_34");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_44 = new org.kermeta.kp.editor.mopp.KptExpectedCsString("=");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_45 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getOption().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__VALUE), "QUOTED_34_34");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_46 = new org.kermeta.kp.editor.mopp.KptExpectedCsString(")");
	private final static org.kermeta.kp.editor.IKptExpectedElement TERMINAL_47 = new org.kermeta.kp.editor.mopp.KptExpectedStructuralFeature(org.kermeta.kp.KpPackage.eINSTANCE.getNamedElement().getEStructuralFeature(org.kermeta.kp.KpPackage.NAMED_ELEMENT__NAME), "TEXT");
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
		TERMINAL_19.addFollower(TERMINAL_20);
		TERMINAL_20.addFollower(TERMINAL_21);
		TERMINAL_20.addFollower(TERMINAL_22);
		TERMINAL_10.addFollower(TERMINAL_23);
		TERMINAL_23.addFollower(TERMINAL_24);
		TERMINAL_24.addFollower(TERMINAL_10);
		TERMINAL_24.addFollower(TERMINAL_11);
		TERMINAL_24.addFollower(TERMINAL_12);
		TERMINAL_24.addFollower(TERMINAL_13);
		TERMINAL_24.addFollower(TERMINAL_14);
		TERMINAL_24.addFollower(TERMINAL_15);
		TERMINAL_24.addFollower(TERMINAL_16);
		TERMINAL_24.addFollower(TERMINAL_17);
		TERMINAL_24.addFollower(TERMINAL_18);
		TERMINAL_11.addFollower(TERMINAL_25);
		TERMINAL_25.addFollower(TERMINAL_26);
		TERMINAL_26.addFollower(TERMINAL_10);
		TERMINAL_26.addFollower(TERMINAL_11);
		TERMINAL_26.addFollower(TERMINAL_12);
		TERMINAL_26.addFollower(TERMINAL_13);
		TERMINAL_26.addFollower(TERMINAL_14);
		TERMINAL_26.addFollower(TERMINAL_15);
		TERMINAL_26.addFollower(TERMINAL_16);
		TERMINAL_26.addFollower(TERMINAL_17);
		TERMINAL_26.addFollower(TERMINAL_18);
		TERMINAL_12.addFollower(TERMINAL_27);
		TERMINAL_27.addFollower(TERMINAL_28);
		TERMINAL_28.addFollower(TERMINAL_29);
		TERMINAL_29.addFollower(TERMINAL_30);
		TERMINAL_30.addFollower(TERMINAL_10);
		TERMINAL_30.addFollower(TERMINAL_11);
		TERMINAL_30.addFollower(TERMINAL_12);
		TERMINAL_30.addFollower(TERMINAL_13);
		TERMINAL_30.addFollower(TERMINAL_14);
		TERMINAL_30.addFollower(TERMINAL_15);
		TERMINAL_30.addFollower(TERMINAL_16);
		TERMINAL_30.addFollower(TERMINAL_17);
		TERMINAL_30.addFollower(TERMINAL_18);
		TERMINAL_13.addFollower(TERMINAL_31);
		TERMINAL_31.addFollower(TERMINAL_32);
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
		TERMINAL_14.addFollower(TERMINAL_35);
		TERMINAL_35.addFollower(TERMINAL_36);
		TERMINAL_36.addFollower(TERMINAL_37);
		TERMINAL_37.addFollower(TERMINAL_10);
		TERMINAL_37.addFollower(TERMINAL_11);
		TERMINAL_37.addFollower(TERMINAL_12);
		TERMINAL_37.addFollower(TERMINAL_13);
		TERMINAL_37.addFollower(TERMINAL_14);
		TERMINAL_37.addFollower(TERMINAL_15);
		TERMINAL_37.addFollower(TERMINAL_16);
		TERMINAL_37.addFollower(TERMINAL_17);
		TERMINAL_37.addFollower(TERMINAL_18);
		TERMINAL_15.addFollower(TERMINAL_38);
		TERMINAL_38.addFollower(TERMINAL_10);
		TERMINAL_38.addFollower(TERMINAL_11);
		TERMINAL_38.addFollower(TERMINAL_12);
		TERMINAL_38.addFollower(TERMINAL_13);
		TERMINAL_38.addFollower(TERMINAL_14);
		TERMINAL_38.addFollower(TERMINAL_15);
		TERMINAL_38.addFollower(TERMINAL_16);
		TERMINAL_38.addFollower(TERMINAL_17);
		TERMINAL_38.addFollower(TERMINAL_18);
		TERMINAL_17.addFollower(TERMINAL_39);
		TERMINAL_17.addFollower(TERMINAL_40);
		TERMINAL_39.addFollower(TERMINAL_40);
		TERMINAL_40.addFollower(TERMINAL_41);
		TERMINAL_40.addFollower(TERMINAL_42);
		TERMINAL_16.addFollower(TERMINAL_43);
		TERMINAL_16.addFollower(TERMINAL_44);
		TERMINAL_43.addFollower(TERMINAL_44);
		TERMINAL_44.addFollower(TERMINAL_45);
		TERMINAL_45.addFollower(TERMINAL_10);
		TERMINAL_45.addFollower(TERMINAL_11);
		TERMINAL_45.addFollower(TERMINAL_12);
		TERMINAL_45.addFollower(TERMINAL_13);
		TERMINAL_45.addFollower(TERMINAL_14);
		TERMINAL_45.addFollower(TERMINAL_15);
		TERMINAL_45.addFollower(TERMINAL_16);
		TERMINAL_45.addFollower(TERMINAL_17);
		TERMINAL_45.addFollower(TERMINAL_18);
		TERMINAL_41.addFollower(TERMINAL_41);
		TERMINAL_41.addFollower(TERMINAL_42);
		TERMINAL_42.addFollower(TERMINAL_41);
		TERMINAL_42.addFollower(TERMINAL_42);
		TERMINAL_46.addFollower(TERMINAL_41);
		TERMINAL_46.addFollower(TERMINAL_42);
		TERMINAL_21.addFollower(TERMINAL_48);
		TERMINAL_48.addFollower(TERMINAL_49);
		TERMINAL_49.addFollower(TERMINAL_50);
		TERMINAL_49.addFollower(TERMINAL_21);
		TERMINAL_49.addFollower(TERMINAL_22);
		TERMINAL_50.addFollower(TERMINAL_51);
		TERMINAL_51.addFollower(TERMINAL_52);
		TERMINAL_52.addFollower(TERMINAL_21);
		TERMINAL_52.addFollower(TERMINAL_22);
	}
	// wire the terminals
	static {
		wire0();
	}
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_0, 0));
		expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
	}
	(
		c0 = parse_org_kermeta_kp_KermetaProject{ element = c0; }
	)
	EOF	
;

parse_org_kermeta_kp_KermetaProject returns [org.kermeta.kp.KermetaProject element = null]
@init{
}
:
	a0 = 'KermetaProject' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_1, 1));
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_2, 2));
	}
	
	(
		a2 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_3, 3));
	}
	
	a3 = 'version' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_4, 4));
	}
	
	a4 = ': ' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_5, 5));
	}
	
	(
		a5 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_6, 6));
	}
	
	a6 = 'group' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_7, 7));
	}
	
	a7 = ':' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_8, 8));
	}
	
	(
		a8 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_9, 9));
	}
	
	a9 = '{' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
	}
	{
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
	
	(
		(
			(
				a10_0 = parse_org_kermeta_kp_Source				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
					}
					if (a10_0 != null) {
						if (a10_0 != null) {
							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__SOURCES, a10_0);
							completedElement(a10_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a10_0, element); 					}
				}
			)
			{
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
			
			
			|			(
				a11_0 = parse_org_kermeta_kp_Dependency				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
					}
					if (a11_0 != null) {
						if (a11_0 != null) {
							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEPENDENCIES, a11_0);
							completedElement(a11_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a11_0, element); 					}
				}
			)
			{
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
			
			
			|			(
				a12_0 = parse_org_kermeta_kp_Option				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
					}
					if (a12_0 != null) {
						if (a12_0 != null) {
							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__OPTIONS, a12_0);
							completedElement(a12_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a12_0, element); 					}
				}
			)
			{
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
			
			
			|			(
				a13_0 = parse_org_kermeta_kp_WeaveDirective				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
					}
					if (a13_0 != null) {
						if (a13_0 != null) {
							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__WEAVE_DIRECTIVES, a13_0);
							completedElement(a13_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a13_0, element); 					}
				}
			)
			{
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
			
		)
		
	)*	{
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
	
	a14 = '}' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a14, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_19, 16));
	}
	
	a15 = 'ref' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a15, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_20, 17));
	}
	
	a16 = '{' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a16, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_21, 18));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_22, 18));
	}
	
	(
		(
			(
				a17_0 = parse_org_kermeta_kp_KermetaProjectRef				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
					}
					if (a17_0 != null) {
						if (a17_0 != null) {
							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__REF, a17_0);
							completedElement(a17_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a17_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_21, 19));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_22, 19));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_21, 20));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_22, 20));
	}
	
	a18 = '}' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a18, element);
	}
	{
		// expected elements (follow set)
	}
	
;

parse_org_kermeta_kp_SourceFolder returns [org.kermeta.kp.SourceFolder element = null]
@init{
}
:
	a0 = 'source' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFolder();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_23, 22));
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFolder();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_24, 23));
	}
	
	(
		a2 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_10, 24));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_11, 24));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_12, 24));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_13, 24));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_14, 24));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_15, 24));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_16, 24));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_17, 24));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_18, 24));
	}
	
;

parse_org_kermeta_kp_SourceFile returns [org.kermeta.kp.SourceFile element = null]
@init{
}
:
	a0 = 'source' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFile();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_25, 25));
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFile();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_26, 26));
	}
	
	(
		a2 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_10, 27));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_11, 27));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_12, 27));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_13, 27));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_14, 27));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_15, 27));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_16, 27));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_17, 27));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_18, 27));
	}
	
;

parse_org_kermeta_kp_SourceNSURI returns [org.kermeta.kp.SourceNSURI element = null]
@init{
}
:
	a0 = 'source' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_27, 28));
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_28, 29));
	}
	
	(
		a2 = NSURI		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_29, 30));
	}
	
	a3 = 'from' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_30, 31));
	}
	
	(
		a4 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_10, 32));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_11, 32));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_12, 32));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_13, 32));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_14, 32));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_15, 32));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_16, 32));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_17, 32));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_18, 32));
	}
	
;

parse_org_kermeta_kp_SourceQuery returns [org.kermeta.kp.SourceQuery element = null]
@init{
}
:
	a0 = 'source' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_31, 33));
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_32, 34));
	}
	
	(
		a2 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_33, 35));
	}
	
	a3 = 'from' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_34, 36));
	}
	
	(
		a4 = QUOTED_34_34		
		{
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
	)
	{
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
	
;

parse_org_kermeta_kp_Dependency returns [org.kermeta.kp.Dependency element = null]
@init{
}
:
	a0 = 'dependency' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_35, 38));
	}
	
	(
		a1 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_36, 39));
	}
	
	a2 = '=' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_37, 40));
	}
	
	(
		a3 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_10, 41));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_11, 41));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_12, 41));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_13, 41));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_14, 41));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_15, 41));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_16, 41));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_17, 41));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_18, 41));
	}
	
	
	|	a4 = 'dependency' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_38, 42));
	}
	
	(
		a5 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_10, 43));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_11, 43));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_12, 43));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_13, 43));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_14, 43));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_15, 43));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_16, 43));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_17, 43));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_18, 43));
	}
	
;

parse_org_kermeta_kp_WeaveDirective returns [org.kermeta.kp.WeaveDirective element = null]
@init{
}
:
	a0 = 'weaver-directive' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_39, 44));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_40, 44));
	}
	
	(
		(
			a1 = QUOTED_34_34			
			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_40, 45));
	}
	
	a2 = '=' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_41, 46));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_42, 46));
	}
	
	(
		a3_0 = parse_org_kermeta_kp_Expression		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_41, 47));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_42, 47));
	}
	
	(
		a4_0 = parse_org_kermeta_kp_Expression		{
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
	)
	{
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
	
;

parse_org_kermeta_kp_Option returns [org.kermeta.kp.Option element = null]
@init{
}
:
	a0 = 'merger-option' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_43, 49));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_44, 49));
	}
	
	(
		(
			a1 = QUOTED_34_34			
			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_44, 50));
	}
	
	a2 = '=' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_45, 51));
	}
	
	(
		a3 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_10, 52));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_11, 52));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_12, 52));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_13, 52));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_14, 52));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_15, 52));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_16, 52));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_17, 52));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_18, 52));
	}
	
;

parse_org_kermeta_kp_StringExpression returns [org.kermeta.kp.StringExpression element = null]
@init{
}
:
	(
		a0 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_41, 53));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_42, 53));
	}
	
;

parse_org_kermeta_kp_MixExpression returns [org.kermeta.kp.MixExpression element = null]
@init{
}
:
	a0 = '(' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_41, 54));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_42, 54));
	}
	
	(
		a1_0 = parse_org_kermeta_kp_Expression		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_41, 55));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_42, 55));
	}
	
	(
		a2_0 = parse_org_kermeta_kp_Expression		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_46, 56));
	}
	
	a3 = ')' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_41, 57));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_42, 57));
	}
	
;

parse_org_kermeta_kp_NamedElement returns [org.kermeta.kp.NamedElement element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_org_kermeta_kp_KermetaProject{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_org_kermeta_kp_Dependency{ element = c1; /* this is a subclass choice */ }
	|	c2 = parse_org_kermeta_kp_WeaveDirective{ element = c2; /* this is a subclass choice */ }
	|	c3 = parse_org_kermeta_kp_Option{ element = c3; /* this is a subclass choice */ }
	|	c4 = parse_org_kermeta_kp_KermetaProjectRef{ element = c4; /* this is a subclass choice */ }
	
;

parse_org_kermeta_kp_KermetaProjectRef returns [org.kermeta.kp.KermetaProjectRef element = null]
@init{
}
:
	(
		a0 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
			}
			if (a0 != null) {
				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__GROUP), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__GROUP), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_48, 59));
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_49, 60));
	}
	
	(
		a2 = QUOTED_34_34		
		{
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
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__NAME), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_50, 61));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_21, 61));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_22, 61));
	}
	
	(
		(
			a3 = '[' {
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_51, 62));
			}
			
			(
				a4 = QUOTED_34_34				
				{
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
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__VERSION), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__VERSION), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_52, 63));
			}
			
			a5 = ']' {
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_21, 64));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_22, 64));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_21, 65));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(TERMINAL_22, 65));
	}
	
;

parse_org_kermeta_kp_Source returns [org.kermeta.kp.Source element = null]
:
	c0 = parse_org_kermeta_kp_SourceFolder{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_org_kermeta_kp_SourceFile{ element = c1; /* this is a subclass choice */ }
	|	c2 = parse_org_kermeta_kp_SourceNSURI{ element = c2; /* this is a subclass choice */ }
	|	c3 = parse_org_kermeta_kp_SourceQuery{ element = c3; /* this is a subclass choice */ }
	
;

parse_org_kermeta_kp_Expression returns [org.kermeta.kp.Expression element = null]
:
	c0 = parse_org_kermeta_kp_StringExpression{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_org_kermeta_kp_MixExpression{ element = c1; /* this is a subclass choice */ }
	
;

SL_COMMENT:
	'//'(~('\n'|'\r'))*
	{ _channel = 99; }
;
ML_COMMENT:
	'/*'.*'*/'	{ _channel = 99; }
;
INTEGER:
	('-')?('1'..'9')('0'..'9')*|'0'	{ _channel = 99; }
;
FLOAT:
	('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ 	{ _channel = 99; }
;
MAVEN:
	'"'('A'..'Z')*'"'	{ _channel = 99; }
;
NSURI:
	('A'..'Z')(('_')?('A'..'Z'))*;
TEXT:
	('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+;
WHITESPACE:
	(' ' | '\t' | '\f')
	{ _channel = 99; }
;
LINEBREAK:
	('\r\n' | '\r' | '\n')
	{ _channel = 99; }
;
QUOTED_34_34:
	('"')(~('"'))*('"')
;

