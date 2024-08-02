import java.util.*;
import java.lang.*;
import java.io.*;

class Table_Strength
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while(t-->0){
	        int n = scan.nextInt();
	        ArrayList<Long> v = new ArrayList<>();
            for (int i = 0; i < n; i++)
                v.add(scan.nextLong());
            Collections.sort(v);
            long ma = v.get(n - 1);
            long index = 1;
            for (int i = n - 1; i >= 0; i--) {
                long total = index * v.get(i);
                ma = Math.max(total, ma);
                index++;
            }
            System.out.println(ma);
	    }
	}
}
