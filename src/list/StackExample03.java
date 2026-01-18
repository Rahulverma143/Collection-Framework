package list;

import java.util.Stack;

public class StackExample03 {

    public static void main(String[] args) {

        // Creating Stack object
        Stack<String> stack = new Stack<>();

        // push()  adds element to top of stack
        stack.push("Java");
        stack.push("Python");
        stack.push("Spring");

        System.out.println("Stack after push: " + stack);

        // peek()  returns top element without removing
        System.out.println("Top element (peek): " + stack.peek());

        // pop()  removes and returns top element
        System.out.println("Removed element (pop): " + stack.pop());

        // Stack after pop
        System.out.println("Stack after pop: " + stack);

        // empty()  checks whether stack is empty or not
        System.out.println("Is stack empty? " + stack.empty());

        // search(Object o)
        // Returns position from top (1-based index)
        System.out.println("Position of Java: " + stack.search("Java"));

        // size()  total number of elements
        System.out.println("Size of stack: " + stack.size());

        // add()  inherited from Vector (works like push but not recommended)
        stack.add("React");
        System.out.println("After add(): " + stack);

        // get(index)  access element by index (from Vector)
        System.out.println("Element at index 0: " + stack.get(0));

        // Iterating Stack using for-each loop
        System.out.println("Iterating stack:");
        for (String item : stack) {
            System.out.println(item);
        }
    }
}

/*
 STACK METHODS USED =================

1) push(E e)
   - Inserts element at top of stack

2) pop()
   - Removes and returns top element

3) peek()
   - Returns top element without removing

4) empty()
   - Returns true if stack is empty

5) search(Object o)
   - Returns position from top (1-based)
   - Returns -1 if element not found

6) size()
   - Returns number of elements in stack

7) add(E e)
   - Inherited from Vector
   - Not recommended for stack operations

8) get(int index)
   - Inherited from Vector
   - Index-based access

====================================================
*/
