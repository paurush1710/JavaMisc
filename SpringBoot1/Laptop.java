package com.example.demo;

import org.springframework.stereotype.Component;

//@Component
@Component("lap1")
public final class Laptop {
	
	private int lid;
	private String laptop;
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLaptop() {
		return laptop;
	}
	public void setLaptop(String laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", laptop=" + laptop + "]";
	}
	public void compile() {
		System.out.println("Compiling");
	}
}
