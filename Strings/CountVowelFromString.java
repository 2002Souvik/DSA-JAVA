public class CountVowelFromString {
    public static void main(String args[]) {
        String str = "hello world! this is java.";
        System.out.println(countVowel(str));
    }

    public static int countVowel(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
