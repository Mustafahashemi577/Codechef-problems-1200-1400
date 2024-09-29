import java.util.*;
import java.lang.*;
import java.io.*;

class Little_Elephant_And_Bomb
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
       	 	int t=scan.nextInt();
        while(t-->0)
        {
            int n=scan.nextInt();
            String s=scan.next();
            char ch[]=s.toCharArray();
            int c=0;
            if(n>1)
            {
                if(ch[0]=='1')
                {
                    if(ch[1]=='0')
                     ch[1]='e';
                }
                if(ch[n-1]=='1')
                {
                    if(ch[n-2]=='0')
                     ch[n-2]='e';
                }
            }
                for(int i=1;i<n-1;i++)
                {
                    if(ch[i]=='1')
                    {
                        if(ch[i-1]=='0')
                        ch[i-1]='d';
                        if(ch[i+1]=='0')
                        ch[i+1]='e';
                    }
                }
                for(int i=0;i<n;i++)
                {
                    if(ch[i]=='0')
                    c++;
                }
            System.out.println(c);
		} 

	}
}
