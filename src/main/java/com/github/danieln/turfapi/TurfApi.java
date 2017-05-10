/*
 * Copyright 2017 Daniel Nilsson
 * Released under the 2-Clause BSD License, see LICENSE for details.
 */
package com.github.danieln.turfapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.filter.EncodingFilter;
import org.glassfish.jersey.message.GZipEncoder;

import com.github.danieln.turfapi.data.BoundingBox;
import com.github.danieln.turfapi.data.ById;
import com.github.danieln.turfapi.data.ByName;
import com.github.danieln.turfapi.data.Statistics;
import com.github.danieln.turfapi.data.TurfApiError;
import com.github.danieln.turfapi.data.User;
import com.github.danieln.turfapi.data.Zone;

public class TurfApi {

	private final WebTarget target;

	public TurfApi() {
		this("http://api.turfgame.com/v4/");
	}

	public TurfApi(String baseUrl) {
		target = ClientBuilder.newClient()
				.register(GZipEncoder.class)
				.register(EncodingFilter.class)
				.target(baseUrl);
	}

	public Statistics statistics() {
		try {
			return target.path("statistics")
					.request(MediaType.APPLICATION_JSON_TYPE)
					.get(Statistics.class);
		} catch (WebApplicationException ex) {
			throw new TurfApiException(ex.getResponse().readEntity(TurfApiError.class), ex);
		}
	}

	public List<User> users(Collection<String> names) {
		try {
			ByName[] byNames = names.stream().map(ByName::new).toArray(ByName[]::new);
			Entity<ByName[]> entity = Entity.json(byNames);
			List<User> list = target.path("users")
					.request(MediaType.APPLICATION_JSON_TYPE)
					.post(entity, new GenericType<List<User>>() {});
			return list;
		} catch (WebApplicationException ex) {
			throw new TurfApiException(ex.getResponse().readEntity(TurfApiError.class), ex);
		}
	}

	public User user(String name) {
		List<User> list = users(Collections.singleton(name));
		if (list.isEmpty())
			return null;
		if (list.size() != 1)
			throw new RuntimeException("Expected one result, got " + list.size());
		return list.get(0);
	}

	public List<Zone> zones(BoundingBox bb) {
		try {
			Entity<BoundingBox[]> entity = Entity.json(new BoundingBox[] { bb });
			return target.path("zones")
					.request(MediaType.APPLICATION_JSON_TYPE)
					.post(entity, new GenericType<List<Zone>>() {});
		} catch (WebApplicationException ex) {
			throw new TurfApiException(ex.getResponse().readEntity(TurfApiError.class), ex);
		}
	}

	public List<Zone> zones(int[] ids) {
		try {
			ById[] byIds = Arrays.stream(ids).mapToObj(ById::new).toArray(ById[]::new);
			Entity<ById[]> entity = Entity.json(byIds);
			return target.path("zones")
					.request(MediaType.APPLICATION_JSON_TYPE)
					.post(entity, new GenericType<List<Zone>>() {});
		} catch (WebApplicationException ex) {
			throw new TurfApiException(ex.getResponse().readEntity(TurfApiError.class), ex);
		}
	}

}
