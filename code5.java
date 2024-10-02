/// 5} GREATEST OF TWO NUMBERS(java)
import java.util.*;
class HelloWorld {
    
    public static void main(String[] args) {
        System.out.println("GREATEST OF TWO ");
        Scanner o = new Scanner(System.in);
        int a = o.nextInt();
        int b = o.nextInt();
        if ( a==b )
        {
            System.out.println("equal");
        }
        else{
            String res = a>b?a+" is greater ": b + "is greater";
            System.out.println(res);
        }

    }
}
/////////////////////////////////////////////////////////////////////////////
System.out.println(Math.max(a, b) + " is greater");
