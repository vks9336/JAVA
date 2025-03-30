package com.String_in_JAVA;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyEqualToTwo {
    public static char frequencyTwo(String str){
        int n = str.length();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char ch = '0';

        for(char key : map.keySet()){
            if(map.get(key) == 2){
                ch = key;
                break;
            }
        }

        return ch;
    }

    public static void main(String[] args) {
        String str = "kbkbcmncccnm";

        char ans = frequencyTwo(str);

        if(ans == '0'){
            System.out.println("No Character found !!");
        }
        else {
            System.out.printf("The first character which is of frequency 2 is : %c", ans);
        }
    }
}
