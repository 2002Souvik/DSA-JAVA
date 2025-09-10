public class OddorEveninBitMask {
    public static void main(String[] args) {
        int bitMask = 1;
        int number = 5;
        if ((number & bitMask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
