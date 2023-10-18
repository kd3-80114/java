package com.app;
import java.util.*;

public class Tester {
	public static void main(String args[])
	{
		int size,index;
		Scanner sc=new Scanner(System.in);
		List<Employee> employees=new LinkedList<>();
		
		int choice=1;
		while(choice!=0)	
		{
			System.out.println("Enter 0 to exit");
			System.out.println("Enter 1 to add Employee");
			System.out.println("Enter 2 to find Employee");
			System.out.println("Enter 3 to sort Employee");
			System.out.println("Enter 4 to sort Employee");
			System.out.println("Enter 5 to update Employee");
			System.out.println("Enter 6 to display all Employee");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				Employee e=new Employee();
				e.acceptData();
				employees.add(e);
			break;
			case 2:
				System.out.println("Enter SSN of Employee to delete");
				int ssn=sc.nextInt();
				Employee key=new Employee();
				key.setSsn(ssn);
				if(employees.contains(key))
				{
					index=employees.indexOf(key);
					employees.remove(index);
				}
				else
				{
					System.out.println("Employee not found");
				}
//				for(Employee emp:employees)
//				{
//					System.out.println(emp);
//				}
			break;
			case 3:
				System.out.println("Enter ssn of employee to find");
				ssn=sc.nextInt();
				Employee e2=new Employee();
				e2.setSsn(ssn);
				if(employees.contains(e2))
				{
					index=employees.indexOf(e2);
					System.out.println(employees.get(index));
				}
			break;
			case 4:
				EmployeeComparartor emp1=new EmployeeComparartor();
				employees.sort(emp1);
				
			case 5:
				System.out.println("Enter ssn of employee to be updated");
				ssn=sc.nextInt();
				Employee e3=new Employee();
				e3.setSsn(ssn);
				if(employees.contains(e3))
				{
					index=employees.indexOf(e3);
					System.out.println("Enter 1 to update firstname\nEnter 2 to update lastname\nEnter 3 to update ssn");
					int c=sc.nextInt();
					if(c==1)
					{
						System.out.println("Enter Firstname");
						String f=sc.next();
						employees.get(index).setFirstName(f);
					}
					else if(c==2)
					{
						System.out.println("Enter Lastname");
						String l=sc.next();
						employees.get(index).setLastName(l);
					}
					else if(c==3)
					{
						System.out.println("Enter ssn");
						int s=sc.nextInt();
						employees.get(index).setSsn(s);
					}
				}
				
			case 6:
				for(Employee ele:employees)
				{
					System.out.println(ele);
				}
			}
			
			
		}
	}

}


//Create LinkedList<> of Employee. Perform add, delete, ﬁnd, sort, 
//edit functionality in a menu driven program.
//Refer hint below for edit/update
//functionality:
