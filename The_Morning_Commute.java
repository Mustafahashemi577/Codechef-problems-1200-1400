import java.util.*;
import java.lang.*;
import java.io.*;

class The_Morning_Commute
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int testCaases = scan.nextInt();
        while(testCaases-->0){
            int n = scan.nextInt();
            long r = 0;
            for(int i = 0; i<n;i++) {
                int x=scan.nextInt();
                int l=scan.nextInt();
                int f=scan.nextInt();
                if(i==0)
                r+=x;
                for(int j=x;;j+=f)
                {
                    if(j>=r)
                    {
                        r=j;
                        break;
                    }
                }
                r+=l;
            }
            System.out.println(r);
        }
	}
}
