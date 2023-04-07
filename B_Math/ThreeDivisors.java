package B_Math;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeDivisors {
    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q){

        //Section 1 - traverse the given query list to find the max value then store the square root of that value in 'n'
        int n=0;
        for(Long qn:query){
            n=Math.max(n,(int)Math.sqrt(qn));
        }

        //Section 2(Seive) - we create a boolean array of length 'n+1' <--+1 here is to accomadate all elements including the square root, incase the max value is a perfect square.
        boolean [] prime=new boolean[n+1];
        Arrays.fill(prime, true);//used to fill all the values inside the array as true.

        //Section 3 - we mark all the non prime numbers in the seive as false
        for(int i=2; i<=n; i++){
            if(prime[i]){
                for(int j=i*i; j<=n; j+=i){
                    prime[j]=false;
                }
            }
        }
        //Section 4 - creating another array to store the count of prime no's
        int[] dp=new int[n+1];
        for(int i=2; i<=n; i++){
            dp[i]=dp[i-1];
            if(prime[i]){
                dp[i]++;
            }
        }
        //Section 5 - removing root of the query and storing it in the ArrayList
        ArrayList<Integer> ans= new ArrayList<>();
        for(Long qn:query){
            int root=(int)Math.sqrt(qn);
            ans.add(dp[root]);
        }
        return ans;
    }
}
