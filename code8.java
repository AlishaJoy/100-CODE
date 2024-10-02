// PRIME OR NOT 
import java.util.*;
class HelloWorld {
    
    public static void main(String[] args) {
        System.out.println("PRIME NUMBER OR NOT ");
        Scanner o = new Scanner(System.in);
        int n = o.nextInt();
        Boolean flag = true;
        if ( n< 2)
        {
            System.out.println("not prime");
        }
        else
        {
            for(int i =3;i<n;i++)
            {
                if(n%i == 0)
                {
                    flag = false;
                }
            }
            if(flag == true)
            {
                System.out.println(" prime");
            }
            else{
                System.out.println("not prime");
            }
            
        }
    }
}
