import java.util.ArrayDeque;
import java.util.Deque;

public class arrayDeque {
    public static void main(String[] args) {
        // ArrayDeque(Collection<? extends E> c);
        // Constructs a deque containing the elements of the specified collection, in the order they are returned by the collection's iterator.
        // Parameters: c - the collection whose elements are to be placed into the deque
        // Throws: NullPointerException - if the specified collection is null
        // Constructs a deque containing the elements of the specified collection, in the order they are returned by the collection's iterator.
        // (The first element returned by the collection's iterator becomes the first element, or front of the deque.)

//        ArrayDeque<Integer> anotherNum = new ArrayDeque<>(10);
//        anotherNum.add(1);
//        anotherNum.add(2);
//        System.out.println(anotherNum);
//    }
    // Constructs an empty array deque with an initial capacity sufficient to hold the specified number of elements.



        // This constructor is used to create an empty array deque with an initial capacity sufficient to hold 16 elements.
        // ArrayDeque class implements the Deque interface.
        // They can grow as neccessary to occupy elements.
        // It facilitates us to use the Deque. Unlike queue, we can add or delete the elements from both the ends.
        // ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.
        Deque<String> namesArray = new ArrayDeque<>();
        namesArray.add("Christian");
        namesArray.add("Hardy");
        namesArray.add("Jeff");
        //Traversing elements
        for (String names : namesArray) {
            System.out.println(names);
        }
    }
}
