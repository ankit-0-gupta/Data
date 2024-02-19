// Pyramid Star Pattern.

//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 

// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 


import java.util.*;
public class Main 
{
    public static void lowerHalfPyramidPattern(int n)
    {
        int nsp = 0; 
        int nst = n;
        for(int row = 1; row <= n; row++)
        {
            for(int csp = 1; csp <= nsp; csp++)
            {
                System.out.print(" ");
            }
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print("* ");
            }
            nsp++;
            nst--;
            System.out.println();
        }
    }
    
    public static void upperHalfPyramidPattern(int n)
    {
        int nsp = n - 1;
        int nst = 1;
        for(int row = 1; row <= n; row++)
        {
            for(int csp = 1; csp <= nsp; csp++)
            {
                System.out.print(" ");
            }
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print("* ");
            }
            nsp--;
            nst++;
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        upperHalfPyramidPattern(n);
        System.out.println();
        lowerHalfPyramidPattern(n);
    }
}
