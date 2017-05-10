/*
 * Copyright 2017 Daniel Nilsson
 * Released under the 2-Clause BSD License, see LICENSE for details.
 */
package com.github.danieln.turfapi.data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, Date> {

	private final DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXX");

	@Override
	public Date unmarshal(String v) throws Exception {
		return format.parse(v);
	}

	@Override
	public String marshal(Date v) throws Exception {
		return format.format(v);
	}

}
