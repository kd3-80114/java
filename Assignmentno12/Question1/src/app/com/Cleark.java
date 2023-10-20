package app.com;

public class Cleark extends Employee implements Emp
{
private double salary;
	public Cleark(double salary) {
	this.salary = salary;
}
	@Override
	public double getSal() {
		return salary;
		
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
//Create another class Clerk (with ﬁeld salary) inherited from Emp interface.
//In this class override getSal() method (salary). Do not override, 
//calcIncentives() in Clerk class.