package Math;

//Program to replace all zeros in an integer with '5'.

public class ReplaceZeros {
    int convertFive(int N){
        String s=Integer.toString(N);
        return Integer.parseInt(s.replace('0', '5'));
    }
    public static void main(String[] args) {
        ReplaceZeros rz=new ReplaceZeros();
        System.out.println(rz.convertFive(1004));
    }
    
}
