package Decorator.SourceCode;
//The concrete component, implementing the component interface, it's also the wrapped object
public class StrawberryIcecream implements Icecream{
    @Override
    public String getDescription(){
        return "Strawberry ice cream";
    }
}
