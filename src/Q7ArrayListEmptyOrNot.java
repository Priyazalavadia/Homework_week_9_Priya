import java.util.ArrayList;

public class Q7ArrayListEmptyOrNot {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Jubilee Line");
        list.add("Metropolitan Line");
        list.add("Northern Line");
        list.add("Piccadilly Line");
        list.add("Victoria Line");
        list.add("Waterloo & City Line");
        System.out.println("Original array List : " +list);

        if(list.isEmpty()){
            System.out.println("Its Empty");
        }
        else
            System.out.println("Not Empty");
    }
}
