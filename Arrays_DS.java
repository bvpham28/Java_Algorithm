package Arrays;
import java.io.*;
import java.util.*;

/**
 * Created by bvpham on 6/4/2017.
 */
public class Arrays_DS {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < n; i++){
            list.add(scan.nextInt());
        }

        Collections.reverse(list);
        System.out.println(list.toString().replace("[","").replace("]","").replace(",",""));

    }


}
