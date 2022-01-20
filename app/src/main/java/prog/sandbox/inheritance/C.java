package prog.sandbox.inheritance;

public class C extends B implements D {
    public C() {
        System.out.println("C intitialized");

    }

    public C(String input) {
        System.out.println("C initialized with string: " + input);
    }

    public void usesInterface() {
        System.out.println("C implements Interface D");
    }
}
