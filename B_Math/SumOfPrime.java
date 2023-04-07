package B_Math;

import java.util.Arrays;

public class SumOfPrime {
   static  long[] isprime=new long[1000001];
    long sieve(int n){
        int sum=0;
         Arrays.fill(isprime, 0);//all marked false
         isprime[1]=1;isprime[0]=1;
         for(int i=2;i*i<=1000000;i++){
             if(isprime[i]==0){
                  for(int j = i * i; j <= 1000000 ;j += i){
                     isprime[j]=1;// all multiples marked true 
                 }
             }
         }
        for(int i=2;i<=n;i++){
            if(isprime[i]==0){
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfPrime sp=new SumOfPrime();
        System.out.println(sp.sieve(978784));
    }
}