import java.util.ArrayList;

public class Swap2Values {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int idx1 = 1, idx2 = 3;
        System.out.println("Before swapping: " + list);
        swapValues(list, idx1, idx2);
        System.out.println("After swapping values at index " + idx1 + " and " + idx2 + ": " + list);
    }

    public static void swapValues(ArrayList<Integer> list, int index1, int index2) {
        Integer temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}
