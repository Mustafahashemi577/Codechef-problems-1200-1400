import java.util.*;
import java.lang.*;
import java.io.*;

class Jumping_In_THe_Hills
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int u = scan.nextInt();
		    int d = scan.nextInt();
		    int[] a = new int[n];
		    for(int i=0;i<n;i++){
		        a[i] = scan.nextInt();
		    }
		    boolean para = true; 
		    int index = 1;
		    for(int i=1;i<n;i++){
		        if(a[i]==a[i-1]){
		            index++;
		        }else if(a[i]>a[i-1]){
		            if(a[i]-a[i-1]<=u){
		                index++;
		            }else{
		                break;
		            }
		        }else if(a[i]<a[i-1]){
		            if(a[i-1]-a[i]<=d){
		                index++;
		            }else if(para){
		                index++;
		                para = false;
		            }else{
		                break;
		            }
		        }
		    }
		    System.out.println(index);
		}

	}
}
