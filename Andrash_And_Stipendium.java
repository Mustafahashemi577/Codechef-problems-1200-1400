import java.util.*;
import java.lang.*;
import java.io.*;

class Andrash_And_Stipendium
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    boolean flag = true;
		    boolean fullScores = false;
		    List <Integer> list = new ArrayList<>();
		    long sum = 0;
		    for(int i = 0;i<n;i++){
		        int temp = scan.nextInt();
		        list.add(temp);
		        sum+=temp;
		    }
		    if(list.contains(2))
		        flag = false;
		    if(list.contains(5))
		        fullScores=true;
		    double ave=(double)sum/(float)n;
		    System.out.println(flag && fullScores && ave>=4.0?"Yes":"No");
		}
	}
}
