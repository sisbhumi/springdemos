package com.examples.S02Autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S02Autowire/springconfig.xml");
    	Employee emp = (Employee) ctx.getBean("emp1");
    	System.out.println(emp);
    }
}
