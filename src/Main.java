public class Main {
    public static void main(String[] args) {
//    Shapes деген класс түзүңүз, анын findArea() деген методу болсун.
//    Shape классты Triangle, Rectangle, Circle, Square деген класстар мурастасын.
//    Жана өзүлөрүнө жараша полялары болсун. Ар бир класс Shape класстын findArea()
//    методун Override кылып,  аянтын тапкан логика жазыңыз.Main класстан ар бир фигуранын объекттерин түзүп,
//    параметрилерин берип, findArea() методун чыкырып, аянтын табыңыз
        Shapes[] shapes = {new Triangle(2, 6),
                new Rectangle(2, 6),
                new Circle(2),
                new Square(2, 6)};
        for (Shapes s : shapes) {
            System.out.println(s.toString() + "\n");
        }
    }
}