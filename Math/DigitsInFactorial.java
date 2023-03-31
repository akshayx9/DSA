package Math;

public class DigitsInFactorial {
    public static double e=2.71828182845904523536;
    public static double Pi = 3.141592654;
    static int findDigits(int N){
        // factorial of -ve number doesn't exists
        if (N < 0){
            return 0;
        }
        // base case
        if (N <= 1){
            return 1;
        }// Use Kamenetsky formula to calculate the number of digits
        double x = (N*Math.log10(N/e)+Math.log10(2*Pi*N)/2.0);
        return (int)Math.floor(x) + 1;
    }
    public static void main(String[] args){
        System.out.println(findDigits(5));
        System.out.println(findDigits(120));
        System.out.println(findDigits(10));
    }
}
