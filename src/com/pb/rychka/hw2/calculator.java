package com.pb.rychka.hw2;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите первое целое число operand1 и затем єнтер");
        int x;
        x = scan.nextInt();
        System.out.println("введите второе  целое число operand2 и затем єнтер");
        int y;
        y = scan.nextInt();
        System.out.println("віберите одно из действий + - : * и затем єнтер");
        String sign;//+ - /*
        sign = scan.next();
        switch (sign) {
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(+(x - y));
                break;
            case "*":
                System.out.println(+(x * y));
                break;
            case "/":  ;

            if( y == 0 ) ;{ System.out.println("делить на ноль нельзя!");
                if(y>0)
                    System.out.println(+(x / y));
            ;

            break;}

        }


    }
}



