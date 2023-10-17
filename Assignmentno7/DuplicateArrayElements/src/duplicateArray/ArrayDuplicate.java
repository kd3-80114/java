package duplicateArray;
import java.util.*;
public class ArrayDuplicate 
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int size=0;
	int index=0;
	System.out.println("Enter Number of elemetns");
	size=sc.nextInt();
	String strings[]=new String[size];
	String strings1[]=new String[size+1];
	for(int i=0;i<size;i++)
	{
		System.out.println("Enter element at index"+(i+1));
		strings[i]=sc.next();
	}
	for(int i=0;i<size;i++)
	{
		for(int j=i+1;j<size;j++)
		{
			if(strings[i].equals(strings[j]))
			{
				strings1[index]=strings[i];
				index++;
			}	
		}
	}
	System.out.println("Duplicate elements are ");
	for(int i=0;i<index;i++)
	{
		System.out.println((i+1)+" = "+strings1[i]);
	}
	}
}
