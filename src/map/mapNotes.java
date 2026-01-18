package map;

/*
 * =============================
 * Java Map Notes
 * =============================
 * 
 * Map Hierarchy (Textual)
 * =============================
 *
java.lang.Object
 └── java.util.Map<K,V> (interface)
      ├── java.util.SortedMap<K,V> (interface)
      │     └── java.util.NavigableMap<K,V> (interface)
      │           └── java.util.TreeMap<K,V> (class)
      ├── java.util.concurrent.ConcurrentMap<K,V> (interface)
      │     └── java.util.concurrent.ConcurrentHashMap<K,V> (class)
      ├── java.util.HashMap<K,V> (class)
      │     └── java.util.LinkedHashMap<K,V> (class)
      └── java.util.Hashtable<K,V> (class)
            └── java.util.Properties (class)

 *
 * Notes:
 * - Map is an interface.
 * - HashMap, LinkedHashMap, TreeMap, Hashtable, ConcurrentHashMap are classes.
 * - Thread safety:
 *     * HashMap, LinkedHashMap, TreeMap → NOT thread-safe
 *     * Hashtable, ConcurrentHashMap → Thread-safe
 * 1. Map Interface
 *    - Map is an interface in java.util package.
 *    - Stores key-value pairs.
 *    - Keys must be unique, values can be duplicate.
 *    - Null key allowed depends on implementation.
 *    - Provides methods like put(), get(), remove(), containsKey().
 *    - Not thread-safe (depends on implementation).
 *
 * =============================
 * Map Implementations
 * =============================
 * 
 * 1. HashMap (It is a class) 
 *    - Class that implements Map interface.
 *    - Does NOT maintain insertion order.
 *    - Allows one null key and multiple null values.
 *    - Not synchronized (NOT thread-safe).
 *    - Fast (O(1) time complexity for basic operations).
 *
 * 2. LinkedHashMap (It is a class) (maintains insertion order.)
 *    - Class that extends HashMap and maintains insertion order.
 *    - Slightly slower than HashMap due to linked list.
 *    - Allows one null key and multiple null values.
 *    - Not synchronized (NOT thread-safe).
 *    - Can be used for LRU cache by enabling access order.
 *
 * 3. TreeMap (class)
 *    - Class that implements NavigableMap and SortedMap interfaces.
 *    - Maintains keys in natural ascending order or custom Comparator.
 *    - Does NOT allow null keys.
 *    - Not synchronized (NOT thread-safe).
 *    - Methods like firstKey(), lastKey(), subMap(), headMap(), tailMap() are available.
 *
 * 4. SortedMap
 *    - Interface extended by Map interface.
 *    - Maintains keys in ascending order.
 *    - Does NOT allow null keys (implementation dependent).
 *    - Provides methods like comparator(), firstKey(), lastKey(), subMap().
 *    - TreeMap is the main implementation.
 *
 * 5. NavigableMap
 *    - Interface that extends SortedMap.
 *    - Provides navigation methods: lowerKey(), floorKey(), ceilingKey(), higherKey().
 *    - Supports descendingMap() and subMap() with inclusive/exclusive bounds.
 *    - TreeMap implements NavigableMap.
 *    - Not thread-safe by default.
 *
 * 6. Hashtable
 *    - Legacy class that implements Map interface.
 *    - Synchronized (thread-safe).
 *    - Does NOT allow null keys or null values.
 *    - Slower than HashMap due to synchronization.
 *    - Iteration using Enumerator or Iterator.
 *
 * 7. ConcurrentHashMap
 *    - Class that implements ConcurrentMap (extends Map).
 *    - Thread-safe without locking the entire map.
 *    - Does NOT allow null keys or null values.
 *    - Provides high concurrency performance.
 *    - Supports atomic operations like putIfAbsent(), remove(key, value), replace().
 *
 *------------------------------------------------------------------
 * LinkedHashMap (C) -> Insertion order preserved
 * SortedMap(I)  -> Sorted Key
 * NavigableMap(I) -> Sorted Key
 * TreeMap(C)    -> Sorted Key
 * ------------------------------------------------------------------
 * 
 * ConcurrentMap(C)   -> Thread safe 
 * ConcurrentHashMap(C)   -> Thread safe 
 * HashTable (C)   -> Thread safe 
 * 
 * =============================
 * End of Map Notes
 * =============================
 */

public class mapNotes {
    // This class is for reading notes only. No executable code.
}
