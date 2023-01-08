package Factory.SourceCode;
//This is a concrete product implementing the product interface
public class Banana implements Fruit{
    @Override
    public void produceJuice(){
        System.out.println("Banana juice. Wait does banana even have juice ?");
    }
}
