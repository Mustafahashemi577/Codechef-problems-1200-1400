import java.util.*;
import java.lang.*;
import java.io.*;

class Copy_Paste
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    HashMap<Integer, Integer> map = new HashMap<>();
		    for(int i = 0;i<n;i++){
		        a[i]=scan.nextInt();
		        int temp = a[i];
		        if(!map.containsKey(temp))
		        map.put(temp,map.getOrDefault(temp,0)+1);
		        else
		        map.put(temp,map.get(temp)+1);
		    }
		    System.out.println(map.size());
		}
	}
}
