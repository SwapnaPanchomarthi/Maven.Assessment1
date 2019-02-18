package com.zipcodewilmington.assessment1.part2;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int n = objectArray.length;
        Integer numberOfOccurences = 0;
        for(int i=0; i<n;i++)

        {
            if(objectArray[i].equals(objectToCount))
            {numberOfOccurences =numberOfOccurences+1;

            }
        }
        return numberOfOccurences;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Integer[] objectArray, Integer objectToRemove) {
        if (objectArray != null) {
            List<Integer> list = new ArrayList<Integer>(Arrays.asList(objectArray));
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(objectToRemove)) {
                    list.remove(i);

                   objectArray=list.toArray(objectArray);
                }
            }


        }
        return objectArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Integer getMostCommon(Integer[] objectArray) {
        int count = 1, tempCount;
        Integer popular = objectArray[0];
        int temp = 0;
        for (int i = 0; i < (objectArray.length - 1); i++)
        {
            temp = objectArray[i];
            tempCount = 0;
            for (int j = 1; j < objectArray.length; j++)
            {
                if (temp == objectArray[j])
                    tempCount++;
            }
            if (tempCount > count)
            {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;

    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Integer getLeastCommon(Integer[] objectArray) {
        Integer minCount = 0;
        Integer minValue = 0;
        int n = objectArray.length;

        for (int i = 0; i < n; i++) {
            int j;
            for (j=0; j<n; j++)
                if (i != j && objectArray[i] == objectArray[j])
                    break;
            if (j == n)
                return objectArray[i];
            minValue =objectArray[i];
        }


        return minValue;
    }
    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Integer[] objectArray, Integer[] objectArrayToAdd) {

        int length = objectArray.length + objectArrayToAdd.length;

        Integer[] result = new Integer[length];
        int pos = 0;
        for (int element : objectArray) {
            result[pos] = element;
            pos++;
        }

        for (int element : objectArrayToAdd) {
            result[pos] = element;
            pos++;
        }
        return result;
    }
}
