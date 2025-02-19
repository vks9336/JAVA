package com.OOPS_in_JAVA.Generics.WildCard;

public class Main {
    public static void main(String[] args) {
        //WildCard<String> wild = new WildCard(); using String will give an error as we have
        //extended it from the in-build number class

        WildCard<Integer> wild = new WildCard<>();
        wild.add(12);
        wild.add(14);
        System.out.println(wild.remove());
        wild.set(3,12);
        System.out.println(wild.get(0));
    }
}
