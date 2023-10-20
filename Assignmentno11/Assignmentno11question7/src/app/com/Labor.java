package app.com;

public class Labor implements Emp 
{
public Labor(double hours, double rate) {
	
		this.hours = hours;
		this.rate = rate;
	}
private double hours;
private double rate;
	@Override
	public double getSal() {
		return hours*rate;
	}
	public double calIncentives()
	{
		if(hours>300)
		{
			return 0.05*(hours*rate);
		}
		else
		{
			return 0;
		}
		
	}
	

}

//Create an interface Emp with abstract method double getSal() and a 
//default method default double calcIncentives(). The default method
//simply returns 0.0. Create a class Manager (with ﬁelds basicSalary and 
//dearanceAllowance)inherited from Emp. In this class override getSal() method
//(basicSalary + dearanceAllowance) as well as calcIncentives() method 
//(20% of basicSalary). Create another class Labor (with ﬁelds hours and rate)
//inherited from Emp interface. In this class override getSal() method 
//(hours * rate) as well as calcIncentives() method 
//(5% of salary if hours > 300,
//otherwise no incentives). 
//Create another class Clerk (with ﬁeld salary) inherited from Emp interface.
//In this class override getSal() method (salary). Do not override, 
//calcIncentives() in Clerk class. 
//In Emp interface create a static method static double 
//calcTotalIncome(Emp arr[]) that calculate
//total income (salary + incentives) of all employees in the given array.