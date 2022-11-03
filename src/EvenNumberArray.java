
//Write a method that takes an array of integers as input and
// prints out all the even numbers.

public class EvenNumberArray {
    public static void getEvenNumber(int[] array){
        for (int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] myList = new int [69];
        for (int i = 0; i < myList.length; i++) {
            myList[i] = (int) (Math.random() * 69);
        }
        getEvenNumber(myList);
    }
}

