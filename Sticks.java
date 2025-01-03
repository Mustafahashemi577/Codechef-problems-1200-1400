import java.util.*;
import java.lang.*;
import java.io.*;

class Sticks
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int a[] = new int [n];
            for(int i = 0;i<n;i++) a[i]=scan.nextInt();
            Arrays.sort(a);
            int max1=0,max2=0;
            int i = n-1;
            while(i>0){
                if(a[i]==a[i-1]){
                    max1=a[i];
                    i-=2;
                    break;
                }
                i--;
            }
            while(i>0){
                if(a[i]==a[i-1]){
                    max2=a[i];
                    i-=2;
                    break;
                }
                i--;
            }
            System.out.println(max2>0&&max1>0?max1*max2:-1);
            
        }
	}
}

