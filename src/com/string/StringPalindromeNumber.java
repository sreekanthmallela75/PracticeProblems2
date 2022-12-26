package com.string;

public class StringPalindromeNumber {
    public static void main(String[] args) {
        String str = "rar";
        StringBuilder sc =new StringBuilder(str);
        sc.reverse();
        String s2 = sc.toString();
        if (str.equals(s2)) {
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");

        }
    }
}
