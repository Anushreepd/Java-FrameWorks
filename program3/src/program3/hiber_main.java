package program3;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;




public class hiber_main {

static Scanner sc = new Scanner(System.in);

StandardServiceRegistry ssr;
Metadata meta;
SessionFactory sf;
Session session;
Transaction t;

public void connect() {

ssr = (StandardServiceRegistry) new StandardServiceRegistryBuilder().configure("hibernate.hbm.xml").build();
meta = new MetadataSources(ssr).getMetadataBuilder().build();
sf = meta.getSessionFactoryBuilder().build();
session=sf.openSession();
t=session.beginTransaction();
}

public void Insert() {
connect();
connect();
student s = new student();
s.setId(1);
s.setUsn("1RV20MC112");
s.setName("vinod");
s.setAddress("arsikere");
s.setMarks(500);
session.save(s);
t.commit();
System.out.println("Inserted");
}

public void delete() {
connect();
student s1 = new student();
System.out.print("Enter ID : ");
int id =  sc.nextInt();
s1.setId(id); session.delete(s1);
t.commit();
System.out.println("Deleted");
}

public void select() 
{
List<student> s = session.createQuery("from student").list();
for(student i:s) {
System.out.println(i.getId());
System.out.println(i.getName());
System.out.println(i.getUsn());
System.out.println(i.getAddress());
System.out.println(i.getMarks());

}  

}

public static void main(String[] args) {
hiber_main sm = new hiber_main();

while(true) {
System.out.println("1- Insert");
System.out.println("2- Select");
System.out.println("3- Delete");
System.out.print("Enter your choice : ");
int choice = sc.nextInt();
switch(choice) {
case 1:
sm.Insert();
break;
case 2:
sm.select();
break;
case 3:
sm.delete();
break;
default:
System.out.println("Invalid");
}
}

}

}



