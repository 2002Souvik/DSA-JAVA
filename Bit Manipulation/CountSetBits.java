public class CountSetBits {
    public static void main(String[] args) {
        int num = 15;
        System.out.println(getSetBitsCount(num));
    }

    public static int getSetBitsCount(int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
