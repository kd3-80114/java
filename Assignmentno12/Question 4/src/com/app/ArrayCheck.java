//Create a functional interface Check<T> with single abstract method boolean compare(T x, T y). 
//Create a static method in main class to test
//array elements static <T> int countIf(T[] arr, T key, Check<T> c). 
//This method should return count of elements in the array for which
//given check is satisﬁed. The check will be given as lambda expression. Example call to countIf() from main() will be as follows

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
			if(c.compare(ele,key))
			{
				count++;
			}
			
		}
		return count;
	}
	public static void main(String args[])
	{
		Integer [] arr = {44, 77, 99,89, 22, 55, 66};
		Integer key = 50;
		int result=countIf(arr,key,new Check<Integer>() 
		{
			public boolean compare(Integer a,Integer b)
			{
				return a>b;
			}
		});
		System.out.println("REsult = "+result);

}
}
