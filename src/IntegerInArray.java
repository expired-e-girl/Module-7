//Write a method that takes as input an integer array and an int x. The
//method should return true if x is an element of the array, false otherwise.

public class IntegerInArray {
    public static boolean inspectArray(int [] arrayToCheck, int x){
        for(int i = 0; i < arrayToCheck.length; i++){
            if(x == arrayToCheck[i]){
                return true;
            }
        }return false;
    }


    public static void main(String[] args) {
        int x = 8;
        int [] arrayToCheck  = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        System.out.print(inspectArray(arrayToCheck, x));
    }
}
