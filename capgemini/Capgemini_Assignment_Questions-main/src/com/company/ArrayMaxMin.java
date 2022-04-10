package com.company;

import java.util.Scanner;

public class ArrayMaxMin {
    public int max(int [] array) {
        int max = 0;

        for(int index=0; index<array.length; index++ ) {
            if(array[index]>max) {
                max = array[index];
            }
        }
        return max;
    }
    public int min(int [] array) {
        int min = array[0];

        for(int index=0; index<array.length; index++ ) {
            if(array[index]<min) {
                min = array[index];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array: ");
        n = sc.nextInt();
        int[] myArray = new int[n];
        System.out.println("Enter the "+ n +" Elements of Integer Type:");
        for (int index=0;index < myArray.length;index++){
            myArray[index] = sc.nextInt();
        }
        ArrayMaxMin ob=new ArrayMaxMin();
        System.out.println("Maximum value in the array is: "+ob.max(myArray));
        System.out.println("Minimum value in the array is: "+ob.min(myArray));

    }
}