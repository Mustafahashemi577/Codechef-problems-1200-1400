import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_In_Fantasy_League
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int s = scan.nextInt();
		    int p [] = new int [n];
		    for(int i =0;i<n;i++) p[i]=scan.nextInt();
		    int location [] = new int [n];
		    for(int i =0;i<n;i++) location[i]=scan.nextInt();
		    int minForward = 10000;
		    int minDefender = 10000;
		    for(int i = 0;i<n;i++){
		        if(p[i]<minDefender && location[i]==0)
		        minDefender=p[i];
		        if(p[i]<minForward && location[i]==1)
		        minForward=p[i];
		    }
		    System.out.println(s+minForward+minDefender>100?"no":"yes");
		    
		}

	}
}
