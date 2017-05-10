/*
 * Copyright 2017 Daniel Nilsson
 * Released under the 2-Clause BSD License, see LICENSE for details.
 */
package com.github.danieln.turfapi.data;

import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


public class Zone {

	private Region region;
	private int id;
	private UserRef currentOwner;
	private Date dateLastTaken;
	private int totalTakeovers;
	private int takeoverPoints;
	private String name;
	private int pointsPerHour;
	private Date dateCreated;
	private double longitude;
	private double latitude;

	public Zone() {
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserRef getCurrentOwner() {
		return currentOwner;
	}

	public void setCurrentOwner(UserRef currentOwner) {
		this.currentOwner = currentOwner;
	}

	@XmlJavaTypeAdapter(DateAdapter.class)
	public Date getDateLastTaken() {
		return dateLastTaken;
	}

	public void setDateLastTaken(Date dateLastTaken) {
		this.dateLastTaken = dateLastTaken;
	}

	public int getTotalTakeovers() {
		return totalTakeovers;
	}

	public void setTotalTakeovers(int totalTakeovers) {
		this.totalTakeovers = totalTakeovers;
	}

	public int getTakeoverPoints() {
		return takeoverPoints;
	}

	public void setTakeoverPoints(int takeoverPoints) {
		this.takeoverPoints = takeoverPoints;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPointsPerHour() {
		return pointsPerHour;
	}

	public void setPointsPerHour(int pointsPerHour) {
		this.pointsPerHour = pointsPerHour;
	}

	@XmlJavaTypeAdapter(DateAdapter.class)
	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((currentOwner == null) ? 0 : currentOwner.hashCode());
		result = prime * result
				+ ((dateCreated == null) ? 0 : dateCreated.hashCode());
		result = prime * result
				+ ((dateLastTaken == null) ? 0 : dateLastTaken.hashCode());
		result = prime * result + id;
		long temp;
		temp = Double.doubleToLongBits(latitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(longitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pointsPerHour;
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + takeoverPoints;
		result = prime * result + totalTakeovers;
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
		Zone other = (Zone) obj;
		if (currentOwner == null) {
			if (other.currentOwner != null)
				return false;
		} else if (!currentOwner.equals(other.currentOwner))
			return false;
		if (dateCreated == null) {
			if (other.dateCreated != null)
				return false;
		} else if (!dateCreated.equals(other.dateCreated))
			return false;
		if (dateLastTaken == null) {
			if (other.dateLastTaken != null)
				return false;
		} else if (!dateLastTaken.equals(other.dateLastTaken))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(latitude) != Double
				.doubleToLongBits(other.latitude))
			return false;
		if (Double.doubleToLongBits(longitude) != Double
				.doubleToLongBits(other.longitude))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pointsPerHour != other.pointsPerHour)
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (takeoverPoints != other.takeoverPoints)
			return false;
		if (totalTakeovers != other.totalTakeovers)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Zone [region=" + region + ", id=" + id + ", currentOwner="
				+ currentOwner + ", dateLastTaken=" + dateLastTaken
				+ ", totalTakeovers=" + totalTakeovers + ", takeoverPoints="
				+ takeoverPoints + ", name=" + name + ", pointsPerHour="
				+ pointsPerHour + ", dateCreated=" + dateCreated
				+ ", longitude=" + longitude + ", latitude=" + latitude + "]";
	}

}
