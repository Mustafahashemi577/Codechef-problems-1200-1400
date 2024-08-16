import java.util.*;
import java.lang.*;
import java.io.*;

class Truth_And_Dare
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    boolean result = true;
		    int tr = scan.nextInt();
		    List <Integer> trlist = new ArrayList<>();
		    for(int i = 0;i<tr;i++) trlist.add(scan.nextInt());
		    int dr = scan.nextInt();
		    List <Integer> drlist = new ArrayList<>();
		    for(int i = 0;i<dr;i++) drlist.add(scan.nextInt());
		    int ts = scan.nextInt();
		    int trs [] = new int [ts];
		    for(int i = 0;i<ts;i++) trs[i]= scan.nextInt();
		    int ds = scan.nextInt();
		    int das [] = new int [ds];
		    for(int i = 0;i<ds;i++) das[i]=scan.nextInt();
		    
		    for(int i = 0;i<ts;i++){
		        if(!trlist.contains(trs[i])){
		            result = false;
		            break;
		        }
		    }
		    for(int i = 0;i<ds;i++){
		        if(!drlist.contains(das[i])){
		            result=false;
		            break;
		        }
		    }
		    System.out.println(result==true?"yes":"no");
		    
		}
	}
}
