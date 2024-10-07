import java.util.*;
import java.lang.*;
import java.io.*;

class Large_Differences
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int k = scan.nextInt();
            int a[] = new int [n];
            for(int i = 0;i<n;i++) a[i]=scan.nextInt();
            
            int max = 0;
            for(int i = 0;i<n;i++){
                int temp = a[i];
                int j = 1;
                while(j<=k){
                    int sum = 0;
                    a[i]=j;
                    for(int m = 0;m<n-1;m++){
                        sum+=Math.abs(a[m]-a[m+1]);
                    }
                    max = Math.max(sum,max);
                    j+=(k-1);
                }
                a[i]=temp;
            }
            System.out.println(max);
        }
	}
}
