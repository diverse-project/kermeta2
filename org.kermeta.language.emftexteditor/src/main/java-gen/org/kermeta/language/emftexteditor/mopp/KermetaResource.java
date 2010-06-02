/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

public class KermetaResource extends org.eclipse.emf.ecore.resource.impl.ResourceImpl implements org.kermeta.language.emftexteditor.IKermetaTextResource {
	
	public class ElementBasedTextDiagnostic implements org.kermeta.language.emftexteditor.IKermetaTextDiagnostic {
		
		private final org.kermeta.language.emftexteditor.IKermetaLocationMap locationMap;
		private final org.eclipse.emf.common.util.URI uri;
		private final org.eclipse.emf.ecore.EObject element;
		private final org.kermeta.language.emftexteditor.IKermetaProblem problem;
		
		public ElementBasedTextDiagnostic(org.kermeta.language.emftexteditor.IKermetaLocationMap locationMap, org.eclipse.emf.common.util.URI uri, org.kermeta.language.emftexteditor.IKermetaProblem problem, org.eclipse.emf.ecore.EObject element) {
			super();
			this.uri = uri;
			this.locationMap = locationMap;
			this.element = element;
			this.problem = problem;
		}
		
		public java.lang.String getMessage() {
			return problem.getMessage();
		}
		
		public org.kermeta.language.emftexteditor.IKermetaProblem getProblem() {
			return problem;
		}
		
		public java.lang.String getLocation() {
			return uri.toString();
		}
		
		public int getCharStart() {
			return Math.max(0, locationMap.getCharStart(element));
		}
		
		public int getCharEnd() {
			return Math.max(0, locationMap.getCharEnd(element));
		}
		
		public int getColumn() {
			return Math.max(0, locationMap.getColumn(element));
		}
		
		public int getLine() {
			return Math.max(0, locationMap.getLine(element));
		}
		
		public boolean wasCausedBy(org.eclipse.emf.ecore.EObject element) {
			if (this.element == null) {
				return false;
			}
			return this.element.equals(element);
		}
	}
	
	public class PositionBasedTextDiagnostic implements org.kermeta.language.emftexteditor.IKermetaTextDiagnostic {
		
		private final org.eclipse.emf.common.util.URI uri;
		
		private int column;
		private int line;
		private int charStart;
		private int charEnd;
		private org.kermeta.language.emftexteditor.IKermetaProblem problem;
		
		public PositionBasedTextDiagnostic(org.eclipse.emf.common.util.URI uri, org.kermeta.language.emftexteditor.IKermetaProblem problem, int column, int line, int charStart, int charEnd) {
			
			super();
			this.uri = uri;
			this.column = column;
			this.line = line;
			this.charStart = charStart;
			this.charEnd = charEnd;
			this.problem = problem;
		}
		
		public org.kermeta.language.emftexteditor.IKermetaProblem getProblem() {
			return problem;
		}
		
		public int getCharStart() {
			return charStart;
		}
		
		public int getCharEnd() {
			return charEnd;
		}
		
		public int getColumn() {
			return column;
		}
		
		public int getLine() {
			return line;
		}
		
		public java.lang.String getLocation() {
			return uri.toString();
		}
		
		public java.lang.String getMessage() {
			return problem.getMessage();
		}
		
		public boolean wasCausedBy(org.eclipse.emf.ecore.EObject element) {
			return false;
		}
	}
	
	private org.kermeta.language.emftexteditor.IKermetaReferenceResolverSwitch resolverSwitch;
	private org.kermeta.language.emftexteditor.IKermetaLocationMap locationMap;
	private int proxyCounter = 0;
	private org.kermeta.language.emftexteditor.IKermetaTextParser parser;
	private java.util.Map<java.lang.String, org.kermeta.language.emftexteditor.IKermetaContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject>> internalURIFragmentMap = new java.util.HashMap<java.lang.String, org.kermeta.language.emftexteditor.IKermetaContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject>>();
	
	public KermetaResource() {
		super();
		resetLocationMap();
	}
	
	public KermetaResource(org.eclipse.emf.common.util.URI uri) {
		super(uri);
		resetLocationMap();
	}
	
