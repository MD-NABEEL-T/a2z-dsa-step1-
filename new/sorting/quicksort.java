import java.util.Arrays;

public class quicksort {

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int quickie(int arr[], int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[low];

        while (i < j) {
            // Move i right while elements are <= pivot
            while (arr[i] <= pivot && i < high) {
                i++;
            }
            // Move j left while elements are > pivot
            while (arr[j] > pivot && j > low) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        // Swap the pivot element into its final sorted index (j)
        swap(arr, low, j);
        return j;
    }

    static void quickSorting(int arr[], int low, int high) {
        if (low < high) {
            int partitionIndex = quickie(arr, low, high);
            quickSorting(arr, low, partitionIndex - 1);
            quickSorting(arr, partitionIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 1, 5, 3};
        quickSorting(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr)); // Output: [1, 1, 2, 3, 4, 5]
    }
}
