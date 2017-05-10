/*
 * Copyright 2017 Daniel Nilsson
 * Released under the 2-Clause BSD License, see LICENSE for details.
 */
package com.github.danieln.turfapi;

import javax.ws.rs.WebApplicationException;

import com.github.danieln.turfapi.data.TurfApiError;

public class TurfApiException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TurfApiException(TurfApiError error, WebApplicationException cause) {
		super(String.format("%s (%X)", error.getErrorMessage(), error.getErrorCode()), cause);
	}

}
