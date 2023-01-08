package Adapter.SourceCode;
//the adapter that helps the incompatible class use the interface
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg; //wrapping/using the incompatible interface
    public SquarePegAdapter(SquarePeg peg){
        this.peg = peg;
    }
    @Override
    //calculation that get the potential radius of the circle that wraps around the square
    public int getRadius(){
        return (int) (peg.getWidth() * Math.sqrt(2) /2);
    }
}
