package com.pb.rychka.hw4;
 import java.util.Scanner;
 import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите фразу");
    String string1 = scan.nextLine();  ;
        System.out.println("введите 2 фразу");
    String string2 = scan.nextLine() ;
    char[] chars = string1.toCharArray();
    char[] chars2 = string2.toCharArray();
       Arrays.sort(chars);
       Arrays.sort(chars2);

        if (Arrays.equals(chars, chars2)) {
            System.out.println ( "Анаграмма");
        } else {
            System.out.println ( "НЕ Анаграмма.");
        }



        }
}
