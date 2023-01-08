package Observer.SourceCode;
//This is a concrete observer/concrete class, extending the observer class
public class OctalObserver extends Observer{
    String octal;
    public OctalObserver(Subject subject){
        super(subject);
        subject.attach(this);
    }

    @Override
    public void update(){
        this.octal = convertDecimalToOctal(subject.getState());
    }

    private String convertDecimalToOctal(int decimal){
        return Integer.toOctalString(decimal);
    }

    @Override
    public String toString(){
        return this.octal;
    }
}
