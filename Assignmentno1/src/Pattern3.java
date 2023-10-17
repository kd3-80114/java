
public class Pattern3 
{
	public static void main(String[] args) 
	{
		int r=6,c=0;
		for(int i=0;i<r;i++)
		{
			for(int j=r-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		
	}

}
