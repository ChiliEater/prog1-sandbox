package prog.sandbox.probepruefung.one;

public class ParkhausApplikation {
    public static void main(String[] args) {
        Parkhaus parkhaus = new Parkhaus(2);
        parkhaus.parkieren(new Fahrzeug("ZH 123"));
        parkhaus.parkieren(new Fahrzeug("ZH 142523"));
        parkhaus.parkieren(new Fahrzeug("ZH 121ddd123"));
        parkhaus.parkieren(new Fahrzeug("ZH 121ddd12dd53"));
        parkhaus.freiePlaetze();
    }
}
