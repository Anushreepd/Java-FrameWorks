package program6;

public class Student {

String name;
String usn;
Marks marks;


public Marks getMarks() {
return marks;
}
public void setMarks(Marks marks) {
this.marks = marks;
}


public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}

public String getUsn() {
return usn;
}
public void setUsn(String usn) {
this.usn = usn;
}
@Override
public String toString() {
	return "Student [name=" + name + ", usn=" + usn + ", marks=" + marks + "]";
}

}