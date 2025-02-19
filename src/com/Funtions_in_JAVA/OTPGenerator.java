package com.Funtions_in_JAVA;

public class OTPGenerator {
    public static void main(String[] args) {
        int size = 6;
        otp(size);
    }

    private static void otp(int size) {
        while(size > 0){
            System.out.print((int)Math.floor(Math.random() * 10));
            size--;
        }
    }
}
