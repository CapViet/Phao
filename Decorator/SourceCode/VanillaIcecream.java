package Decorator.SourceCode;
//The concrete component, implementing the component interface, it's also the wrapped object
public class VanillaIcecream implements Icecream{
    @Override
    public String getDescription(){
        return "Vanilla ice cream";
    }
}
