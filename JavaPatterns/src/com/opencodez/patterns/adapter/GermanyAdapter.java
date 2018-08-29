package com.opencodez.patterns.adapter;

public class GermanyAdapter implements Adapter {

	@Override
	public void connect() {
		System.out.println("Connecting to Germany Plug using Adapter.");
	}

}
