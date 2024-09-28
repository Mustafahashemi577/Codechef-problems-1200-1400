import java.util.*;
import java.lang.*;
import java.io.*;

class Spell_Bob
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0)
        {
            String a=scan.next(),b=scan.next();
            boolean f=true;
            int c1=0,c2=0;
            for(int i=0;i<3;i++)
            {
                char ch1=a.charAt(i);
                char ch2=b.charAt(i);
                if(!(ch1=='b'||ch1=='o'||ch2=='b'||ch2=='o'))
                {
                f=false;
                }
                if(ch1=='o'||ch2=='o')
                c1++;
                if(ch1=='b'||ch2=='b')
                c2++;
            }
            if(f && c2>=2 && c1>=1)
            System.out.println("yes");
            else
            System.out.println("no");
        }
	}
}
