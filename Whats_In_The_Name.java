import java.util.*;
import java.lang.*;
import java.io.*;

class Whats_In_The_Name
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t =Integer.parseInt(scan.nextLine());
		while(t-->0){
		    String s = scan.nextLine();
		    String s1[] = s.split(" ");
		    if(s1.length==1){
		        String temp1 = s1[0];
		        String temp = temp1.substring(0,1);
		        temp = temp.toUpperCase();
		        String temp2 = temp1.substring(1);
		        temp2=temp2.toLowerCase();
		        s1[0]=temp+temp2;
		    }
		    else{
		        for(int i = 0;i<s1.length-1;i++){
		            String temp = s1[i].substring(0,1).toUpperCase();
		            s1[i]=temp+".";
		        }
		        String temp = s1[s1.length-1].substring(0,1).toUpperCase();
		        String temp2 = s1[s1.length-1].substring(1).toLowerCase();
		        s1[s1.length-1]=temp+temp2;
		        
		    }
		    for(String temp : s1){
		        System.out.print(temp+" ");
		    }
		    System.out.println();
		}
	}
}
