// Symmetry.

// https://www.codingninjas.com/studio/problems/symmetry_6581914


public class Solution
{   
    public static void symmetry(int n)
    {
        int nst = 1; 
        int nsp = 2 * n - 2;
        n = 2 * n - 1;
        for(int row = 1; row <= n; row++)
        {
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print("* ");
            }
            for(int csp = 1; csp <= nsp; csp++)
            {
                System.out.print(" ");
            }
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print("* ");
            }
            if(row <= n / 2)
            {
                nst++;
                nsp -= 2;
            }
            else
            {
                nst--;
                nsp += 2;
            }
            System.out.println();
        }
    }
}
