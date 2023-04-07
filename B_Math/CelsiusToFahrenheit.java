package B_Math;

public class CelsiusToFahrenheit {
    public void CtoF(int C){
        double F=(C*1.8)+32;
        System.out.println("The Fahrenheit value of "+C+"C is: "+F+"F");
    }
    public static void main(String[] args) {
        CelsiusToFahrenheit ctf=new CelsiusToFahrenheit();
        ctf.CtoF(4);
    }
}
