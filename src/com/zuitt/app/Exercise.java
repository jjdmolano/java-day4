package com.zuitt.app;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
//        Exercise:
//        1. Get a number from the user, and given the number, use a switch case statement to determine the gift received
//        2. Implement the try catch finally for item 1, such that it would only get numeric values

        Scanner input = new Scanner(System.in);
        int day = 0;
        System.out.println("Please enter a number");
        try {
            day = input.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input");
            e.printStackTrace();
        } finally {
            System.out.println("Thanks for entering a number");
        }

        switch (day) {
            case 1 -> System.out.println("On the first day of Christmas my true love gave to me\n" +
                    "A partridge in a pear tree");
            case 2 -> System.out.println("On the second day of Christmas my true love gave to me\n" +
                    "Two turtle doves and a partridge in a pear tree");
            case 3 -> System.out.println("On the third day of Christmas my true love gave to me\n" +
                    "Three French hens, two turtle doves and a partridge in a pear tree");
            case 4 -> System.out.println("On the fourth day of Christmas my true love gave to me\n" +
                    "Four calling birds, three French hens\n" +
                    "Two turtle doves and a partridge in a pear tree");
            case 5 -> System.out.println("On the fifth day of Christmas my true love gave to me\n" +
                    "Five gold rings, four calling birds, three French hens\n" +
                    "Two turtle doves and a partridge in a pear tree");
            case 6 -> System.out.println("On the sixth day of Christmas my true love gave to me\n" +
                    "Six geese a laying, five gold rings\n" +
                    "Four calling birds, three French hens\n" +
                    "Two turtle doves and a partridge in a pear tree");
            case 7 -> System.out.println("On the seventh day of Christmas my true love gave to me\n" +
                    "Seven swans a swimming, six geese a laying, five gold rings\n" +
                    "Four calling birds, three French hens\n" +
                    "Two turtle doves and a partridge in a pear tree");
            case 8 -> System.out.println("On the eighth day of Christmas my true love gave to me\n" +
                    "Eight maids a milking, seven swans a swimming\n" +
                    "Six geese a laying, five gold rings\n" +
                    "Four calling birds, three French hens\n" +
                    "Two turtle doves and a partridge in a pear tree");
            case 9 -> System.out.println("On the ninth day of Christmas\n" +
                    "Nine ladies dancing, eight maids a milking\n" +
                    "Seven swans a swimming, six geese a laying, five gold rings\n" +
                    "Four calling birds, three French hens\n" +
                    "Two turtle doves and a partridge in a pear tree");
            case 10 -> System.out.println("On the tenth day of Christmas my true love gave to me\n" +
                    "Ten lords a leaping, nine ladies dancing, eight maids a milking\n" +
                    "Seven swans a swimming, six geese a laying, five gold rings\n" +
                    "Four calling birds, three French hens\n" +
                    "Two turtle doves and a partridge in a pear tree");
            case 11 -> System.out.println("On the eleventh day of Christmas my true love gave to me\n" +
                    "Eleven pipers piping, ten lords a leaping\n" +
                    "Nine ladies dancing, eight maids a milking\n" +
                    "Seven swans a swimming, six geese a laying, five gold rings\n" +
                    "Four calling birds, three French hens\n" +
                    "Two turtle doves and a partridge in a pear tree");
            case 12 -> System.out.println("On the twelfth day of Christmas my true love gave to me\n" +
                    "Twelve drummers drumming, eleven pipers piping\n" +
                    "Ten lords a leaping, nine ladies dancing, eight maids a milking\n" +
                    "Seven swans a swimming, six geese a laying, five gold rings\n" +
                    "Four calling birds, three French hens\n" +
                    "Two turtle doves and a partridge in a pear tree");
            default -> System.out.println("No more gifts!");
        }
    }
}
