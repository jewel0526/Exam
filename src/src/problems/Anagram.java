package src.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String str1 = "Cat";
        String str2 = "Act";

        if (str1.length()==str2.length()) {
            char[] arr1 = str1.toCharArray();
            Arrays.sort(arr1);
            System.out.println(Arrays.toString(arr1));
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr2);
            System.out.println(Arrays.toString(arr2));
            System.out.println(Arrays.equals(arr1, arr2));
            if(arr1.equals(arr2)) {
                System.out.println("Given strings are anagrams");
            } else {
                System.out.println("Given strings are not anagrams");
            }
        }
    }
    }


