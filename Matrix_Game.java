import java.util.*;
import java.lang.*;
import java.io.*;

class Matrix_Game
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int m = scan.nextInt();
		    int a[] = new int [n*m];
		    int sumCyborg = 0;
		    int sumGeno =0;
		    for(int i = 0;i<a.length;i++) a[i]=scan.nextInt();
		    Arrays.sort(a);
		    int Cyborg = 0; 
		    for(int i = a.length-1;i>=0;i--){
		        if(Cyborg==0){
		            sumCyborg+=a[i];
		            Cyborg=1;
		        }
		        else{
		            sumGeno+=a[i];
		            Cyborg=0;
		        }
		    }
		   if(sumGeno==sumCyborg)
		   System.out.println("Draw");
		   else
		   System.out.println(sumCyborg>sumGeno?"Cyborg":"Geno");
		}

	}
}
