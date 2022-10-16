package logicalprog;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reminder,reverse=0;

        while (num>0){
            reminder = num % 10;
            reverse=reverse*10+reminder;
            num=num/10;
        }
        System.out.println("Reverse Number = "  +reverse);

    }
}