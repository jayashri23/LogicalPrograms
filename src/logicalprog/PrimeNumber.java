package logicalprog;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i, m = 0;
        if (num == 0 || num == 1) {
            System.out.println(num + " :Number is not Prime.");
        }
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(num + " :Number is not Prime.");
                m = 1;
                break;
            }
        }
        if (m == 0) {
            System.out.println(num + ":Number is Prime Number.");
        }
    }
}