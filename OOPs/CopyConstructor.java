public class CopyConstructor {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Souvik";
        s1.roll = 2402;
        s1.password = "Souvik@2402";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "Souv@1234";

        for(int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

        // s1.marks[0] = 50;

        // System.out.println("After changing s1.marks[0] = 50");
        // System.out.println("s1.marks[0]: " + s1.marks[0]);
        // System.out.println("s2.marks[0]: " + s2.marks[0]);
    }
}

class Student {
    String name;
    int roll;
    String password;
    int[] marks;

    //// shallow copy constructor
    // Student(Student s1) {
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.password = s1.password;

    //     this.marks = new int[3];
    //     for(int i = 0; i < 3; i++) {
    //         this.marks[i] = s1.marks[i];
    //     }
    // }

    //// deep copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;

        this.marks = new int[3];
        for(int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        System.out.println("Constructor is called...");
        marks = new int[3];
    }

    Student(String name) {
        this.name = name;
        marks = new int[3];
    }

    Student(int roll) {
        this.roll = roll;
        marks = new int[3];
    }
}
