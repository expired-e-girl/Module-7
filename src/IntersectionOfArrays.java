//Write a method that takes two integer arrays as input and returns an array
//corresponding to the intersection of the two arrays.

import java.util.Arrays;

public class IntersectionOfArrays {
    public static int[] getIntersection(int [] firstArray, int [] secondArray){
        int [] newArray = {};
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++){
                if(firstArray[i] == secondArray[j]){
                    newArray = Arrays.copyOf(newArray, newArray.length + 1);
                    newArray[newArray.length - 1] = firstArray[i];
                }
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int [] firstArray = new int[] {1,2,3,4,5};
        int [] secondArray = new int[]{2,4,6,7,8};

       System.out.println(Arrays.toString(getIntersection(firstArray, secondArray)));

    }
}
