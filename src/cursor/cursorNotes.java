package cursor;
/*
A cursor is an object that traverses or iterates over elements of a collection.

Used to read or modify elements.

Every collection provides some kind of cursor.

// What is a Cursor in Java? 
-> In Java Collection Framework, a cursor is an object that allows you to traverse (visit) 
   (each) the elements of a collection one by one.
-> It helps us access, read, or modify elements in a collection without using indexes.
-> It acts like a pointer or iterator that moves through the elements of a 
   collection (like ArrayList, HashSet, etc.) and lets you read or modify them.

// Why We Need a Cursor? 
-> When we store data in a collection (like ArrayList), we need a way to access
     each element one by one without worrying about indexes.
-> That’s where cursors come in — they give us a clean and safe way to iterate, 
  read, and sometimes modify the collection elements.

// Types of Cursors in Java: 
There are 3 main types of cursors in the Java Collection Framework:
| Cursor           | Direction              | Applicable To             | Modify Collection      | Introduced In |
| ---------------- | ---------------------- | ------------------------- | ---------------------- | ------------- |
| **Iterator**     | Forward only           | All collections           | Yes (remove)           | JDK 1.2       |
| **ListIterator** | Forward & Backward     | Only List                 | Yes (add, remove, set) | JDK 1.2       |
| **Spliterator**  | Sequential or Parallel | All collections & Streams | No direct modification | JDK 1.8       |
*/
/*
 -> A cursor is a pointer-like object used to traverse elements in a Java collection one by one.
-> It makes reading or modifying collection elements easier and safer.
There are three types of cursors:
      -> Iterator → forward, all collections
      -> ListIterator → forward & backward, only list
      -> Spliterator → sequential & parallel, all collections & streams
 */
/
public class cursorNotes {

}
