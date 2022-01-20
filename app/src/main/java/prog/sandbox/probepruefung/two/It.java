package prog.sandbox.probepruefung.two;

import java.util.HashMap;

public class It {
    HashMap <Integer, String> alphabet = new HashMap<>();
    
    public void removeEveryThirdLetter(){
        for (int letter : alphabet.keySet()) {
            if (letter % 3 - 2 == 0) {
                alphabet.remove(letter);
            }
        }
    }
}
