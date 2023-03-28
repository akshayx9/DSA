package Intro.Math;

//Program to find the count of digits in any given number

public class CountDigits {
    public int CountDigit(int x) {
        int res=0;
        while(x>0){
            x=x/10;
            res++;
        }
        return res;        
    }
    public static void main(String[] args) {
        CountDigits cd=new CountDigits();
        System.out.println(cd.CountDigit(78431));
    }
}
