package Patterns;

import java.util.Scanner;

public class Pattern_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number U want-: ");
        int n = sc.nextInt();
        char k;
        for(int i =1;i<=n;i++)
        {
             k= 'A';
            for(int j=1;j<=n*2-1;j++)
            {
                if(j<=n+1-i || j>=n-1+i)
                {
                    System.out.print(k);
                    //j<n?k++:k--;
                    if(j<n)
                    {
                        k++;
                    }
                    else
                    {
                        k--;
                    }
                }
                else
                {
                    System.out.print(" ");
                    if(j==n)
                        k--;
                }
            }
            System.out.println();
        }
    }
}
