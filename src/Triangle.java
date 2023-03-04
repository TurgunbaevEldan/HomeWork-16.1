public class Triangle extends Shapes {
    private int a;
    private int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    public Triangle() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public String findArea() {
        return "S = " + a + " * " + h + " * " + "/ 2 = " + (a * h) / 2;
    }

    @Override
    public String toString() {
        return findArea() + " Triangle";
    }
}
