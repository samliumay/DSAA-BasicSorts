// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {

    int array[] = {1,4,6,2,3,8,11,20,10};
  
    BasicSorts basicSorts = new BasicSorts();

    basicSorts.bubbleSort(array);

    System.out.print("bubble Sort:");
    
    for(int i:array){
      System.out.print(i + " ");
    }
    System.out.println("");

    System.out.print("selection Sort:");
    int array2[] = {1,4,6,2,3,8,11,20,10};
    basicSorts.selectionSort(array2);

    for(int i:array2){
      System.out.print(i + " ");
    }
    System.out.println("");

    System.out.print("insertion Sort:");
    int array3[] = {1,4,6,2,3,8,11,20,10};
    basicSorts.insertionSort(array3);

    for(int i:array3){
      System.out.print(i + " ");
    }

  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}