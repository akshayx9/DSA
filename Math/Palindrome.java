package Math;

//Program to find if the given number is palindrome or not.

public class Palindrome {
    public boolean Palin(int n){
        int rev=0;
        int temp=n;//we store the value of n in a temp variable so that we can maintain the while of n for comparison with the reverse number later.
        while(temp!=0){
            int ld=temp%10;
            rev=rev*10+ld;
            temp=temp/10;
        }
        return(rev==n);
}
    public static void main(String[] args) {
        Palindrome p=new Palindrome();
        System.out.println(p.Palin(78987));
    }
}
