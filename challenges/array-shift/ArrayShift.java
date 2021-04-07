import java.util.ArrayList;
public class ArrayShift {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    int[] arr={2,4,6,8};
    int newNum=5;
    addToArray(arr,newNum);

    int[] array={4,8,15,23,42};
    addToArray(array,16);
  }
  public static void addToArray(int[] arr, int value){
    ArrayList<Integer> pushedArray = new ArrayList<>();
    int middleIndex;
  
      if (arr.length%2 == 0){
        middleIndex = arr.length/2;
      }else{
        middleIndex = arr.length/2 + 1;
      }
      for(int i=0; i<middleIndex; i++){
          pushedArray.add(arr[i]);
      }
        pushedArray.add(value);
        for(int i=middleIndex;i<arr.length;i++){

        pushedArray.add(arr[i]);
    }
      System.out.println(pushedArray);
      }
      
    }
