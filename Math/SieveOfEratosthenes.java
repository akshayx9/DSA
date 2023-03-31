package Math;

//Program to find all the prime numbers between 0 to given number using the concept of Sieve of Eratosthenes

import java.util.Arrays;

public class SieveOfEratosthenes {
    public void SOE(int n){
        if(n<=1){
            return;
        }
        boolean isPrime[]=new boolean[n+1];
        Arrays.fill(isPrime, true);//Here we create a boolean array and fill all the values as true
        for(int i=2; i<=n; i++){
            if(isPrime[i]){
                System.out.println(i);//If the value of the specified array index [i] is true then we print it as true for a prime number.
            }
            for(int j=i*i; j<=n; j=j+i){//When i is prime, we mark all multiples of i as false so as to mark them as not a prime number.
                isPrime[j]=false;
            }
        }
    }
    public static void main(String[] args) {
        SieveOfEratosthenes s=new SieveOfEratosthenes();
        s.SOE(343);
    }
}
