import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Party
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
           int n = scan.nextInt();
           int a[] = new int[n];
           for(int j=0;j<n;j++){
                a[j]=scan.nextInt();
           }
           int count=0;
           Arrays.sort(a);
           for(int i=0;i<n;i++){
             if(count>=a[i])
             {
                count++;
             }
             else{
                break;
             }
           }
        System.out.println(count);
        }
            
	}
}
