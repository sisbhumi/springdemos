package com.examples.S03stereotypes.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("Chennai")
	private String city;
	
	@Value("TN")
	private String state;
	
	@Value("60056")
	private String pincode;

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
}
