package AbstractFactory.SourceCode;

public class Demo {
    public static void main(String[] args) {
        //get shape factory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory("not rounded");
        //get an object of Shape Rectangle
        Shape shape1 = shapeFactory1.getShape("RECTANGLE");
        //call draw method of Shape Rectangle
        shape1.draw();
        //get an object of Shape Square
        Shape shape2 = shapeFactory1.getShape("SQUARE");
        //call draw method of Shape Square
        shape2.draw();
        //get rounded* shape factory
        AbstractFactory shapeFactory2 = FactoryProducer.getFactory("rounded");
        //get an object of Shape Rectangle
        Shape shape3 = shapeFactory2.getShape("RECTANGLE");
        //call draw method of Shape Rectangle
        shape3.draw();
        //get an object of Shape Square
        Shape shape4 = shapeFactory2.getShape("SQUARE");
        //call draw method of Shape Square
        shape4.draw();

    }
}
