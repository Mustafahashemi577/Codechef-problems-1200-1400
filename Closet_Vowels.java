import java.util.*;
import java.lang.*;
import java.io.*;

class Closet_Vowels
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n=scan.nextInt();
		    String s=scan.next();
		    long ans=1L;
		    char ch[]=s.toCharArray();
		    for(int i=0;i<n;i++){
		        if(ch[i] == 'c' || ch[i] == 'g' || ch[i] == 'l' || ch[i] == 'r')
		        {
		            ans = (ans * 2) % 1000000007;
		        }
		    }
		    System.out.println(ans);
		}

	}
}
