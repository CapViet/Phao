package Decorator.SourceCode;
//the base decorator class (can be an interface), implementing the component, it's also the wrapping object
public abstract class ToppingDecorator implements Icecream{
    protected Icecream icecream; //the field referencing the wrappee
    public ToppingDecorator(Icecream icecream){
        this.icecream = icecream;
    }
    @Override
    public abstract String getDescription();
}
