package com.company.department.exceptions;

/**
 * A raised exception of this type ends all test executions.
 */
@SuppressWarnings("serial")
public class FooBarLibraryFatalException extends RuntimeException {

	/**
	 * Mark this exception as fatal
	 */
	public static final boolean ROBOT_EXIT_ON_FAILURE = true;

	public FooBarLibraryFatalException() {
		super();
	}

	public FooBarLibraryFatalException(String string) {
		super(string);
	}

	public FooBarLibraryFatalException(Throwable t) {
		super(t);
	}

	public FooBarLibraryFatalException(String string, Throwable t) {
		super(string, t);
	}
}
