grammar Kp;

options {
	superClass = KpANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package org.kermeta.kp.editor.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime3_2_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_2_0.RecognitionException>();
	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
	
	public void reportError(org.antlr.runtime3_2_0.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime3_2_0.ANTLRStringStream) input).index());
	}
}
@header{
	package org.kermeta.kp.editor.mopp;
}

@members{
	private org.kermeta.kp.editor.IKpTokenResolverFactory tokenResolverFactory = new org.kermeta.kp.editor.mopp.KpTokenResolverFactory();
	
	/**
	 * the index of the last token that was handled by collectHiddenTokens()
	 */
	private int lastPosition;
	
	private org.kermeta.kp.editor.mopp.KpTokenResolveResult tokenResolveResult = new org.kermeta.kp.editor.mopp.KpTokenResolveResult();
	
	/**
	 * A flag that indicates whether the parser should remember all expected elements.
	 * This flag is set to true when using the parse for code completion. Otherwise it
	 * is set to false.
	 */
	private boolean rememberExpectedElements = false;
	
	private Object parseToIndexTypeObject;
	private int lastTokenIndex = 0;
	
	/**
	 * A list of expected elements the were collected while parsing the input stream.
	 * This list is only filled if <code>rememberExpectedElements</code> is set to
	 * true.
	 */
	private java.util.List<org.kermeta.kp.editor.mopp.KpExpectedTerminal> expectedElements = new java.util.ArrayList<org.kermeta.kp.editor.mopp.KpExpectedTerminal>();
	
	private int mismatchedTokenRecoveryTries = 0;
	private java.util.Map<?, ?> options;
	/**
	 * A helper list to allow a lexer to pass errors to its parser
	 */
	protected java.util.List<org.antlr.runtime3_2_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_2_0.RecognitionException>());
	
	/**
	 * Another helper list to allow a lexer to pass positions of errors to its parser
	 */
	protected java.util.List<Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
	
	/**
	 * A stack for incomplete objects. This stack is used filled when the parser is
	 * used for code completion. Whenever the parser starts to read an object it is
	 * pushed on the stack. Once the element was parser completely it is popped from
	 * the stack.
	 */
	protected java.util.Stack<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	
	private int stopIncludingHiddenTokens;
	private int stopExcludingHiddenTokens;
	/**
	 * A flag to indicate that the parser should stop parsing as soon as possible. The
	 * flag is set to false before parsing starts. It can be set to true by invoking
	 * the terminateParsing() method from another thread. This feature is used, when
	 * documents are parsed in the background (i.e., while editing them). In order to
	 * cancel running parsers, the parsing process can be terminated. This is done
	 * whenever a document changes, because the previous content of the document is
	 * not valid anymore and parsing the old content is not necessary any longer.
	 */
	private boolean terminateParsing;
	
	private int tokenIndexOfLastCompleteElement;
	
	private int expectedElementsIndexOfLastCompleteElement;
	
	/**
	 * The offset indicating the cursor position when the parser is used for code
	 * completion by calling parseToExpectedElements().
	 */
	private int cursorOffset;
	
	/**
	 * The offset of the first hidden token of the last expected element. This offset
	 * is used to discard expected elements, which are not needed for code completion.
	 */
	private int lastStartIncludingHidden;
	
	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
		postParseCommands.add(new org.kermeta.kp.editor.IKpCommand<org.kermeta.kp.editor.IKpTextResource>() {
			public boolean execute(org.kermeta.kp.editor.IKpTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.addProblem(new org.kermeta.kp.editor.IKpProblem() {
					public org.kermeta.kp.editor.KpEProblemSeverity getSeverity() {
						return org.kermeta.kp.editor.KpEProblemSeverity.ERROR;
					}
					public org.kermeta.kp.editor.KpEProblemType getType() {
						return org.kermeta.kp.editor.KpEProblemType.SYNTAX_ERROR;
					}
					public String getMessage() {
						return errorMessage;
					}
					public java.util.Collection<org.kermeta.kp.editor.IKpQuickFix> getQuickFixes() {
						return null;
					}
				}, column, line, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	public void addExpectedElement(org.kermeta.kp.editor.IKpExpectedElement terminal, int followSetID, org.eclipse.emf.ecore.EStructuralFeature... containmentTrace) {
		if (!this.rememberExpectedElements) {
			return;
		}
		org.kermeta.kp.editor.mopp.KpExpectedTerminal expectedElement = new org.kermeta.kp.editor.mopp.KpExpectedTerminal(terminal, followSetID, containmentTrace);
		setPosition(expectedElement, input.index());
		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
			// clear list of expected elements
			this.expectedElements.clear();
		}
		lastStartIncludingHidden = startIncludingHiddenTokens;
		this.expectedElements.add(expectedElement);
	}
	
	protected void addMapEntry(org.eclipse.emf.ecore.EObject element, org.eclipse.emf.ecore.EStructuralFeature structuralFeature, org.kermeta.kp.editor.mopp.KpDummyEObject dummy) {
		Object value = element.eGet(structuralFeature);
		Object mapKey = dummy.getValueByName("key");
		Object mapValue = dummy.getValueByName("value");
		if (value instanceof org.eclipse.emf.common.util.EMap<?, ?>) {
			org.eclipse.emf.common.util.EMap<Object, Object> valueMap = org.kermeta.kp.editor.util.KpMapUtil.castToEMap(value);
			if (mapKey != null && mapValue != null) {
				valueMap.put(mapKey, mapValue);
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	
	public boolean addObjectToList(org.eclipse.emf.ecore.EObject container, int featureID, Object object) {
		return ((java.util.List<Object>) container.eGet(container.eClass().getEStructuralFeature(featureID))).add(object);
	}
	
	@SuppressWarnings("unchecked")
	
	public boolean addObjectToList(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EStructuralFeature feature, Object object) {
		return ((java.util.List<Object>) container.eGet(feature)).add(object);
	}
	
	protected org.eclipse.emf.ecore.EObject apply(org.eclipse.emf.ecore.EObject target, java.util.List<org.eclipse.emf.ecore.EObject> dummyEObjects) {
		org.eclipse.emf.ecore.EObject currentTarget = target;
		for (org.eclipse.emf.ecore.EObject object : dummyEObjects) {
			assert(object instanceof org.kermeta.kp.editor.mopp.KpDummyEObject);
			org.kermeta.kp.editor.mopp.KpDummyEObject dummy = (org.kermeta.kp.editor.mopp.KpDummyEObject) object;
			org.eclipse.emf.ecore.EObject newEObject = dummy.applyTo(currentTarget);
			currentTarget = newEObject;
		}
		return currentTarget;
	}
	
	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
	}
	
	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
		postParseCommands.add(new org.kermeta.kp.editor.IKpCommand<org.kermeta.kp.editor.IKpTextResource>() {
			public boolean execute(org.kermeta.kp.editor.IKpTextResource resource) {
				org.kermeta.kp.editor.IKpLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for code completion
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
	
	protected void copyLocalizationInfos(final org.antlr.runtime3_2_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
		postParseCommands.add(new org.kermeta.kp.editor.IKpCommand<org.kermeta.kp.editor.IKpTextResource>() {
			public boolean execute(org.kermeta.kp.editor.IKpTextResource resource) {
				org.kermeta.kp.editor.IKpLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for code completion
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
	
	/**
	 * Sets the end character index and the last line for the given object in the
	 * location map.
	 */
	protected void setLocalizationEnd(java.util.Collection<org.kermeta.kp.editor.IKpCommand<org.kermeta.kp.editor.IKpTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
		postParseCommands.add(new org.kermeta.kp.editor.IKpCommand<org.kermeta.kp.editor.IKpTextResource>() {
			public boolean execute(org.kermeta.kp.editor.IKpTextResource resource) {
				org.kermeta.kp.editor.IKpLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for code completion
					return true;
				}
				locationMap.setCharEnd(object, endChar);
				locationMap.setLine(object, endLine);
				return true;
			}
		});
	}
	
	public org.kermeta.kp.editor.IKpTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
		try {
			if (encoding == null) {
				return new KpParser(new org.antlr.runtime3_2_0.CommonTokenStream(new KpLexer(new org.antlr.runtime3_2_0.ANTLRInputStream(actualInputStream))));
			} else {
				return new KpParser(new org.antlr.runtime3_2_0.CommonTokenStream(new KpLexer(new org.antlr.runtime3_2_0.ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (java.io.IOException e) {
			org.kermeta.kp.editor.mopp.KpPlugin.logError("Error while creating parser.", e);
			return null;
		}
	}
	
	/**
	 * This default constructor is only used to call createInstance() on it.
	 */
	public KpParser() {
		super(null);
	}
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_2_0.RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((KpLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((KpLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
		Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
			if (type.getInstanceClass() == org.kermeta.kp.KermetaProject.class) {
				return parse_org_kermeta_kp_KermetaProject();
			}
			if (type.getInstanceClass() == org.kermeta.kp.Source.class) {
				return parse_org_kermeta_kp_Source();
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
			if (type.getInstanceClass() == org.kermeta.kp.KermetaProjectRef.class) {
				return parse_org_kermeta_kp_KermetaProjectRef();
			}
		}
		throw new org.kermeta.kp.editor.mopp.KpUnexpectedContentTypeException(typeObject);
	}
	
	private org.kermeta.kp.editor.mopp.KpTokenResolveResult getFreshTokenResolveResult() {
		tokenResolveResult.clear();
		return tokenResolveResult;
	}
	
	public int getMismatchedTokenRecoveryTries() {
		return mismatchedTokenRecoveryTries;
	}
	
	public Object getMissingSymbol(org.antlr.runtime3_2_0.IntStream arg0, org.antlr.runtime3_2_0.RecognitionException arg1, int arg2, org.antlr.runtime3_2_0.BitSet arg3) {
		mismatchedTokenRecoveryTries++;
		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
	}
	
	protected java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public org.kermeta.kp.editor.mopp.KpMetaInformation getMetaInformation() {
		return new org.kermeta.kp.editor.mopp.KpMetaInformation();
	}
	
	public Object getParseToIndexTypeObject() {
		return parseToIndexTypeObject;
	}
	
	protected org.kermeta.kp.editor.mopp.KpReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.kermeta.kp.editor.mopp.KpReferenceResolverSwitch) getMetaInformation().getReferenceResolverSwitch();
	}
	
	protected Object getTypeObject() {
		Object typeObject = getParseToIndexTypeObject();
		if (typeObject != null) {
			return typeObject;
		}
		java.util.Map<?,?> options = getOptions();
		if (options != null) {
			typeObject = options.get(org.kermeta.kp.editor.IKpOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	/**
	 * Implementation that calls {@link #doParse()} and handles the thrown
	 * RecognitionExceptions.
	 */
	public org.kermeta.kp.editor.IKpParseResult parse() {
		terminateParsing = false;
		postParseCommands = new java.util.ArrayList<org.kermeta.kp.editor.IKpCommand<org.kermeta.kp.editor.IKpTextResource>>();
		org.kermeta.kp.editor.mopp.KpParseResult parseResult = new org.kermeta.kp.editor.mopp.KpParseResult();
		try {
			org.eclipse.emf.ecore.EObject result =  doParse();
			if (lexerExceptions.isEmpty()) {
				parseResult.setRoot(result);
			}
		} catch (org.antlr.runtime3_2_0.RecognitionException re) {
			reportError(re);
		} catch (java.lang.IllegalArgumentException iae) {
			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
				// can be caused if a null is set on EMF models where not allowed. this will just
				// happen if other errors occurred before
			} else {
				iae.printStackTrace();
			}
		}
		for (org.antlr.runtime3_2_0.RecognitionException re : lexerExceptions) {
			reportLexicalError(re);
		}
		parseResult.getPostParseCommands().addAll(postParseCommands);
		return parseResult;
	}
	
	public java.util.List<org.kermeta.kp.editor.mopp.KpExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.kermeta.kp.editor.IKpTextResource dummyResource, int cursorOffset) {
		this.rememberExpectedElements = true;
		this.parseToIndexTypeObject = type;
		this.cursorOffset = cursorOffset;
		this.lastStartIncludingHidden = -1;
		final org.antlr.runtime3_2_0.CommonTokenStream tokenStream = (org.antlr.runtime3_2_0.CommonTokenStream) getTokenStream();
		org.kermeta.kp.editor.IKpParseResult result = parse();
		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
			org.antlr.runtime3_2_0.Lexer lexer = (org.antlr.runtime3_2_0.Lexer) tokenStream.getTokenSource();
			int endChar = lexer.getCharIndex();
			int endLine = lexer.getLine();
			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
		}
		if (result != null) {
			org.eclipse.emf.ecore.EObject root = result.getRoot();
			if (root != null) {
				dummyResource.getContentsInternal().add(root);
			}
			for (org.kermeta.kp.editor.IKpCommand<org.kermeta.kp.editor.IKpTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		java.util.Set<org.kermeta.kp.editor.mopp.KpExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<org.kermeta.kp.editor.mopp.KpExpectedTerminal>();
		java.util.List<org.kermeta.kp.editor.mopp.KpExpectedTerminal> newFollowSet = new java.util.ArrayList<org.kermeta.kp.editor.mopp.KpExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			org.kermeta.kp.editor.mopp.KpExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 90;
		int i;
		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
			org.antlr.runtime3_2_0.CommonToken nextToken = (org.antlr.runtime3_2_0.CommonToken) tokenStream.get(i);
			if (nextToken.getChannel() == 99) {
				// hidden tokens do not reduce the follow set
			} else {
				// now that we have found the next visible token the position for that expected
				// terminals can be set
				for (org.kermeta.kp.editor.mopp.KpExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are
				// kept
				for (org.kermeta.kp.editor.mopp.KpExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						java.util.Collection<org.kermeta.kp.editor.util.KpPair<org.kermeta.kp.editor.IKpExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (org.kermeta.kp.editor.util.KpPair<org.kermeta.kp.editor.IKpExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]> newFollowerPair : newFollowers) {
							org.kermeta.kp.editor.IKpExpectedElement newFollower = newFollowerPair.getLeft();
							org.kermeta.kp.editor.mopp.KpExpectedTerminal newFollowTerminal = new org.kermeta.kp.editor.mopp.KpExpectedTerminal(newFollower, followSetID, newFollowerPair.getRight());
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
		// after the last token in the stream we must set the position for the elements
		// that were added during the last iteration of the loop
		for (org.kermeta.kp.editor.mopp.KpExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(org.kermeta.kp.editor.mopp.KpExpectedTerminal expectedElement, int tokenIndex) {
		int currentIndex = Math.max(0, tokenIndex);
		for (int index = lastTokenIndex; index < currentIndex; index++) {
			if (index >= input.size()) {
				break;
			}
			org.antlr.runtime3_2_0.CommonToken tokenAtIndex = (org.antlr.runtime3_2_0.CommonToken) input.get(index);
			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			if (tokenAtIndex.getChannel() != 99) {
				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			}
		}
		lastTokenIndex = Math.max(0, currentIndex);
		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
	}
	
	public Object recoverFromMismatchedToken(org.antlr.runtime3_2_0.IntStream input, int ttype, org.antlr.runtime3_2_0.BitSet follow) throws org.antlr.runtime3_2_0.RecognitionException {
		if (!rememberExpectedElements) {
			return super.recoverFromMismatchedToken(input, ttype, follow);
		} else {
			return null;
		}
	}
	
	/**
	 * Translates errors thrown by the parser into human readable messages.
	 */
	public void reportError(final org.antlr.runtime3_2_0.RecognitionException e)  {
		String message = e.getMessage();
		if (e instanceof org.antlr.runtime3_2_0.MismatchedTokenException) {
			org.antlr.runtime3_2_0.MismatchedTokenException mte = (org.antlr.runtime3_2_0.MismatchedTokenException) e;
			String expectedTokenName = formatTokenName(mte.expecting);
			String actualTokenName = formatTokenName(e.token.getType());
			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedTreeNodeException) {
			org.antlr.runtime3_2_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_2_0.MismatchedTreeNodeException) e;
			String expectedTokenName = formatTokenName(mtne.expecting);
			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
		} else if (e instanceof org.antlr.runtime3_2_0.NoViableAltException) {
			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
		} else if (e instanceof org.antlr.runtime3_2_0.EarlyExitException) {
			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedSetException) {
			org.antlr.runtime3_2_0.MismatchedSetException mse = (org.antlr.runtime3_2_0.MismatchedSetException) e;
			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedNotSetException) {
			org.antlr.runtime3_2_0.MismatchedNotSetException mse = (org.antlr.runtime3_2_0.MismatchedNotSetException) e;
			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_2_0.FailedPredicateException) {
			org.antlr.runtime3_2_0.FailedPredicateException fpe = (org.antlr.runtime3_2_0.FailedPredicateException) e;
			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
		}
		// the resource may be null if the parse is used for code completion
		final String finalMessage = message;
		if (e.token instanceof org.antlr.runtime3_2_0.CommonToken) {
			final org.antlr.runtime3_2_0.CommonToken ct = (org.antlr.runtime3_2_0.CommonToken) e.token;
			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
		} else {
			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
		}
	}
	
	/**
	 * Translates errors thrown by the lexer into human readable messages.
	 */
	public void reportLexicalError(final org.antlr.runtime3_2_0.RecognitionException e)  {
		String message = "";
		if (e instanceof org.antlr.runtime3_2_0.MismatchedTokenException) {
			org.antlr.runtime3_2_0.MismatchedTokenException mte = (org.antlr.runtime3_2_0.MismatchedTokenException) e;
			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
		} else if (e instanceof org.antlr.runtime3_2_0.NoViableAltException) {
			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
		} else if (e instanceof org.antlr.runtime3_2_0.EarlyExitException) {
			org.antlr.runtime3_2_0.EarlyExitException eee = (org.antlr.runtime3_2_0.EarlyExitException) e;
			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedSetException) {
			org.antlr.runtime3_2_0.MismatchedSetException mse = (org.antlr.runtime3_2_0.MismatchedSetException) e;
			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedNotSetException) {
			org.antlr.runtime3_2_0.MismatchedNotSetException mse = (org.antlr.runtime3_2_0.MismatchedNotSetException) e;
			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedRangeException) {
			org.antlr.runtime3_2_0.MismatchedRangeException mre = (org.antlr.runtime3_2_0.MismatchedRangeException) e;
			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
		} else if (e instanceof org.antlr.runtime3_2_0.FailedPredicateException) {
			org.antlr.runtime3_2_0.FailedPredicateException fpe = (org.antlr.runtime3_2_0.FailedPredicateException) e;
			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
		}
		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
	}
	
	private String formatTokenName(int tokenType)  {
		String tokenName = "<unknown>";
		if (tokenType == org.antlr.runtime3_2_0.Token.EOF) {
			tokenName = "EOF";
		} else {
			if (tokenType < 0) {
				return tokenName;
			}
			tokenName = getTokenNames()[tokenType];
			tokenName = org.kermeta.kp.editor.util.KpStringUtil.formatTokenName(tokenName);
		}
		return tokenName;
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public void terminate() {
		terminateParsing = true;
	}
	
	protected void completedElement(Object object, boolean isContainment) {
		if (isContainment && !this.incompleteObjects.isEmpty()) {
			this.incompleteObjects.pop();
		}
		if (object instanceof org.eclipse.emf.ecore.EObject) {
			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
		}
	}
	
	/**
	 * Creates a dynamic Java proxy that mimics the interface of the given class.
	 */
	@SuppressWarnings("unchecked")
	
	public <T> T createDynamicProxy(Class<T> clazz) {
		Object proxy = java.lang.reflect.Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class<?>[]{clazz, org.eclipse.emf.ecore.EObject.class, org.eclipse.emf.ecore.InternalEObject.class}, new java.lang.reflect.InvocationHandler() {
			
			private org.eclipse.emf.ecore.EObject dummyObject = new org.eclipse.emf.ecore.impl.EObjectImpl() {};
			
			public Object invoke(Object object, java.lang.reflect.Method method, Object[] args) throws Throwable {
				// search in dummyObject for the requested method
				java.lang.reflect.Method[] methodsInDummy = dummyObject.getClass().getMethods();
				for (java.lang.reflect.Method methodInDummy : methodsInDummy) {
					boolean matches = true;
					if (methodInDummy.getName().equals(method.getName())) {
						Class<?>[] parameterTypes = method.getParameterTypes();
						Class<?>[] parameterTypesInDummy = methodInDummy.getParameterTypes();
						if (parameterTypes.length == parameterTypesInDummy.length) {
							for (int p = 0; p < parameterTypes.length; p++) {
								Class<?> parameterType = parameterTypes[p];
								Class<?> parameterTypeInDummy = parameterTypesInDummy[p];
								if (!parameterType.equals(parameterTypeInDummy)) {
									matches = false;
								}
							}
						} else {
							matches = false;
						}
					} else {
						matches = false;
					}
					if (matches) {
						return methodInDummy.invoke(dummyObject, args);
					}
				}
				return null;
			}
		});
		return (T) proxy;
	}
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_0, 0);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_org_kermeta_kp_KermetaProject{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_org_kermeta_kp_KermetaProject returns [org.kermeta.kp.KermetaProject element = null]
@init{
}
:
	a0 = 'KermetaProject' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_1, 1);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 2);
	}
	
	(
		a2 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
				incompleteObjects.push(element);
			}
			if (a2 != null) {
				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 3);
	}
	
	(
		(
			a3 = 'version' {
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 4);
			}
			
			a4 = ': ' {
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 5);
			}
			
			(
				a5 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
						incompleteObjects.push(element);
					}
					if (a5 != null) {
						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__VERSION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__VERSION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a5, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 6);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 6);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 7);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 7);
	}
	
	(
		(
			a6 = 'group' {
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 8);
			}
			
			a7 = ':' {
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_5_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 9);
			}
			
			(
				a8 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
						incompleteObjects.push(element);
					}
					if (a8 != null) {
						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__GROUP), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a8).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__GROUP), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_5_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a8, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 10);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 11);
	}
	
	a9 = '{' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 12);
	}
	
	(
		(
			(
				a10_0 = parse_org_kermeta_kp_Source				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
						incompleteObjects.push(element);
					}
					if (a10_0 != null) {
						if (a10_0 != null) {
							Object value = a10_0;
							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__SOURCES, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_7_0_0_1, a10_0, true);
						copyLocalizationInfos(a10_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 13);
			}
			
			
			|			(
				a11_0 = parse_org_kermeta_kp_Dependency				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
						incompleteObjects.push(element);
					}
					if (a11_0 != null) {
						if (a11_0 != null) {
							Object value = a11_0;
							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEPENDENCIES, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_7_0_1_1, a11_0, true);
						copyLocalizationInfos(a11_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 14);
			}
			
			
			|			(
				a12_0 = parse_org_kermeta_kp_Option				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
						incompleteObjects.push(element);
					}
					if (a12_0 != null) {
						if (a12_0 != null) {
							Object value = a12_0;
							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__OPTIONS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_7_0_2_1, a12_0, true);
						copyLocalizationInfos(a12_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 15);
			}
			
			
			|			(
				a13_0 = parse_org_kermeta_kp_WeaveDirective				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
						incompleteObjects.push(element);
					}
					if (a13_0 != null) {
						if (a13_0 != null) {
							Object value = a13_0;
							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__WEAVE_DIRECTIVES, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_7_0_3_1, a13_0, true);
						copyLocalizationInfos(a13_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 16);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 17);
	}
	
	a14 = '}' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a14, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_20, 18);
	}
	
	(
		(
			a15 = 'ref' {
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_11_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a15, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_21, 19);
			}
			
			a16 = '{' {
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_11_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a16, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 20, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 20);
			}
			
			(
				(
					(
						a17_0 = parse_org_kermeta_kp_KermetaProjectRef						{
							if (terminateParsing) {
								throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
							}
							if (element == null) {
								element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
								incompleteObjects.push(element);
							}
							if (a17_0 != null) {
								if (a17_0 != null) {
									Object value = a17_0;
									addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__REF, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_11_0_0_2_0_0_1, a17_0, true);
								copyLocalizationInfos(a17_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 21, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 21);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 22, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 22);
			}
			
			a18 = '}' {
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_11_0_0_4, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a18, element);
			}
			{
				// expected elements (follow set)
			}
			
		)
		
	)?	{
		// expected elements (follow set)
	}
	
;

parse_org_kermeta_kp_Source returns [org.kermeta.kp.Source element = null]
@init{
}
:
	a0 = 'source' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSource();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_1_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_24, 25);
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSource();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_1_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_25, 26);
	}
	
	(
		a2 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createSource();
				incompleteObjects.push(element);
			}
			if (a2 != null) {
				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE__URL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE__URL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_1_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 27, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 27, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 27, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 27, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 27, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 27, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 27, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 27, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 27, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 27);
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_org_kermeta_kp_SourceFolder{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_kermeta_kp_SourceFile{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_kermeta_kp_SourceNSURI{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_kermeta_kp_SourceQuery{ element = c3; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_kermeta_kp_SourceFolder returns [org.kermeta.kp.SourceFolder element = null]
@init{
}
:
	a0 = 'srcDir' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFolder();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_26, 28);
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFolder();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_27, 29);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_28, 29);
	}
	
	(
		(
			a2 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
				}
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFolder();
					incompleteObjects.push(element);
				}
				if (a2 != null) {
					org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__FOLDER_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String)resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__FOLDER_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_2_0_0_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 30);
		}
		
		
		|		(
			a3 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
				}
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFolder();
					incompleteObjects.push(element);
				}
				if (a3 != null) {
					org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__URL), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String)resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__URL), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_2_0_1_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 31);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 32);
	}
	
