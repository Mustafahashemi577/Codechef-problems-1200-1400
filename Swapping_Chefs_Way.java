import java.util.*;
import java.lang.*;
import java.io.*;

class Swapping_Chefs_Way
{
    public static String swapper(String s, int n ){
        char c [] = s.toCharArray();
        for(int i = 0;i<=n/2-1;i++){
            int j = n-(i+1);
            if(c[i]>c[j]){
                char temp = c[i];
                c[i]=c[j];
                c[j]=temp;
            }
        }
        return new String(c);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    String s = scan.next();
		    char d [] = s.toCharArray();
		    Arrays.sort(d);
		    String s1 = swapper(s,n);
		    String s2 = new String(d);
		    if (s2.equals(s1))
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
