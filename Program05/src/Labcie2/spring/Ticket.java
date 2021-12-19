package Labcie2.spring;

public class Ticket {
String T_number;
String destiny;
Customer Customer;

public Customer getCustomer() {
	return Customer;
}
public void setCustomer(Customer customer) {
	Customer = customer;
}
public String getT_number() {
	return T_number;
}
public void setT_number(String t_number) {
	T_number = t_number;
}
public String getDestiny() {
	return destiny;
}
public void setDestiny(String destiny) {
	this.destiny = destiny;
}
@Override
public String toString() {
	return "Ticket [T_number=" + T_number + ", destiny=" + destiny + ", Customer=" + Customer + "]";
}


}
