import java.util.*;
import java.lang.*;
import java.io.*;

class Sum_Of_Palindromic_Numbers
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan =new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0){
		    int l=scan.nextInt();
		    int r=scan.nextInt();
		    
		    int sum=0;
		    
		    for(int i=l;i<=r;i++){
		        if(isPalindrome(i))
		          sum+=i;
		    }
		    System.out.println(sum);
		}
	}
	private static boolean isPalindrome(int num){
	    String numStr=String.valueOf(num);
	    if(numStr.length()<=1)
	      return true;
	    boolean flag=true;
	    
	    for(int i=0,j=numStr.length()-1;i<j;i++,j--){
	        if(numStr.charAt(i)!=numStr.charAt(j)){
	            flag=false;
	            break;
	        }
	    }
	    return flag;
	}
}
