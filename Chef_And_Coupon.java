import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Coupon
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int d = scan.nextInt();
		    int c = scan.nextInt();
		    int a[] = new int [6];
		    int sum =0;
		    for(int i = 0;i<6;i++){ 
		        a[i]=scan.nextInt();
		        sum+=a[i];
		    }
		    sum+=(2*d);
		    int sumcoupon =0;
		    if(a[0]+a[1]+a[2]>=150)
		    {
		        sumcoupon+=(a[0]+a[1]+a[2]+c);
		        if(a[3]+a[4]+a[5]>=150)
		        sumcoupon+=a[3]+a[4]+a[5];
		        else
		        sumcoupon+=a[3]+a[4]+a[5]+d;
		    }
		    else if (a[3]+a[4]+a[5]>=150){
		        sumcoupon+=(a[3]+a[4]+a[5]+c);
		        if(a[0]+a[1]+a[2]>=150)
		        {
		            sumcoupon+=(a[0]+a[1]+a[2]);
		        }
		        else
		        {
		            sumcoupon+=(a[0]+a[1]+a[2]+d);
		        }
		    }
		    else
		    sumcoupon=sum;
		    System.out.println(sumcoupon<sum?"YES":"NO");
		    
		    
		}

	}
}
