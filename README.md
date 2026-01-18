# Java Collection Framework – Complete Notes & Examples

This repository contains **Java Collection Framework (JCF)** programs written for **learning, practice, and interview preparation**.  
All source code is placed inside the `src` directory and demonstrates how different collection interfaces and classes work in Java.

---

## 📌 What is Java Collection Framework?

The **Java Collection Framework (JCF)** is a **set of interfaces and classes** in Java used to **store, manipulate, and process groups of objects**.

👉 It provides:
- Ready-made data structures
- High performance
- Reduced coding effort

📦 Package used: `java.util`

---

## 📂 Project Structure

Collection-Framework/
│
├── src/
│ ├── List examples
│ ├── Set examples
│ ├── Map examples
│ ├── Iteration examples
│ └── Utility classes
|--ShortNotes.pdf
│
└── README.md

✔ All Java programs are inside `src/`  
✔ Each file focuses on one collection concept  
✔ Beginner-friendly code with clear output

---

## 🧱 Java Collection Framework Hierarchy

### 🔹 Root Interface

java.lang.Iterable (interface)
↓
java.util.Collection (interface)

---

### 🔹 Collection Interface Hierarchy

Collection (interface)
│
├── List (interface)
│ ├── ArrayList (class)
│ ├── LinkedList (class)
│ ├── Vector (class)
│ │ └── Stack (class)
│
├── Set (interface)
│ ├── HashSet (class)
│ │ └── LinkedHashSet (class)
│ ├── SortedSet (interface)
│ │ └── NavigableSet (interface)
│ │ └── TreeSet (class)
│
└── Queue (interface)
├── PriorityQueue (class)
└── Deque (interface)
└── ArrayDeque (class)

---

### 🔹 Map Interface Hierarchy (Not a Child of Collection)
Map (interface)
│
├── HashMap (class)
│ └── LinkedHashMap (class)
│
├── SortedMap (interface)
│ └── NavigableMap (interface)
│ └── TreeMap (class)
│
├── Hashtable (class)
│
└── ConcurrentMap (interface)
└── ConcurrentHashMap (class)

---

## 📘 What Is Inside the `src` Folder?

### 🔹 List Implementations
Programs demonstrating:
- `ArrayList`
- `LinkedList`
- `Vector`
- `Stack`

Concepts covered:
- Insertion order maintained
- Duplicate values allowed
- Index-based access
- Dynamic resizing

---

### 🔹 Set Implementations
Programs demonstrating:
- `HashSet`
- `LinkedHashSet`
- `TreeSet`

Concepts covered:
- No duplicate elements
- Ordering vs sorting
- Natural ordering
- Null handling

---

### 🔹 Map Implementations
Programs demonstrating:
- `HashMap`
- `LinkedHashMap`
- `TreeMap`
- `Hashtable`
- `ConcurrentHashMap`

Concepts covered:
- Key-value storage
- Duplicate keys not allowed
- Null key/value behavior
- Thread safety
- Sorting by key

---

### 🔹 Iteration Techniques
Examples showing:
- `for-each` loop
- `Iterator`
- `ListIterator`
- `while` loop
- `entrySet()` for maps

---

## 🔐 Thread Safety Overview

| Collection Type | Thread Safe |
|-----------------|------------|
| ArrayList       | ❌ No |
| HashSet         | ❌ No |
| HashMap         | ❌ No |
| Vector          | ✅ Yes |
| Hashtable       | ✅ Yes |
| ConcurrentHashMap | ✅ Yes |

---

## ⚡ Fail-Fast vs Fail-Safe

### 🔴 Fail-Fast
- Throws `ConcurrentModificationException`
- Example: `ArrayList`, `HashMap`
- Uses original collection

### 🟢 Fail-Safe
- No exception
- Works on copy of collection
- Example: `ConcurrentHashMap`

---
👤 Author
Rahul Verma
GitHub: Rahulverma143

## 🛠 How to Run the Project

### ▶ Using Command Line
```bash
cd Collection-Framework/src
javac *.java
java ClassName

⭐ If You Find This Helpful

Please ⭐ star the repository and share it with others learning Java 😊



