import java.util.*;
import java.lang.*;
import java.io.*;

class Distinct_Codes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    String s = scan.next();
		    Set <String> list = new HashSet<>();
		    for(int i = 0;i<s.length()-1;i++){
		        String temp =""+s.charAt(i)+s.charAt(i+1);
		        if(!list.contains(temp))
		        list.add(temp);
		    }
		    System.out.println(list.size());
		}

	}
}
