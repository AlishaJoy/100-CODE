// 2} odd or even (java) USING BITWISE OPERATORS 

import java.util.*;
class HelloWorld {
    static boolean check(int n)
    {
        return((n & 1)!= 0);
    }
    public static void main(String[] args) {
        System.out.println("ODD OR EVEN ");
        Scanner o = new Scanner(System.in);
        int n = o.nextInt();
        if(check(n))
        {
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
        
    }
}
