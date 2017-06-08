package Arrays;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by bvpham on 6/8/2017.
 */
public class Sparse_Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> strings = IntStream.range(0, in.nextInt()).mapToObj(i -> in.next()).collect(Collectors.toList());
        IntStream.range(0, in.nextInt()).mapToObj(i -> in.next()).mapToLong(q -> strings.stream().filter(q::equals).count()).forEach(System.out::println);
    }
}