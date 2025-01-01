import java.util.*;

public class RacingHorses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long[] s = new long[n];
            for (int i = 0; i < n; i++) {
                s[i] = scanner.nextLong();
            }
            Arrays.sort(s);
            long diff = Long.MAX_VALUE;
            for(int i = 1;i<n;i++){
                long temp = s[i]-s[i-1];
                if(temp<diff)
                diff=temp;
            }
            System.out.println(diff);
        }
    }
}

