package Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrimeGenerator1 {
    int N=1000000;
    boolean[] sieve=new boolean[N+1];
    public void createSieve() {
        Arrays.fill(sieve, true);
        sieve[1]=false;
        sieve[0]=false;

        for(int i=2; i*i<=N; i++){
            if(sieve[i]){
                for(int j=i*i; j<=N; j++){
                    sieve[j]=false;
                }
            }
        }
    }

    ArrayList<Integer> generatePrimes(int N){
        ArrayList<Integer> ds=new ArrayList<>();
        for(int i=2; i<=N; i++){
            if(sieve[i]==true){
                ds.add(i);
            }
        }
        return ds;
    }
    public static void main(String[] args) {
        PrimeGenerator1 pg=new PrimeGenerator1();
        pg.createSieve();
        int t;//t is the number of testcases
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        for(int x=0; x<t; x++){
            int m=s.nextInt();
            int n=s.nextInt();
            
            //Step 1 : generate all primes till sqrt(n)
            ArrayList<Integer> primes=pg.generatePrimes(n);

            //Step 2 : Create a dummy array of size n-m+1 and make everyone as 1
            int[] dummy=new int[n-m+1];
            for(int i=0; i<n-m+1; i++){
                dummy[i]=1;
            }

            //Step 3 : for all prime number mark it's multiples as false
            for(int pr:primes){
                int firstMultiple=(m/pr*pr)*pr;
                for(int j=Math.max(firstMultiple, pr*pr); j<=n; j+=pr){
                    dummy[j-m]=0; 
                }
            }
            if(m==1){
                dummy[0]=0;
            }

            //Step 4 : get all the primes
            for(int i=m; i<=n; i++){
                if(dummy[i-m]==1){
                    System.out.println(i+" ");
                }
            }
            System.out.println();
        }
        s.close();
    }
}