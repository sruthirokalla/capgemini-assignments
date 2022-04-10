package com.company;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
public class MapKeysAscendingOrder {
    public void mapsort(Map<String, String> map)
    {
        TreeMap<String, String> sorted = new TreeMap<>();
        sorted.putAll(map);
        for (Map.Entry<String, String> entry : sorted.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
    }
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int n=sc.nextInt();
        System.out.println("enter the values: ");
        for (int i = 0; i < n; i++) {
            System.out.print("key: ");
            String a = sc.next();
            System.out.print("value: ");
            String b = sc.next();
            map.put(a, b);
        }
        MapKeysAscendingOrder ob=new MapKeysAscendingOrder();
        ob.mapsort(map);
    }
}
