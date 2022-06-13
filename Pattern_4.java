package Patterns;

import java.util.Scanner;

public class Pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number U want-: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=i-1;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
