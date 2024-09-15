import java.util.*;
class Chef_And_Salary_Pay
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while (t-->0){
            int x = scan.nextInt();
            int y = scan.nextInt();
            String s = scan.next();
            int max = 0;
            int second = 0;
            int totalSalary = 0;
            for(int i = 0;i<30;i++){
                if(s.charAt(i)=='1'){
                    second++;
                    totalSalary+=x;
                    max = Math.max(second,max);
                }
                else{
                    second=0;
                }
            }
            System.out.println(totalSalary+(max*y));
        } 
    }
}
