/*
 * Copyright 2017 Daniel Nilsson
 * Released under the 2-Clause BSD License, see LICENSE for details.
 */
package com.github.danieln.turfapi.data;

public class BoundingBox {

	private Point northEast;
	private Point southWest;

	public BoundingBox() {
	}

	public BoundingBox(Point northEast, Point southWest) {
		this.northEast = northEast;
		this.southWest = southWest;
	}

	public Point getNorthEast() {
		return northEast;
	}

	public void setNorthEast(Point northEast) {
		this.northEast = northEast;
	}

	public Point getSouthWest() {
		return southWest;
	}

	public void setSouthWest(Point southWest) {
		this.southWest = southWest;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((northEast == null) ? 0 : northEast.hashCode());
		result = prime * result
				+ ((southWest == null) ? 0 : southWest.hashCode());
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
		BoundingBox other = (BoundingBox) obj;
		if (northEast == null) {
			if (other.northEast != null)
				return false;
		} else if (!northEast.equals(other.northEast))
			return false;
		if (southWest == null) {
			if (other.southWest != null)
				return false;
		} else if (!southWest.equals(other.southWest))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BoundingBox [northEast=" + northEast + ", southWest="
				+ southWest + "]";
	}

}
