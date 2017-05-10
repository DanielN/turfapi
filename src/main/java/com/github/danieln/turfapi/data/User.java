/*
 * Copyright 2017 Daniel Nilsson
 * Released under the 2-Clause BSD License, see LICENSE for details.
 */
package com.github.danieln.turfapi.data;

import java.util.Arrays;

public class User {

	private Region region;
	private int[] medals;
	private int blocktime;
	private int[] zones;
	private int uniqueZonesTaken;
	private int id;
	private int pointsPerHour;
	private int rank;
	private int totalPoints;
	private String name;
	private int taken;
	private int points;
	private int place;
	private String country;

	public User() {
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public int[] getMedals() {
		return medals;
	}

	public void setMedals(int[] medals) {
		this.medals = medals;
	}

	public int getBlocktime() {
		return blocktime;
	}

	public void setBlocktime(int blocktime) {
		this.blocktime = blocktime;
	}

	public int[] getZones() {
		return zones;
	}

	public void setZones(int[] zones) {
		this.zones = zones;
	}

	public int getUniqueZonesTaken() {
		return uniqueZonesTaken;
	}

	public void setUniqueZonesTaken(int uniqueZonesTaken) {
		this.uniqueZonesTaken = uniqueZonesTaken;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPointsPerHour() {
		return pointsPerHour;
	}

	public void setPointsPerHour(int pointsPerHour) {
		this.pointsPerHour = pointsPerHour;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTaken() {
		return taken;
	}

	public void setTaken(int taken) {
		this.taken = taken;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getPlace() {
		return place;
	}

	public void setPlace(int place) {
		this.place = place;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + blocktime;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + id;
		result = prime * result + Arrays.hashCode(medals);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + place;
		result = prime * result + points;
		result = prime * result + pointsPerHour;
		result = prime * result + rank;
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + taken;
		result = prime * result + totalPoints;
		result = prime * result + uniqueZonesTaken;
		result = prime * result + Arrays.hashCode(zones);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (blocktime != other.blocktime)
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (id != other.id)
			return false;
		if (!Arrays.equals(medals, other.medals))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (place != other.place)
			return false;
		if (points != other.points)
			return false;
		if (pointsPerHour != other.pointsPerHour)
			return false;
		if (rank != other.rank)
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (taken != other.taken)
			return false;
		if (totalPoints != other.totalPoints)
			return false;
		if (uniqueZonesTaken != other.uniqueZonesTaken)
			return false;
		if (!Arrays.equals(zones, other.zones))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TurferDetail [region=" + region + ", medals="
				+ Arrays.toString(medals) + ", blocktime=" + blocktime
				+ ", zones=" + Arrays.toString(zones) + ", uniqueZonesTaken="
				+ uniqueZonesTaken + ", id=" + id + ", pointsPerHour="
				+ pointsPerHour + ", rank=" + rank + ", totalPoints="
				+ totalPoints + ", name=" + name + ", taken=" + taken
				+ ", points=" + points + ", place=" + place + ", country="
				+ country + "]";
	}

}
