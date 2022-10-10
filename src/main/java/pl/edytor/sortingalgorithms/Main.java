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
            insertSorting(table[i]);
        }
        for (int i = 0; i < 10; i++) {
            bubbleSorting(table[i]);
        }
        for (int i = 0; i < 10; i++) {
            heapSorting(table[i]);
        }
        for (int i = 0; i < 10; i++) {
            quickSorting(table[i]);
        }
}
       public static void insertSorting(int capacity) {
        long sum = 0;
           for (int i = 1; i < 4; i++) {
                int [] table = createAndFillTable(capacity);
                long start = System.currentTimeMillis();
                insertSort.sort(table);
                long stop = System.currentTimeMillis();
                long time = stop - start;
                System.out.println("InsertSort with a capacity of "+ capacity + ", " + i + " try: " + time);
                sum += time;
            }
           long average = sum/3;
           System.out.println("The average is " + average);
           System.out.println("***************************");
        }
    public static void bubbleSorting(int capacity) {
        long sum = 0;
        for (int i = 1; i < 4; i++) {
            int [] table = createAndFillTable(capacity);
            long start = System.currentTimeMillis();
            bubbleSort.sort(table);
            long stop = System.currentTimeMillis();
            long time = stop - start;
            System.out.println("BubbleSort with a capacity of "+ capacity + ", " + i + " try: " + time);
            sum += time;
        }
        long average = sum/3;
        System.out.println("The average is " + average);
        System.out.println("***************************");
    }
    public static void heapSorting(int capacity) {
        long sum = 0;
        for (int i = 1; i < 4; i++) {
            int [] table = createAndFillTable(capacity);
            long start = System.currentTimeMillis();
            heapSort.sort(table);
            long stop = System.currentTimeMillis();
            long time = stop - start;
            System.out.println("HeapSort with a capacity of "+ capacity + ", " + i + " try: " + time);
            sum += time;
        }
        long average = sum/3;
        System.out.println("The average is " + average);
        System.out.println("***************************");
    }
    public static void quickSorting(int capacity) {
        long sum = 0;
        for (int i = 1; i < 4; i++) {
            int [] table = createAndFillTable(capacity);
            long start = System.currentTimeMillis();
            quickSort.sort(table);
            long stop = System.currentTimeMillis();
            long time = stop - start;
            System.out.println("QuickSort with a capacity of "+ capacity + ", " + i + " try: " + time);
            sum += time;
        }
        long average = sum/3;
        System.out.println("The average is " + average);
        System.out.println("***************************");
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
