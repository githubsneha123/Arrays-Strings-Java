package com.NonPrimitiveArray.Comparable;

import java.util.Arrays;

public class Emp2Driver {
	public static void main(String[] args) {
		Emp2 e1=new Emp2("Ram",28,4);
		Emp2 e2=new Emp2("Sita",25,2);
		Emp2 e3=new Emp2("Bharat",23,1);
		Emp2 e4=new Emp2("Laxman",24,0);
		
		Emp2[] e= {e1,e2,e3,e4};
		Arrays.sort(e,new SortByAge());
		for(Emp2 emp:e)
			System.out.println(emp);
		System.out.println("----------------------------");
		Arrays.sort(e,new SortById());
		for(Emp2 emp:e)
			System.out.println(emp);
		System.out.println("----------------------------");
		Arrays.sort(e,new SortByName());
		for(Emp2 emp:e)
			System.out.println(emp);
		
	}

}
