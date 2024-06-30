package dataStructures;

//A Binary Search Tree (BST) is a hierarchical structure where each node
// can have up to two children, arranged so that values to the left are smaller
// and values to the right are larger, facilitating efficient searching.
// TreeNode class represents a node in the Binary Search Tree (BST)


//You want to seat students based on age efficiently.
//Inserting a new student (node) involves deciding
// whether they sit to the left (younger) or right (older) of a current student (node).
// TreeNode represents a student and their two chairs (BST node)
class TreeNode {
    int studentAge; // Data: Student's age
    TreeNode left; // Reference to the left chair (node)
    TreeNode right; // Reference to the right chair (node)

    // Constructor to initialize the node with student's age
    public TreeNode(int studentAge) {
        this.studentAge = studentAge;
        this.left = null;
        this.right = null;
    }
}

// BinarySearchTree represents the seating arrangement in the classroom (BST)
public class BinarySearchTreeBST {
    TreeNode root; // Root of the BST (first student seated)

    // Method to seat a new student (node) based on their age in the classroom (BST)
    public void seatStudent(int studentAge) {
        root = seatRec(root, studentAge); // Call recursive seating method
    }

    // Recursive method to seat a student (node) based on their age in the BST
    private TreeNode seatRec(TreeNode root, int studentAge) {
        // If the tree is empty, create a new node and return it as the root
        if (root == null) {
            root = new TreeNode(studentAge);
            return root;
        }

        // Otherwise, decide where to seat the student based on age
        if (studentAge < root.studentAge) {
            // Seat the student to the left (younger)
            root.left = seatRec(root.left, studentAge);
        } else if (studentAge > root.studentAge) {
            // Seat the student to the right (older)
            root.right = seatRec(root.right, studentAge);
        }

        // Return the unchanged node pointer
        return root;
    }

    // Method for in-order traversal of the BST
    public void inOrderTraversal(TreeNode node) {
        if (node != null) {
            // Traverse the left subtree
            inOrderTraversal(node.left);

            // Print the age of the current student
            System.out.print(node.studentAge + " ");

            // Traverse the right subtree
            inOrderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTreeBST classroom = new BinarySearchTreeBST();

        // Seat students in the classroom based on their age (BST insertion)
        classroom.seatStudent(50);
        classroom.seatStudent(30);
        classroom.seatStudent(20);
        classroom.seatStudent(40);
        classroom.seatStudent(70);
        classroom.seatStudent(60);
        classroom.seatStudent(80);

        // Perform in-order traversal to print students' ages in sorted order
        System.out.print("Sorted Ages in Classroom: ");
        classroom.inOrderTraversal(classroom.root); // Output: Sorted Ages in Classroom: 20 30 40 50 60 70 80
    }
}