;

parse_org_kermeta_kp_SourceFile returns [org.kermeta.kp.SourceFile element = null]
@init{
}
:
	a0 = 'srcFile' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFile();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_29, 33);
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFile();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_30, 34);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_31, 34);
	}
	
	(
		(
			a2 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
				}
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFile();
					incompleteObjects.push(element);
				}
				if (a2 != null) {
					org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__FILE_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String)resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__FILE_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_2_0_0_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 35);
		}
		
		
		|		(
			a3 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
				}
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFile();
					incompleteObjects.push(element);
				}
				if (a3 != null) {
					org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__URL), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String)resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__URL), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_2_0_1_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 36, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 36, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 36, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 36, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 36, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 36, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 36, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 36, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 36, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 36);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 37);
	}
	
;

parse_org_kermeta_kp_SourceNSURI returns [org.kermeta.kp.SourceNSURI element = null]
@init{
}
:
	a0 = 'srcNSURI' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_32, 38);
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_33, 39);
	}
	
	(
		a2 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
				incompleteObjects.push(element);
			}
			if (a2 != null) {
				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__URL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__URL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_34, 40);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 40, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 40, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 40, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 40, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 40, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 40, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 40, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 40, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 40, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 40);
	}
	
	(
		(
			a3 = 'from' {
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_35, 41);
			}
			
			(
				a4 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
						incompleteObjects.push(element);
					}
					if (a4 != null) {
						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__FROM), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						org.kermeta.kp.Dependency proxy = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.kermeta.kp.editor.mopp.KpContextDependentURIFragmentFactory<org.kermeta.kp.ImportedSource, org.kermeta.kp.Dependency>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getImportedSourceFromReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__FROM), resolved, proxy);
						if (proxy != null) {
							Object value = proxy;
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__FROM), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_3_0_0_1, proxy, true);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 42, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 42, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 42, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 42, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 42, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 42, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 42, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 42, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 42, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 42);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 43);
	}
	
