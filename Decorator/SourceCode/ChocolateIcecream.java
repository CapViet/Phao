package Decorator.SourceCode;
//The concrete component, implementing the component interface, it's also the wrapped object
public class ChocolateIcecream implements Icecream{
    @Override
    public String getDescription(){
        return "Chocolate ice cream";
    }
}
