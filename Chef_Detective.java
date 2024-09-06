import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_Detective
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int a [] = new int [n];
		Set <Integer> set = new HashSet<>();
		for(int i = 0;i<n;i++){
		    set.add(scan.nextInt());
		}
		for(int i =1;i<=n;i++){
		    if(!set.contains(i))
		    System.out.print(i+" ");
		}

	}
}
