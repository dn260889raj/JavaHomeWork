package com.pb.rychka.hw2;

import java.util.Scanner;

public class interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" ввести целое число  и затем єнтер");
        int x;
        x = scan.nextInt();
        if (x>=0 && x < 15) {
            System.out.println("[0 -14");
        }
        if (x >= 15 && x <= 35) {
            System.out.println("[15 - 35");
        }
        if (x >= 36 && x <= 50) {
            System.out.println("[36 - 50");
        }
        if (x >= 51 && x <= 100) {
            System.out.println("51 - 100");
        }
        if (x >= 101) {
                System.out.println("не входит в интервал");

            }
        }


    }