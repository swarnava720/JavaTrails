import java.util.Arrays;

class run {
  public static void main(String[] args) {

    int array[] = { 8, 67, 7, 9, 16, 1, 0, 4, 90};
    insertionSort obj =new insertionSort();
    obj.insertion(array);
    for(int e : array){
      System.out.print(e + " ");
    }

  }
}