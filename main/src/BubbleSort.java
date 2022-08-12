import java.util.*;

public class BubbleSort {

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

    static void bubbleSort(int[] arr1) {
        int sortOder = sortOrderType();

        int n = arr1.length;
        int temp = 0;
        if (sortOder == 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if (arr1[j - 1] > arr1[j]) {
                        // swap elements
                        temp = arr1[j - 1];
                        arr1[j - 1] = arr1[j];
                        arr1[j] = temp;
                    }

                }
            }
        }
        if (sortOder == 2) {
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if (arr1[j - 1] < arr1[j]) {
                        // swap elements
                        temp = arr1[j - 1];
                        arr1[j - 1] = arr1[j];
                        arr1[j] = temp;
                    }

                }
            }
        }

    }

    public static void main(String[] args) {
        // Get list of array from users
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Elements you want Sort");
        n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the Elements you want Sort");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println();

        bubbleSort(arr1);// sorting array elements using bubble sort

        System.out.println("List of Items After using Bubble Sort");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

    }

}
