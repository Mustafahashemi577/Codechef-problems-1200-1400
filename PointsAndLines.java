import java.util.*;
import java.lang.*;
import java.io.*;

class PointsAndLines
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    Map<Integer,Integer> mapx = new HashMap<>();
		    Map<Integer,Integer> mapy = new HashMap<>();
		    for(int i = 0;i<n;i++){
		        int tempx = scan.nextInt();
		        int tempy = scan.nextInt();
		        mapx.put(tempx,mapx.getOrDefault(tempx,0)+1);
		        mapy.put(tempy,mapy.getOrDefault(tempy,0)+1);
		    }
		    System.out.println(mapx.size()+mapy.size());
		    
		}

	}
}

