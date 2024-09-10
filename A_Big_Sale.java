import java.util.*;
import java.lang.*;
import java.io.*;

class A_Big_Sale
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int price[] = new int [n];
		    int quantity[] = new int [n];
		    int discount[] = new int [n];
		    double totalLoss = 0;
		    double eachLoss = 0;
		    double lastPrice=0;
		    for(int i=0;i<n;i++){
		        price[i]=scan.nextInt();
		        quantity[i]=scan.nextInt();
		        discount[i]=scan.nextInt();
		        if(discount[i]!=0){
		            lastPrice=price[i]+((discount[i]*price[i])/100.0);
		            eachLoss = (lastPrice-((lastPrice*discount[i])/100.0))*quantity[i];
		            totalLoss+=(price[i]*quantity[i])-eachLoss;
		        }
		    }
		    System.out.println(totalLoss);
		    
		}
	}
}
