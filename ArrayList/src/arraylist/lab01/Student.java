package arraylist.lab01;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	String studname,dept;
	int studid;
	
	public Student(String studname, String dept,int studid)
	{
		this.studname=studname;
		this.dept=dept;
		this.studid= studid;
		
	}

	public static void main(String[] args) {
		ArrayList<Student>arr1 = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		System.out.println("1----enter student details");
		System.out.println("2----display");
		System.out.println("3---Remove");
		System.out.println("4----size");
		System.out.println("5-----Replace");
		System.out.println("6-----Contains");
		while(true)
		{
			System.out.println("enter your choice");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 01: System.out.println("Enter Student Name");
			         String s1 = sc.next();
			         System.out.println("Enter Student Department");
			         String s2 = sc.next();
			         System.out.println("Enter Student id");
			         int s3 = sc.nextInt();
			         Student obj = new Student(s1,s2,s3);
			         arr1.add(obj);
			         break;
			         
			case 02:  System.out.println("Display");
			           for(Student s : arr1)
			           {
			        	   System.out.println(s.studname);
			        	   System.out.println(s.studid);
			        	   System.out.println(s.dept);
			           }
			           break;
			case 03:
				   System.out.println("Remove");
				   System.out.println("Enter index");
				   int index = sc.nextInt();
				   arr1.remove(index);
				   break;
				   
			case 04:
				  System.out.println(arr1.size());
				  break;
				  
			case 05:
				  System.out.println("Replace");
				  System.out.println("Enter Student Name");
			         String s4 = sc.next();
			         System.out.println("Enter Student Department");
			         String s5 = sc.next();
			         System.out.println("Enter Student id");
			         int s6 = sc.nextInt();
			         Student obj1 = new Student(s4,s5,s6);
			         System.out.println("Enter the index value");
			         int k = sc.nextInt();
			         arr1.set(k,obj1);
			         break;
			         
			case 06:
				    System.out.println("Contains");
				    System.out.println(arr1.contains("ram"));
				    arr1.clear();
				    break;
				  
			    
			}
			
		}

	}

}
