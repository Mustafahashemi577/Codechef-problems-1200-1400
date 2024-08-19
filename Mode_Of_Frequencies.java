import java.util.*;
import java.lang.*;
import java.io.*;

class Mode_Of_Frequencies
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    Map <Integer, Integer> list = new HashMap<>();
		    for(int i =0;i<n;i++){
		        int temp=scan.nextInt();
		        list.put(temp,list.getOrDefault(temp, 0)+1);
		    }
		    Map<Integer,Integer> map2 = new TreeMap<>();
		    for( int key : list.keySet() ){
		        map2.put( list.get( key ) , map2.getOrDefault( list.get(key) , 0 ) + 1 );
		    }
		    int max = Collections.max( map2.values() );
		    int ans = 0;
		    for( int key : map2.keySet() ){
		        if( map2.get( key ) == max ){
		            ans = key;
		            break;
		        }
		    }
		    System.out.println( ans );
		}
	}
}
