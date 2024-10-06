import java.util.*;
import java.lang.*;
import java.io.*;

class Strong_Language
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            long n = scan.nextLong();
            long k = scan.nextLong();
            String s = scan.next();
            boolean result = false;
            int stars = 0;
            for(int i = 1;i<s.length();i++){
                if(s.charAt(i)=='*'){
                    stars++;
                    if(stars==k){
                        result=true;
                        break;
                    }
                }
                else
                stars=0;
            }
            System.out.println(result==true?"YES":"NO");
        }
	}
}
