package com.OOPS_in_JAVA.Introduction;

public class GetterAndSetter {
    private char size;
    private String name;
    private float price;
    // these getter and setter method help to get and set the data of the
    // private field of the class
    // like it set and get the data of size, name and price
    public int getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Size : " + size + "\nName : " + name + "\nPrice : " + price + "$";
    }
}
