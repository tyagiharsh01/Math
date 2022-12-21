package com.HarshTyagi;

public class TrailingZerosinFact {
    public static void main(String[] args) {
        System.out.println(countZeros(1));
        System.out.println(count_Zeors(100));
    }
// Kinve Solution

    public static int countZeros(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        int res = 0;
        while (fact % 10 == 0) {
            res++;
            fact /= 10;
        }
        return res;
    }
    //efficient Method
    public static int count_Zeors(int n){
        int res =0;
        for(int i =5;i<=n;i=i*5)
            res = res+n/i;
        return res;
    }

}
