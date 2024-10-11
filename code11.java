//REVERSE THE NUMBER

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner o = new Scanner(System.in);
        int num = o.nextInt();
        int rem,j=0;
        int n = String.valueOf(num).length();
        int arr[] = new int[n];
        while(num!=0)
        {
            rem = num%10;
            arr[j++] = rem;
            num = num/10;
        }
        System.out.println("REVERSE OF DIGITS IS : " );
        int i=0;
        while(i< n)
        {
            System.out.print(arr[i++]);
        }
    }
}
