package com.epam.epam3;

public class Interest {
	public double simpleInterest(double principle,double time,double rate)
	{
	return principle*rate*time/100;	
	}
	public double compoundInterest(double principle,double time,double rate)
	{
	return principle*Math.pow(1.0+rate/100,time)-principle;
	}

}
