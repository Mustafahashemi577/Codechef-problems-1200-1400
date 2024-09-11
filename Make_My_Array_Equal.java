import java.util.*;
import java.lang.*;
import java.io.*;

class Make_My_Array_Equal
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int a [] = new int [n];
            for(int i = 0;i<n;i++){
                a[i]=scan.nextInt();
            }
            Set <Integer> set = new HashSet<>();
            for(int x:a)
                if(x!=0)
                set.add(x);
            System.out.println(set.size()<=1?"YES":"NO");
        }
    }
}
