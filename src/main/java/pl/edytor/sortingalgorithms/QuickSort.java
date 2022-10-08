package pl.edytor.sortingalgorithms;


public class QuickSort implements Sorting {

    @Override
    public void sort(int[] table) {
        quickSort(0, table.length - 1, table);
    }

    private void swap(int[] table, int index1, int index2) {
        int temporary = table[index1];
        table[index1] = table[index2];
        table[index2] = temporary;
    }

    private boolean isBiggerThanPivot(int[] table, int value, int pivot) {
        return table[value] > pivot;
    }

    private void quickSort(int left, int right, int[] table) {
        int boarder = left;
        int pivotValue = table[right];
        for (int i = boarder; i < right; i++) {
            if (!isBiggerThanPivot(table, i, pivotValue)) {
                swap(table, boarder, i);
                boarder++;
            }
        }
        swap(table, boarder, right);
        if ((boarder) - left > 1) {
            quickSort(left, boarder - 1, table);
        }
        if ((right) - (boarder) > 1) {
            quickSort(boarder + 1, right, table);
        }
    }
}
