//  1} positive or negative(java)

import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("positive or negative");
        
        Scanner o = new Scanner(System.in);
       
        int a = o.nextInt();
        if(a==0)
        {
        System.out.println("zero");
            
        }
        else{
            String res = a>0?"positive":"negative";
            System.out.println(res);}}}
