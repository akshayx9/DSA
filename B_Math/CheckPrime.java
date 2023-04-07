package B_Math;
 
//Program to find if the given number is prime or not

public class CheckPrime{
    boolean isPrime(int n){
        if(n==1){
            return false;
        }
        if(n==2 || n==3){
            return true;            
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i=5; i*i<=n; i=i+6){ //we use i*i here because if a number n has no divisors until root of n, then it wouldn't have any divisors after it either.
                if(n%i==0 || n%(i+2)==0){
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {
            CheckPrime cp=new CheckPrime();
            System.out.println(cp.isPrime(251));
        }
    }