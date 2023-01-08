package AbstractFactory.SourceCode;
//This class serves to make the client code shorter, as in you don't need to write a lengthy code in the client
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        //check which concrete factory ya want to work with
        if(type.equals("rounded")){
            return new RoundedShapeFactory();
        }
        else{
            return new ShapeFactory();
        }
    }
}
