package dataStructures;

//A linked list is a data structure where each element (node) holds data and
// a pointer to the next node,
// enabling flexible memory usage and efficient element insertion and deletion.
// Node class represents each element (node) in the linked list

//Example:
//
//You want to add a new student (node) to the row (linked list).
//You insert the student into an empty seat (create a new node).
//Each student (node) knows who is sitting next to them (pointer to the next node).

// Node represents a chair in the classroom (linked list node)
class Node {
    String studentName; // Data: Student's name
    Node next; // Reference to the next chair (node)

    // Constructor to initialize the node with student's name and next reference
    public Node(String studentName) {
        this.studentName = studentName;
        this.next = null; // Initialize next as null (no student seated next yet)
    }
}

// LinkedList represents the row of chairs in the classroom (linked list)
public class LinkedList {
    Node head; // Head of the linked list (first chair)

    // Method to add a new student (node) at the end of the row (linked list)
    public void addStudent(String studentName) {
        Node newNode = new Node(studentName);
        if (head == null) {
            head = newNode; // If the row is empty, new node becomes the head
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the end of the row
            }
            current.next = newNode; // Insert new node at the end of the row
        }
    }

    // Method to display the names of students in the row (linked list)
    public void displayStudents() {
        Node current = head;
        while (current != null) {
            System.out.print(current.studentName + " -> "); // Print student's name
            current = current.next; // Move to the next chair (node)
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList classroom = new LinkedList();

        // Add students to the classroom (linked list)
        classroom.addStudent("Alice");
        classroom.addStudent("Bob");
        classroom.addStudent("Charlie");

        // Display the names of students in the classroom (linked list)
        System.out.print("Classroom Students: ");
        classroom.displayStudents(); // Output: Classroom Students: Alice -> Bob -> Charlie -> null
    }
}
