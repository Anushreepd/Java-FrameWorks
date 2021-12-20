package program3;


import javax.persistence.*;


@Entity
@Table(name="student")

public class student {
@Id
int Id;
String Name,Usn,Address;
float Marks;
public int getId() {
return Id;
}
public void setId(int id) {
this.Id = id;
}
public String getName() {
return Name;
}
public void setName(String name) {
this.Name = name;
}
public String getUsn() {
return Usn;
}
public void setUsn(String usn) {
this.Usn = usn;
}
public String getAddress() {
return Address;
}
public void setAddress(String address) {
this.Address = address;
}
public float getMarks() {
return Marks;
}
public void setMarks(float marks) {
this.Marks = marks;
}

}