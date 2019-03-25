package SDA.UserCompare;

public class Student implements Comparable<Student>{
    int iQ = 0;
    String name;
    String lastname;

Student(int iq, String name, String lastname){
    this.iQ = iq;
    this.name = name;
    this.lastname = lastname;
}

    public int getiQ() {
        return iQ;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public int compareTo(Student std) {
        int resault = this.name.compareTo(std.name);
//
//        if(this.getiQ()==std.getiQ()){return 0;}
//    else if(this.getiQ()>std.getiQ())return 1;
//        else return -1;

        return resault;
    }
}
