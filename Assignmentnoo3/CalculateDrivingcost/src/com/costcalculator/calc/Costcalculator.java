package com.costcalculator.calc;
import java.util.*;
public class Costcalculator {

	private int milesPerDay;
	private int cost;
	private int averageMilesPerGallon;
	private int parkingFees;
	private int tollsPerDay;
	public Costcalculator()
	{
		this(0,0,0,0,0);
	}
	public Costcalculator(int milesPerDay,int cost,int averageMilesPerGallon,int parkingFees,int tollsPerDay)
	{
	this.milesPerDay=milesPerDay;
	this.cost=cost;
	this.averageMilesPerGallon=averageMilesPerGallon;
	this.parkingFees=parkingFees;
	this.tollsPerDay=tollsPerDay;
	}
	public int calculateDrivingCost()
	{

				return ((milesPerDay/averageMilesPerGallon)*cost+parkingFees+tollsPerDay);
	}
	public void accept()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Total miles Driven per day");
		this.milesPerDay=scanner.nextInt();
		System.out.println("Enter cost");
		this.cost=scanner.nextInt();
		System.out.println("Enter Average Miles Per Gallon");
		this.averageMilesPerGallon=scanner.nextInt();
		System.out.println("Enter Parking fees");
		this.parkingFees=scanner.nextInt();
		System.out.println("Enter tolls per day");
		this.tollsPerDay=scanner.nextInt();
		
	}
	

}
