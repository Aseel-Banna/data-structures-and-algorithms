public class ArrayReverse {

   public static void main(String [] args){
    int[] array = {1,2,5,8,47,9};
    reverseArray(array);
  }

  public static void reverseArray (int [] arrNumbers){
      System.out.print("[");
    for(int i = arrNumbers.length - 1; i >= 0; i--){
      if (i == 0){
        System.out.print(arrNumbers[i]);
      }else{
        System.out.print(arrNumbers[i]+",");
      }
      
    } 
     System.out.print("]");
  }
}