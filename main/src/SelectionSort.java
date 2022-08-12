import java.util.*;

public class SelectionSort {

    private static int user_input;

    public static int sortOrderType() {
        System.out.println("Choose an order you want you numbers to be sorted");
        System.out.print("1. Ascending Order\n2. Descending Order\n");
        Scanner sc = new Scanner(System.in);
        boolean validInput = true;
        try {
            user_input = sc.nextInt();
        } catch (Exception e) {
            System.out.println("invalid Input.... Try again");
            validInput = false;
        }
        if (!validInput) {
            sortOrderType();
        }
        return user_input;
    }

    public static void selectionSort(int[] arr1) {

        int sortOrder = sortOrderType();

        if (sortOrder == 1) {
            for (int i = 0; i < arr1.length - 1; i++) {
                int index = i;
                for (int j = i + 1; j < arr1.length; j++) {
                    if (arr1[j] < arr1[index]) {
                        index = j;// searching for lowest index
                    }
                }
                int minNumber = arr1[index];
                arr1[index] = arr1[i];
                arr1[i] = minNumber;

            }
        }

        if (sortOrder == 2) {
            for (int i = 0; i < arr1.length - 1; i++) {
                int index = i;
                for (int j = i + 1; j < arr1.length; j++) {
                    if (arr1[j] > arr1[index]) {
                        index = j;// searching for lowest index
                    }
                }
                int minNumber = arr1[index];
                arr1[index] = arr1[i];
                arr1[i] = minNumber;

            }
        }

    }

    public static void main(String a[]) {
        // Get list of array from users
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Elements you want Sort");
        n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the Elements you want Sort");

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println();

        selectionSort(arr1);
        // sorting array using selection sort
        System.out.println("Your Elements After using Selection Sort");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
     }

}