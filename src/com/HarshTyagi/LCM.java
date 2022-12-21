package com.HarshTyagi;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(3,4));

    }
    // naive method
    public static int lcm(int a,int b){
        int res = Math.max(a,b);
        while(true){
            if(res%a==0&&res%b==0)
               break;
            res++;
        }
        return res;
    }
    /* a*b = gcd(a*b)*lcm(a*b)
       lcm(a*b) = gcd(a*b)/a*b

     */
}
