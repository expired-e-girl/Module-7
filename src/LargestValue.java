//Write a method that takes an array of integers as
// input and returns
//the largest value in the array.

import java.util.Arrays;

public class LargestValue {
    public static int getLargest(int [] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max)
                max = array[i];
            }
            return max;
        }


    public static void main(String[] args) {
        int[] myArray = new int [10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(myArray));
        System.out.print(getLargest(myArray));
    }
}
