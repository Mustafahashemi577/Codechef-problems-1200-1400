import java.util.*;
import java.lang.*;
import java.io.*;
class Your_Name_Is_Mine
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    String m = scan.next();
		    String w = scan.next();
		    int l1 = m.length();
		    int l2 = w.length();
		    
		    int max = Math.max(l1, l2);
		    boolean canMarry = true;
		    
		    if(m.equals(w)){
		        System.out.println("YES");
		    }else{
		        
		        if(max == l1){
    		        int lastIndex = 0;
    		        for(int i=0; i<l2; i++){
    		            char ch = w.charAt(i);
    		            int index = m.indexOf(ch, lastIndex);
    		            if(index == -1){
    		                canMarry = false;
    		                break;
    		            }else{
    		                lastIndex = index+1;
    		            }
    		        }
    		    }else{
    		        int lastIndex = 0;
    		        for(int i=0; i<l1; i++){
    		            char ch = m.charAt(i);
    		            int index = w.indexOf(ch, lastIndex);
    		            if(index == -1){
    		                canMarry = false;
    		                break;
    		            }else{
    		                lastIndex = index+1;
    		            }
    		        }
    		    }
    		    if(canMarry)
    		        System.out.println("YES");
    		    else
    		        System.out.println("NO");
		    }
		}
	}
}
