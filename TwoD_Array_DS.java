package Arrays;
import java.io.*;
import java.util.*;
/**
 * Created by bvpham on 6/5/2017.
 */
public class TwoD_Array_DS {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[][] arr = new int[6][6];

        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        int[] count = new int[4*4];

        int x = 0;
        for(int i = 0; i<4; i++){
            for(int j =0; j<4; j++){
                try {
                    count[x] = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                    x++;
                } catch (Exception e) {
                }
            }
        }

        Arrays.sort(count);
        System.out.print(count[count.length-1]);
    }
            }

