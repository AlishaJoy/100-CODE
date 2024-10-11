// FIBONACCI OF A NUMBER


import java.util.Scanner;

class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int numNew = a + b;
            a = b;
            b = numNew;
        }
        return b;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        int result = solution.fib(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
}
