package com.NonPrimitiveArray.Comparable;

import java.util.Comparator;

public class SortEmp {

}
class SortByAge implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Emp2 e1=(Emp2)o1;
		Emp2 e2=(Emp2)o2;
		return e1.age-e2.age;
	}
	
}
class SortById implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Emp2 e1=(Emp2)o1;
		Emp2 e2=(Emp2)o2;
		return e1.id-e2.id;
	}
	
}
class SortByName implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Emp2 e1=(Emp2)o1;
		Emp2 e2=(Emp2)o2;
		return e1.name.compareTo(e2.name);
	}
	
}
