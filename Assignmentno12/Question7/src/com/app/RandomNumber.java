package com.app;

import java.util.Random;
import java.util.stream.Stream;

public class RandomNumber 
{
	public static void main(String args[])
	{
		Random r=new Random();
		Stream<Integer> stream=Stream.generate(()->r.nextInt(100)).limit(10);
		int result=stream.reduce(1,(x,y)->x+y);
		System.out.println("result="+result);
	}

}
