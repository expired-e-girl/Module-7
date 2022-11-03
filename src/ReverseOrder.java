//Write a void method that reverses the order of the elements of an array.

public class ReverseOrder {
    public static void reverseIt(int[] myList) {
        for(int i = myList.length - 1; i >= 0; i--){
            System.out.print(myList[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] myList = new int[]{1, 2, 3, 4, 5};
        reverseIt(myList);
    }
}
