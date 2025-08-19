public class PassingArraysAsArgument {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88}; 
        updateMarks(marks); 
        printMarks(marks);
    }

    public static void updateMarks(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1; // Increase each mark by 1
        }
    }

    public static void printMarks(int[] marks) {
        for (int mark : marks) {
            System.out.println(mark); // Print each mark in the array
        }
    }
}
