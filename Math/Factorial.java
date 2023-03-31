package Math;

//Program to find factorial of a number

public class Factorial {
    //Iterative approach - This is the better approach as it requires Auxilary Space: Theta of 1: Constant. While the time complexity is Theta of n.
    public long Fact1(int n) {
        long res=1;
        for(int i=2;i<=n;i++){
            res=res*i;//here we multiple each number to it's next with every iteration. Ex: 1*2*3*4*...*n
        }
        return res;
    }
    //Recursive approach - This requires an Auxilary Space & Time Complexity of Theta n.
    public int Fact2(int n) {
        if(n==0){
            return 1;
        }
        return n*Fact2(n-1);
    }
    public static void main(String[] args) {
        Factorial f=new Factorial();
        System.out.println(f.Fact1(18));
        System.out.println(f.Fact2(6));
    }
}