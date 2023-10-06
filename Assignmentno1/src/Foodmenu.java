import java.util.*;
class Fooditems
{
	Scanner sc=new Scanner(System.in);

	int samosa,dosa,idli,upma,poha,total,quantity,choice;
	Fooditems()
	{
		samosa=20;
		dosa=50;
		idli=30;
		upma=50;
		poha=20;	
		quantity=0;
	}
 
 void displaymenu()
 {
	 
		System.out.println("Press 0 for Exit");
		System.out.println("Press 1 for samosa");
		System.out.println("Press 2 for Dosa ");
		System.out.println("Press 3 for idli");
		System.out.println("Press 4 for upma");
		System.out.println("Press 5 for poha");
		choice=sc.nextInt();
		System.out.println("Enter Quantity");
		quantity=sc.nextInt();
		switch(choice)
		{
		case 1:
			total=quantity*samosa;
			break;
		case 2:
			total=quantity*dosa;
			break;
		case 3:
			total=quantity*idli;
			break;
		case 4:
			total=quantity*upma;
			break;
		case 5:
			total=quantity*poha;
			break;
		}	
}
 void calculateBill()
 {
	System.out.println("Total = "+total); 
 }	
}
public class Foodmenu 
{

	public static void main(String[] args) {
		int choice;
		Fooditems f=new Fooditems();
		f.displaymenu();
		f.calculateBill();
		
		
	}

}
