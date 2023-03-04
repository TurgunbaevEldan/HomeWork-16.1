public class Square extends Shapes {
    private int a;
    private int b;

    public Square(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Square() {
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
        return "S = ( " + a + " + " + b + " ) * 2 = " + (a + b) + 2;
    }

    @Override
    public String toString() {
        return findArea() + " Square";
    }
}
