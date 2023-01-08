package AbstractFactory.SourceCode;
//This is a concrete factory, implementing the abstract factory
public class ShapeFactory implements AbstractFactory{
    @Override
    public Shape getShape(String type){
        if(type.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        else  if(type.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }
}
