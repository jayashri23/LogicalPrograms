package logicalprog;
import java.util.Scanner;
public class FibonacciSeries {
//function created as fibona
   public void fibona(){
       System.out.println("Enter the number of count= ");
       Scanner sc = new Scanner(System.in);
       int count = sc.nextInt();
       int n1 =0, n2 = 1, n3;
       System.out.println( n1 +  "\n" + n2);

       for (int i = 2; i < count; i++) {
           n3 = n1 + n2;
           System.out.println("" + n3);
           n1 = n2;
           n2 = n3;
       }
   }
   public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();  //object
        fibonacciSeries.fibona();   //calling function by using class refrence variable
    }
}



