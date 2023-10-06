
public class Patter2 {
public static void main(String[] args) {
	int r=5,c=1,d=0,e=0;
	for(int i=0;i<r;i++)
	{
	for(int j=r-i;j>0;j--)
	{
	System.out.print(" ");
	}
	for(int k=0;k<r-(r-c);k++)
	{
		System.out.print("*");
	}
	c=c+2;
	System.out.println();
	}
	d=r+(r-1)-2;
	for(int i=0;i<r-1;i++)
	{
	for(int j=0;j<=i+1;j++)
	{
	System.out.print(" ");
	}
	for(int k=0;k<d;k++)
	{
		System.out.print("*");
	}
	d=d-2;
	System.out.println();
	}
	

}
}
