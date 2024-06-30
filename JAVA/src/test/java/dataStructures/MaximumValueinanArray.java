package dataStructures;

//Finding the maximum value in an array means
// identifying the largest element present in the collection of numbers or data items.
public class MaximumValueinanArray {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 9, 7, 4, 8};
        int maxValue = findMax(numbers);
        System.out.println("The maximum value in the array is: " + maxValue); // Output: The maximum value in the array is: 12
    }

    public static int findMax(int[] arr) {
        int max = arr[0]; // Assume the first element is the maximum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if current element is larger
            }
        }
        return max;
    }

}