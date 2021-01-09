import java.util.Arrays;
import java.util.Random;
public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        //int[] arr2 = new int[arr.length];
        int[] firstHalf = new int[arr.length/2];
        int[] secondHalf = new int[arr.length/2];

        for (int i = 0; i < arr.length/2; i++){
            firstHalf[i] = arr[i];
        }
        for (int i = arr.length/2; i < arr.length; i++){
            secondHalf[i - arr.length/2] = arr[i];
        }
        for (int i = 0; i < arr.length/2; i++){
            arr[i*2] = firstHalf[i];
            arr[(i*2) + 1] = secondHalf[i];
        } 
        return arr;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++){
            int randNum = rand.nextInt(arr.length);
            int num = arr[randNum];
            arr[randNum] = arr[i];
            arr[i] = num;
        }
        return arr;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
