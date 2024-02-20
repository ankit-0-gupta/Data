// Inverted Diamond Star Pattern.
    
// *** ***
// **   **
// *     *
//
// *     *
// **   **
// *** ***
    

import java.util.*;
public class Main 
{
    public static void invertedDiamond(int n)
    {
        int nst = n / 2;
        int nsp = 1; 
        for(int row = 1; row <= n; row++)
        {
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print("*");
            }
            for(int csp = 1; csp <= nsp; csp++)
            {
                System.out.print(" ");
            }
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print("*");
            }
            if(row <= n / 2)
            {
                nst--;
                nsp += 2;
            }
            else
            {
                nst++;
                nsp -= 2;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        invertedDiamond(n);
    }
}
