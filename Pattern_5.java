package Patterns;

import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number U want-: ");
        int n = sc.nextInt();
        // Here please give the value of n = 5 ;
        for(int i =1;i<=n;i++)
        {
            for(int j=1;j<=n*2-1;j++)
            {
                if(j>=n+1-i && j<=n-1+i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
