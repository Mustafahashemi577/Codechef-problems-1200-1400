import java.util.*;
import java.lang.*;
import java.io.*;

class Asymmetric_Swaps
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int a [] = new int [2*n];
            for(int i = 0;i<2*n;i++) a[i]=scan.nextInt();
            Arrays.sort(a);
            int min = Integer.MAX_VALUE;
            for(int i = 0;i<=n;i++){
                min=Math.min((a[i+n-1]-a[i]),min);
            }
            System.out.println(min);
        }
	}
}
