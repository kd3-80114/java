package com.app;
import java.util.*;
class Stringcomparator implements Comparator<String>
{
	@Override
	public int compare(String s1, String s2) {
		
		int diff=s1.length()-s2.length();
		return diff;
	}
	
}
public class StringList 
{
	public static void main(String args[])
	{
		ArrayList<String> str=new ArrayList<>();
		str.add("jkshgnsnggsfgbskhgwgnskdfnvs");
		str.add("jadfhkajf");
		str.add("jadfkajfkjafkshfkjasdflkjanfkfanfkanfnjklahkaj");
		str.add("jadfhka");
		str.add("zadfhk");
		str.add("jadfh");
		Stringcomparator s=new Stringcomparator();
		System.out.println(Collections.max(str,s)); 
	}

}
