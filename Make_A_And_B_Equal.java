import java.util.*;
import java.lang.*;
import java.io.*;

class Make_A_And_B_Equal
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan =new Scanner(System.in);
	    long t=scan.nextLong();
	    while(t-->0){
	        ArrayList<Integer> a= new ArrayList<>();
	        ArrayList<Integer> b= new ArrayList<>();
	        long n=scan.nextInt();
	        for(int i=0;i<n;i++){
	            a.add(scan.nextInt());
	        }
	        long sum1=0,sum2=0;
	        for(int j=0;j<n;j++){
	            b.add(scan.nextInt());
	            if(a.get(j)< b.get(j)){
	                sum1+=(b.get(j)-a.get(j));
	            }
	            else{
	                sum2+=(a.get(j)-b.get(j));
	            }
	        }
	        if(sum1==sum2)
	            System.out.println(sum1);
	        else
	            System.out.println("-1");
	    }
	}
}
