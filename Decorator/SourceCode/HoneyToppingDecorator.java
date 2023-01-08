package Decorator.SourceCode;
//The concrete decorator, extending the base decorator, or implementing if it's an interface, it's also the wrapped object

public class HoneyToppingDecorator extends ToppingDecorator{
    public HoneyToppingDecorator(Icecream icecream){
        super(icecream);
    }
    @Override
    public String getDescription(){
        return icecream.getDescription() +", with Honey";
    }
}
