package Math;

//Program to find all the prime numbers between 0 to given number using the concept of Sieve of Eratosthenes

import java.util.Arrays;

public class SieveOfEratosthenes {
    public void SOE(int n){
        if(n<=1){
            return;
        }
        boolean isPrime[]=new boolean[n+1];
        Arrays.fill(isPrime, true);
        for(int i=2; i<=n; i++){
            if(isPrime[i]){
                System.out.println(i);
            }
            for(int j=i*i; j<=n; j=j+i){
                isPrime[j]=false;
            }
        }
    }
    public static void main(String[] args) {
        SieveOfEratosthenes s=new SieveOfEratosthenes();
        s.SOE(343);
    }
}
