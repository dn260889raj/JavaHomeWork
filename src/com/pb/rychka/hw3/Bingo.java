package com.pb.rychka.hw3;

import java.util.Random;
import java.util.Scanner;
public class Bingo {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(101);
        System.out.println("число загадано системой, попробуй отгадать от 0 до 100 ! Для выхода нажимите 666 "+ x );
        // оставил икс для проверки  варианта бинго
        final int  MAX_ATTEMPT=101;
        int attempt = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("введите   число   и затем єнтер");int y;
    while ( true ){

            y = scan.nextInt();
            if ( y ==666){System.out.println("Досрочный выход");}
            break;}

        while ( attempt< MAX_ATTEMPT){ {attempt++;
            y = scan.nextInt();
            if ( y > x){System.out.println("загадай число меньше");}
            else if ( y < x){System.out.println("загадай число больше");}
            else  {System.out.println("Бинго! Угадали с " + attempt + "  попытки");}
            continue;}}}}




















