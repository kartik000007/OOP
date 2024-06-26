public class Aggregation {
    public static void main(String[] args) {
        student s1 = new student(1, "aaa", 12, "madhav", "varachha", "Gujrat");
        System.out.println(s1.address.state);
    }
}

class Address {
    int Hno;
    String Sname;
    String area;
    String state;

    public Address(int Hno, String Sname, String area, String state) {
        this.Hno = Hno;
        this.Sname = Sname;
        this.area = area;
        this.state = state;
    }
}

class student {
    int Rno;
    String name;
    Address address;
    public student(int Rno, String name, int Hno, String Sname, String area, String state) {
        this.Rno = Rno;
        this.name = name;
        this.address = new Address(Hno, Sname, area, state);
    }
}