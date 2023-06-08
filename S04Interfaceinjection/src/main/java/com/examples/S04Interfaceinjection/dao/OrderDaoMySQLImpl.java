package com.examples.S04Interfaceinjection.dao;

import org.springframework.stereotype.Component;

@Component("orderdaomysqlimpl")
public class OrderDaoMySQLImpl implements OrderDAO{

	@Override
	public void ceateOrder() {
		System.out.println("Open connection to MYSQL DB");
	}

}
