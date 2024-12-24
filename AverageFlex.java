import java.util.*;
import java.lang.*;
import java.io.*;
class AverageFlex
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    while(T!=0){
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        int count = 0;
	        for(int i =0; i<n; i++){
	            arr[i] = sc.nextInt();
	        }
	        for(int i =0; i<n; i++){
	            if(solve(arr[i], arr)){
	                count++;
	            }
	        }
	        System.out.println(count);
	        T--;
	    }
		
	}
	public static boolean solve(int a, int A[]){
        int l=0, r=0;
        for(int i=0;i<A.length;i++){
            if(A[i]<=a){
                l++;
            }else{
                r++;
            }
        }
        if(l>r){
            return true;
        }else{
            return false;
        }
    }
}

