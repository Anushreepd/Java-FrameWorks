package Labcie2.spring;

public class Customer {
 String c_name;
 String c_id;
 int age;
public String getC_name() {
	return c_name;
}
public void setC_name(String c_name) {
	this.c_name = c_name;
}
public String getC_id() {
	return c_id;
}
public void setC_id(String c_id) {
	this.c_id = c_id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Customer [c_name=" + c_name + ", c_id=" + c_id + ", age=" + age + "]";
}

 
 
}
