package pl.edytor.sortingalgorithms;

import java.util.Random;

public class Main {
    static Random random;
    static InsertSort insertSort = new InsertSort();
    static BubbleSort bubbleSort = new BubbleSort();
    static HeapSort heapSort = new HeapSort();
    static QuickSort quickSort = new QuickSort();

    public static void main(String[] args) {
        int[] table = {100, 500, 1000, 3000, 5000, 10000, 20000, 50000, 70000, 100000};
        for (int i = 0; i < 10; i++) {
            sort(table[i], insertSort);
            sort(table[i], bubbleSort);
            sort(table[i], heapSort);
            sort(table[i], quickSort);
        }
    }
public static void sort(int capacity, Sorting sorting) {
        String sortingMethod = "Unknown";
        if (sorting instanceof BubbleSort) {
            sortingMethod = "Bubble Sort";
        } else if (sorting instanceof InsertSort) {
            sortingMethod = "Insert Sort";
        } else if ( sorting instanceof HeapSort) {
            sortingMethod = "Heap Sort";
        } else if (sorting instanceof QuickSort) {
            sortingMethod = "Quick Sort";
        }
        long sum = 0;
        for (int i = 1; i < 4; i++) {
            int [] table = createAndFillTable(capacity);
            long start = System.currentTimeMillis();
            sorting.sort(table);
            long stop = System.currentTimeMillis();
            long time = stop - start;
            System.out.println(sortingMethod + ", capacity = "+ capacity + ", " + i + " try: " + time);
            sum += time;
        }
        long average = sum/3;
        System.out.println("The average is " + average);
        System.out.println("********************************************");
    }

    public static int[] createAndFillTable(int size) {
        random = new Random();
        int[] table = new int[size];
        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(10000);
        }
        return table;
    }
}
