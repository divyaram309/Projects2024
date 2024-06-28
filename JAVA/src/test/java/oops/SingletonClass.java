package oops;
//A singleton class ensures that only one instance of the class is created and
// provides a single point of access to that instance,
// like having a single key to a single room in a house.


public class SingletonClass {
    public static void main(String[] args) {
        // Getting the only instance of SingletonPrinter
        Singleton singleObject = Singleton.getInstance(); // Get the only instance
        singleObject.showMessage(); // Output: Singleton instance!
    }
}
