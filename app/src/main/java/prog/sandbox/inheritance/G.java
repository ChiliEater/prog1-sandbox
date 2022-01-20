package prog.sandbox.inheritance;

public class G<X, Y, Z> {
    private X x;
    private Y y;
    private Z z;

    public G() {
        System.out.println("Generic class instantiated");
    }

    public G(X x, Y y, Z z) {
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Generic class instantiated with these variables: \nx = " + x + "\nY = " + y + "\nZ = " + z);
    }

    public X getX() {
        return x;
    }
    public void setX(X x) {
        this.x = x;
    }
    public Y getY() {
        return y;
    }
    public void setY(Y y) {
        this.y = y;
    }
    public Z getZ() {
        return z;
    }
    public void setZ(Z z) {
        this.z = z;
    }
}
