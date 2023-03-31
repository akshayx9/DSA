package Math;

//Program to find if the given number is palindrome or not.

public class Palindrome {
    public boolean Palin(int n){
        int rev=0;
        int temp=n;//we store the value of n in a temp variable so that we can maintain the value of n for comparison with the reverse number later.
        while(temp!=0){
            int ld=temp%10;//we divide by 10 here to give us the last digit of the number as remainder
            rev=rev*10+ld;//then we add the last digit to reverse and multiple is by 10, with every new digit we add.
            temp=temp/10;//finaly we remove the last digit from the original number with each iteration.
        }
        return(rev==n);
}
    public static void main(String[] args) {
        Palindrome p=new Palindrome();
        System.out.println(p.Palin(78987));
    }
}
