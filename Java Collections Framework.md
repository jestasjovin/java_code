# Java Collections Framework

### 1. **Queue**

- **Interface**: `Queue<E>`
- **Purpose**: A queue is a **FIFO (First In, First Out)** data structure. Elements are added at the end (rear) of the queue and removed from the front.
- **Implementations**:
  - `LinkedList`: Implements the `Queue` interface and can be used to create a queue. It is often used for linked data structures that provide faster insertion and removal.
  - `PriorityQueue`: Implements the `Queue` interface, but the elements are ordered by their natural order or a specified comparator, rather than insertion order.
  - `ArrayDeque`: Implements the `Deque` interface (double-ended queue) and can be used as a queue, providing better performance than `LinkedList` in some cases.

**Example**:

```java
Queue<String> queue = new LinkedList<>();
queue.add("A");
queue.add("B");
System.out.println(queue.poll()); // Removes and prints "A"
```

### 2. **Map**

- **Interface**: `Map<K, V>`
- **Purpose**: A map stores data in key-value pairs, where each key is unique and maps to a value.
- **Implementations**:
  - `HashMap`: A commonly used implementation of `Map`. It allows null keys and values and does not guarantee any specific order of elements.
  - `TreeMap`: A `Map` implementation that orders its entries by the keys using a natural order or a comparator.
  - `LinkedHashMap`: Like `HashMap`, but it maintains the insertion order of keys.

**Example**:

```java
Map<String, Integer> map = new HashMap<>();
map.put("apple", 5);
map.put("banana", 3);
System.out.println(map.get("apple")); // Prints 5
```

### 3. **Set**

- **Interface**: `Set<E>`
- **Purpose**: A set is a collection that **does not allow duplicate elements**. It is often used when you want to store unique items.
- **Implementations**:
  - `HashSet`: Implements `Set`, and does not guarantee any order of elements.
  - `LinkedHashSet`: A set implementation that maintains the insertion order of elements.
  - `TreeSet`: A sorted set implementation, which orders elements using their natural order or a comparator.

**Example**:

```java
Set<String> set = new HashSet<>();
set.add("apple");
set.add("banana");
set.add("apple");  // Duplicate, will not be added
System.out.println(set); // Prints [banana, apple]
```

### 4. **Stack**

- **Class**: `Stack<E>`
- **Purpose**: A stack is a **LIFO (Last In, First Out)** data structure. The most recently added element is the first to be removed.
- **Alternative**: `Deque` (double-ended queue) can also be used as a stack (using `addFirst()` and `removeFirst()`).

**Example**:

```java
Stack<String> stack = new Stack<>();
stack.push("A");
stack.push("B");
System.out.println(stack.pop()); // Prints "B"
```

### **How are they related?**

These data structures are all part of the **Java Collections Framework** and implement different interfaces based on their functionalities. Here's how they are related:

#### Interfaces and Implementations:

- **Collection Interface**: Most of these classes implement the `Collection<E>` interface, which is the root interface for collections.
  - `Set`, `List`, and `Queue` all extend the `Collection` interface.
- **List**:
  - A `List` is an ordered collection (like an array) that allows duplicate elements. It is different from a `Set` because a `Set` does not allow duplicates.
  - `ArrayList`, `LinkedList` are examples of `List` implementations.
- **Set**:
  - A `Set` does not allow duplicates and is unordered by default (except `LinkedHashSet`).
- **Queue**:
  - A `Queue` follows the FIFO principle, which is different from `Stack` (LIFO).
  - `PriorityQueue` can be thought of as a specialized `Queue` where the element's order is determined by its priority.
- **Map**:
  - A `Map` is not a direct descendant of `Collection` because it stores data in key-value pairs.
  - It’s typically used to associate a **key** with a **value**, whereas `Set` and `List` store values without such associations.

### Diagram of the Relationships:

```
               Collection
                  /  |  \
           Set     List   Queue
            |       |       |
   HashSet, TreeSet  ArrayList, LinkedList
                      LinkedList  PriorityQueue
                        |
                    Deque (Double-ended queue)
                        |
                    LinkedList (can act as a Deque)
```

---

### **Core Java Collections Framework**

1. **Collection Interface**: The root interface in the collections hierarchy, which is extended by most collection classes.
   - **Subinterfaces**: `Set`, `List`, `Queue`
2. **Set Interface**: A collection that does not allow duplicate elements.
   - **Implementations**:
     - `HashSet`: Stores elements in no particular order (fast insertion and lookup).
     - `LinkedHashSet`: Maintains the insertion order of elements.
     - `TreeSet`: A sorted `Set` that orders elements using their natural ordering or a provided comparator.
3. **List Interface**: A collection that allows duplicates and maintains the order of elements.

   - **Implementations**:
     - `ArrayList`: A dynamically resizing array (good for random access and iteration).
     - `LinkedList`: A doubly linked list (good for efficient insertion/removal from both ends).
     - `Vector`: Similar to `ArrayList`, but synchronized (less commonly used now).
     - `Stack`: A `List` implementation that follows LIFO (Last In, First Out) order.

4. **Queue Interface**: A collection designed for holding elements in a queue structure (FIFO).

   - **Implementations**:
     - `LinkedList`: Can be used as a `Queue` (FIFO).
     - `PriorityQueue`: Orders elements based on their priority.
     - `ArrayDeque`: Implements `Deque` (double-ended queue), and can be used as a `Queue`.

