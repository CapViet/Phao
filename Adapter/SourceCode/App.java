package Adapter.SourceCode;
//the client code
public class App {
    public static void main(String[] args){
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        System.out .println(hole.fits(roundPeg));

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        //System.out .println(hole.fits(smallSqPeg)); won't work bcs of the incompatibility


        //Use the adapter to help the incompatible class use the interface
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        System.out.println(hole.fits(smallSqPegAdapter));
        System.out.println(hole.fits(largeSqPegAdapter));
    }
}
