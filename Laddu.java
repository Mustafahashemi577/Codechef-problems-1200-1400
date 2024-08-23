import java.util.*;
import java.lang.*;
import java.io.*;

class Laddu
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while( t-- > 0 ){
		    int activities = scan.nextInt();    
		    String origin = scan.next();
		    int point = 0;
		    for (int i = 1 ; i <= activities ; i++ ) {
		        String a = scan.next();
		        int r = 0;
		        if( a.equals( "CONTEST_WON" ) || a.equals("BUG_FOUND") ){
		            r = scan.nextInt();
		        }
		        if( a.equals( "CONTEST_WON" ) ){
		            point += 300;
		            if( r <= 20 ){
		                point += 20 - r;
		            }
		        }
		        else if( a.equals( "TOP_CONTRIBUTOR" ) ){
		            point += 300;   
		        }
		        else if( a.equals( "BUG_FOUND" ) ){
		            point += r;   
		        }
		        else if( a.equals( "CONTEST_HOSTED" ) ){
		            point += 50;   
		        }
		    }
		    int ans = 0;
		    if( origin.equals( "INDIAN" ) ){
		        ans = point/200;
		    }
		    else{
		        ans = point/400;
		    }
		    System.out.println(ans);
		}
	}
}
