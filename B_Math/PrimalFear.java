package B_Math;

import java.util.Arrays;
import java.util.Scanner;

public class PrimalFear {
    static boolean[] isPrime;
    static int N=(int) 1e6+10;//1000010
    static int[] fear;
    
    static void sieve() {
        isPrime=new boolean[N+1];
        Arrays.fill(isPrime, true);
        isPrime[0]=isPrime[1]=false;
        for(int i=2; (long)i*i<N; i++){
            if(isPrime[i]){
                for(long j=(long)i*i; j<N; j+=i){
                    isPrime[(int)j]=false;
                    }
                }
            }
        }
    static boolean isValid(int x){
        int pw=1;
        int temp=0;
        int i=1;
        while(x!=0){
            int digit=x%10;
            if(digit==0){
                return false;
            }
            pw *=i;
            temp +=digit*pw;
            x /=10;
            i=10;
            if(!isPrime[temp]){
                return false;
            }
        }
        return true;
    }
    static void prexSumBuild(){
        fear=new int[N];
        for(int i=2; i<N; i++){
            if(isValid(i)) fear[i]=1;
        }
        for(int i=1; i<N; i++){
            fear[i]+=fear[i-1];
        }
    }
    public static void main(String[] args) {
        sieve();
        prexSumBuild();

        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int x=0; x<t; x++){
            int n=s.nextInt();
            System.out.println(fear[n]);
        }
        s.close();
    }
}
