package com.HarshTyagi;

public class PailndromeNumber {

    public static void main(String[] args) {
        System.out.println(pailndrome(121));
    }
    public static boolean pailndrome(int n){
        int rev =0;
         int temp = n;
        while (n>0){
            int digit = n%10;
            rev = rev*10+digit;
            n = n/10;
        }
        if(rev==temp){
            return true;
        }
        else{
             return false;
        }
    }
}
