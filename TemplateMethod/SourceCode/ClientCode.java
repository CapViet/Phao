package TemplateMethod.SourceCode;
//Client code, obviously
public class ClientCode {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }

}
