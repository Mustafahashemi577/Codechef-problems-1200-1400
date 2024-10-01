import java.util.*;
import java.lang.*;
import java.io.*;

class A_Plus_B_Remastered
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while (t-->0){
            int n = scan.nextInt();
            int a[] = new int [n];
            Integer b[] = new Integer [n];
            for(int i = 0;i<n;i++)
                a[i]=scan.nextInt();
            for(int i = 0;i<n;i++)
                b[i]=scan.nextInt();
            Arrays.sort(a);
            Arrays.sort(b,Collections.reverseOrder());
            boolean result = true;
            int recent = a[0]+b[0];
            for(int i = 1;i<n;i++){
                if(a[i]+b[i]!=recent){
                    result=false;
                    break;
                }
            }
            if(result==false)
            System.out.println(-1);
            else{
                for(int i = 0;i<n;i++)
                    System.out.print(a[i]+" ");
                System.out.println();
                for(int i =0;i<n;i++)
                    System.out.print(b[i]+" ");
                System.out.println();
            }
            
        } 
	}
}
