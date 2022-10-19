package logicalprog;


import java.util.Scanner;

public class CouponNumbers {
    public void coupon() {
        System.out.println("Enter the coupon number size:");
        Scanner sc =new Scanner(System.in);
        int rang=sc.nextInt();

        for (int i = 0; i < rang; i++) {
            int rand = (int) (Math.random() * rang) ;
            System.out.println(rand);
        }
    }
    public static void main(String [] args){
        CouponNumbers coup =new CouponNumbers();
        coup.coupon();
    }
}