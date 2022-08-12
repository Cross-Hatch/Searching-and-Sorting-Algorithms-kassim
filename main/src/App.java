import java.util.Arrays;
class App {
    static void playAgain()
    {
        main(null);
    }
    public static void main(String[] args){    
        int chooseType = methods_used.userOption();
        int[] arr = methods_used.userNumbers();
        switch(chooseType){
            case 1:
                int output = methods_used.linearSearch(arr, methods_used.searchItem());
                if(output == -1)
                {
                    System.out.println("Sorry!! The Search item is not present");
                }
                else
                {
                    System.out.println("The Search item is present at index " + output);
                }
                break;
            case 2:
                methods_used.binarySearch(arr, arr[0], arr.length-1, methods_used.searchItem());
                break;
            case 3:
                methods_used.bubbleSort(arr);
                break;

            case 4:
                methods_used.selectionSort(arr);
                break;
            case 5:
                methods_used.Insertion_sort(arr);
                break;
            case 6:
                methods_used.shellShort(arr);
                break;
            case 7:
                methods_used.Quick_Sort.quickSort(arr, 0, arr.length - 1);

                System.out.println("Sorted Array in Ascending Order ");
                System.out.println(Arrays.toString(arr));
                break;
            case 8:
                break;
            
            default:
                System.out.println("invalid Input!!");
                playAgain();
        }
        
    }
    
    
}