	protected void doLoad(java.io.InputStream inputStream, java.util.Map<?,?> options) throws java.io.IOException {
		java.lang.String encoding = null;
		java.io.InputStream actualInputStream = inputStream;
		java.lang.Object inputStreamPreProcessorProvider = null;
		if (options!=null) {
			inputStreamPreProcessorProvider = options.get(org.kermeta.language.emftexteditor.IKermetaOptions.INPUT_STREAM_PREPROCESSOR_PROVIDER);
		}
		if (inputStreamPreProcessorProvider != null) {
			if (inputStreamPreProcessorProvider instanceof org.kermeta.language.emftexteditor.IKermetaInputStreamProcessorProvider) {
				org.kermeta.language.emftexteditor.IKermetaInputStreamProcessorProvider provider = (org.kermeta.language.emftexteditor.IKermetaInputStreamProcessorProvider) inputStreamPreProcessorProvider;
				org.kermeta.language.emftexteditor.mopp.KermetaInputStreamProcessor processor = provider.getInputStreamProcessor(inputStream);
				actualInputStream = processor;
				encoding = processor.getOutputEncoding();
			}
		}
		
		parser = getMetaInformation().createParser(actualInputStream, encoding);
		parser.setOptions(options);
		org.kermeta.language.emftexteditor.IKermetaReferenceResolverSwitch referenceResolverSwitch = getReferenceResolverSwitch();
		referenceResolverSwitch.setOptions(options);
		org.kermeta.language.emftexteditor.IKermetaParseResult result = parser.parse();
		clearState();
		getContents().clear();
		if (result != null) {
			org.eclipse.emf.ecore.EObject root = result.getRoot();
			if (root != null) {
				getContents().add(root);
			}
			java.util.Collection<org.kermeta.language.emftexteditor.IKermetaCommand<org.kermeta.language.emftexteditor.IKermetaTextResource>> commands = result.getPostParseCommands();
			if (commands != null) {
				for (org.kermeta.language.emftexteditor.IKermetaCommand<org.kermeta.language.emftexteditor.IKermetaTextResource>  command : commands) {
					command.execute(this);
				}
			}
		}
		getReferenceResolverSwitch().setOptions(options);
		if (getErrors().isEmpty()) {
			runPostProcessors(options);
		}
	}
	
	public void reload(java.io.InputStream inputStream, java.util.Map<?,?> options) throws java.io.IOException {
		try {
			isLoaded = false;
			java.util.Map<java.lang.Object, java.lang.Object> loadOptions = addDefaultLoadOptions(options);
			doLoad(inputStream, loadOptions);
		} catch (org.kermeta.language.emftexteditor.mopp.KermetaTerminateParsingException tpe) {
			// do nothing - the resource is left unchanged if this exception is thrown
		}
		isLoaded = true;
	}
	
	public void cancelReload() {
		org.kermeta.language.emftexteditor.IKermetaTextParser parserCopy = parser;
		parserCopy.terminate();
	}
	
	protected void doSave(java.io.OutputStream outputStream, java.util.Map<?,?> options) throws java.io.IOException {
		org.kermeta.language.emftexteditor.mopp.KermetaPrinter printer = new org.kermeta.language.emftexteditor.mopp.KermetaPrinter(outputStream, this);
		org.kermeta.language.emftexteditor.IKermetaReferenceResolverSwitch referenceResolverSwitch = getReferenceResolverSwitch();
		referenceResolverSwitch.setOptions(options);
		for(org.eclipse.emf.ecore.EObject root : getContents()) {
			printer.print(root);
		}
	}
	
	protected String getSyntaxName() {
		return "kermeta";
	}
	
	public org.kermeta.language.emftexteditor.IKermetaReferenceResolverSwitch getReferenceResolverSwitch() {
		if (resolverSwitch == null) {
			resolverSwitch = new org.kermeta.language.emftexteditor.mopp.KermetaReferenceResolverSwitch();
		}
		return resolverSwitch;
	}
	
	public org.kermeta.language.emftexteditor.mopp.KermetaMetaInformation getMetaInformation() {
		return new org.kermeta.language.emftexteditor.mopp.KermetaMetaInformation();
	}
	
	protected void resetLocationMap() {
		locationMap = new org.kermeta.language.emftexteditor.mopp.KermetaLocationMap();
	}
	
	public void addURIFragment(java.lang.String internalURIFragment, org.kermeta.language.emftexteditor.IKermetaContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment) {
		internalURIFragmentMap.put(internalURIFragment, uriFragment);
	}
	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(org.kermeta.language.emftexteditor.IKermetaContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, ContainerType container, org.eclipse.emf.ecore.EReference reference, java.lang.String id, org.eclipse.emf.ecore.EObject proxyElement) {
		int pos = -1;
		if (reference.isMany()) {
			pos = ((java.util.List<?>)container.eGet(reference)).size();
		}
		org.eclipse.emf.ecore.InternalEObject proxy = (org.eclipse.emf.ecore.InternalEObject) proxyElement;
		java.lang.String internalURIFragment = org.kermeta.language.emftexteditor.IKermetaContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX + (proxyCounter++) + "_" + id;
		org.kermeta.language.emftexteditor.IKermetaContextDependentURIFragment<?> uriFragment = factory.create(id, container, reference, pos, proxy);
		proxy.eSetProxyURI(getURI().appendFragment(internalURIFragment));
		addURIFragment(internalURIFragment, uriFragment);
	}
	
