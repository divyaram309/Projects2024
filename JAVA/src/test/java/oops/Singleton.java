package oops;

public class Singleton {
    private static Singleton instance = null; // Only instance

    private Singleton() {
    } // Private constructor

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Create instance if it doesn't exist
        }
        return instance; // Return the single instance
    }

    public void showMessage() {

        System.out.println("Singleton instance!");
    }
}
