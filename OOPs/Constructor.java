public class Constructor {
    public static void main(String args[]) {
        Student s1 = new Student();                         // Non-Parameterized
        Student s2  = new Student("Souvik");           // String param  
        Student s3 =  new Student(2402);               // int param
        Student s4 =  new Student("Kousik", 2400);// String + int param param overloding (Polymorphisam)

        System.out.println(s2.name);
        System.out.println(s3.roll);
        System.out.println(s4.name);
        System.out.println(s4.roll);
    }
}

class Student{
    String name;
    int roll;

    Student() {
        System.out.println("Constructor is called...");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

}
