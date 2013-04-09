package org.kermeta.language.api;

import kermeta.exceptions.ConstraintsDiagnostic;


public class DiagnosticImpl implements Diagnostic {

	private ConstraintsDiagnostic diagnostic;

	public DiagnosticImpl(ConstraintsDiagnostic diagnostic) {
		super();
		this.diagnostic = diagnostic;
	}
	
}
