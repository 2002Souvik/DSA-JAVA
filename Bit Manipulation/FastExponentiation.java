public class FastExponentiation {
    public static void main(String[] args) {
        int num = 5;
        int n = 3;
        System.out.println(fastExpo(num, n));
    }

    public static int fastExpo(int a, int n) {
        int ans  = 1;

        while(n > 0) {
            if((n & 1) != 0) {
                ans = ans *a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
}
