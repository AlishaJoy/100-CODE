//PALINDROME NUMBER

import java.util.*;

class HelloWorld {
    public static int palindrome(int num,int rev)
    {
        if(num == 0)
        {
            return rev;
        }
        
        int rem  = num%10;
        rev = rev*10 + rem;
        return palindrome(num/10,rev);
        
    }
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner o = new Scanner(System.in);
        int number = o.nextInt();
        int num = number;
        int n = String.valueOf(num).length();
        int rev= 0;
        int revnum = palindrome(num,rev);
        if(revnum == number)
        {
        System.out.println("IT IS A PALINDROME ");

        }
        else{
        System.out.println("IT IS NOT A PALINDROME ");
        }}
}
