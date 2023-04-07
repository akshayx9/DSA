package B_Math;

public class AbsoluteValue {
    public int absolute(int i){
        return Math.abs(i);
    }
    public static void main(String[] args) {
        AbsoluteValue ab=new AbsoluteValue();
        System.out.println(ab.absolute(-121));
    } 
}
