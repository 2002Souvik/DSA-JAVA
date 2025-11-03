class Student {
    protected void finalize() {
        System.out.println("Destructor called for Student object");
    }
}

public class Destructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1 = null;
        s2 = null;
        s3 = null;

        System.gc();  // Request garbage collection

        System.out.println("End of main");
    }
}
