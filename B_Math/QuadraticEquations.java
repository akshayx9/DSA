package B_Math;

import java.util.ArrayList;

//Program to find roots of a quadratic equation.

public class QuadraticEquations {
  public ArrayList<Integer> quadraticRoots(int a, int b, int c){
    double d=b*b-4.0*a*c;
    int x1=(int)((-b + Math.pow(d, 0.5))/(2.0 * a));
    int x2=(int)((-b - Math.pow(d, 0.5))/(2.0 * a));
    ArrayList<Integer> list=new ArrayList<>();
    if(x1>x2){
        list.add(x1);
        list.add(x2);
    }else{
        list.add(x2);
        list.add(x1);
    }
    return list;
  }  
  public static void main(String[] args) {
    QuadraticEquations qe=new QuadraticEquations();
    System.out.println(qe.quadraticRoots(1, -8, 15));
  }
  
}
