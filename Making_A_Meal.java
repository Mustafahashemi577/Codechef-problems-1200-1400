import java.util.*;
import java.lang.*;
import java.io.*;

class Making_A_Meal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s[] = new String[n];
            Map<Character, Integer> list = new HashMap<>();

            for (int i = 0; i < n; i++) {
                s[i] = scan.next();
                char a[] = s[i].toCharArray();
                for (char c : a) {
                    list.put(c, list.getOrDefault(c, 0) + 1);
                }
            }
            list.put('c', list.getOrDefault('c', 0) / 2);
            list.put('e', list.getOrDefault('e', 0) / 2);
            char d[] = "codechef".toCharArray();
            long min = Long.MAX_VALUE;

            for (char c : d) {
                min = Math.min(min, list.getOrDefault(c, 0));
            }

            System.out.println(min);
        }

	}
}