	public org.eclipse.emf.ecore.EObject getEObject(String id) {
		if (internalURIFragmentMap.containsKey(id)) {
			org.kermeta.language.emftexteditor.IKermetaContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment = internalURIFragmentMap.get(id);
			boolean wasResolvedBefore = uriFragment.isResolved();
			org.kermeta.language.emftexteditor.IKermetaReferenceResolveResult<? extends org.eclipse.emf.ecore.EObject> result = uriFragment.resolve();
			if (result == null) {
				//the resolving did call itself
				return null;
			}
			if (!wasResolvedBefore && !result.wasResolved()) {
				attachErrors(result, uriFragment.getProxy());
				return null;
			} else if (!result.wasResolved()) {
				return null;
			} else {
				//remove an error that might have been added by an earlier attempt
				removeDiagnostics(uriFragment.getProxy(), getErrors());
				//remove old warnings and attach new
				removeDiagnostics(uriFragment.getProxy(), getWarnings());
				attachWarnings(result, uriFragment.getProxy());
				org.kermeta.language.emftexteditor.IKermetaReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping = result.getMappings().iterator().next();
				return getResultElement(uriFragment, mapping, uriFragment.getProxy(), result.getErrorMessage());
			}
		} else {
			return super.getEObject(id);
		}
	}
	
	private org.eclipse.emf.ecore.EObject getResultElement(org.kermeta.language.emftexteditor.IKermetaContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment, org.kermeta.language.emftexteditor.IKermetaReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping, org.eclipse.emf.ecore.EObject proxy, final java.lang.String errorMessage) {
		if (mapping instanceof org.kermeta.language.emftexteditor.IKermetaURIMapping<?>) {
			org.eclipse.emf.common.util.URI uri = ((org.kermeta.language.emftexteditor.IKermetaURIMapping<? extends org.eclipse.emf.ecore.EObject>)mapping).getTargetIdentifier();
			if (uri != null) {
				org.eclipse.emf.ecore.EObject result = null;
				try {
					result = this.getResourceSet().getEObject(uri, true);
				} catch (java.lang.Exception e) {
					//we can catch exceptions here, because EMF will try to resolve again and handle the exception
				}
				if (result == null || result.eIsProxy()) {
					//unable to resolve: attach error
					if (errorMessage == null) {
						assert(false);
					} else {
						addProblem(new org.kermeta.language.emftexteditor.mopp.KermetaProblem(errorMessage, org.kermeta.language.emftexteditor.KermetaEProblemType.ERROR), proxy);
					}
				}
				return result;
			}
			return null;
		} else if (mapping instanceof org.kermeta.language.emftexteditor.IKermetaElementMapping<?>) {
			org.eclipse.emf.ecore.EObject element = ((org.kermeta.language.emftexteditor.IKermetaElementMapping<? extends org.eclipse.emf.ecore.EObject>)mapping).getTargetElement();
			org.eclipse.emf.ecore.EReference reference = uriFragment.getReference();
			org.eclipse.emf.ecore.EReference oppositeReference = uriFragment.getReference().getEOpposite();
			if (!uriFragment.getReference().isContainment() && oppositeReference != null) {
				if (reference.isMany()) {
					org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList.ManyInverse<org.eclipse.emf.ecore.EObject> list = org.kermeta.language.emftexteditor.util.KermetaCastUtil.cast(element.eGet(oppositeReference, false));										//avoids duplicate entries in the reference caused by adding to the oppositeReference 
					list.basicAdd(uriFragment.getContainer(),null);
				} else {
					uriFragment.getContainer().eSet(uriFragment.getReference(), element);
				}
			}
			return element;
		} else {
			assert(false);
			return null;
		}
	}
	
	private void removeDiagnostics(org.eclipse.emf.ecore.EObject proxy, java.util.List<org.eclipse.emf.ecore.resource.Resource.Diagnostic> diagnostics) {
		// remove errors/warnings from resource
		for (org.eclipse.emf.ecore.resource.Resource.Diagnostic errorCand : new org.eclipse.emf.common.util.BasicEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(diagnostics)) {
			if (errorCand instanceof org.kermeta.language.emftexteditor.IKermetaTextDiagnostic) {
				if (((org.kermeta.language.emftexteditor.IKermetaTextDiagnostic) errorCand).wasCausedBy(proxy)) {
					diagnostics.remove(errorCand);
				}
			}
		}
	}
	
