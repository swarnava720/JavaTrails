public class insertionSort {
    void insertion(int [] arr){
        int i,j,current;
        int n = arr.length;
        for(i = 0;i<n-1;i++){
          current=arr[i];
          j = i-1;
          while(j>= 0 && current < arr[j]){
            arr[j+1] = arr[j];
            j--;
          }
          arr[j+1] = current;
        }

    }
}
