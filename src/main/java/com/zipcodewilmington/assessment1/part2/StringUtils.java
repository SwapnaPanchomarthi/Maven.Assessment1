package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence)
    {
        //String strMain = "Alpha, Beta, Delta, Gamma, Sigma";
        String[] arrSplit = sentence.split(" ");
        for (int i=0; i < arrSplit.length; i++)
        {
            System.out.println(arrSplit[i]);
        }
        return arrSplit;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String[] result = sentence.split(" ", 2);
        String first = result[0];
        return first;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String[] result = sentence.split(" ", 2);
        String first = result[0];
        String[] strArray = new String[]{first};
        String reverse = "";

        for(int i = first.length() - 1; i >= 0; i--)
        {
            reverse = reverse + first.charAt(i);
        }

        System.out.println("Reversed string is:");
        System.out.println(reverse);

        return reverse;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence)
    {
        String[] result = sentence.split(" ", 2);
        String first = result[0];
        String[] strArray = new String[]{first};
        String reverse = "";
        String newString="";

        for(int i = first.length() - 1; i >= 0; i--)
        {
            reverse = reverse + first.charAt(i);
        }


        String s1 = reverse.substring(0, 1).toUpperCase() + reverse.substring(1);
        return s1;



    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        String newstr = str.substring(0, index) + str.substring(index + 1);
        return newstr;
    }

}
