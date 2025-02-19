package com.Collection_in_JAVA.Map.HashMap.Mapping;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterMapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        //pre-compute
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        System.out.print("Enter the number of testcase : ");
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0) {
            //fetch
            System.out.print("Enter the character that you want to know how many times it came : ");
            char  ch = sc.nextLine().charAt(0);
            System.out.println("The character " + ch + " comes " + map.getOrDefault(ch, 0) + " times.");
        }
    }
}
