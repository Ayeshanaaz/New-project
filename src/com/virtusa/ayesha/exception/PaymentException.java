package com.virtusa.ayesha.exception;

public class PaymentException extends Exception {

	public PaymentException() {

	}

	public PaymentException(String message) {
		super(message);

	}

	public PaymentException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public PaymentException(String message, Throwable cause) {
		super(message, cause);

	}

	public PaymentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}
