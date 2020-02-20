package com.epam.epam3;

public class ConstructionCost {
	
public double Standard(int no_of_feets)
{
	return 1200*no_of_feets;
}
public double Above_Standard(int no_of_feets)
{
	return 1500*no_of_feets;
}
public double High_Standard(int no_of_feets)
{
	return 1800*no_of_feets;
}
public double Automated(int no_of_feets)
{
	return 2500*no_of_feets;
}

}