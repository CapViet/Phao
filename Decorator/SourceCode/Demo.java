package Decorator.SourceCode;
//client code
public class Demo {
    public static void main(String[] args){
        Icecream icecream = new ChocolateIcecream();
        System.out.println(icecream.getDescription());

        Icecream IceCreamWithHoney = new HoneyToppingDecorator(new VanillaIcecream());
        System.out.println(IceCreamWithHoney.getDescription());

        Icecream IceCreamWithNuts = new NutsToppingDecorator(new StrawberryIcecream());
        System.out.println(IceCreamWithNuts.getDescription());

    }
}
