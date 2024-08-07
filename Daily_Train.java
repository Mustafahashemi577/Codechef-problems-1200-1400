import java.util.*;
import java.lang.*;
import java.io.*;

class Daily_Train
{
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    
    public static int nCr(int n, int r){
        int ans = fact(n)/(fact(n-r)*fact(r));
        return ans;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int n = scan.nextInt();
		
		int count =0;
		
		for(int i=0;i<n;i++){
		    
		    String str = scan.next();
		    int r1=0;
		    int r2=53;
		    for(int j=0;j<9;j++){
		        int tmp = 0;
		        for(int k=1;k<=4;k++){
    		        if(str.charAt(r1)=='0'){
    		            tmp++;
    		        }
    		        r1++;
		        }
		        for(int k=1;k<=2;k++){
    		        if(str.charAt(r2)=='0'){
    		            tmp++;
    		        }
    		        r2--;
		        }
    		    if(tmp>=x){
    		        count+=nCr(tmp,x);
    		    }
		    }
		}
		
		System.out.println(count);
	}
}
