package com.Collection_in_JAVA.List.ArrayList;

import java.util.Arrays;

public class CustomArrayList<T> {



    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;


    public CustomArrayList() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T value){
        if(isFull()){
            resize();
        }
        data[size++] = value;
    }
    private void resize() {
        Object[] temp = new Object[data.length * 2];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public void set(int index, T value){
        data[index] = value;
    }
    public int size(){
        return size;
    }

    public T remove(){
        T removed;
        removed = (T)(data[--size]);
        return removed;
    }
    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        return STR."Your List :[data=\{Arrays.toString(data)}, size=\{size}]";
    }
}
