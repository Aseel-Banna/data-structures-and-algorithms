/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package array.shift;

import java.util.ArrayList;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
  public static int[] addToArray(int[] arr, int value){
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

    int[] convertArray=new int[pushedArray.size()];
    for (int i = 0; i < pushedArray.size(); i++)
      convertArray[i] = pushedArray.get(i);
    return convertArray ;
    }


}
