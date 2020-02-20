package com.epam.epam3;

import java.util.*;

public class CalculateInterest {

	public static void main(String[] args) {
		Interest In=new Interest();
		Scanner sc=new Scanner(System.in);
		double principle,time,rate;
		System.out.println("enter principle amount");
		principle=sc.nextDouble();
		System.out.println("enter time period");
		time=sc.nextDouble();
		System.out.println("enter rate of interest");
		rate=sc.nextDouble();
		double simple=In.simpleInterest(principle, time, rate);
		double compound=In.compoundInterest(principle, time, rate);
		System.out.println("simple interest is"+simple);
		System.out.println("compound interest is"+compound);
		

	}

}
