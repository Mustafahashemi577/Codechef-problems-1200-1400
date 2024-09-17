import java.util.*;
import java.lang.*;
import java.io.*;

class Firece_Battles2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t =scan.nextInt();
		while(t-- > 0){
		    int n = scan.nextInt();
		    int m = scan.nextInt();
		    Map <Integer,Integer> map = new HashMap<>();
		    for(int i = 0; i < n; i++){
		       int p = scan.nextInt();
		       int l = scan.nextInt();
		       map.put(l,map.getOrDefault(l,0)+p);
		    }
		     for(int i = 0; i < m; i++){
		       int p = scan.nextInt();
		       int l = scan.nextInt();
		       map.put(l,map.getOrDefault(l,0)-p);
		    }
		    int sum =0;
		    for(Map.Entry<Integer,Integer> entry : map.entrySet()){
		        int temp = entry.getValue();
		        if(temp<0)
		            sum+=Math.abs(temp);
		    }
		    System.out.println(sum);
		} 
	}
}
