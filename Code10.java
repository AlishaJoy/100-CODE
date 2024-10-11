//SUM OF DIGITS OF THE NUMBER

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner o = new Scanner(System.in);
        int num = o.nextInt();
        int sum = 0,rem;
        int n = String.valueOf(num).length();
        for(int i=n;i>0;i--)
        {
            rem = num%10;
            sum = sum + rem;
            num = num/10;
        }
        System.out.println("SUM OF DIGITS IS : " + sum);
    }
}
