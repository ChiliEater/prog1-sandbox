package prog.sandbox.inheritance;

public class Runner {

    public static void main(String[] args) {
        C c = new C();
        space();
        G g = new G<String, Integer, Float>("Aaa", 2, 1.0f);
        space();
        D d = new C();
        c = (C) new A();
    }

    public static void space() {
        System.out.println("====================");
    }
}