	private void attachErrors(org.kermeta.language.emftexteditor.IKermetaReferenceResolveResult<?> result, org.eclipse.emf.ecore.EObject proxy) {
		// attach errors to resource
		assert result != null;
		final java.lang.String errorMessage = result.getErrorMessage();
		if (errorMessage == null) {
			assert(false);
		} else {
			addProblem(new org.kermeta.language.emftexteditor.mopp.KermetaProblem(errorMessage, org.kermeta.language.emftexteditor.KermetaEProblemType.ERROR), proxy);
		}
	}
	
	private void attachWarnings(org.kermeta.language.emftexteditor.IKermetaReferenceResolveResult<? extends org.eclipse.emf.ecore.EObject> result, org.eclipse.emf.ecore.EObject proxy) {
		assert result != null;
		assert result.wasResolved();
		if (result.wasResolved()) {
			for (org.kermeta.language.emftexteditor.IKermetaReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping : result.getMappings()) {
				final java.lang.String warningMessage = mapping.getWarning();
				if (warningMessage == null) {
					continue;
				}
				addProblem(new org.kermeta.language.emftexteditor.mopp.KermetaProblem(warningMessage, org.kermeta.language.emftexteditor.KermetaEProblemType.ERROR), proxy);
			}
		}
	}
	
	// Extends the super implementation by clearing all information about element positions.
	protected void doUnload() {
		super.doUnload();
		clearState();
	}
	
	protected void runPostProcessors(java.util.Map<?, ?> loadOptions) {
		if (loadOptions == null) {
			return;
		}
		java.lang.Object resourcePostProcessorProvider = loadOptions.get(org.kermeta.language.emftexteditor.IKermetaOptions.RESOURCE_POSTPROCESSOR_PROVIDER);
		if (resourcePostProcessorProvider != null) {
			if (resourcePostProcessorProvider instanceof org.kermeta.language.emftexteditor.IKermetaResourcePostProcessorProvider) {
				((org.kermeta.language.emftexteditor.IKermetaResourcePostProcessorProvider) resourcePostProcessorProvider).getResourcePostProcessor().process(this);
			} else if (resourcePostProcessorProvider instanceof java.util.Collection<?>) {
				java.util.Collection<?> resourcePostProcessorProviderCollection = (java.util.Collection<?>) resourcePostProcessorProvider;
				for (Object processorProvider : resourcePostProcessorProviderCollection) {
					if (processorProvider instanceof org.kermeta.language.emftexteditor.IKermetaResourcePostProcessorProvider) {
						org.kermeta.language.emftexteditor.IKermetaResourcePostProcessorProvider csProcessorProvider = (org.kermeta.language.emftexteditor.IKermetaResourcePostProcessorProvider) processorProvider;
						org.kermeta.language.emftexteditor.IKermetaResourcePostProcessor postProcessor = csProcessorProvider.getResourcePostProcessor();
						try {
							postProcessor.process(this);
						} catch (java.lang.Exception e) {
							org.kermeta.language.emftexteditor.mopp.KermetaPlugin.logError("Exception while running a post-processor.", e);
						}
					}
				}
			}
		}
	}
	
	public void load(java.util.Map<?, ?> options) throws java.io.IOException {
		java.util.Map<java.lang.Object, java.lang.Object> loadOptions = addDefaultLoadOptions(options);
		super.load(loadOptions);
	}
	
	public void setURI(org.eclipse.emf.common.util.URI uri) {
		//because of the context dependent proxy resolving it is 
		//essential to resolve all proxies before the URI is changed
		//which can cause loss of object identities
		org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(this);
		super.setURI(uri);
	}
	
	public org.kermeta.language.emftexteditor.IKermetaLocationMap getLocationMap() {
		return locationMap;
	}
	
	public void addProblem(org.kermeta.language.emftexteditor.IKermetaProblem problem, org.eclipse.emf.ecore.EObject element) {
		getDiagnostics(problem.getType()).add(new ElementBasedTextDiagnostic(locationMap, getURI(), problem, element));
	}
	
	public void addProblem(org.kermeta.language.emftexteditor.IKermetaProblem problem, int column, int line, int charStart, int charEnd) {
		getDiagnostics(problem.getType()).add(new PositionBasedTextDiagnostic(getURI(), problem, column, line, charStart, charEnd));
	}
	
	public void addError(java.lang.String message, org.eclipse.emf.ecore.EObject cause) {
		addProblem(new org.kermeta.language.emftexteditor.mopp.KermetaProblem(message, org.kermeta.language.emftexteditor.KermetaEProblemType.ERROR), cause);
	}
	
