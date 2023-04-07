package B_Math;

//Program to find the remainder when a large number given in the form of integer is divided by 11.

public class Xmod11 {
    int xmod11(String x){
        int curr=0, rem=0;
        for(int i=0; i<x.length(); i++){
            curr=rem*10+x.charAt(i)-'0';
            rem=curr%11;
        } return rem;
    }
    public static void main(String[] args) {
        Xmod11 r=new Xmod11();
        System.out.println(r.xmod11("1000"));
    }    
}
