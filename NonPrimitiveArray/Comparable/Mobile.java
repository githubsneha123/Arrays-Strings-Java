package com.NonPrimitiveArray.Comparable;

public class Mobile {
	String mobileName;
	int ram;
	int rom;
	double price;
	String color;
	public Mobile(String mobileName, int ram, int rom, double price, String color) {
		this.mobileName = mobileName;
		this.ram = ram;
		this.rom = rom;
		this.price = price;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Mobile [mobileName=" + mobileName + ", ram=" + ram + ", rom=" + rom + ", price=" + price + ", color="
				+ color + "]";
	} 
	
	

}
