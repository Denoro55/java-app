package com.test.model;

public class Player {

	private String name;

	private String figure;

	public Player(final String name, final String figure) {
		this.name = name;
		this.figure = figure;
	}

	public String getName() {
		return name;
	}

	public String getFigure() {
		return figure;
	}

}