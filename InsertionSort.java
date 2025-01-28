public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Insertion Sort!!!");

        for (int i = 1; i < input.length; i++) {
            int key = input[i];
            int j = i - 1;

            // Shift elements of the sorted portion that are greater than the key
            while (j >= 0 && input[j] > key) {
                input[j + 1] = input[j];
                j--;
            }

            // Insert the key at the correct position
            input[j + 1] = key;
        }
    }
}

