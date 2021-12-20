package program6;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Student_main {
	
	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(Config.class);
		Scanner sc = new Scanner(System.in);


		Student s=context.getBean(Student.class);
		System.out.print("Name");
		String name = sc.next();
		s.setName(name);
		System.out.print("USN");
		String usn = sc.next();
		s.setUsn(usn);

		Marks mt=(Marks)context.getBean(Marks.class);
		System.out.print("Marks1");
		int m1 = sc.nextInt();
		mt.setM1(m1);
		System.out.print("Marks2");
		int m2 = sc.nextInt();
		mt.setM2(m2);
		System.out.print("Marks3");
		int m3 = sc.nextInt();
		mt.setM3(m3);

		System.out.println(s.toString());
		System.out.println(mt.toString());





	}

}

