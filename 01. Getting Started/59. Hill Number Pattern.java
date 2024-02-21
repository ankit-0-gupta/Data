// Hill Number Pattern.

// Sample Input:
// 7
    
// Sample Output:
// 1           1
// 12         21
// 123       321
// 1234     4321
// 12345   54321
// 123456 654321
// 1234567654321


import java.util.*;
public class Main 
{
    public static void hillPattern(int n)
    {
        int nst = 1; 
        int nsp = 2 * n - 3;
        for(int row = 1; row <= n; row++)
        {
            int val = 1;
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print(val++);
            }
            for(int csp = 1; csp <= nsp; csp++)
            {
                System.out.print(" ");
            }
            if(row == n)
            {
                nst--;
                val--;
            }
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print(--val);
            }
            nst++;
            nsp -= 2;
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        hillPattern(n);
    }
}
