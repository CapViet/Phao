package Observer.SourceCode;
//this is the observer/subscriber class
public abstract class Observer {
    protected Subject subject;
    public Observer(Subject subject){
        this.subject = subject;
    }
    public abstract void update();
    public abstract String toString();
}
