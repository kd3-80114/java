//In above assignment, create one more array of Double (constant values) where few elements are repeated. Input a key from user and check how many
//times key is repeated in the array using appropriate lambda expression.

package com.app;
interface Check<T>
{
	public boolean compare(T x,T y);
}

public class ArrayCheck {
	public static <T> int countIf(T[] arr,T key,Check<T> c)
	{
		int count=0;
		for(T ele:arr)
		{
			if(c.compare(ele,key)==true)
			{
				count++;
			}
			
		}
		return count;
	}
	public static void main(String args[])
	{
		Double [] arr = {4.4,4.4,7.7,9.9,8.9,8.9,2.2,5.5,5.5,5.5,6.6,6.6};
		Double key = 5.5;
		int result=countIf(arr,key,new Check<Double>() 
		{
			public boolean compare(Double a,Double b)
			{
					 return a.equals(b);
			}
		});
		System.out.println(result);
		
	int result1=countIf(arr,key,(x,y)->x.equals(y));
		System.out.println("REsult = "+result1);

}
}
