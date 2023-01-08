package Observer.SourceCode;
//This is a concrete observer/concrete class, extending the observer class
public class HexalObserver extends Observer{
    private String hex;
    public HexalObserver(Subject subject){
        super(subject);
        subject.attach(this);
    }

    @Override
    public void update(){
        this.hex = convertDecimalToHexadecimal(subject.getState());
    }

    private String convertDecimalToHexadecimal(int decimal){
        return Integer.toHexString(decimal);
    }

    @Override
    public String toString(){
        return this.hex;
    }
}
