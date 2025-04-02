package com.String_in_JAVA;

public class GroupSequentialCharacters {
    //main method
    public static void main(String[] args) {
        String str = "abcdjkgfshdssdv";

        StringBuilder group = new StringBuilder();
        group.append(str.charAt(0));

        for(int  i = 1; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i - 1) + 1){
                group.append(str.charAt(i));
            }
            else{
                System.out.println(group);
                group = new StringBuilder();
                group.append(str.charAt(i));
            }
        }
        System.out.println(group);
    }
}
