package demoForMaps;

import java.time.LocalDate;
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
//        Map<String, Long> contactList = new HashMap<String, Long>();
//        contactList.put("RandoJawn", 3023587584L);
//        contactList.put("ohhsnap", 3024767890L);
//        contactList.replace("RandoJawn", 3023587584L, 3025678989L);
//        System.out.println(contactList);
//        System.out.println(contactList.keySet());

//        Map<Integer, String> products = new LinkedHashMap<Integer, String>();
//        products.put(1000, "Notebook");
//        products.put(2000, "Phone");
//        products.put(3000, "Keyboard");
//        System.out.println(products);
//
//        for(Map.Entry<Integer, String> product : products.entrySet()){
//            System.out.println(product.getKey());
//        }
//        SortedMap<LocalDate, String> events = new TreeMap<>();
//
//        events.put(LocalDate.of(2017, 6, 6), "The Java conference");
//        events.put(LocalDate.of(2017, 6, 7), "Another Java conference");
//        events.put(LocalDate.of(2017, 6, 8), "Discussion create or edit");
//
//        LocalDate fromInclusive = LocalDate.of(2017, 6, 6);
//        LocalDate toExclusive = LocalDate.of(2017, 6, 8);
//
//        System.out.println(events.subMap(fromInclusive, toExclusive));
//
//        ArrayList<String> myPeeps = new ArrayList<>();
//        myPeeps.add("Christian");
//        myPeeps.add("T-bone");
//        myPeeps.add("roger");
//
//        myPeeps.remove("roger");
//
//        for(String x: myPeeps){
//            System.out.println(x);
//        }
        List<String> list = new LinkedList<>();
        list.add("palma");
        list.add("edna");
        list.add("samantha");

        for (String l : list) {
            System.out.println(l);
        }

       // ArrayDeque(Collection<? extends E> c);
       // Constructs a deque containing the elements of the specified collection, in the order they are returned by the collection's iterator.
        // Parameters: c - the collection whose elements are to be placed into the deque
        // Throws: NullPointerException - if the specified collection is null

        // ArrayDeque(int numElements);
        // Constructs an empty array deque with an initial capacity sufficient to hold the specified number of elements.

        // This constructor is used to create an empty array deque with an initial capacity sufficient to hold 16 elements.
        // ArrayDeque class implements the Deque interface.
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

