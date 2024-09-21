import java.util.*;

public class Andrew_And_The_Meatballs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long m = scan.nextLong();
            long [] p = new long[n];
            for (int i = 0; i < n; i++) {
                p[i] = scan.nextLong();
            }
            boolean result = false;
            Arrays.sort(p);
            long sum = 0;
            long count = 0L;
            for(int i = n-1;i>=0;i--){
                sum+=p[i];
                count++;
                if(sum>=m){
                    result = true;
                    break;
                }
            }
            System.out.println(result==true?count:-1);
        }
    }
}
