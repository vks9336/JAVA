package com.OOPS_in_JAVA.Cloning;
import java.util.Arrays;

public class DeepCopy implements Cloneable{
    int age;
    String name;
    int[] arr;

    public DeepCopy(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{2,3,4,5,6,7,8};
    }

    public Object clone() throws CloneNotSupportedException {//it throws an exception
        //this is shallow copy
        DeepCopy twin =  (DeepCopy) super.clone();
        // make a deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepCopy example = new DeepCopy(23,"DeepCopy");
        DeepCopy twin = (DeepCopy) example.clone();
        System.out.println("Before changing the twin array");
        System.out.println("Main array : " + Arrays.toString(example.arr));
        System.out.println("Twin array : " + Arrays.toString(twin.arr));

        twin.arr[0] = 123;
        System.out.println("After changing the twin array");
        System.out.println("Main array : " + Arrays.toString(example.arr));
        System.out.println("Twin array : " + Arrays.toString(twin.arr));
    }
}
