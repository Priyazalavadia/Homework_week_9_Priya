import java.util.HashMap;
import java.util.Map;

public class Q10ParticularStations {
    public static void main(String[] args) {
        HashMap<Integer, String> metropolitanLine = new HashMap<>();
        metropolitanLine.put(1, "BakerStreet");
        metropolitanLine.put(2, "King Cross");
        metropolitanLine.put(3, "MoorGate");
        metropolitanLine.put(4, "Liverpool");
        metropolitanLine.put(5, "Aldgate");
        metropolitanLine.put(6, "great portland street");
        metropolitanLine.put(7, "Ferringdon");
        metropolitanLine.put(8, "Barbican");
        for (Map.Entry<Integer, String> metropolitanline : metropolitanLine.entrySet()) {
            System.out.println(metropolitanline);


        }

    }
}