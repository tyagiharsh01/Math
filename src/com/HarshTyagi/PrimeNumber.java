package com.HarshTyagi;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }
    public static boolean isPrime(int n){
     if(n==1){
         return true;
     }
     for(int i=2;i*i<=n;i++){
         if(n%i==0){
             return false;
         }
     }
     return true;
    }
}
