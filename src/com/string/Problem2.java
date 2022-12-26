package com.string;

public class Problem2<T> {
    public void method(T[] arr){
        for (T s : arr){
            System.out.println(s + "");
        }
    }

    public static void main(String[] args) {
        Integer[] integer ={1,2,3};
        String [] strings ={"Sreekanth" ,"raj","Robert" };
        Problem2 p2 = new Problem2();
        p2.method(integer);
        System.out.println();
        p2.method(strings);
    }
}
