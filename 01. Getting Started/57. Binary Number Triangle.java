// Binary Number Triangle.

// https://www.codingninjas.com/studio/problems/binary-number-triangle_6581890


public class Solution
{   
    public static void binaryNumberPattern(int n)
    {
        int nst = 1;
        for(int row = 1; row <= n; row++)
        {
            if(row % 2 == 0)
            {
                int n1 = 0;
                for(int cst = 1; cst <= nst; cst++)
                {
                    System.out.print(n1 + " ");
                    if(n1 == 0)
                        n1++;
                    else
                        n1--;
                }
            }
            else
            {
                int n2 = 1;
                for(int cst = 1; cst <= nst; cst++)
                {
                    System.out.print(n2 + " ");
                    if(n2 == 1)
                        n2--;
                    else
                        n2++;
                }
            }
            nst++;
            System.out.println();
        }
    }
}
