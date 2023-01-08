package TemplateMethod.SourceCode;
//the abstract class, declaring the methods as steps of an algorithm
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //template method und da steps
    public final void play(){

        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}
