package app.com;

class Employee {
	private double basicSalary;
	private double dearanceAllowance;
	public Employee()
	{
		this.basicSalary=0;
		this.dearanceAllowance=0;	
	}
	public Employee(double basicSalary, double dearanceAllowance) {
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
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