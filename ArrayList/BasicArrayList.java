import java.util.ArrayList;

public class BasicArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add O(1)
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("ArrayList after adding elements: " + list);

        list.add(1, 15); // O(n)
        System.out.println("ArrayList after adding 15 at index 1: " + list);

        // Get O(1)
        int elementAtIndex1 = list.get(1);
        System.out.println("Element at index 1: " + elementAtIndex1);

        // Remove O(n)
        list.remove(0);
        System.out.println("ArrayList after removing element at index 0: " + list);

        // Set O(1)
        list.set(0, 25);
        System.out.println("ArrayList after setting element at index 0 to 25: " + list);

        // Size O(1)
        int size = list.size();
        System.out.println("Size of the ArrayList: " + size);

        // Contains O(n)
        boolean contains20 = list.contains(20);
        System.out.println("ArrayList contains 20: " + contains20);

    }
}
