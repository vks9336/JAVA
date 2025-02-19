package com.OOPS_in_JAVA.Enums;

public enum Month implements Hello{
    January,February,March,April,May,June,July,August,September,October,November,December;
    //these are enums constants
    //enums are always public, static and final
    //type is Month
    //abstract are not allowed

    Month() {
        System.out.println("Months of a year are : " + this);
    }

    @Override
    public void hello() {
        System.out.println("Hello and Welcome the coding Hub!!");
    }
    //This is not public or protected, only private or default
    //why? because we don't want to create new object
    //this is because of enum concept
    //internally : public static final Month January = new Month();
}
