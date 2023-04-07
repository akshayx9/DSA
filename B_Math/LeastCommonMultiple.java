package B_Math;

public class LeastCommonMultiple {
    public int GCD(int a, int b) {
        if(b==0){
            return a;
        }else{
            return GCD(b, a%b);
        }
    }
    public int LCM(int a, int b) {
        return (a*b)/GCD(a, b); //We use the formula a*b = gcd(a,b)*lcm(a,b) to find the most efficient solution. The time complexity here is O(log min(a,b)).
    }
    public static void main(String[] args) {
        LeastCommonMultiple l=new LeastCommonMultiple();
        System.out.println(l.LCM(4, 6));
    }
}
