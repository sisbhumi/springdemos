package com.examples.S04Interfaceinjection.dao;

import org.springframework.stereotype.Component;

@Component("orderdaooracle")
public class OrderDaoOracleImpl implements OrderDAO {
	

	@Override
	public void ceateOrder() {
		System.out.println("Open coneection to oracle db");
		
	}
}
