package com.app.tester;
import com.app.employees.*;
import com.app.generic.*;
public class Tester {

	public static void main(String[] args) {
		Box<CommisionEmployee> c=new Box<>();
		//c.calculateSalaries(new CommisionEmployee());
		c.setObj(new CommisionEmployee());
		CommisionEmployee d=c.getObj();
		d.acceptData();
		c.calculateSalaries();
		
		Box<HourlySalaried> o1=new Box<>();
		o1.setObj(new HourlySalaried());
		HourlySalaried o2=o1.getObj();
		o2.acceptData();
		o1.calculateSalaries();
		

	}

}
