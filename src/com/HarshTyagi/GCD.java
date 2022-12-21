package com.HarshTyagi;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(8,12));
        System.out.println(euclidGCD(8,12));
        System.out.println(euclid_fac_GCD(8,12));

    }
    //kinve solution
    public static int gcd(int n,int m){
        int res = Integer.min(n,m);
        while(res>0){
            if(n%res==0&&m%res==0)
                break;
            res--;
        }
        return res;
    }
    //Eculid Algo
    public static int euclidGCD(int a, int b){
        while(a!=b){
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }
    //facEuclid Algo
    public static int euclid_fac_GCD(int a, int b){
        if(b==0)
            return a;
        else
            return gcd(b,b%a);
    }

}
