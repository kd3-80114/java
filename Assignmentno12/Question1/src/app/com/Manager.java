package app.com;

public class Manager implements Emp
{
private double basicSalary;
private double dearanceAllowance;

	public Manager(double basicSalary, double dearanceAllowance) {
	this.basicSalary = basicSalary;
	this.dearanceAllowance = dearanceAllowance;
}
	@Override
	public double getSal() 
	{
		return basicSalary+dearanceAllowance;
	}
	@Override
	public double calIncentives()
	{
		return 0.2*basicSalary;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getDearanceAllowance() {
		return dearanceAllowance;
	}
	public void setDearanceAllowance(double dearanceAllowance) {
		this.dearanceAllowance = dearanceAllowance;
	}

}
