public class Optimized {

    public static int climbStairs(int n) {

        if (n == 1 || n == 2) {
            return n;
        }

        int first = 1;
        int second = 2;

        for (int i = 3; i <= n; i++) {

            int current = first + second;

            first = second;
            second = current;
        }

        return second;
    }

}