	public void addWarning(java.lang.String message, org.eclipse.emf.ecore.EObject cause) {
		addProblem(new org.kermeta.language.emftexteditor.mopp.KermetaProblem(message, org.kermeta.language.emftexteditor.KermetaEProblemType.WARNING), cause);
	}
	
	private java.util.List<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getDiagnostics(org.kermeta.language.emftexteditor.KermetaEProblemType type) {
		if (type == org.kermeta.language.emftexteditor.KermetaEProblemType.ERROR) {
			return getErrors();
		} else {
			return getWarnings();
		}
	}
	
	protected java.util.Map<java.lang.Object, java.lang.Object> addDefaultLoadOptions(java.util.Map<?, ?> loadOptions) {
		java.util.Map<java.lang.Object, java.lang.Object> loadOptionsCopy = org.kermeta.language.emftexteditor.util.KermetaMapUtil.copySafelyToObjectToObjectMap(loadOptions);
		if (org.eclipse.core.runtime.Platform.isRunning()) {
			// find default load option providers
			org.eclipse.core.runtime.IExtensionRegistry extensionRegistry = org.eclipse.core.runtime.Platform.getExtensionRegistry();
			org.eclipse.core.runtime.IConfigurationElement configurationElements[] = extensionRegistry.getConfigurationElementsFor(org.kermeta.language.emftexteditor.mopp.KermetaPlugin.EP_DEFAULT_LOAD_OPTIONS_ID);
			for (org.eclipse.core.runtime.IConfigurationElement element : configurationElements) {
				try {
					org.kermeta.language.emftexteditor.IKermetaOptionProvider provider = (org.kermeta.language.emftexteditor.IKermetaOptionProvider) element.createExecutableExtension("class");
					final java.util.Map<?, ?> options = provider.getOptions();
					final java.util.Collection<?> keys = options.keySet();
					for (java.lang.Object key : keys) {
						addLoadOption(loadOptionsCopy, key, options.get(key));
					}
				} catch (org.eclipse.core.runtime.CoreException ce) {
					org.kermeta.language.emftexteditor.mopp.KermetaPlugin.logError("Exception while getting default options.", ce);
				}
			}
		}
		return loadOptionsCopy;
	}
	
	// Adds a new key,value pair to the list of options. If there
	// is already an option with the same key, the two values are 
	// collected in a list.
	private void addLoadOption(java.util.Map<java.lang.Object, java.lang.Object> options,java.lang.Object key, java.lang.Object value) {
		// check if there is already an option set
		if (options.containsKey(key)) {
			java.lang.Object currentValue = options.get(key);
			if (currentValue instanceof java.util.List<?>) {
				// if the current value is a list, we add the new value to
				// this list
				java.util.List<?> currentValueAsList = (java.util.List<?>) currentValue;
				java.util.List<java.lang.Object> currentValueAsObjectList = org.kermeta.language.emftexteditor.util.KermetaListUtil.copySafelyToObjectList(currentValueAsList);
				if (value instanceof java.util.Collection<?>) {
					currentValueAsObjectList.addAll((java.util.Collection<?>) value);
				} else {
					currentValueAsObjectList.add(value);
				}
				options.put(key, currentValueAsObjectList);
			} else {
				// if the current value is not a list, we create a fresh list
				// and add both the old (current) and the new value to this list
				java.util.List<java.lang.Object> newValueList = new java.util.ArrayList<java.lang.Object>();
				newValueList.add(currentValue);
				if (value instanceof java.util.Collection<?>) {
					newValueList.addAll((java.util.Collection<?>) value);
				} else {
					newValueList.add(value);
				}
				options.put(key, newValueList);
			}
		} else {
			options.put(key, value);
		}
	}
	
	// Extends the super implementation by clearing all information about element positions.
	protected void clearState() {
		//clear concrete syntax information
		resetLocationMap();
		internalURIFragmentMap.clear();
		getErrors().clear();
		getWarnings().clear();
		proxyCounter = 0;
		resolverSwitch = null;
	}
	
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> getContents() {
		return new org.kermeta.language.emftexteditor.util.KermetaCopiedEObjectInternalEList((org.eclipse.emf.ecore.util.InternalEList<org.eclipse.emf.ecore.EObject>) super.getContents());
	}
	
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getWarnings() {
		return new org.kermeta.language.emftexteditor.util.KermetaCopiedEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(super.getWarnings());
	}
	
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getErrors() {
		return new org.kermeta.language.emftexteditor.util.KermetaCopiedEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(super.getErrors());
	}
	
}
