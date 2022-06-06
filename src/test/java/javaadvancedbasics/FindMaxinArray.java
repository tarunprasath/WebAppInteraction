package javaadvancedbasics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindMaxinArray {
    public static void main(String args[]){
        int[] input = {12,5,8,3};
        int max=input[0], i;
        int arrlen = input.length;
        for(i=0; i < arrlen;i++)
        {
            if(input[i]>max)
            max = input[i];
        }
        System.out.println("Highest number in array:"+ max);

        //Sort the Array
        Arrays.sort(input);
        for(int element:input)
            System.out.println("Sorted :"+element);
        System.out.println("Highest number in array using sort:"+ input[arrlen-1]);
    }
}
