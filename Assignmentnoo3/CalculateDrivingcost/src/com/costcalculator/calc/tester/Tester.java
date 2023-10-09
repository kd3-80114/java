package com.costcalculator.calc.tester;
import com.costcalculator.calc.*;
public class Tester {
	
	public static void main(String[] args) {
		Costcalculator costcalculator=new Costcalculator();
		costcalculator.accept();
		System.out.println("Total Daily Driving cost = "+costcalculator.calculateDrivingCost());
		
	}

}
