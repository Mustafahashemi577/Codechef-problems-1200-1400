import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Secret_Ingredient
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int x = scan.nextInt();
		    int a [] = new int [n];
		    boolean result = false;
		    for(int i = 0;i<n;i++){ 
		        a[i]=scan.nextInt();
		        if(a[i]>=x)
		        result=true;
		    }
		    System.out.println(result==false?"NO":"YES");    
		}
	}
}
