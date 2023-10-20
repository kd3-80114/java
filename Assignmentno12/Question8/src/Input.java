import java.util.stream.IntStream;

public class Input 
{
	public static void main(String arg[])
	{
		IntStream ing=IntStream.iterate(1, x->x+1).limit(10);
		
		System.out.println(ing.summaryStatistics());
		
		
	}
	

}
//8. Create an IntStream to represent numbers from 1 to 10. 
//Call various functions like sum(), summaryStatistics() 
//and observe the output.