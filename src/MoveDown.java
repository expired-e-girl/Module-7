//Write a method that takes an array as input and returns an array
// where all the elements have been moved down by one position.
import java.util.*;

public class MoveDown {
    public static int[] moveItDown(int[] List) {
        int[] Other = new int[List.length];
        for(int i = 0; i < List.length;i++) {
            // If we are at the end just copy the first element
            if(i + 1 > List.length - 1) {
                Other[i] = List[0];
                continue;
            }

            Other[i] = List[i+1];

            }

        System.out.println(Arrays.toString(Other));
        return Other;

}


    public static void main(String[] args) {

        int[] resultArray = {1, 2, 3, 4, 5};
        String arrayToPrint = "";

        moveItDown(resultArray);

    }






}
