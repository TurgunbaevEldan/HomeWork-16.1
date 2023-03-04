public class Rectangle extends Shapes {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String findArea() {
        return "S = " + a + " * " + b + " = " + (a * b);
    }

    @Override
    public String toString() {
        return findArea() + " Rectangle";
    }
}
