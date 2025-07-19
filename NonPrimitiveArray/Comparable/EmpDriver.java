package com.NonPrimitiveArray.Comparable;

import java.util.Arrays;

public class EmpDriver {
	public static void main(String[] args) {
		Emp e1=new Emp("Ram",28,2);
	    Emp e2=new Emp("Sita",25,3);
	    Emp e3=new Emp("Laxman",24,0);
	    Emp e4=new Emp("Bharat",23,1);
	    
	    Emp[]e= {e1,e2,e3,e4};
	    Arrays.sort(e);
	    for(Emp emp:e)
	    	System.out.println(emp);
	}

}
