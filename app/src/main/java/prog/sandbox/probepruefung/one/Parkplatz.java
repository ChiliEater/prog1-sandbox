package prog.sandbox.probepruefung.one;

public class Parkplatz {
    private int parkplatzId;
    private Fahrzeug fahrzeug = null;

    public Parkplatz(int id) {
        parkplatzId = id;
    }

    public void verlassen() {
        fahrzeug = null;
    }

    public void parkieren(Fahrzeug fahrzeug) {
        if (this.fahrzeug != null) {
            throw new NichtParkierbarException();
        }
        this.fahrzeug = fahrzeug;
    }

    public int getParkplatzId() {
        return parkplatzId;
    }

    public Fahrzeug getFahrzeug(){
        return fahrzeug;
    }

}
