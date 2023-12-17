import java.util.Arrays;
public class ReverseArray {

    public void reverseList(int[] myArray) {
        for (int index = myArray.length - 1; index >= 0; index--) {
            System.out.print(myArray[index] + " ");
        }
    }

    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        int[] myArray = {1, 2, 3, 4, 392, 492, 102, 482, 5};
        reverseArray.reverseList(myArray);
    }
}