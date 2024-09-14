import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Icecream
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n =scan.nextInt();
		    int a[] =new int[n];
		    int five=0;
		    int ten=0;
		    int fif=0;
		    int flag=0;
		    for(int i=0;i<n;i++){
		        a[i]=scan.nextInt();
		        if(a[i]==5){five++;}
		        else if(a[i]==10 && five !=0){ten++;five--;}
		        else if(a[i]==15 && (five>=2 || ten !=0 )){
		            if(ten !=0){ten--;}
		            else{five=five-2;}
		            fif++;
		        }
		        else{flag=1;}
		    }
		    if(flag==1){System.out.println("NO");}
		    else{System.out.println("YES");}
		}
		
	}
}
