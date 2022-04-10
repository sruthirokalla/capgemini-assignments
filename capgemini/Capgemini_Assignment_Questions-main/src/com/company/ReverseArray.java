package com.company;
import java.util.Scanner;
public class ReverseArray {
    public void reverse(int a[], int n) {
        int[] reversedArray = new int[n];
        int j = n;
        for (int index = 0; index < n; index++) {
            reversedArray[j - 1] = a[index];
            j = j - 1;
        }
        System.out.println("The Reversed array is:");
        for (int k = 0; k < n; k++) {
            System.out.println(reversedArray[k]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:  ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements:");
        for (int index = 0; index < n; index++) {
            arr[index] = sc.nextInt();
        }
        ReverseArray reversearray = new ReverseArray();

        reversearray.reverse(arr,n);
    }
}