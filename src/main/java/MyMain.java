public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            for (int j = arr.length/2; j < arr.length; j++){
                arr2[i] = arr[i];
                arr2[i+1] = arr[j];
            }
        } 
        return arr2;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        return null;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
