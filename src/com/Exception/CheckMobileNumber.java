package com.Exception;

public class CheckMobileNumber {
    public static void checkMobile(String num){
        if (num.length()!=10) {
            throw new RuntimeException("The number is  not correct");
        }else {
            System.out.println("The number is correct");
        }
    }

    public static void main(String[] args) {
     checkMobile("8790662584");
    }
}
