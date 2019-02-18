package com.zipcodewilmington.assessment1.part5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Palindrome {
    static int count = 0;

    public Integer countPalindromes(String input) {

        int count = 0;
        int len = input.length();
        int startIndex = 0;

        String subString = "";

        System.out.println("Possible substrings are: ");
        for (int i = 0; i < len; i++) {
            for (int j = startIndex; j <= len; j++) {
                subString = input.substring(startIndex, j);
                //System.out.println(subString);

                count = checkPalindrome(subString);

            }
            startIndex++;
        }

        return count;
    }

    private static int checkPalindrome(String subString) {
        // TODO Auto-generated method stub
        int subLen = subString.length();
        boolean isPalindrome = false;
        for(int k=0; k<subLen; k++,subLen-- ) {     // Important
            if (subString.charAt(k) != subString.charAt(subLen -1)) {
                isPalindrome =  false;
                break;
            }else {
                isPalindrome = true;
            }
        }
        if(isPalindrome == true) {
            count ++;
        }
        return count;
    }

}