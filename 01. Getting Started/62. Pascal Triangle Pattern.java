// Pascal Triangle Pattern.

// 1
// 1   1
// 1   2   1
// 1   3   3   1
// 1   4   6   4   1
// 1   5   10  10  5   1


import java.util.*;
public class Main 
{
    public static void pascalPattern(int rows)
    {
        for(int n = 0; n < rows; n++) 
        {                
            int nCr = 1;
            for(int r = 0; r <= n; r++) 
            {
                System.out.print(nCr + "\t");
                int nCr1 = ((n - r) * nCr) / (r + 1);
                nCr = nCr1;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pascalPattern(n);
    }
}
