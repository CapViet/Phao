package AbstractFactory.SourceCode;
//This is a concrete factory, implementing the abstract factory
public class RoundedShapeFactory implements AbstractFactory{
    @Override
    public Shape getShape(String type){
        if(type.equalsIgnoreCase("rectangle")){
            return new RoundedRectangle();
        }
        else  if(type.equalsIgnoreCase("square")){
            return new RoundedSquare();
        }
        return null;
    }
}
