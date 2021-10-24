package com.pb.rychka.hw3;
import java.util.Scanner;
public class arzampl
{public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("программой задано  10 єлементов ");
    int array[] = new int[10];
    System.out.println("программой задано  10 элементов - введите целые числа размерностью 10 элементов");

    for (int i = 0; i < 10; i++) {
        array[i] = input.nextInt();
    }
    System.out.print ("Вывести на экран введенный массив:  ");
    for (int i = 0; i < 10; i++) {
        System.out.print (" " + array[i]);}

         for ( int d : array){int  sum = 0; sum=sum +d;

        System.out.println("     Сумма элементов массива равна: " + sum ); break;}


             int counter = 0;
             for(int i = 0; i<10; i++)
             {
                 if(array[i] > 0)
                     counter += 1;
             }
             System.out.println("кол-во положительных "  + counter);


             //      int k=  0;
     //    for (int i = 0; i < 11; i++);
  //  { if ( array[10]>0 ) k ++;
    //         System.out.println("кол-во положительных " + k);}
    //МЕТОД ПУЗЫРЬКОВОЙ СОРТИРОВКИ
    boolean sort= false;
    while(!sort){ sort=true;
    for (int i=1; i< array.length;i++){
        if (array [i] <array[i-1]){
                int obmen = array[i];
                array[i]=array[i-1];
                array[i-1]=obmen;
             sort= false;
        }  System.out.println(array[i]);}
    }}}




