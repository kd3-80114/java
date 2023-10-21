package com.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Buffered 
{
	
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		try(FileWriter fw=new FileWriter("new.txt"))
		{
		try(BufferedWriter bw=new BufferedWriter(fw))
		{
			for(int i=1; i<=4; i++) {
				String line = sc.nextLine();
				bw.write(line);
				bw.newLine();
				}
		}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}	
	}
	
	
}
