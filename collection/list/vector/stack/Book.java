
import java.util.List;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.ListIterator;

public class Book {

    public static void main(String[] args) {
        // The Java Collection framework provides a Stack class, which implements a Stack data structure.
        // The class is based on the basic principle of LIFO (last-in-first-out).
        // The Stack class can be considered as a subclass of Vector because it inherits all of its methods and properties.
        // 
        // The Stack class in Java provides only a default constructor, which creates an empty stack.
        // If you want to create a stack with a specified initial capacity, you would need to extend the Vector class (which Stack itself extends) and set the initial capacity in the constructor of your custom class.
        Stack<String> stack = new Stack<String>();

        // With the help of push() method you can add element to the stack.
        // The push() method place the element at the top of the stack.
        stack.push("To Kill a Mockingbird");
        stack.push("1984");
        stack.push("Pride and Prejudic");
        stack.push("The Great Gatsby");
        stack.push("Moby-Dick");

        System.out.println("First occurence of the stack: " + stack);

        // With the help of pop() method you can delete and return the top element from the stack.
        stack.pop();

        System.out.println("Second occurence of the stack: " + stack);

        // With the help of peek() method you can fetch the top element of the stack. 
        String peek = stack.peek();

        System.out.println("Peek of the stack is \"" + peek + "\".");

        // Searching for an element in the stack and return its position.
        int positionOf1984 = stack.search("1984");

        System.out.println("You can find \"1984\" at " + positionOf1984 + ".");

        // Checking whether the stack is empty or not.
        boolean isEmpty = stack.isEmpty();

        System.out.println("Is stack empty? " + isEmpty + ".");

        // Counting size of the stack.
        int size = stack.size();

        System.out.println("Size of the stack is " + size + ".");

        // Adding element at the end of the stack.
        stack.add("The Catcher in the Rye");
        stack.add("The Lord of the Rings");
        stack.add("Harry Potter and the Sorcerer’s Stone");
        stack.add("The Alchemist");
        stack.add("Brave New World");

        System.out.println("Third occurence of the stack: " + stack);

        ListIterator<String> listIterator = stack.listIterator();

        while (listIterator.hasNext()) {
            String book = listIterator.next();
            System.out.println("Iterating with ListIterator: " + book);
        }

        // Cleaning-up the stack.
        stack.clear();

        System.out.println("Fourth occurence of the stack: " + stack);

        // The Stack class in Java is inherits from Vector in Java.
        // It is a thread-safe class. It is recommended to use ArrayDeque for stack implementation as it is more efficient in a single-threaded environment.
        // 
        // One more reason to use Deque over Stack is Deque has the ability to use streams convert to list
        // with keeping LIFO concept applied while Stack does not.
        Stack<Integer> stackBills = new Stack<>();
        Deque<Integer> dequeBills = new ArrayDeque<>();

        stackBills.push(10);
        stackBills.push(20);
        stackBills.push(30);
        stackBills.push(40);
        stackBills.push(50);

        dequeBills.push(100);
        dequeBills.push(200);
        dequeBills.push(300);
        dequeBills.push(400);
        dequeBills.push(500);

        List<Integer> stackToList = stackBills.stream().toList();
        List<Integer> dequeToList = dequeBills.stream().toList();

        for (var i = 0; i < stackToList.size(); ++i) {
            System.out.println(stackToList.get(i)); // 10 20 30 40 50
        }

        for (var i = 0; i < dequeToList.size(); ++i) {
            System.out.println(dequeToList.get(i)); // 500 400 300 200 100
        }
    }

}
