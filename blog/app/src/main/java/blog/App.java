/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package blog;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

    }

    public static String sorting(int[] arr){
        ArrayList<Integer>  pushOne = new ArrayList<>();

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int tmp = 0;
                if (arr[i] > arr[j])
                {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            pushOne.add(arr[i]);
        }

//        System.out.println(pushOne);
        return pushOne.toString();
    }
}
