package Math;

//Program to find all divisors of a given number in sorted order.

public class AllDivisors {
    void printDivisors(int n){
        int i;
        for(i=1; i*i<n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        for(; i>=1; i--){
            if(n%i==0){
                System.out.println(n/i);
            }
        }
    }
    public static void main(String[] args) {
        AllDivisors ad=new AllDivisors();
        ad.printDivisors(150);
    }
}
