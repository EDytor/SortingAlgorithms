package pl.edytor.sortingalgorithms;

public class InsertSort implements Sorting {

    @Override
    public void sort(int[] table) {
        int lastIndexOfNewTable = 0;
        int indexOfAddedElement = 1;
        int size = table.length;
        int[] newTable = new int[size];
        newTable[0] = table[0];
        while (indexOfAddedElement < size) {
            if (table[indexOfAddedElement] > newTable[lastIndexOfNewTable]) {
                newTable[lastIndexOfNewTable + 1] = table[indexOfAddedElement];
                lastIndexOfNewTable++;
                indexOfAddedElement++;
            } else {
                int index = 0;
                for (int i = lastIndexOfNewTable; i >= 0; ) {
                    if (newTable[i] > table[indexOfAddedElement]) {
                        if (i == 0) {
                            break;
                        } else {
                            i--;
                        }
                    } else {
                        index = i+1;
                        break;
                    }
                }
                for (int j = lastIndexOfNewTable; ; ) {
                    newTable[j + 1] = newTable[j];
                    if (j > index) {
                        j--;
                    } else {
                        break;
                    }
                }
                    newTable[index] = table[indexOfAddedElement];

                indexOfAddedElement++;
                lastIndexOfNewTable++;
            }
        }
    }
}