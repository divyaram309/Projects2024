package oops;

//Different methods with the same name but different parameters, resolved at compile time.


// Java program to demonstrate
// compile-time polymorphism

// Animal class (superclass)
// Tree class (superclass)
class Tree {
    void grow() {
        System.out.println("Tree is growing");
    }

    // Method overloading example
    void grow(int years) {
        System.out.println("Tree grows " + years + " years");
    }
}

// OakTree class (subclass of Tree)
class OakTree extends Tree {
    // Overriding grow method from Tree
    @Override
    void grow() {
        System.out.println("Oak tree is growing");
    }

    // Overloading grow method in OakTree class
    void grow(boolean isMature) {
        if (isMature) {
            System.out.println("Oak tree is mature");
        } else {
            System.out.println("Oak tree is growing");
        }
    }
}

// PineTree class (subclass of Tree)
class PineTree extends Tree {
    // Overriding grow method from Tree
    @Override
    void grow() {
        System.out.println("Pine tree is growing");
    }
}

public class Overloading_PolyCompile {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.grow(); // Output: Tree is growing

        Tree oakTree = new OakTree();
        oakTree.grow(); // Output: Oak tree is growing

        // Using overloaded method in OakTree class
        ((OakTree) oakTree).grow(true); // Output: Oak tree is mature

        Tree pineTree = new PineTree();
        pineTree.grow(); // Output: Pine tree is growing

        // Using overloaded method in Tree class
        tree.grow(10); // Output: Tree grows 10 years
    }

}


