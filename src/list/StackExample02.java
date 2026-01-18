package list;
import java.util.Stack;
public class StackExample02 {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();          //  Creates a Stack object (default capacity = 10)
        s.push(10);                     //  Adds 10 to stack
        s.push(20);                     //  Adds 20
        s.push(30);                     //  Adds 30
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);
        s.push(90);
        s.push(100);                    //  10 elements added, stack is full (capacity = 10)
        
        System.out.println(s.capacity()); //  Prints current capacity → 10
        s.push(110);                      //  Adding 11th element → capacity increases automatically
        s.push(120);                      //  Adding 12th element
        
        System.out.println(s);            //  Prints entire stack contents
        
        System.out.println(s.pop());      //  Removes and prints **top element (120)**
        System.out.println(s.peek());     //  Shows **current top element (110)** without removing it
        System.out.println(s.pop());      //  Removes and prints **110**
        System.out.println(s.capacity()); //  Prints current capacity (20 after resizing)
    }
}