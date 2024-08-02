import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Digits_Of_A_Number
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    String s = scan.next();
		    int ones = 0 ;
		    int zeros = 0;
		    for(int i = 0;i<s.length();i++){
		        if(s.charAt(i)=='1')
		        ones++;
		        else
		        zeros++;
		    }
		    System.out.println(ones==1 || zeros == 1 ?"Yes":"No");
		}

	} 
}
