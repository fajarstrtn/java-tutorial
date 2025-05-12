
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceComparison {

    private static final int DATA_SIZE = 100_000;

    public static void main(String[] args) {
        List<Integer> list;
        long start;
        long end;

        // Declaring list as an ArrayList.
        list = new ArrayList<>();

        start = System.nanoTime();
        for (var i = 0; i < DATA_SIZE; ++i) {
            list.add(i);
        }
        end = System.nanoTime();
        System.out.println("Write (ms) with ArrayList: " + ((end - start) / 1_000_000.0) + " ms");

        start = System.nanoTime();
        for (var i = 0; i < DATA_SIZE; ++i) {
            int val = list.get(i);
        }
        end = System.nanoTime();
        System.out.println("Read (ms) with ArrayList: " + ((end - start) / 1_000_000.0) + " ms");

        // Then declaring list as LinkedList.
        list = new LinkedList<>();

        start = System.nanoTime();
        for (var i = 1; i < DATA_SIZE; ++i) {
            list.add(i);
        }
        end = System.nanoTime();
        System.out.println("Write (ms) with LinkedList: " + ((end - start) / 1_000_000.0) + " ms");

        start = System.nanoTime();
        for (var i = 0; i < DATA_SIZE; ++i) {
            int val = list.get(i);
        }
        end = System.nanoTime();
        System.out.println("Read (ms) with LinkedList: " + ((end - start) / 1_000_000.0) + " ms");
    }

}
