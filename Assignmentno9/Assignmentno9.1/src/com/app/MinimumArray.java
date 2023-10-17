package com.app;

public class MinimumArray 
{
	public static <T extends Number> T calcMinimun(T arr[])
	{
		T min=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].doubleValue()<arr[j].doubleValue())
				{
					 min=arr[i];
				}
				else
				{
					min=arr[j];
				}
			}
		}
		return min;
	}
}