;

parse_org_kermeta_kp_SourceQuery returns [org.kermeta.kp.SourceQuery element = null]
@init{
}
:
	a0 = 'srcQuery' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_36, 44);
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_37, 45);
	}
	
	(
		a2 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
				incompleteObjects.push(element);
			}
			if (a2 != null) {
				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__QUERY), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__QUERY), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_38, 46);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 46, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 46, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 46, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 46, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 46, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 46, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 46, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 46, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 46, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 46);
	}
	
	(
		(
			a3 = 'from' {
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_39, 47);
			}
			
			(
				a4 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
						incompleteObjects.push(element);
					}
					if (a4 != null) {
						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__FROM), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						org.kermeta.kp.Dependency proxy = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.kermeta.kp.editor.mopp.KpContextDependentURIFragmentFactory<org.kermeta.kp.ImportedSource, org.kermeta.kp.Dependency>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getImportedSourceFromReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__FROM), resolved, proxy);
						if (proxy != null) {
							Object value = proxy;
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__FROM), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_3_0_0_1, proxy, true);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_40, 48);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 48);
			}
			
			(
				(
					a5 = 'URL' {
						if (element == null) {
							element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_3_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_41, 49);
					}
					
					a6 = '=' {
						if (element == null) {
							element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_3_0_0_2_0_0_1, null, true);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_42, 50);
					}
					
					(
						a7 = QUOTED_34_34						
						{
							if (terminateParsing) {
								throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
							}
							if (element == null) {
								element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
								incompleteObjects.push(element);
							}
							if (a7 != null) {
								org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
								tokenResolver.setOptions(getOptions());
								org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__URL), result);
								Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a7).getStopIndex());
								}
								java.lang.String resolved = (java.lang.String)resolvedObject;
								if (resolved != null) {
									Object value = resolved;
									element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__URL), value);
									completedElement(value, false);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_3_0_0_2_0_0_2, resolved, true);
								copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a7, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 51, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 51, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 51, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 51, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 51, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 51, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 51, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 51, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 51, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 51);
					}
					
				)
				
			)?			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 52, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 52, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 52, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 52, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 52, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 52, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 52, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 52, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 52, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 52);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 53, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 53, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 53, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 53, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 53, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 53, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 53, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 53, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 53, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 53);
	}
	
