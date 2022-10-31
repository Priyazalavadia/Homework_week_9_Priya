
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

public class Q9HasMapObjectCalled {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Dickens" , 1);
        people.put("Joseph Conrad", 2);
        people.put("Roald Dahl", 3);
        people.put("Diana Athill", 4);
        people.put("Rudyard Kipling", 5);
        // for(Map.Entry<Integer, String> people1 : people.entrySet()){
        //   System.out.println(people);
        for(String i : people.keySet()){
            System.out.println( "Name: " + i + " value:" + people.get(i));

        }
    }
}