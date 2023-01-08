package Factory.SourceCode;
//The creator class, declaring the factory methods
public class Demo {
    public static void main(String[] args){
        FruitFactory fruitFactory = new FruitFactory();

        //get an object of Apple and call its produce juice method
        Fruit fruit1 = fruitFactory.getFruit("apple");
        fruit1.produceJuice();

        //get an object of Orange and call its produce juice method
        Fruit fruit2 = fruitFactory.getFruit("orange");
        fruit2.produceJuice();

        //get an object of Banana and call its produce juice method
        Fruit fruit3 = fruitFactory.getFruit("banana");
        fruit3.produceJuice();
    }

}
