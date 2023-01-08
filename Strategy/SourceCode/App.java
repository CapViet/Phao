package Strategy.SourceCode;
import java.util.Scanner;

public class App { //or client class
    public static void main(String[] args){
        Context context = new Context();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.println("Enter the action from: addition, subtraction or multiplication, 1 - 2 - 3");
        int action = sc.nextInt();
        sc.close();

        //setting the strategy according to the input
        if(action == 1){
            context.setStrategy(new ConcreteStrategyAdd());
        }
        else if( action == 2){
            context.setStrategy(new ConcreteStrategySubtract());
        }
        else if (action == 3){
            context.setStrategy(new ConcreteStrategyMultiply());
        }

        //executing the setted (?) strategy
        int result = context.execute(a,b);

        System.out.println(result);
    }
}
