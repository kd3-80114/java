package com.creditcalculator.calc;
import com.creditcalculator.*;
public class Tester {

	public static void main(String[] args) {
		Creditcalculator credit=new Creditcalculator(555,500,25,200,300);
		credit.calculateCreditLimit();
	}
}
