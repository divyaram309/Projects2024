package basicInterviewpgms;

public class SecMaxArray {
    public static void main(String[] args) {
        int arr[] = {600, 89, 70, 700};

        // Sorting the array in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Swapping elements
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // To print the second maximum, we need to access the second last element in a sorted array
        // However, this approach assumes that all values are unique. If duplicates are present,
        // this approach needs to handle those cases separately.
        System.out.println("Second maximum value is: " + arr[arr.length - 2]);
    }
}



