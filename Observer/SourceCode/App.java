package Observer.SourceCode;
//client code
public class App {
    public static void main(String[] args) {
        //create a new subject object
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        subject.attach(binaryObserver);

        OctalObserver octalObserver = new OctalObserver(subject);
        subject.attach(octalObserver);

        HexalObserver hexalObserver = new HexalObserver(subject);

        //try with the base state (=1 as defined in subject class)
        subject.attach(hexalObserver);
        System.out.println("Decimal = " + subject.getState());
        System.out.println(binaryObserver);
        System.out.println(octalObserver);
        System.out.println(hexalObserver);
        System.out.println();

        //setting the state, notifying the other observers about the change and update the result
        subject.setState(1234);
        System.out.println("Decimal = " +subject.getState());
        System.out.println(binaryObserver);
        System.out.println(octalObserver);
        System.out.println(hexalObserver);
        System.out.println();

        subject.setState(56789);
        System.out.println("Decimal = " + subject.getState());
        System.out.println(binaryObserver);
        System.out.println(octalObserver);
        System.out.println(hexalObserver);
    }
}
