package com.zipcodewilmington.assessment1.part1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        StringBuilder inputString = new StringBuilder(str);

        return inputString.substring(0, 1).toUpperCase() + inputString.substring(1);
    }



    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        StringBuilder str1 = new StringBuilder();
        str1.append(str);
        str1 = str1.reverse();
        return str1.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        StringBuilder str1 = new StringBuilder();
        str1.append(str);
        str1 = str1.reverse();
        String str2= str1.toString();
        return str2.substring(0, 1).toUpperCase() + str2.substring(1);

    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str)
    {   StringBuilder string = new StringBuilder(str);
        string= string.deleteCharAt(0);
        int n = string.length();
        string.deleteCharAt( n-1);
        return string.toString();
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        StringBuilder string = new StringBuilder(str);
        String newString = "";
        for (int i = 0; i < string.length(); i++)
        {
            char c = str.charAt(i);
            boolean check = Character.isUpperCase(c);
            if (check == true)
                newString = newString + Character.toLowerCase(c);
            else
                newString = newString + Character.toUpperCase(c);
        }
        return newString;
    }
}
