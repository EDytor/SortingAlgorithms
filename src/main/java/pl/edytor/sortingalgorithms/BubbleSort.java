package pl.edytor.sortingalgorithms;


public class BubbleSort implements Sorting {

    @Override
    public void sort(int[] table) {
        boolean swapped;
        int n = table.length - 1;
        for (int j = 0; j < table.length; j++) {
            swapped = false;
            for (int i = 0; i < n; i++) {
                if (table[i] > table[i + 1]) {
                    swap(table, i, i + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            n--;
        }
    }

    private void swap(int[] table, int index1, int index2) {
        int temporary = table[index1];
        table[index1] = table[index2];
        table[index2] = temporary;
    }

    @Override
    public String toString() {
        return "Bubble Sort";
    }
}
