import java.util.*;
import java.lang.*;
import java.io.*;

class Max_Power
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        int pow =0;
        for(int i=n-1;i>=0;i--){
            if(str.charAt(i)=='1'){
                pow =n-(i+1);
                break;
            }
        }
        System.out.println(pow);

	}
}
