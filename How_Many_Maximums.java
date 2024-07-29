import java.util.*;
import java.lang.*;
import java.io.*;

class How_Many_Maximums
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
		    int n = scan.nextInt();
            String s = scan.next();
            char[] c = s.toCharArray();

            int count=0;

                for (int i = 0; i < n-2; i++) {
                    if(c[i]=='0'&&c[i+1]=='1'){
                        count++;
                    }
                }
                
            if(c[0]=='1')count++;
            if(c[n-2]=='0')count++;

            System.out.println(count);
		}
	}
}
