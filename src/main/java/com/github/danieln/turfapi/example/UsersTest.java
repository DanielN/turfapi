/*
 * Copyright 2017 Daniel Nilsson
 * Released under the 2-Clause BSD License, see LICENSE for details.
 */
package com.github.danieln.turfapi.example;

import java.util.Arrays;
import java.util.List;

import com.github.danieln.turfapi.TurfApi;
import com.github.danieln.turfapi.data.User;

public class UsersTest {

	public static void main(String[] args) {
		TurfApi api = new TurfApi();

		List<User> users = api.users(Arrays.asList(args));

		users.stream().map(User::toString).forEach(System.out::println);
	}
}
