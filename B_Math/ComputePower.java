package B_Math;

//Program to compute x(given number) to the power of n(given number)

public class ComputePower {
    public int power(int x, int n){
        int res=1;
        while(n>0){ //We are using the binary exponentation concept to implement the solution here
            if(n%2!=0){//This is for when n is an odd number or when iterations of it are odd in value.
                res=res*x;
            }
            x=x*x;
            n=n/2;
        }
        return res;
    }
    public static void main(String[] args) {
        ComputePower cp=new ComputePower();
        System.out.println(cp.power(2, 8));
    }
}
