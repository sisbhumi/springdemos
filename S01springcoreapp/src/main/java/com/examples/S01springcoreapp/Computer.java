package com.examples.S01springcoreapp;

public class Computer {
	int cpucores;
	String memorysize;
	String storageSize;
	
	public Computer(int cpucores, String memorysize, String storageSize) {

		this.cpucores = cpucores;
		this.memorysize = memorysize;
		this.storageSize = storageSize;
	}

	@Override
	public String toString() {
		return "Computer [cpucores=" + cpucores + ", memorysize=" + memorysize + ", storageSize=" + storageSize + "]";
	}

}
