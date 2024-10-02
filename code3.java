// 3} SUM OF FIRST N NUMBERS(java) 
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("SUM OF FIRST N NUMBERS ");
        Scanner o = new Scanner(System.in);
        int n = o.nextInt();
        int sum = n*(n-1)/2;
        System.out.println(sum);
    }
}
///////////////////////////////////////////////////////////////////// OR ////////////////////////////////////////////////
public class Main
{
  public static void main (String[]args)
  {
    int n = 10;
    int sum = getSum (n);
      System.out.println (sum);
  }

  static int getSum (int n)
  {
    if (n == 0)
      return n;

    return n + getSum (n - 1);}}
