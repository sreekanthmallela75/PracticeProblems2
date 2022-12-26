package com.Exception;

import java.io.IOException;

public class ThrowsDemo1 {
    public  static void method()throws ArithmeticException, IOException{
        int a = 15/3;
        System.out.println(a);
         throw new IOException("Hi");
    }

    public static void main(String[] args) throws ArithmeticException,IOException {
        try {
            method();
        }
        catch (ArithmeticException e){
         System.out.println();
        }
        catch (IOException e){
            System.out.println("Sreekanth Mallela");
        }
    }
}
