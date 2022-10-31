import java.util.ArrayList;
import java.util.List;

public class Q4ArrayColoursString {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Violet");
        list_Strings.add("Blue");
        list_Strings.add("Green");
        list_Strings.add("Yellow");
        list_Strings.add("Red");

        //using foreach loop
        System.out.println("Iterating over Arraylist using for-each loop");
        for (String list : list_Strings) {
            System.out.println(list);
        }
    }
}