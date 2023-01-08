package Facade.SourceCode;
public class Demo {
    public static void main(String[] args) {
        //using facade to
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
