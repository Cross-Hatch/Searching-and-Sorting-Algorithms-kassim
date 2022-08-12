import java.util.*;

public class MergeSort {

    void merge(int arr1[], int beg, int mid, int end) {
        int l = mid - beg + 1;
        int r = end - mid;

        int LeftArray[] = new int[l];
        int RightArray[] = new int[r];

        for (int i = 0; i < l; ++i)
            LeftArray[i] = arr1[beg + i];

        for (int j = 0; j < r; ++j)
            RightArray[j] = arr1[mid + 1 + j];

        int i = 0, j = 0;
        int k = beg;
        while (i < l && j < r) {
            if (LeftArray[i] <= RightArray[j]) {
                arr1[k] = LeftArray[i];
                i++;
            } else {
                arr1[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i < l) {
            arr1[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j < r) {
            arr1[k] = RightArray[j];
            j++;
            k++;
        }
    }

    void sort(int arr1[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            sort(arr1, beg, mid);
            sort(arr1, mid + 1, end);
            merge(arr1, beg, mid, end);
        }
    }

    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Elements you want Sort");
        n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the Elements you want to sort: ");

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        MergeSort ob = new MergeSort();
        ob.sort(arr1, 0, arr1.length - 1);

        System.out.println("\nSorted array");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
