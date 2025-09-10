public class ClearBittsinRange {
    public static void main(String[] args) {
        int number = 10; // 10 = 1010
        int i = 2;
        int j = 4;
        System.out.println(clearBitsInRange(number, i, j));
    }

    public static int clearBitsInRange(int number, int i, int j) {
        int a = (~0) << (j + 1); // All bits after j are 1
        int b = (1 << i) - 1; // All bits before i are 1
        int bitMask = a | b;
        return number & bitMask;
    }
}
