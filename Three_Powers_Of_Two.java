import java.util.*;
import java.lang.*;
import java.io.*;

class Three_Powers_Of_Two
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0){
		    int n = scan.nextInt();
		    String str = scan.next();
		    
		    int count=0;
		    for(int i=0; i< n ; i++){
		        if(str.charAt(i) == '1')
		        count++;
		    }
		    
		    if(count <= 3 && !str.equals("1") && !str.equals("10"))
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
