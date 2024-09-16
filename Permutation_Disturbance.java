import java.util.*;
import java.lang.*;
import java.io.*;

class Permutation_Disturbance
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    List <Integer> list = new ArrayList<>();
		    int count=0;
		    int adjacent = 0;
		    for(int i = 0;i<n;i++){
		        int temp =scan.nextInt();
		        if(temp==i+1)
		            list.add(i+1);
		    }
		    int previous = -1;
		    for(int i : list){
		        if(i-previous == 1){
		            adjacent++;
		            count--;
		            previous=-1;
		            continue;
		        }
		        else 
		        count++;
		        previous=i;
		    }
		   System.out.println(count+adjacent); 
		}
	}
}
