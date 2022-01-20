package prog.sandbox.probepruefung.two;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class Filter {
    private List<String> input = new ArrayList<>();
    private HashSet<String> illegal = new HashSet<>();

    public Filter() {
        input.add("Taxi,   ");
        input.add("Taxi, Zurich");
        input.add("Zurich");
        input.add("    Zurich  Taxi");
        input.add("");
        input.add("  ");

        illegal.add("zurich");
    }

    public void checkList() {
        Iterator it = input.iterator();
        while(it.hasNext()) {
            String current = (String)it.next();
            for (String illegalString : illegal) {
                if (current.toLowerCase().contains(illegalString)) {
                    it.remove();
                    //System.out.println("removed: " + current);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        new Filter().checkList();
    }
}
