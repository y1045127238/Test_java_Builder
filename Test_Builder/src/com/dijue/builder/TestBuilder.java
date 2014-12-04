package com.dijue.builder;

public class TestBuilder {

	public static void main(String[] args) {

		ClsBuilder cb = new ClsBuilder.Builder().lat(12.21).lng(21.12).build();
		System.out.println(cb.toString());

	}

}
