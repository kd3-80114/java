import java.util.*;
public class Conversion 
{
	public static void main(String[] args) 
	{
		int number;
		String converted_number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		number=sc.nextInt();
		System.out.println("Given Number :"+number);
		converted_number=Integer.toBinaryString(number);
		System.out.println("Binary Equivalent of "+number+" is "+converted_number);
		converted_number=Integer.toOctalString(number);
		System.out.println("Octal Equivalent of "+number+" is "+converted_number);
		converted_number=Integer.toHexString(number);
		System.out.println("Hex Equivalent of "+number+" is "+converted_number);
	}
}
