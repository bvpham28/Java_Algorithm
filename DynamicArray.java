package Arrays;
import java.io.*;
import java.util.*;

/**
 * Created by bvpham on 6/6/2017.
 */
public class DynamicArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int q = scan.nextInt();
        int lastAns = 0;

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lists.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < q; i++){
            int q1 = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            ArrayList<Integer> seq = lists.get((x ^ lastAns) % n);
            if (q1 == 1){
                seq.add(y);
            } else if (q1 == 2){
                lastAns = seq.get(y % seq.size());
                System.out.println(lastAns);
            }
        }

        scan.close();
    }
}
