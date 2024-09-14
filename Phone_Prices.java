import java.util.*;
import java.lang.*;
import java.io.*;

class Phone_Prices
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    for(int i = 0;i<n;i++){
		        a[i]=scan.nextInt();
		    }
		    int goodPrices = 1;
		    for(int i=5;i<n;i++) {
                if(a[i]<a[i-1] && a[i]<a[i-2] && a[i]<a[i-3] && a[i]<a[i-4] && a[i]<a[i-5])
                    goodPrices++;
            }
            if(a[1]<a[0]) goodPrices++;
            if(a[2]<a[0] && a[2]<a[1]) goodPrices++;
            if(a[3]<a[2] && a[3]<a[1] && a[3]<a[0]) goodPrices++;
            if(a[4]<a[3] && a[4]<a[2] && a[4]<a[1] && a[4]<a[0]) goodPrices++;
            
            System.out.println(goodPrices);
		}
	}
}
