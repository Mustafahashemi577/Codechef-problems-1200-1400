import java.util.*;
import java.lang.*;
import java.io.*;

class Rock_Paper_Scissor
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int chef =0;
		    int chefina = 0;
		    char a [] = scan.next().toCharArray();
		    char b [] = scan.next().toCharArray();
		    for(int i = 0;i<n;i++){
		        if(a[i]=='R'&& b[i]=='S')
		        chef++;
		        else if (b[i]=='R'&& a[i]=='S')
		        chefina++;
		        else if (a[i]=='P'&& b[i]=='S')
		        chefina++;
		        else if (a[i]=='S'&& b[i]=='P')
		        chef++;
		        else if (a[i]=='R'&& b[i]=='P')
		        chefina++;
		        else if (a[i]=='P'&& b[i]=='R')
		        chef++;
		    }
		    if(chef==chefina)
		    System.out.println(1);
		    else if (chef>chefina)
		    System.out.println(0);
		    else{
		        int c = (chefina+chef)/2;
		        if((chef+chefina)%2==0)
		        System.out.println(chefina-c+1);
		        else
		        System.out.println(chefina-c);
		    } 
		    
		}

	}
}
