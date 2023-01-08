package Factory.SourceCode;
//This is a concrete product implementing the product interface
public class Orange implements Fruit{
    @Override
    public void produceJuice(){
        System.out.println("Orange juice");
    }
}
