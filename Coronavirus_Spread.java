import java.util.*;
import java.lang.*;
import java.io.*;

class Coronavirus_Spread
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    for(int i = 0;i<n;i++) a[i]=scan.nextInt();
		    int count=1,max=1,min=1000;
              for(int i=0;i<n-1;i++)
              {
                  if((a[i+1]-a[i])<=2)
                     count++;
                  else
                  {
                     if(count>max)
                       max=count;
                     if(count<min)
                       min=count;
                        count=1;
                  }    
              }
                     if(count>max)
                       max=count;
                     if(count<min)
                       min=count;
                   System.out.println(min+" "+max);
                
          }

	}
}
