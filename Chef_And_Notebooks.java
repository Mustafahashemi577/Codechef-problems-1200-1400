import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Notebooks
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while (t-->0){
            int x = scan.nextInt();
            int y = scan.nextInt();
            int k = scan.nextInt();
            int n = scan.nextInt();
            int p [] = new int [n];
            int c [] = new int [n];
            for(int i = 0;i<n;i++){
                p[i]=scan.nextInt();
                c[i]=scan.nextInt();
            }
            if(y>=x){
                System.out.println("LuckyChef");
            }
            else{
                boolean result = false;
                for(int i = 0;i<n;i++){
                    if(p[i]>=(x-y) && c[i]<=k){
                        result=true;
                        break;
                    }
                }
                System.out.println(result==true?"LuckyChef":"UnluckyChef");    
            }
        } 
	}
}
