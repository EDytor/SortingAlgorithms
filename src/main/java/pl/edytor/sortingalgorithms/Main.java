package pl.edytor.sortingalgorithms;

import java.util.Random;

public class Main {
    Random random;
    final int repetitions = 3;

    public static void main(String[] args) {
        Main mainClass = new Main();

        InsertSort insertSort = new InsertSort();
        BubbleSort bubbleSort = new BubbleSort();
        HeapSort heapSort = new HeapSort();
        QuickSort quickSort = new QuickSort();

        int[] table = {100, 500, 1000, 3000, 5000, 10000, 20000, 50000, 70000, 100000};

        for (int j : table) {
            mainClass.sort(j, insertSort);
            mainClass.sort(j, bubbleSort);
            mainClass.sort(j, heapSort);
            mainClass.sort(j, quickSort);
        }
    }

    public void sort(int capacity, Sorting sorting) {
        long sum = 0;
        for (int i = 0; i < repetitions; i++) {
            int[] table = fulfilTable(capacity);
            long start = System.currentTimeMillis();
            sorting.sort(table);
            long stop = System.currentTimeMillis();
            long time = stop - start;
            System.out.println(sorting + ", capacity = " + capacity + ", " + (i + 1) + " try: " + time);
            sum += time;
        }
        long average = sum / 3;
        System.out.println("The average is " + average);
        System.out.println("********************************************");
    }

    public int[] fulfilTable(int size) {
        random = new Random();
        int[] table = new int[size];
        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(10000);
        }
        return table;
    }
}
