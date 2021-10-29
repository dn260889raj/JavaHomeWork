package com.pb.rychka.hw4;
import java.util.Scanner;
public class CapitalLetter {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввести фразу:");

        String orignalStatement = scanner.nextLine();

        String[] words = orignalStatement.split(" ");

        String finalStatement = "";

        for (String word : words) {

            char[] ca = word.toCharArray();

            char c = ca[0];

            String firstChar = String.valueOf(c).toUpperCase();

            String capitializedWord = firstChar;

            for (int i = 1; i < ca.length; i++) {

                capitializedWord = capitializedWord + ca[i];

            }

            finalStatement = finalStatement + capitializedWord + " ";


        }System.out.println(finalStatement);}}






