import java.util.*;
import java.lang.*;
import java.io.*;

class Brackets
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    String a = scan.next();
		    int balance=0;
		    int max_balance=0;
		    for(int i=0;i<a.length();i++){
		        if (a.charAt(i) == '(')
		        balance++;
			    if (a.charAt(i) == ')')
			    balance--;
			    max_balance = Math.max( max_balance, balance );
		    }
		    for(int i=0;i<max_balance;i++){
		        System.out.print("(");
		    }
		    for(int i=0;i<max_balance;i++){
		        System.out.print(")");
		    }
		    System.out.println();
		}

	}
}
