package Math;

//Program to count trailing zeros in a Factorial of a given number

public class TrailingZerosFactorial {
    public int CountTrailingZeros(int n) {
        int res=0;
        for(int i=5; i<=n; i=i*5){ //we use this approach as 5 is the prime factor of any number ending with zero
            res=res+n/i;
        }
        return res;        
    }
    public static void main(String[] args) {
        TrailingZerosFactorial t=new TrailingZerosFactorial();
        System.out.println(t.CountTrailingZeros(40));
    }
}
