/*
 * Copyright 2017 Daniel Nilsson
 * Released under the 2-Clause BSD License, see LICENSE for details.
 */
package com.github.danieln.turfapi.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.github.danieln.turfapi.TurfApi;
import com.github.danieln.turfapi.data.User;

public class Toplist {

	public static void main(String[] args) {
		TurfApi api = new TurfApi();

		List<User> users = api.users(Arrays.asList(args));

		Collections.sort(users, (a, b) -> b.getPoints() - a.getPoints());

		int i = 0;
		int pos = 0;
		int last = -1;

		System.out.println("Pos  Points Name");
		for (User user : users) {
			i++;
			if (user.getPoints() != last) {
				pos = i;
				last = user.getPoints();
			}
			System.out.printf("%3d %7d %s\n", pos, user.getPoints(), user.getName());
		}
	}
}
