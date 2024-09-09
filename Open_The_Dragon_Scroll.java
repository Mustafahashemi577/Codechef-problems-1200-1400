import java.util.*;
import java.lang.*;
import java.io.*;

class Open_The_Dragon_Scroll
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    
		    int count1 = 0;
		    
		    int c1 = 0;
		    
		    String s1 = Integer.toBinaryString(a);
		    String s2 = Integer.toBinaryString(b);
		  //  System.out.println(s1);
		  //  System.out.println(s2);
		    for(int i = 0; i < s1.length(); i++){
		        if(s1.charAt(i) == '1'){
		            count1++;
		        }
		        
		    }
		    for(int i = 0; i < s2.length(); i++){
		        if(s2.charAt(i) == '1'){
		            c1++;
		        }
		    }
		        
		    
		    int ans = 0;
		    if((c1+ count1) <= n){
		        ans = c1 +  count1;
		    } else {
		        ans = 2*n - c1 - count1;
		    }
		  //  System.out.println(ans);
		    int pro = 0;
		    while(ans > 0){
		        pro += Math.pow(2, n-1);
		        n--;
		        ans--;
		    }
		    System.out.println(pro);
		}

	}
}
