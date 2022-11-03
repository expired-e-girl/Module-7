//Write a method that takes 2 arrays as input and return true
//if they contain the same elements (in the same order), false otherwise.

public class SameOrder {
    public static boolean sameElements(int [] arrayOne, int [] arrayTwo){
        if (arrayOne.length != arrayTwo.length){
            return false;
        }
        for (int i = 0; i < arrayOne.length; i++){
            if(arrayOne[i] != arrayTwo[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] firstArray = new int [10];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * 10);
        }

        int[] secondArray = new int [10];
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = (int) (Math.random() * 10);
        }

        System.out.print("Both arrays are the same: "+ sameElements(firstArray, secondArray));
    }
}
