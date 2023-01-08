package Adapter.SourceCode;

//class with compatible interface
public class RoundPeg {
    private int radius;
    public RoundPeg(){}
    public RoundPeg (int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return this.radius;
    }
}
