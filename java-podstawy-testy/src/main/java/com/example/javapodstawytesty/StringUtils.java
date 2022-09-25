package com.example.javapodstawytesty;

import java.util.Objects;

public class StringUtils {

    public static String capitalize(String name){

        if(name == null){
            return null;
        }

        if("".equals(name)){
            return "";
        }

        String firstLetter = name.substring(0,1);
        firstLetter = firstLetter.toUpperCase();

        String secondPart = name.substring(1).toLowerCase();

        return firstLetter + secondPart;
    }

    //Zadanie.
    // Napisz metode "csvLineSplitter" ktora przyjmuje string reprezentujacy rekord z pliku CSV i dzieli
    // go na kolumny (zamienia na String[] array).
    //e.g.
    //"ProductId;ProductName;Price"
    //"1234;Bike;1300$"
    //|-----------|-------------|-------|
    //| productId | productName | price |
    //|-----------|-------------|-------|
    //|      1234 | Bike        | 1300$ |
    //|-----------|-------------|-------|

    //Napisz metodę "public static boolean isPalindrome(String palindrome)"
    //Sprawdzającą czy podana tekst jest palindromem (pisany od początku i od końca jest taka sama).
//    public static boolean isPalindrome(String palindrome){
//
//    }


}
