public class ClearithBit {
    public static void main(String[] args) {
        int number = 10; // 10 = 1010
        int i = 1;
        System.out.println(clearIthBit(number, i));
    }

    public static int clearIthBit(int number, int i) {
        int bitMask = 1 << i; // Left shift 1, i times
        bitMask = ~bitMask; // Invert all bits
        return number & bitMask;
    }
}
