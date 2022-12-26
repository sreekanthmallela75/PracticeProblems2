package com.string;

public class Demo1 {
    public static void main(String[] args) {
        String str = "S0r0e0e";
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == '0'){
                continue;
            }
            System.out.println(str.charAt(i));
        }
    }
}