;

parse_org_kermeta_kp_Dependency returns [org.kermeta.kp.Dependency element = null]
@init{
}
:
	a0 = 'dependency' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_43, 54);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
				incompleteObjects.push(element);
			}
			if (a1 != null) {
				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_44, 55);
	}
	
	a2 = 'URL' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_45, 56);
	}
	
	a3 = '=' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_46, 57);
	}
	
	(
		a4 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
				incompleteObjects.push(element);
			}
			if (a4 != null) {
				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__URL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__URL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_4, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 58, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 58, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 58, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 58, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 58, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 58, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 58, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 58, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 58, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 58);
	}
	
	
	|	a5 = 'dependency' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_1_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_47, 59);
	}
	
	(
		a6 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
				incompleteObjects.push(element);
			}
			if (a6 != null) {
				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a6).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_1_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a6, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_48, 60);
	}
	
	a7 = '=' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_1_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_49, 61);
	}
	
	(
		a8 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
				incompleteObjects.push(element);
			}
			if (a8 != null) {
				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a8).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.kermeta.kp.KermetaProjectRef proxy = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.kermeta.kp.editor.mopp.KpContextDependentURIFragmentFactory<org.kermeta.kp.Dependency, org.kermeta.kp.KermetaProjectRef>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDependencyDepRefReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_1_3, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a8, element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a8, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_50, 62);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_51, 62);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 62, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 62, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 62, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 62, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 62, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 62, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 62, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 62, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 62, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 62);
	}
	
	(
		(
			a9 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
				}
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
					incompleteObjects.push(element);
				}
				if (a9 != null) {
					org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__GROUP), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a9).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a9).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a9).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String)resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__GROUP), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_1_4, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a9, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_51, 63);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 63, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 63, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 63, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 63, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 63, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 63, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 63, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 63, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 63, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 63);
	}
	
	(
		(
			a10 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
				}
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
					incompleteObjects.push(element);
				}
				if (a10 != null) {
					org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__VERSION), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a10).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String)resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__VERSION), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_1_5, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a10, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 64, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 64, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 64, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 64, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 64, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 64, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 64, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 64, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 64, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 64);
	}
	
