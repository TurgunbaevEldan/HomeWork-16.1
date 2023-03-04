public class Circle extends Shapes {
    private final double PI = 3.14;
    private int a;

    public Circle(int a) {
        this.a = a;
    }

    public Circle() {
    }

    public double getPI() {
        return PI;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String findArea() {
        return "S = PI " + " * ( " + a + " * " + a + " ) = " + PI * (a * a);
    }

    @Override
    public String toString() {
        return findArea() + " Circle";
    }
}
