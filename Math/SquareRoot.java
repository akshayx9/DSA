package Math;

public class SquareRoot {
    long floorsqrt(long x){
        long sq=(long)Math.pow(x, 0.5);
        return sq;
    }
    public static void main(String[] args) {
        SquareRoot s=new SquareRoot();
        System.out.println(s.floorsqrt(5));
    }
}