;

parse_org_kermeta_kp_WeaveDirective returns [org.kermeta.kp.WeaveDirective element = null]
@init{
}
:
	a0 = 'weaver-directive' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_7_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_52, 65);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_53, 65);
	}
	
	(
		(
			a1 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
				}
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
					incompleteObjects.push(element);
				}
				if (a1 != null) {
					org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String)resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_7_0_0_1, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_53, 66);
	}
	
	a2 = '=' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_7_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_54, 67, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_55, 67, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
	}
	
	(
		a3_0 = parse_org_kermeta_kp_Expression		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
				incompleteObjects.push(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__MIX), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_7_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_54, 68, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_55, 68, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
	}
	
	(
		a4_0 = parse_org_kermeta_kp_Expression		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
				incompleteObjects.push(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__TARGET), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_7_0_0_4, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 69, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 69, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 69, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 69, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 69, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 69, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 69, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 69, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 69, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 69);
	}
	
;

parse_org_kermeta_kp_Option returns [org.kermeta.kp.Option element = null]
@init{
}
:
	a0 = 'merger-option' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_8_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_56, 70);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_57, 70);
	}
	
	(
		(
			a1 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
				}
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
					incompleteObjects.push(element);
				}
				if (a1 != null) {
					org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String)resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_8_0_0_1, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_57, 71);
	}
	
	a2 = '=' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_8_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_58, 72);
	}
	
	(
		a3 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
				incompleteObjects.push(element);
			}
			if (a3 != null) {
				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__VALUE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__VALUE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_8_0_0_3, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 73, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 73, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 73, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 73, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 73, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 73, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 73, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 73, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 73, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 73);
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
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createStringExpression();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.STRING_EXPRESSION__VALUE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.STRING_EXPRESSION__VALUE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_9_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_54, 74, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_55, 74, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
	}
	
