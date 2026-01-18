package list;

import java.util.Stack;

public class StackExample01 {
	

	    public static void main(String[] args) {

	        Stack<Integer> s = new Stack<>();

	        s.push(10);
	        s.push(20);
	        s.push(30);
	        s.push(50);
	        s.push(40);
	        s.push(60);

	        System.out.println(s);
	    }
	}
/*
→ Stack is a linear data structure.
→ It follows the LIFO principle (Last In First Out).
   The element inserted last is removed first.

→ Stack maintains insertion order internally.
   (Elements jis order me add hote hain, usi order me store hote hain.)

→ Stack allows duplicate elements.
→ Stack allows null elements.

→ Stack supports index-based access (because it extends Vector).

→ Stack does NOT require shifting like ArrayList
   because insertion and deletion happen at the top.

→ Stack is present in java.util package (java.util.Stack).

→ Stack is a subclass of Vector.
   So, it inherits all properties of Vector such as:
   - Synchronization (thread-safe)
   - Dynamic array behavior

→ Initial capacity of Stack is 10 (inherited from Vector).

→ When capacity is exceeded, it automatically doubles:
   New Capacity = Old Capacity × 2
   Example: 10 → 20 → 40 → 80
   */
