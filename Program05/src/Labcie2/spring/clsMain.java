package Labcie2.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class clsMain {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("NewFile.xml");
		Customer c =(Customer)ac.getBean("Customer");
		Ticket t = (Ticket)ac.getBean("Ticket");
		Scanner sc = new Scanner(System.in);
        System.out.print("Customer details");
        System.out.print("name of the customer");
        String n = sc.next();
        c.setC_name(n);
        System.out.println("ID of the customer");
        String i = sc.next();
        c.setC_id(i);
        System.out.println("age");
        int a = sc.nextInt();
        c.setAge(a);
        System.out.print("Ticket details");
        System.out.println("Ticket Number");
        String tn = sc.next();
        t.setT_number(tn);
        System.out.println("Destination");
        String d = sc.next();
        t.setDestiny(d);
        System.out.println(t.toString());
        

	}

}
