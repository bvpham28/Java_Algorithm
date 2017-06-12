package Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Created by bvpham on 6/10/2017.
 */
public class AlgorithmicCrush {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int M = s.nextInt();
        //int[] operations = new int[N + 1];
        List<Long>[] operations = new List[N + 1];
        while (s.hasNextInt()) {
            int from = s.nextInt();
            int to = s.nextInt();
            long sum = s.nextLong();
            addOperation(operations, from, to, sum);
        }
        System.out.println(copmileOperations(operations));
    }

    private static long copmileOperations(List<Long>[] operations) {
        long crawler = 0;
        long max = Integer.MIN_VALUE;
        for (List<Long> ops : operations) {
            if (null == ops) {
                continue;
            }
            for (Long op : ops) {
                crawler += op;
            }
            if (max < crawler) {
                max = crawler;
            }
        }
        return max;
    }

    private static void addOperation(List<Long>[] operations, int from, int to, long sum) {
        if (null == operations[from]) {
            operations[from] = new ArrayList<Long>();
        }
        operations[from].add(sum);

        to++;
        if (to >= operations.length) {
            return;
        }
        if (null == operations[to]) {
            operations[to] = new ArrayList<Long>();
        }
        operations[to].add(-sum);
    }
}