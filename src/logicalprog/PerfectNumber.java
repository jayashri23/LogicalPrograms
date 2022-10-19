package logicalprog;

import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Egitnter the number= ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= num) {

            if (num % i == 0) {
                System.out.println(i + " ");
                sum = sum + i;
            }
            i++;
        }
        if (sum == num) {
            System.out.println(num + ":Number is Perfect.");
        } else {
            System.out.println(num + ":Number is not Perfect");
        }
    }

    }