;

parse_org_kermeta_kp_MixExpression returns [org.kermeta.kp.MixExpression element = null]
@init{
}
:
	a0 = '(' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_10_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_54, 75, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_7);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_55, 75, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_7);
	}
	
	(
		a1_0 = parse_org_kermeta_kp_Expression		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
				incompleteObjects.push(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.MIX_EXPRESSION__LEFT), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_10_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_54, 76, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_8);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_55, 76, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_8);
	}
	
	(
		a2_0 = parse_org_kermeta_kp_Expression		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.MIX_EXPRESSION__RIGHT), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_10_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_59, 77);
	}
	
	a3 = ')' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_10_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_54, 78, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_55, 78, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
	}
	
;

parse_org_kermeta_kp_KermetaProjectRef returns [org.kermeta.kp.KermetaProjectRef element = null]
@init{
}
:
	(
		a0 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__GROUP), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__GROUP), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_11_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_60, 79);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_11_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_61, 80);
	}
	
	(
		a2 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
				incompleteObjects.push(element);
			}
			if (a2 != null) {
				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_11_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_62, 81);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_63, 81);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 81, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 81);
	}
	
	(
		(
			a3 = 'URL' {
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_11_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_64, 82);
			}
			
			a4 = '=' {
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_11_0_0_3_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_65, 83);
			}
			
			(
				a5 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
						incompleteObjects.push(element);
					}
					if (a5 != null) {
						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__URL), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__URL), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_11_0_0_3_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a5, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_63, 84);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 84, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 84);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_63, 85);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 85, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 85);
	}
	
	(
		(
			a6 = '[' {
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_11_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_66, 86);
			}
			
			(
				a7 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
						incompleteObjects.push(element);
					}
					if (a7 != null) {
						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__VERSION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__VERSION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_11_0_0_4_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_67, 87);
			}
			
			a8 = ']' {
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_11_0_0_4_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 88, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 88);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 89, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 89);
	}
	
;

parse_org_kermeta_kp_Expression returns [org.kermeta.kp.Expression element = null]
:
	c0 = parse_org_kermeta_kp_StringExpression{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_kermeta_kp_MixExpression{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

SL_COMMENT:
	('//'(~('\n'|'\r'))*)
	{ _channel = 99; }
;
ML_COMMENT:
	('/*'.*'*/')
	{ _channel = 99; }
;
INTEGER:
	(('-')?('1'..'9')('0'..'9')*|'0')
	{ _channel = 99; }
;
FLOAT:
	(('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ )
	{ _channel = 99; }
;
TEXT:
	(('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+)
	{ _channel = 99; }
;
WHITESPACE:
	((' ' | '\t' | '\f'))
	{ _channel = 99; }
;
LINEBREAK:
	(('\r\n' | '\r' | '\n'))
	{ _channel = 99; }
;
QUOTED_34_34:
	(('"')(~('"'))*('"'))
;

