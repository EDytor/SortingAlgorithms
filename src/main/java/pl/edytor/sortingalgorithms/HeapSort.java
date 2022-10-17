package pl.edytor.sortingalgorithms;

public class HeapSort implements Sorting {

    @Override
    public void sort(int[] table) {
        int size = table.length;
        for (int i = size / 2 - 1; i >= 0; i--) {
            sortHeap(table, size, i);
        }
        for (int j = size - 1; j > 0; j--) {
            swap(table, 0, j);
            size--;
            sortHeap(table, size, 0);
        }
    }

    private void sortHeap(int[] table, int heapSize, int parentIndex) {
        int maxIndex = parentIndex;
        int left = parentIndex * 2 + 1;
        int right = parentIndex * 2 + 2;

        if (left < heapSize && table[left] > table[maxIndex]) {
            maxIndex = left;
        }
        if (right < heapSize && table[right] > table[maxIndex]) {
            maxIndex = right;
        }
        if (maxIndex != parentIndex) {
            swap(table, maxIndex, parentIndex);
            sortHeap(table, heapSize, maxIndex);
        }
    }

    private void swap(int[] table, int index1, int index2) {
        int temporary = table[index1];
        table[index1] = table[index2];
        table[index2] = temporary;
    }

    @Override
    public String toString() {
        return "Heap Sort";
    }
}
