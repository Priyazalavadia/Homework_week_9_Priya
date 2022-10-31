import java.util.ArrayList;
import java.util.ListIterator;

public class Q5ArrayListUsingIterator {
    public static void main(String[] args) {
        //Creating an ArrayList
        ArrayList<Integer> num = new ArrayList();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        System.out.println("ArrayList: " + num);

        //creating an instance of ListIterator
        ListIterator<Integer> iterator = num.listIterator();
        System.out.println("Iterating over ArrayList: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " , ");
        }
    }


}


