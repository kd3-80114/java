package com.app;

import java.util.Comparator;

public class Tester 
{

	public static void main(String[] args) 
	{
		Double[] arr = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		System.out.println("Before sorting");
		for(Double element:arr)
		{
			System.out.println(element);
		}
		Doublecomparator d=new Doublecomparator();
		Selectionsort.selectionSort(arr,d);
		System.out.println("After sorting");

		for(Double element:arr)
		{
			System.out.println(element);
		}
		

	}

}
class Doublecomparator implements Comparator<Double>
{

	@Override
	public int compare(Double d1, Double d2) {
		return d1.compareTo(d2);
	
	}
	
}
