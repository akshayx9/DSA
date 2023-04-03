package Math;

//Program to find the Greatest Common Divisor for any two given numbers
public class GreatestCommonDivisor {
    //Euclidean Algorithm approach
    public int GCD(int a, int b) {
        if(b==0){
            return a;
        }else{
            return GCD(b,a%b);
        }
    }
    public static void main(String[] args) {
        GreatestCommonDivisor g=new GreatestCommonDivisor();
        System.out.println(g.GCD(2, 1));
    }
}
