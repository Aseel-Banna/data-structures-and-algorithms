public class ArrayBinarySearch {

   public static void main(String[] args) {
    System.out.println("Hello world!");
    int[] my_array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };
 
        // find the index of 5
        System.out.println("Index position of 5 is: "
                           + BinarySearch(my_array, 5));
                           }

  

  public static int BinarySearch(int [] arr, int searchKey){
  if (arr == null) {
            return -1;
  }
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == searchKey) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
}