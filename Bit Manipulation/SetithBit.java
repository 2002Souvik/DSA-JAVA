public class SetithBit {
    public static void main(String[] args) {
        int number = 10; // 10 = 1010
        int i = 2;
        System.out.println(setIthBit(number, i));
    }

    public static int setIthBit(int number, int i) {
        int bitMask = 1 << i; // Left shift 1, i times
        return number | bitMask;
    }
}
