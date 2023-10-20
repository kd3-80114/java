package app.com;

public class Tester {
	public static void main(String args[])
	{
		double income;
		Emp[] e=new Emp[3];
		e[0]=new Manager(100,200);
		e[1]=new Labor(12,50);
		e[2]=new Cleark(200);
		
	income=Emp.calcTotalIncome(e);
	System.out.println("Total income= "+income);
	
	}

}
