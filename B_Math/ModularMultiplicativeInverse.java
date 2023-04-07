package B_Math;

public class ModularMultiplicativeInverse {
    static int modInverse(int A, int M)
    { 
        for (int X = 1; X < M; X++)
            if (((A % M) * (X % M)) % M == 1)
                return X;
        return -1;
    }
 
    // Driver code
    public static void main(String args[])
    {
        int A = 3, M = 11;
 
        // Function call
        System.out.println("Modular multiplicative "
                           + "inverse is "
                           + modInverse(A, M));
    }
}
