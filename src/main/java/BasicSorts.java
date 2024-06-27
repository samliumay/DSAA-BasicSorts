
public class BasicSorts {

  public void bubbleSort(int[] array) {
    for (int i = array.length - 1; i > 0; i--) {
      for (int j = 0; i > j; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }

    }
  }

  public void selectionSort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      int minIndex = i;
      for (int j = i + 1; array.length > j; j++) {
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }
      if (i != minIndex) {
        int temp = array[minIndex];
        array[minIndex] = array[i];
        array[i] = temp;
      }
    }
  }

  public void insertionSort(int [] array){

    for(int i = 1; array.length > i;i++ ){
      int temp = array[i];
      int j = i-1;
      //The order of the boolean at while loop is important. 
      while((j>-1)&&(temp <array[j])){
        array[j+1] = array[j];
        array[j] = temp;
        j--;
      }
    }
    
  }

}