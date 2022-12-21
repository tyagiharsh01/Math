package com.HarshTyagi;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isprime(1728971));
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
    // more efficent solution
    public static boolean isprime(int n) {
        if (n == 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        }
        return true;
    }

}
