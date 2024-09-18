import java.util.*;
import java.lang.*;
import java.io.*;

class Weird_Walk
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0)
        {
            int alice=0,bob=0;
            int n=scan.nextInt();
            int a[]=new int[n],b[]=new int[n];
            for(int i=0;i<n;i++)
             a[i]=scan.nextInt();
             
            for(int i=0;i<n;i++)
             b[i]=scan.nextInt();
            long s=0;
            for(int i=0;i<n;i++)
            {
                if(alice==bob&&a[i]==b[i])
                {s+=a[i];}
                alice+=a[i];
                bob+=b[i];
            }
            System.out.println(s);
        }
	}
}
