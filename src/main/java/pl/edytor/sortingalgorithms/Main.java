package pl.edytor.sortingalgorithms;


import java.util.Random;

public class Main {
    static Random random;
    static InsertSort insertSort = new InsertSort();
    static BubbleSort bubbleSort = new BubbleSort();
    static HeapSort heapSort = new HeapSort();
    static QuickSort quickSort = new QuickSort();

    public static void main(String[] args) {
        int[] table1 = createAndFillTable(100);
        int[] table2 = createAndFillTable(500);
        int[] table3 = createAndFillTable(1000);
        int[] table4 = createAndFillTable(3000);
        int[] table5 = createAndFillTable(5000);
        int[] table6 = createAndFillTable(10000);
        int[] table7 = createAndFillTable(20000);
        int[] table8 = createAndFillTable(50000);
        int[] table9 = createAndFillTable(70000);
        int[] table10 = createAndFillTable(100000);

        System.out.println("QuickSort: ");
        measureTimeForQuickSort(table1);
        measureTimeForQuickSort(table2);
        measureTimeForQuickSort(table3);
        measureTimeForQuickSort(table4);
        measureTimeForQuickSort(table5);
        measureTimeForQuickSort(table6);
        measureTimeForQuickSort(table7);
        measureTimeForQuickSort(table8);
        measureTimeForQuickSort(table9);
        measureTimeForQuickSort(table10);

//        System.out.println("HeapSort: ");
//        measureTimeForHeapSort(table1);
//        measureTimeForHeapSort(table2);
//        measureTimeForHeapSort(table3);
//        measureTimeForHeapSort(table4);
//        measureTimeForHeapSort(table5);
//        measureTimeForHeapSort(table6);
//        measureTimeForHeapSort(table7);
//        measureTimeForHeapSort(table8);
//        measureTimeForHeapSort(table9);
//        measureTimeForHeapSort(table10);
//
//        System.out.println("BubbleSort: ");
//        measureTimeForBubbleSort(table1);
//        measureTimeForQuickSort(table2);
//        measureTimeForBubbleSort(table3);
//        measureTimeForBubbleSort(table4);
//        measureTimeForBubbleSort(table5);
//        measureTimeForBubbleSort(table6);
//        measureTimeForBubbleSort(table7);
//        measureTimeForBubbleSort(table8);
//        measureTimeForBubbleSort(table9);
//        measureTimeForBubbleSort(table10);
//
//        System.out.println("InsertSort: ");
//        measureTimeForInsertSort(table1);
//        measureTimeForInsertSort(table2);
//        measureTimeForInsertSort(table3);
//        measureTimeForInsertSort(table4);
//        measureTimeForInsertSort(table5);
//        measureTimeForInsertSort(table6);
//        measureTimeForInsertSort(table7);
//        measureTimeForInsertSort(table8);
//        measureTimeForInsertSort(table9);
//        measureTimeForInsertSort(table10);

    }
    public static int[] createAndFillTable(int size) {
        random = new Random();
        int[] table = new int[size];
        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(10000);
        }
        return table;
    }
    public static void measureTimeForInsertSort(int[] table) {
        long start = System.currentTimeMillis();
        insertSort.sort(table);
        long stop = System.currentTimeMillis();
        long time = stop - start;
        System.out.println("InsertSort =  " + time);
    }
    public static void measureTimeForBubbleSort(int[] table) {
        long start = System.currentTimeMillis();
        bubbleSort.sort(table);
        long stop = System.currentTimeMillis();
        long time = stop - start;
        System.out.println("BubbleSort =  " + time);
    }
    public static void measureTimeForHeapSort(int[] table) {
        long start = System.currentTimeMillis();
        heapSort.sort(table);
        long stop = System.currentTimeMillis();
        long time = stop - start;
        System.out.println("HeapSort = " + time);
    }
    public static void measureTimeForQuickSort(int[] table) {
        long start = System.currentTimeMillis();
        quickSort.sort(table);
        long stop = System.currentTimeMillis();
        long time = stop - start;
        System.out.println("QuickSort = " + time);
    }
}
