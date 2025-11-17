public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String str = "aabbccddeeff";
        String result = removeDuplicates(str, 0, "", new boolean[26]);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str, int index, String newStr, boolean[] seen) {
        if (index == str.length()) {
            return newStr;
        }
        char currentChar = str.charAt(index);
        if (!seen[currentChar - 'a']) {
            seen[currentChar - 'a'] = true;
            newStr += currentChar;
        }
        return removeDuplicates(str, index + 1, newStr, seen);
    }
}
