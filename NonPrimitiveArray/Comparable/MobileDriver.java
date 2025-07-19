package com.NonPrimitiveArray.Comparable;

import java.util.Arrays;
import java.util.Scanner;

public class MobileDriver {
	public static void main(String[] args) {
		boolean r=true;
		Scanner s=new Scanner(System.in);
		Mobile m1=new Mobile("Oppo",4,128,20000,"Black");
		Mobile m2=new Mobile("Nothing",6,64,10000,"White");
		Mobile m3=new Mobile("Vivo",2,32,7000,"Pink");
		Mobile m4=new Mobile("Mi",8,256,30000,"Grey");
		Mobile m5=new Mobile("S23",12,266,12000,"Aqua");
		Mobile m6=new Mobile("Redmi",16,276,80000,"Red");
		
		Mobile[] m= {m1,m2,m3,m4,m5,m6};
		System.out.println(m1+"\n"+m2+"\n"+m3+"\n"+m4+"\n"+m5+"\n"+m6);
		do {
			System.out.println("Sort By:");
			System.out.println("1.SortByMobileName\n2.SortByPrice\n3.SortByRam\n4.SortByRom\n5.SortByColor\n6.Exit");
			int n=s.nextInt();
			switch(n) {
			case 1:{
				Arrays.sort(m,new SortByMobileName());
				for(Mobile mob:m)
					System.out.println(mob);
			}break;
			case 2:{
				Arrays.sort(m,new SortByPrice());
				for(Mobile mob:m)
					System.out.println(mob);
			}break;
			case 3:{
				Arrays.sort(m,new SortByRam());
				for(Mobile mob:m)
					System.out.println(mob);
			}break;
			case 4:{
				Arrays.sort(m,new SortByRom());
				for(Mobile mob:m)
					System.out.println(mob);
			}break;
			case 5:{
				Arrays.sort(m,new SortByColor());
				for(Mobile mob:m)
					System.out.println(mob);
			}break;
			case 6:{
				r=false;
				System.out.println("Thank You");
			}break;
			default:
				System.out.println("Invalid");
			}
		}while(r);
		
	}

}
