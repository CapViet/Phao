package Factory.SourceCode;
//This is a concrete product implementing the product interface
public class Apple implements Fruit{
    @Override
    public void produceJuice(){
        System.out.println("Apple juice");
    }
}
