package com.epam.epam3;
import java.util.*;

public class Cost_estimation {

	public static void main(String[] args) {
		int no_of_feets;
		ConstructionCost cc=new ConstructionCost();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of feets to be estimated");
		no_of_feets=sc.nextInt();
		System.out.println("select the materials form the following");
		System.out.println("1 for standard" +"\n"+ "2 for above standard"+"\n"+"3 for high standard"+"\n"+"4 for fully automated");
		System.out.println("enter ypur response");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:System.out.println("cost estimated is"+cc.Standard(no_of_feets));break;
		case 2:System.out.println("cost estimated is"+cc.Above_Standard(no_of_feets));break;
		case 3:System.out.println("cost estimated is"+cc.High_Standard(no_of_feets));break;
		case 4:System.out.println("cost estimated is"+cc.Automated(no_of_feets));break;
		}
			
		
		

	}

}
