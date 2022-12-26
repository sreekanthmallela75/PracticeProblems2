package com.string;

public class Problem3< T> {
    public void method(T[] arr){
        for (T s: arr){
            System.out.println(s+" ");
        }
    }

    public static void main(String[] args) {
        Integer[]integers={1,2,3};
        String[]strings={"Sreekanth","ram","raj"};
        Problem3 p3 = new Problem3();
        p3.method(integers);
        System.out.println();
        p3.method(strings);
    }
}
