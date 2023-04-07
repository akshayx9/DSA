package B_Math;

import java.util.Scanner;

public class PrimeGenerator {

    public static boolean isPrime(int n){
        if (n<2){
            return false;
        } 
        int endpoint=(int)(Math.sqrt(n));
        for (int i=2; i<=endpoint;i++ ){
            if (n%i==0){
                return false;
            } 
        } 
        return true;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		   int n=sc.nextInt();
		   int m=sc.nextInt();
		   for(int i=n;i<=m;i++){
		       if(isPrime(i)){
		           System.out.println(i);
		       }
		   }
		} sc.close();
	}
}
