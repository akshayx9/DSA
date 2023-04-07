package B_Math;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeDivisors2 {
    static boolean primeNum[];//1-create a boolean array which can be accessed anywhere in the program.
    static ArrayList<Integer> primeArray;//2-Create a dynamic array as initial size is unknown.

    //Section 3
    static void sieve(int N){
        for(int i=2; i*i<=N; i++){
            if(primeNum[i]){
                primeArray.add(i);//Creating a sieve to find all the prime numbers and then adding them to an array - primeArray
                for(int j=i*i; j<=N; j=j+i){
                    primeNum[j]=false;
                }
            }
        }
    }

    //Section 5*** - creating a method to actually solve our problem statement
    static int solve(long n){
        int counter=0;
        int index=0;
        
        long currentNum=1L*primeArray.get(index)*primeArray.get(index); //Check till when square of primeArray elements is less than n.
        while(currentNum<=n){
            counter++;//counts the number of prime squares which are less than or equal to n
            index++;//increments the array index for next iteration
            if(index==primeArray.size()){
                break;//If index has reached the last element we have read through all our prime numbers so we can come out of the loop
            }
            currentNum=1L*primeArray.get(index)*primeArray.get(index);
        }return counter;
    }
    ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q){

        //Section 1- Initializing
        primeNum=new boolean[1000001];//3-Initialize the boolean array with a size of 1000001, so as to accomadate the constraints.
        primeArray=new ArrayList<>();//4-create an array object
        Arrays.fill(primeNum, true);

        //Section 2 - using the sieve method to create an array consisting of only prime numbers.
        sieve(100000);//5-initalizing a sieve with max value of n possible

        //Section 4 - creating the array list that we will be returing as the answer
        ArrayList<Integer> ans=new ArrayList<>();
        for(var n:query){
            ans.add(solve(n));
        }return ans;
    }
    public static void main(String[] args) {
        ThreeDivisors2 td=new ThreeDivisors2();
        ArrayList<Long> q1=new ArrayList<>();
        q1.add(0, 6L);
        q1.add(1, 49L);
        System.out.println(td.threeDivisors(q1, 2));
    }
}

