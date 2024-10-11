//FACTORIAL OF A NUMBER


import java.util.*;

class HelloWorld {
   
    public static int fact(int n) {
        if(n==0||n==1)
        {
            return 1;
        }
        int res = n * fact(n-1);
        return res;
        
       
    }

    public static void main(String[] args) {
        
        System.out.println("enter a number");
        Scanner o = new Scanner(System.in);
        int number = o.nextInt();
        int num = number;
        System.out.println(fact(num));
            
            
        }
}
