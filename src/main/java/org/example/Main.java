package org.example;

import org.w3c.dom.css.CSSStyleRule;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(1234));
        System.out.println(isPerfectNumber(6));
        System.out.println(numberToWords(234234234));
    }

    public static boolean isPalindrome(int sayi) {

        String str = String.valueOf(Math.abs(sayi));
        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return str.equals(reverse);
    }

    public static boolean isPerfectNumber(int sayi) {
        if(sayi < 1) {
            return false;
        }

        int sum = 0;

        for(int i = 1; i < sayi; i++) {
            if(sayi % i == 0) {
                sum += i;
            }
        }
        return (sum == sayi);


    }
    public static String numberToWords(int sayi) {
        if(sayi < 0) {
            return "Invalid Value";
        }

        String[] kelimeler = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine",};

        String numberStr = String.valueOf(sayi);
        String result = "";

        for(int i =0; i < numberStr.length(); i++) {

            int digit = Integer.parseInt(String.valueOf(numberStr.charAt(i)));
            result = result + kelimeler[digit];
            if(i < numberStr.length() - 1) {
                result = result + " ";
            }

        }

        return result;
    }

}
