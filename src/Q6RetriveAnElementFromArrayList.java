import java.util.ArrayList;

public class Q6RetriveAnElementFromArrayList {


    // Array
    int a[] = new int[5];

    public static void main(String[] args) {
        //Array list
        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList <String> list1 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("Size : "+list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove(3);
        System.out.println("After removing value from index 2");
        for (int a : list) {
            System.out.println(a);

        }

    }
}