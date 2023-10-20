
package app.com;
interface Emp
{
	
	public double getSal();
	default double calIncentives()
	{
		return 0.0;
	}
	static double calcTotalIncome(Emp[] arr)
	{
		double income=0.0;
		for(Emp ele:arr)
		{
			income+=ele.getSal()*ele.calIncentives();
		}
		
		return income;
	}
}

