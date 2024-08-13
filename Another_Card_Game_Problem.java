import java.util.*;
import java.lang.*;
import java.io.*;

class Another_Card_Game_Problem
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int Pc = scan.nextInt();
		    int Pr = scan.nextInt();
		    
		    int digitC = Pc/9;
		    int digitR = Pr/9;
		    if(digitC == digitR)
		        System.out.println(1 + " " + (Pc%9 == 0 ? digitC : digitC+1));
		    else if(digitC > digitR){
		        System.out.println(1 + " " + (Pr%9 == 0 ? digitR : digitR+1));
		    }else if(digitC < digitR){
		        System.out.println(0 + " " + (Pc%9 == 0 ? digitC : digitC+1));
		    }
		}

	}
}
