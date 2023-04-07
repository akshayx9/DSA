package B_Math;

public class ArmstrongNumbers {
    public String armstrongNumber(int n){
        int res=0;
        int temp=n;
        while(n>0){
            int x=n%10;
            res=res+x*x*x;
            n=n/10;
        }
        if(res==temp){
            return "Yes";
        }else{
            return "No";
        }
    }
public static void main(String[] args) {
    ArmstrongNumbers an=new ArmstrongNumbers();
    System.out.println(an.armstrongNumber(371));   
}
}

