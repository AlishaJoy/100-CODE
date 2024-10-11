/*Armstrong Numbers
Example
Input : 371
Output : It's an Armstrong Number.
Explanation: 371 = 3^3 + 7^3 + 1^3
Therefore it's an Armstrong number.*/


import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner o = new Scanner(System.in);
        int number = o.nextInt();
        int num = number;
        int n = String.valueOf(num).length();
        int sum=0,rem;
        while(num!=0)
        {
            rem = num%10;
            sum = sum + (int)Math.pow(rem,n);
            num = num/10;
        }
        if(sum == number)
        {
        System.out.println("IT IS ARMSTRONG NUMBER");
        }
        else
        {
        System.out.println("IT IS NOT ARMSTRONG NUMBER");

        }
        
        
    }
}
