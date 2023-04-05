package Math;

import java.util.ArrayList;
import java.util.Scanner;

public class test{
    int N=100001;
    static ArrayList<Integer> primes;
    ArrayList<Integer> sieve(){
        boolean[] isPrime=new boolean[N];
        for(int i=0; i<N; i++){
            isPrime[i]=true;//add here
        }
        for(int i=2; i*i<N; i++){
            if(isPrime[i]){
                for(int j=i*i; j<N; j+=i){
                    isPrime[j]=false;
                }
            }
        }//add here
        primes= new ArrayList<>();
        primes.add(2);
        for(int i=3; i<N; i+=2){
            if(isPrime[i]){
                primes.add(i);
            }
        }
        return primes;
    }
    void printPrimes(long m, long n, ArrayList<Integer> primes){
        int N1=(int)(n-m+1);
        boolean[] isPrime=new boolean[N1];

        for(int i=0; i<=m-n; i++){
            isPrime[i]=true;
        }//add here
        for(int i=0; primes.get(i)*primes.get(i)<=n; i++){
            int currPrime=primes.get(i);
            long base=(m/(currPrime))*(currPrime);
            if(base<m){
                base=base+currPrime;
            }
            for(long j=base; j<=n; j+=currPrime){
                isPrime[(int)(j-m)]=false;
            }
            if(base==currPrime){
                isPrime[(int)(base-m)]=true;
            }
        }//add here
        for(int i=0; i<=n-m; i++){
            if(isPrime[i]){
                System.out.println(i+m);
            }
        }
    }
    public static void main(String[] args) {
        test ts=new test();
        ts.sieve();

        int t;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        for(int x=0; x<t; x++){
            long m=s.nextInt();
            long n=s.nextInt();

            ts.printPrimes(m, n, primes);

        }s.close();
    }
}