import java.util.HashSet;
import java.util.Set;

public class Q8HashSetStoresIntegerObjects {

    public static void main(String[] args) {
        Set<Integer> list = new HashSet();

        //Adding elemnets into HashSet
        list.add(4);
        list.add(7);
        list.add(8);

        // show which numbers between 1 and 10 are in the set
        for(int i=1;i<10;i++){
            if(list.contains(i)) {
                System.out.println("numbers was found in the list : " + i);
            }else{
                System.out.println("number was not found in the list : " + i);
            }
        }
    }
}
