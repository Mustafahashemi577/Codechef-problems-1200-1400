import java.util.*;
import java.lang.*;
import java.io.*;

class Average_Number
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int sum=0;
		    int N = scan.nextInt();
		    int K = scan.nextInt();
		    int V = scan.nextInt();
		    for(int j=0;j<N;j++){
		        int temp = scan.nextInt();
		        sum = sum + temp;
		    }
		    int value = ((N+K)*V)-sum;
		    if(value<=0)
		      System.out.println("-1");
		    else{
		        int check_decimal = (((N+K)*V)-sum)%K;
		        if(check_decimal==0)
		        {
		            System.out.println((((N+K)*V)-sum)/K);
		        }
		        else{
		            System.out.println("-1");
		        }
		    }
		}

	}
}
