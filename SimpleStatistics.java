import java.util.*;

public class SimpleStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            double[] a = new double[n];
            double sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                sum+=a[i];
            }
            Arrays.sort(a);
            for(int i = 0;i<k;i++){
                sum-=a[i];
                sum-=a[n-1-i];
            }
            System.out.println((double)sum/(n-2*k));
        }
    }
}

