/*
 * Copyright 2017 Daniel Nilsson
 * Released under the 2-Clause BSD License, see LICENSE for details.
 */
package com.github.danieln.turfapi.example;

import com.github.danieln.turfapi.TurfApi;
import com.github.danieln.turfapi.data.Statistics;

public class StatisticsTest {

	public static void main(String[] args) {
		TurfApi api = new TurfApi();

		Statistics stats = api.statistics();

		System.out.println(stats);
	}
}
