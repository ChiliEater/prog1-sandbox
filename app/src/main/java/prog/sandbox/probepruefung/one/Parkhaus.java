package prog.sandbox.probepruefung.one;

import java.util.ArrayList;
import java.util.List;

public class Parkhaus {
    private Parkplatz[] parkplaetze;

    public Parkhaus(int anzahlParkplaetze) {
        parkplaetze = new Parkplatz[anzahlParkplaetze];

        for (int i = 0; i < anzahlParkplaetze; i++) {
            parkplaetze[i] = new Parkplatz(i);
        }
    }

    public void parkiereAuf(int parkplatz, Fahrzeug fahrzeug) {
        try {
            parkplaetze[parkplatz - 1].parkieren(fahrzeug);
        } catch (Exception e) {
            throw new NichtParkierbarException();
        }
    }

    public void verlasse(int parkplatz) {
        try {
            parkplaetze[parkplatz - 1].verlassen();
        } catch (Exception e) {
            throw new NichtParkierbarException();
        }
    }

    public void freiePlaetze() {
        for (Parkplatz parkplatz : parkplaetze) {
            if (parkplatz.getFahrzeug() == null) {
                System.out.println(parkplatz.getParkplatzId() + 1);
            }
        }
    }

    public boolean parkieren(Fahrzeug fahrzeug) {
        Parkplatz freierPlatz = null;
        for (Parkplatz parkplatz : parkplaetze) {
            if (parkplatz.getFahrzeug() == null) {
                freierPlatz = parkplatz;
                break;
            }
        }
        try {
            freierPlatz.parkieren(fahrzeug);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
