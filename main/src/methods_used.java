import java.util.Scanner;
//----------Display and accept user preferred Option--------
class methods_used {
    private static int user_input;

    public static int userOption() {
        System.out.println("WELCOME TO OUR SEARCHING AND SORTING PROGRAM");
        System.out.println("============================================");
        System.out.println("Rule of the program:");
        System.out.println("1. SELECT THE TYPE OF ALGORITHM ");
        System.out.println("2. ENTER THE VALUES TO BE USED");
        System.out.println("3.FOR THE PROGRAM TO DETECT YOU'RE ");
        System.out.println("============================================");
        System.out.println("Select the type of Algorithm to be used");
        System.out.print("1. Linear Search Algorithm\n2. Binary Search Algorithm\n3. Bubble Sort Algorithm\n");
        System.out.print("4. Selection Sort  Algorithm\n5. Insertion Sort Algorithm\n6. Shell Sort Algorithm\n");
        System.out.print("7. Quick Sort Algorithm\n\n8. Quit\n");
        
        //Accept user Option
        System.out.println("Choose your Preferred Algorithm (1 to 7)");
        Scanner option_chosen = new Scanner(System.in);
        int value = option_chosen.nextInt();
        boolean validInput = true;
        try {
            if(value <9){
                user_input = value;
            }
            else{
                validInput = false;
            }
        } catch (Exception e) {
            System.out.println("invalid Input.... Try again");
            validInput = false;
        }
        if(!validInput){
            userOption();
        }
        return user_input;
    }
    //------ User choose either output should be in Ascending order or descending Order------
    public static int sortOrderType() {
        System.out.println("Choose an order you want you numbers to be sorted");
        System.out.print("1. Ascending Order\n2. Descending Order\n");
        Scanner order = new Scanner(System.in); 
        boolean validInput = true;
        try {
            user_input = order.nextInt();
        } catch (Exception e) {
            System.out.println("invalid Input.... Try again");
            validInput = false;
        }
        if(!validInput){
            sortOrderType();
        }
        
        return user_input;
    }

    //-----------
    public static void Insertion_sort( int[] numArray) {
        int a;
        int tempHolder;
        int sortOrder = sortOrderType();
        switch(sortOrder){
            case 1:
                for(int index=1; index<numArray.length; index++){
                    a = index -1;
                    tempHolder = numArray[index];
                    while(a>=0 && numArray[a] > tempHolder){
                        numArray[a+1] = numArray[a];
                        a--;
    
                    }
                    numArray[a+1] = tempHolder;
                }
                System.out.println("......Sorted Array in Ascending Order......");
                System.out.print('[');
                for(int index=0; index<numArray.length;index++){
                    System.out.print(numArray[index]+" ");
                }
                System.out.print(']');
                break;
            case 2:
                for(int index=1; index<numArray.length; index++){
                    a = index -1;
                    tempHolder = numArray[index];
                    while(a>=0 && numArray[a] < tempHolder){
                        numArray[a+1] = numArray[a];
                        a--;
                    }
                    numArray[a+1] = tempHolder;
                }
                System.out.println("........Sorted Array in Descending order........ ");
                System.out.print("[");
                for(int index=0; index<numArray.length;index++){
                    System.out.print(numArray[index]+" ");
                }
                System.out.print("]");
                break;
            default:
                System.out.println("Invalid input");
        }
        
    }
    public static int[] userNumbers() {
        int n;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the Size of the Elements you want Sort");
        int number=num.nextInt();
        int[] arr = new int[number];
        System.out.println("Enter the Elements you want Sort");
              
        for(int i= 0; i<arr.length; i++){ 
            arr[i] =num.nextInt();  
        }
        return arr;
      }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int minNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = minNumber;  
        } 
        System.out.println("Your Elements After using Selection Sort");  
        for(int i:arr){  
        System.out.print(i+" ");  
        }  
    }


    public static int searchItem() {
        System.out.println("Enter the search value:");
        Scanner sc = new Scanner(System.in);
        int search_item = sc.nextInt();
        return search_item;
    }

    public static int linearSearch(int[] numArray, int search_item) {
        int num = numArray.length;
      for(int a = 0; a < num; a++)
      {
         // here we are returning the index of the element if found
         if(numArray[a] == search_item)
            return a;
      }
      
      return -1;
         
   }

   class Quick_Sort {

    static int partition(int array[], int low, int high) {
      
      int pivot = array[high];
      
      int i = (low - 1);
  
      for (int j = low; j < high; j++) {
        if (array[j] <= pivot) {
  
          i++;
  
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
  
      }
  
      int temp = array[i + 1];
      array[i + 1] = array[high];
      array[high] = temp;
  
      return (i + 1);
    }
  
    static void quickSort(int array[], int low, int high) {
      if (low < high) {
  
        int pi = partition(array, low, high);
  
        quickSort(array, low, pi - 1);
  
        quickSort(array, pi + 1, high);
      }
    }
  }

  static void bubbleSort(int[] arr) {  
    int n = arr.length;  
    int temp = 0;  
    for(int i=0; i < n; i++){  
        for(int j=1; j < (n-i); j++){  
            if(arr[j-1] > arr[j]){  
                 //swap elements  
                 temp = arr[j-1];  
                 arr[j-1] = arr[j];  
                 arr[j] = temp;  
             }  
                      
         }  
    }
    System.out.println("Array After Bubble Sort");  
              for(int i=0; i < arr.length; i++){  
                      System.out.print(arr[i] + " ");  
              }

  }
  public static void merge(int arr1[], int beg, int mid, int end) {
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

public static void sort(int arr1[], int beg, int end) {
    if (beg < end) {
        int mid = (beg + end) / 2;
        sort(arr1, beg, mid);
        sort(arr1, mid + 1, end);
        merge(arr1, beg, mid, end);
    }
}
  


    public static void binarySearch(int arr[], int first, int last, int key){  
        int mid = (first + last)/2;  
        while( first <= last ){  
           if ( arr[mid] < key ){  
             first = mid + 1;     
           }else if ( arr[mid] == key ){  
             System.out.println("Element is found at index: " + mid);  
             break;  
           }else{  
              last = mid - 1;  
           }  
           mid = (first + last)/2;  
        }  
        if ( first > last ){  
           System.out.println("Element is not found!");  
        }}  

        public static void shellShort(int[] arrNumber){
            int n = arrNumber.length;
            for (int gap = n/2; gap > 0; gap /= 2)
            {         
                for (int a = gap; a < n; a += 1)
                {              
                    int temp_holder = arrNumber[a];               
                    int b;
                    for (b = a; b >= gap && arrNumber[b - gap] > temp_holder; b -= gap)
                        arrNumber[b] = arrNumber[b - gap];
                    arrNumber[b] = temp_holder;
                }
                 
            }
            System.out.println("Array After Shell Sort");  
                for(int i=0; i < arrNumber.length; i++){  
                        System.out.print(arrNumber[i] + " ");  
                } 
      }

      

}


