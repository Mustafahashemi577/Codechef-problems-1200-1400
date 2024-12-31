import java.util.*;
import java.lang.*;
import java.io.*;

class EquinoxStrings
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        char d[] = {'E','Q','U','I','N','O','X'};
        while(t-->0){
            
            int n = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            long sar =0,anu=0;
            for(int i = 0;i<n;i++){
                boolean result = false;
                String s = scan.next();
                for(int j=0;j<7;j++){
                    if(s.charAt(0)==d[j]){
                        result=true;
                        break;
                    }
                }
                if(result)
                    sar+=a;
                else
                    anu+=b;
            }
            if(anu==sar)
            System.out.println("DRAW");
            else
            System.out.println(sar>anu?"SARTHAK":"ANURADHA");
        }
	}
}

