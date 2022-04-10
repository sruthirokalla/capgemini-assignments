package com.company;

import java.util.Scanner;

public class SortingArray {
    public void Sortarray(int[] arr)
    {
        int temp=0;
        for (int index = 0; index < arr.length; index++) {
            for (int sort = index+1; sort < arr.length; sort++) {
                if(arr[index] > arr[sort]) {
                    temp = arr[index];
                    arr[index] = arr[sort];
                    arr[sort] = temp;
                }
            }
        }
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        SortingArray sortarray = new SortingArray();
        sortarray.Sortarray(arr);
    }
}