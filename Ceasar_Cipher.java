import java.util.*;
import java.lang.*;
import java.io.*;

class Ceasar_Cipher
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int q = scan.nextInt();
		while(q-->0){
		    int n = scan.nextInt();
		    char a [] = scan.next().toCharArray();
		    char b [] = scan.next().toCharArray();
		    char c [] = scan.next().toCharArray();
		    int differnce =b[0]-a[0];
		    if(differnce<0){
		        differnce=differnce+26;
		    }
		    for(int i = 0;i<n;i++){
		        int temp = differnce;
		       if((c[i]+temp)>122){
		           temp=((c[i]+temp)-122);
		           c[i]='a';
		           c[i]+=temp-1;
		       }
		       else
		       c[i]+=temp;
		       
		    }
		    for(int i = 0;i<n;i++){
		        System.out.print(c[i]);
		    }
		    System.out.println();
		}

	}
}
