package Employee_LL;

import java.util.LinkedList;
import java.util.Scanner;

public class Employee {
	String designation,empname;
	int  empid;
	
	
	public Employee(String empname,String designation,int empid)
	{
		this.empname=empname;
		this.designation=designation;
		this.empid=empid;
		
	}
	

	public static void main(String[] args) {
		LinkedList<Employee>arr1 = new LinkedList<Employee>();
		Scanner sc = new Scanner(System.in);
		System.out.println("1----Insert");
		System.out.println("2----Display");
		System.out.println("3----Remove");
		System.out.println("4-----size");
		System.out.println("5----Replace");
		System.out.println("6----contains");
		while(true)
		{
			System.out.println("Enter the Choice");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 01: System.out.println("Enter the Employee name");
			         String s1= sc.next();
			         System.out.println("enter the Employee designation");
			         String s2= sc.next();
			         System.out.println("Enter the Employee id");
			         int s3 = sc.nextInt();
			         Employee obj = new Employee(s1,s2,s3);
			         arr1.add(obj);
			         break;
			         
			case 02: System.out.println("Display");
			         for(Employee e :arr1)
			         {
			        	 System.out.println(e.empid);
			        	 System.out.println(e.empname);
			        	 System.out.println(e.designation);
			        	 
			         }
			         break;
			         
			case 03: System.out.println("Removing");
			         System.out.println("enter the index number");
			         int index = sc.nextInt();
			         arr1.remove(index);
			         System.out.println("removed Successfully");
			         break;
			         
			case 04: System.out.print("Size of LinkedList");
			         System.out.println(arr1.size());
			          
			case 05: System.out.println("Replace based on index");
					System.out.println("Enter the Employee name");
					String s4= sc.next();
					System.out.println("enter the Employee designation");
					String s5= sc.next();
					System.out.println("Enter the Employee id");
					int s6 = sc.nextInt();
					Employee obj1 = new Employee(s4,s5,s6);
					System.out.println("Enter the index to replace");
					int index1 = sc.nextInt();
					arr1.set(index1, obj1);
					break;
	         
			case 06: 
					System.out.println("Contains");
					System.out.println("Enter the String that you want yo search");
					String s = sc.next();
					System.out.println(arr1.contains(s));
			}
		}

	}

}