5. **Deque Interface**: A double-ended queue where elements can be added or removed from both ends.
   - **Implementations**:
     - `LinkedList`: Can be used as a `Deque`.
     - `ArrayDeque`: A resizable array implementation of the `Deque` interface.
6. **Map Interface**: Stores data in key-value pairs. It is not part of the `Collection` hierarchy but is often used alongside them.
   - **Implementations**:
     - `HashMap`: A map that stores key-value pairs and does not maintain any order.
     - `TreeMap`: A map that stores key-value pairs in a sorted order.
     - `LinkedHashMap`: A map that maintains the order of insertion of keys.
     - `Hashtable`: Synchronized version of `HashMap` (not commonly used today).

---

### **Additional Collections and Interfaces**

#### 7. **SortedSet Interface**: A specialized version of `Set` that orders its elements.

- **Implementations**:
  - `TreeSet`: A `SortedSet` that orders elements in their natural order or according to a comparator.

#### 8. **NavigableSet Interface**: Extends `SortedSet` to provide navigation methods such as `lower()`, `higher()`, etc.

- **Implementations**:
  - `TreeSet`: Implements `NavigableSet`, providing additional methods for navigation.

#### 9. **SortedMap Interface**: A specialized version of `Map` that stores its keys in sorted order.

- **Implementations**:
  - `TreeMap`: A `SortedMap` implementation that stores key-value pairs in a sorted order.

#### 10. **NavigableMap Interface**: Extends `SortedMap` and provides navigation methods (e.g., `lowerKey()`, `higherKey()`).

- **Implementations**:
  - `TreeMap`: Implements `NavigableMap` and allows navigation based on keys.

---

### **Specialized Collections**

#### 11. **CopyOnWrite Collections**: These collections are designed for use in multi-threaded environments. They are specifically useful for scenarios where the collection is read frequently and modified rarely.

- **Implementations**:
  - `CopyOnWriteArrayList`: A thread-safe version of `ArrayList` for cases where you don’t modify the collection often.
  - `CopyOnWriteArraySet`: A thread-safe version of `Set`.

#### 12. **Blocking Queue**: Used in multi-threaded applications where the queue might block the thread (e.g., waiting for an element to become available or for space to free up).

- **Implementations**:
  - `ArrayBlockingQueue`: A bounded blocking queue that supports operations like blocking on take and put.
  - `LinkedBlockingQueue`: A blocking queue that can grow dynamically.

#### 13. **WeakHashMap**: A `Map` implementation where keys are weakly referenced, meaning that if there are no strong references to a key, it can be garbage collected.

- **Use Case**: Useful for caching and situations where the map should not prevent garbage collection of keys.

#### 14. **IdentityHashMap**: A `Map` implementation that compares keys using reference equality (using `==`) instead of object equality (`equals()`).

- **Use Case**: Useful in situations where you need reference-based comparisons of keys (e.g., storing unique instances).

#### 15. **EnumSet**: A specialized `Set` implementation designed specifically for use with enum types.

- **Use Case**: Provides high-performance sets for enum values.

#### 16. **EnumMap**: A specialized `Map` implementation designed specifically for use with enum types as keys.

- **Use Case**: Provides better performance than `HashMap` when using enum keys.

#### 17. **BitSet**: A collection that represents a set of bits (boolean values).

- **Use Case**: Efficient storage and manipulation of large sets of boolean values.

---

### **Summary of the Common Collections**

| **Collection**   | **Interface**        | **Description**                                           | **Examples**                                |
| ---------------- | -------------------- | --------------------------------------------------------- | ------------------------------------------- |
| **Set**          | `Set<E>`             | Unordered collection with no duplicates                   | `HashSet`, `LinkedHashSet`, `TreeSet`       |
| **List**         | `List<E>`            | Ordered collection, allows duplicates                     | `ArrayList`, `LinkedList`, `Vector`         |
| **Queue**        | `Queue<E>`           | FIFO collection (first-in, first-out)                     | `LinkedList`, `PriorityQueue`, `ArrayDeque` |
| **Deque**        | `Deque<E>`           | Double-ended queue, allows adding/removing from both ends | `LinkedList`, `ArrayDeque`                  |
| **Map**          | `Map<K, V>`          | Stores key-value pairs                                    | `HashMap`, `TreeMap`, `LinkedHashMap`       |
| **SortedSet**    | `SortedSet<E>`       | A set with sorted elements                                | `TreeSet`                                   |
| **SortedMap**    | `SortedMap<K, V>`    | A map with sorted keys                                    | `TreeMap`                                   |
| **NavigableSet** | `NavigableSet<E>`    | A sorted set with navigation methods                      | `TreeSet`                                   |
| **NavigableMap** | `NavigableMap<K, V>` | A sorted map with navigation methods                      | `TreeMap`                                   |

### **Relationship Between Them**

These collections all extend a variety of interfaces, and some implement multiple interfaces. For example:

- **`Set`** extends **`Collection`** and represents a collection of unique elements.
- **`List`** extends **`Collection`** and represents an ordered collection of elements that can contain duplicates.
- **`Queue`** extends **`Collection`** and represents a FIFO (First In, First Out) collection.
- **`Map`** does not extend **`Collection`**, but it stores key-value pairs and can be thought of as a collection of mappings.
