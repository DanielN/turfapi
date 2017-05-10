/*
 * Copyright 2017 Daniel Nilsson
 * Released under the 2-Clause BSD License, see LICENSE for details.
 */
package com.github.danieln.turfapi.data;

public class Statistics {

	private int zonesTakenYesterday;
	private int totalZonesTaken;
	private int activeUsersThisRound;
	private int zonesTakenToday;
	private int usersOnline;
	private int zonesTakenThisRound;
	private int totalUsers;

	public Statistics() {
	}

	public int getZonesTakenYesterday() {
		return zonesTakenYesterday;
	}

	public void setZonesTakenYesterday(int zonesTakenYesterday) {
		this.zonesTakenYesterday = zonesTakenYesterday;
	}

	public int getTotalZonesTaken() {
		return totalZonesTaken;
	}

	public void setTotalZonesTaken(int totalZonesTaken) {
		this.totalZonesTaken = totalZonesTaken;
	}

	public int getActiveUsersThisRound() {
		return activeUsersThisRound;
	}

	public void setActiveUsersThisRound(int activeUsersThisRound) {
		this.activeUsersThisRound = activeUsersThisRound;
	}

	public int getZonesTakenToday() {
		return zonesTakenToday;
	}

	public void setZonesTakenToday(int zonesTakenToday) {
		this.zonesTakenToday = zonesTakenToday;
	}

	public int getUsersOnline() {
		return usersOnline;
	}

	public void setUsersOnline(int usersOnline) {
		this.usersOnline = usersOnline;
	}

	public int getZonesTakenThisRound() {
		return zonesTakenThisRound;
	}

	public void setZonesTakenThisRound(int zonesTakenThisRound) {
		this.zonesTakenThisRound = zonesTakenThisRound;
	}

	public int getTotalUsers() {
		return totalUsers;
	}

	public void setTotalUsers(int totalUsers) {
		this.totalUsers = totalUsers;
	}

	@Override
	public String toString() {
		return "Statistics [zonesTakenYesterday=" + zonesTakenYesterday
				+ ", totalZonesTaken=" + totalZonesTaken
				+ ", activeUsersThisRound=" + activeUsersThisRound
				+ ", zonesTakenToday=" + zonesTakenToday + ", usersOnline="
				+ usersOnline + ", zonesTakenThisRound=" + zonesTakenThisRound
				+ ", totalUsers=" + totalUsers + "]";
	}

}
