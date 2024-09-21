import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_The_Right_Triangles
{
    public static boolean power(int x1,int y1,int x2,int y2,int x3, int y3){
        double temp1 = Math.pow((x1-x2),2)+Math.pow((y1-y2),2);
        double temp2 = Math.pow((x1-x3),2)+Math.pow((y1-y3),2);
        double temp3 = Math.pow((x3-x2),2)+Math.pow((y3-y2),2);
        if(temp3==temp1+temp2 || temp2==temp1+temp3 || temp1 == temp2+temp3)
        return true;
        else
        return false;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int n = scan.nextInt();
	    int count = 0;
	    while(n-->0){
	        int x1 =scan.nextInt();
	        int y1 =scan.nextInt();
	        int x2 =scan.nextInt();
	        int y2 =scan.nextInt();
	        int x3 =scan.nextInt();
	        int y3 =scan.nextInt();
	        if(power(x1,y1,x2,y2,x3,y3))
	            count++;
	    }
	    System.out.println(count);
	}
}
