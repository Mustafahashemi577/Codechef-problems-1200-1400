import java.util.*;
import java.lang.*;
import java.io.*;

class Check_Algorithm
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            StringBuilder result = new StringBuilder();
            char current = s.charAt(0);
            int curLen = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != current) {
                    result.append(current);
                    result.append(curLen);
                    current = s.charAt(i);
                    curLen = 1;
                } 
                else
                    curLen++;

                if (i == s.length() - 1){ 
                    result.append(current);
                    result.append(curLen);
                }
            }
            System.out.println(s.length()<=result.length()?"NO":"YES");
        }
	}
}
