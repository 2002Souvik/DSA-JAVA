public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Souvik");
        s1.schoolName = "DSSS High School";

        Student s2 = new Student();
        s2.setName("Kousik");
        System.out.println("School Name of s2: " + s2.schoolName);

        Student s3 = new Student();
        s3.setName("Aniket");
        s3.schoolName = "ABC High School";

        System.out.println("School Name of s1: " + s1.schoolName);

    }
}

class Student {
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}
