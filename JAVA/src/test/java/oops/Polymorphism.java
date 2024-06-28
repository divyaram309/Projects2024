package oops;

//It allows methods to do different things
// based on the object it is acting upon, even if they share the same name


class A {
    int a, b, c;

    public void add(int x, int y) {
        a = x;
        b = y;
        System.out.println("addition of a+b is:" + (a + b));
    }

    public void add(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
        System.out.println("addition of a+b+c is:" + (a + b + c));
    }

    public void print() {
        System.out.println("Class A's method is running");
    }
}

;

class B extends A {
    public void print() {
        System.out.println("Class B's method is running");
    }

    // Driver Code
    public static void main(String[] args) {
        A a1 = new A();

        // method overloading (Compile-time polymorphism)
        a1.add(6, 5);

        // method overloading (Compile-time polymorphism)
        a1.add(1, 2, 3);

        B b1 = new B();

        // Method overriding (Run-time polymorphism)
        b1.print();
    }
}

