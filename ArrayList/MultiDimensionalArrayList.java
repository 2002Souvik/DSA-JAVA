import java.util.ArrayList;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> multiList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i = 1; i <= 5; i++) {
            list1.add(i * 10); // 10, 20, 30, 40, 50
            list2.add(i * 20); // 20, 40, 60, 80, 100
            list3.add(i * 30); // 30, 60, 90, 120, 150
        }

        multiList.add(list1);
        multiList.add(list2);
        multiList.add(list3);

        // list2.remove(3);
        // list2.remove(2);

        System.out.println("Multi-dimensional ArrayList:");
        System.out.println(multiList);

        for(int i = 0; i < multiList.size(); i++) {
            ArrayList<Integer> innerList = multiList.get(i);
            for(int j = 0; j < innerList.size(); j++) {
                System.out.print(innerList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
