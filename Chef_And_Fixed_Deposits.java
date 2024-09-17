import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Fixed_Deposits
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while (t-->0){
            int n = scan.nextInt();
            int x = scan.nextInt();
            int a [] = new int [n];
            int sum = 0;
            for(int i = 0;i<n;i++) a[i]=scan.nextInt();
            Arrays.sort(a);
            for(int i = n-1;i>=0;i--){
                sum+=a[i];
                if(sum>=x){
                    System.out.println(n-i);
                    break;
                }
            }
            if(sum<x)
            System.out.println(-1);
                
        } 
	}
}
