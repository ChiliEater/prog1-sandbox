package prog.sandbox.inheritance;

public class B extends A {
    public B() {
        super("B");
        System.out.println("B intitialized");
    }

    public B(String input) {
        System.out.println("B initialized with string: " + input);
    }
}
