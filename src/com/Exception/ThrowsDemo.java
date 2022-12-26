package com.Exception;

import java.io.IOException;

public class ThrowsDemo {
    public static void method()throws ArithmeticException, IOException{
        int a = 24/3;
        System.out.println(a);
       throw new IOException("Hii");
    }

    public static void main(String[] args) throws ArithmeticException,IOException {
        try {
            method();
        }
        catch (ArithmeticException e){
           // System.out.println(8);
        }
        catch (IOException e){
            System.out.println("Sreekanth Mallela");
        }
    }
}
