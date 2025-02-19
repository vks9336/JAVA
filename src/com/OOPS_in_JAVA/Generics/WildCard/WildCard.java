package com.OOPS_in_JAVA.Generics.WildCard;

import java.util.Arrays;

public class WildCard<T extends Number> {
    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildCard() {
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
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
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
        return "Your List :[" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                ']';
    }

}
