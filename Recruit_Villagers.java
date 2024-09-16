import java.util.*;
import java.lang.*;
import java.io.*;

class Recruit_Villagers
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		int numberOfHouses = scan.nextInt();
	    long totalAbove = 0L;
	    long totalBelow = 0L;
	    int m = scan.nextInt();
	    int c = scan.nextInt();
	    for(int i = 0;i<numberOfHouses;i++){
	        int x = scan.nextInt();
	        int y = scan.nextInt();
	        int p = scan.nextInt();
	        if((m*x)+c>y)
	            totalAbove+=p;
	        else 
	            totalBelow+=p;
	    }
        System.out.println(Math.max(totalBelow,totalAbove));
	}
}
