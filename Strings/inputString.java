import java.util.Scanner;

public class inputString {
    public static void main(String arhs[]) {
        //// Decleration of String
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz@123");
        // Strings are immutable

        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        // name = sc.next();
        // next() -> takes input till space
        name = sc.nextLine(); 
        // nextLine() -> takes input till new line
        System.out.println("Your name is: " + name);

        //// length of string - name.length()
        System.out.println("Length of your name is: " + name.length());

        //// Concatenation of strings - name1.concat(name2) or name1 + name2
        String firstName, lastName;
        System.out.print("Enter your first name: ");
        firstName = sc.nextLine();
        System.out.print("Enter your last name: ");
        lastName = sc.nextLine();
        String fullName = firstName + " " + lastName;
        System.out.println("Your full name is: " + fullName);

        ///// charAt() - to get character at a specific index
        System.out.print("Enter an index to get character from your name: ");
        int index = sc.nextInt();
        if (index >= 0 && index < name.length()) {
            System.out.println("Character at index " + index + " is: " + name.charAt(index));
        } else {
            System.out.println("Index out of bounds");
        }

        sc.close();
    }
}
