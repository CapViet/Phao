package Observer.SourceCode;
//this  is the publisher/subject class
import java.util.*;

public class Subject{
    //list of observers/subscribers
    private final List<Observer> observers;
    //the base state of the subject/publisher
    private int state;


    public Subject(){
        observers = new LinkedList<>();
        state = 1;
    }
    public int getState() {
        return this.state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }
    //adding new observers/subsribers
    public void attach(Observer observer){
        observers.add(observer);
    }

    //notifying about the update
    public void notifyAllObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
