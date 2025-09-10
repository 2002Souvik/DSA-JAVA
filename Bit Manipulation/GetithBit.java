public class GetithBit {
    public static void main(String[] args) {
        int number = 10; // 10 = 1010
        int i = 2;;
        System.out.println(getIthBit(number, i));
    }

    public static int getIthBit(int number, int i) {
        int bitMask = 1 << i; // Left shift 1, i times
         // 1 = 0000 0001
         // 1 << 2 = 0000 0100 = 4
        if ((number & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
