import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Sorting problems");
        int[] arr={3,2,9,5,4};
        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}