import java.util.*;
public class Checkdatatype 
{
public static void main(String[] args) 
{
	double d1,d2,average;
	Boolean result1,result2;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter First Number");
	result1=sc.hasNextDouble();
	d1=sc.nextDouble();
	System.out.println("Enter Second Number");
	result2=sc.hasNextDouble();
	d2=sc.nextDouble();
	if(result1==true&&result2==true)
	{
		System.out.println(average=((d1+d2)/2));
	}
	else
	{
	System.out.println("Error");
	}	
}
}
