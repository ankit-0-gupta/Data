// Number Crown.

// https://www.codingninjas.com/studio/problems/number-crown_6581894


public class Solution
{
    public static void numberCrown(int n)
    {
        int nst = 1;
        int nsp = 2 * n - 2;
        for(int row = 1; row <= n; row++)
        {
            int val = 1;
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print(val++ + " ");
            }
            for(int csp = 1; csp <= nsp; csp++)
            {
                System.out.print(" ");
            }
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print(--val + " ");
            }
            nst++;
            nsp -= 2;
            System.out.println();
        }
    }
}
