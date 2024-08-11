import java.util.*;
import java.lang.*;
import java.io.*;

class Weapon_Choice
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int h = scan.nextInt();
		    int x = scan.nextInt();
		    int y1=scan.nextInt();
		    int y2 = scan.nextInt();
		    int k = scan.nextInt();
		    int gun = (h%x==0? h/x : (h/x)+1);
		    int laser = 0;
		    if(h<=y1*k){
		        if(h%y1==0)
		        laser=h/y1;
		        else
		        laser=(h/y1)+1;
		    }
		    else{
		        laser = k;
		        h-=y1*k;
		        if(h%y2==0)
		        laser+=h/y2;
		        else
		        laser+=(h/y2)+1;
		    }
		    System.out.println(Math.min(gun,laser));
		}

	}
}
