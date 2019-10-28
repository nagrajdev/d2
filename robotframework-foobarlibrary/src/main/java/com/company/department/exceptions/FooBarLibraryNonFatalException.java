package com.company.department.exceptions;

/**
 * A raised exception of this type marks the step as failed, but does not end
 * all test executions.
 */
@SuppressWarnings("serial")
public class FooBarLibraryNonFatalException extends RuntimeException {

	/**
	 * Mark this exception as non fatal
	 */
	public static final boolean ROBOT_EXIT_ON_FAILURE = false;

	public FooBarLibraryNonFatalException() {
		super();
	}

	public FooBarLibraryNonFatalException(String string) {
		super(string);
	}

	public FooBarLibraryNonFatalException(Throwable t) {
		super(t);
	}

	public FooBarLibraryNonFatalException(String string, Throwable t) {
		super(string, t);
	}
}
