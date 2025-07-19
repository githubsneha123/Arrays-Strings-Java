package com.NonPrimitiveArray.Comparable;

public class Emp implements Comparable {
	String name;
	int id;
	int age;
	
	public Emp(String name,int age,int id) {
		this.name=name;
		this.age=age;
		this.id=id;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
	@Override 
	public int compareTo(Object o) {
		Emp e=(Emp)o;
//		if(this.age>e.age) return 1;
//		else if(this.age<e.age) return -1;
//		return 0;
		
		return this.id-e.id;//number
		
		//return this.name.compareTo(e.name);//string
	}

}
