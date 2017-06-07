package Arrays;
import java.io.*;
import java.util.*;

/**
 * Created by bvpham on 6/7/2017.
 */
public class LeftRotation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int d = scan.nextInt();
        int[] array = new int[n];
        for(int i =0; i<n; i++){
            array[(i+n-d)%n] = scan.nextInt();
        }
        for(int i =0; i < n; i++){
            System.out.print(array[i] + " ");
        }

    }
}
