public class StringFunctions {
    public static void main(String args[]) {
        //// String Concatenation
        String s1 = "Souvik";
        String s2 = "Souvik";
        String s3 = new String("Souvik");
        
        if(s1 == s2) { 
            System.out.println("s1 and s2 are equal");
        } else {
            System.out.println("s1 and s2 are not equal");
        }

        if(s1 == s3) {
            System.out.println("s1 and s3 are equal");
        } else {
            System.out.println("s1 and s3 are not equal");
        }

        if(s1.equals(s3)) {
            System.out.println("s1 and s3 are equal");
        } else {
            System.out.println("s1 and s3 are not equal");
        }

        //// Substring
        String str = "Hello World";
        System.out.println(getSubstring(str, 4, 7));
    }

    public static String getSubstring(String str, int start, int end) {
        String substr = "";
        for(int i = start; i < end; i++) {
            substr += str.charAt(i);
        }
        return substr;
        // return str.substring(start, end); // built-in method
    }
}
