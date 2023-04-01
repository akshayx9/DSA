package Math;

public class SeriesGP {
    Long power(int r, int n, int mod){
        if(n==0){
            return 1l;
        }
        Long temp=power(r, n/2, mod)%mod;

        if(n%2==0){
            return (temp*temp)%mod;
        }else{
            return (((temp*temp)%mod)*r)%mod;
        }
    }
    public int Nth_term(int a, int r, int n){
        int mod=1000000007;
        Long ans=(a*power(r, n-1,mod))%mod;
        return ans.intValue();
    }
    public static void main(String[] args) {
        SeriesGP s=new SeriesGP();
        System.out.println(s.Nth_term(5, 9, 10));
    }
}
