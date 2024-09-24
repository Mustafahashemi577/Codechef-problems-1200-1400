import java.util.*;
import java.lang.*;
import java.io.*;

class Fancy_Quotes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		scan.nextLine();
		String real ="not";
		while(t-->0){
		    boolean result = false;
		    String s[] = scan.nextLine().split(" ");
		    for(String str : s)
		        if(str.equals(real)){
		            result=true;
		            break;
		        }
		    System.out.println(result==true?"Real Fancy":"regularly fancy");
		}
	}
}
