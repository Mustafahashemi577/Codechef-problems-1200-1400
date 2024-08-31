import java.util.*;
import java.lang.*;
import java.io.*;

class Popular_Rice_Recipe
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while(t-->0){
	        int n = scan.nextInt();
	        Map <String,Integer> map = new HashMap<>();
	        for(int i = 0;i<n;i++){
	            String temp = scan.next();
	            String d = scan.next();
	            if(d.equals("+"))
	            map.put(temp, +1);
	            else
	            map.put(temp, -1);
	        }
	        int total = 0;
	        for(Map.Entry<String, Integer> entry : map.entrySet() ){
	            int i = entry.getValue();
	            total+=i;
	        }
	        System.out.println(total);
	    
	    }
	}
}
