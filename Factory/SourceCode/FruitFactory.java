package Factory.SourceCode;
//This is the concrete factory, returning a different type of product, depending on the choice
public class FruitFactory {
    //returning the product type matching with the interface (aka fruit in this instance)
    public Fruit getFruit(String fruit) {
        if (fruit.equalsIgnoreCase("apple")){
            return new Apple();
        }
        else if(fruit.equalsIgnoreCase("banana")){
            return new Banana();
        }
        else if(fruit.equalsIgnoreCase("orange")){
            return new Orange();
        }
        return null;
    }
}
