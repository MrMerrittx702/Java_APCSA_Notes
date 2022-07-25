
//Java
//Bubble sort 
/*
Run two loops(inner and outer)
Repeat steps till the outer loop is exhausted
If the current element in the inner loop is smaller than its next element, swap the values of the two elements. 
*/

class BubbleSort {
  public static void main(String[] args){
    int arr[] = {6,4,5,12,2,11,9};
    bubbleSort(arr, arr.length);
    printArray(arr);

  }

  static void bubbleSort(int arr[], int n){
    if (n == 1){
      return;
    } //passes are done

    for (int i =0; i<n-1; i++){//iteration through unsorted elements
      if (arr[i] > arr[i+1]){//check if the elements are in order
        int temp = arr[i];//if not swap them
        arr[i] =arr[i+1];
        arr[i+1] = temp;
      }
    }
    bubbleSort(arr, n-1); //recursive call for next pass
  }

  static void printArray(int arr[]){
    for (int i = 0; i < arr.length; ++i){
      System.out.print(arr[i]+" ");
    }
  }

}