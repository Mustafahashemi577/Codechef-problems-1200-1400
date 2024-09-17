import java.util.*;
import java.lang.*;
import java.io.*;

class RedAlert
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while (t-->0){
            int n = scan.nextInt();
            int d = scan.nextInt();
            int h = scan.nextInt();
            int a [] = new int [n];
            long waterLevel = 0L;
            boolean result = false;
            for(int i = 0;i<n;i++) a[i]=scan.nextInt();
            for(int i = 0;i<n;i++){
                if(a[i]==0){
                    if((waterLevel-d)<0)
                        waterLevel=0;
                    else
                        waterLevel-=d;
                }
                else
                waterLevel+=a[i];
                if(waterLevel>h){
                    result =true;
                    break;
                }
            }
            System.out.println(result==true?"YES":"NO");
        } 
	}
}
