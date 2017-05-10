/*
 * Copyright 2017 Daniel Nilsson
 * Released under the 2-Clause BSD License, see LICENSE for details.
 */
package com.github.danieln.turfapi.example;

import java.util.Arrays;
import java.util.List;

import com.github.danieln.turfapi.TurfApi;
import com.github.danieln.turfapi.data.BoundingBox;
import com.github.danieln.turfapi.data.Point;
import com.github.danieln.turfapi.data.Zone;

public class ZonesTest {

	public static void main(String[] args) {

		TurfApi api = new TurfApi();

		List<Zone> zones;

		if (args.length == 0) {
			zones = api.zones(new BoundingBox(new Point(65.5899977, 22.1666673), new Point(65.5780329, 22.1206005)));
		} else {
			zones = api.zones(Arrays.stream(args).mapToInt(Integer::parseInt).toArray());
		}

		zones.stream().map(Zone::toString).forEach(System.out::println);
	}
}
