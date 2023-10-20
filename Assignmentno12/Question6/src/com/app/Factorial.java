//Calculate the factorial of the given number using stream operations.
package com.app;

import java.util.Scanner;
import java.util.stream.Stream;

public class Factorial 
{
	public static void main(String ar[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number  to calculale result");
		Stream<Integer> streams=Stream.iterate(1, x->x+1).limit(sc.nextInt());
		int result=streams.reduce(1,((x,y)->x*y));
		System.out.println(result);
		
	}
}
