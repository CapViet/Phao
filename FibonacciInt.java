public class FibonacciInt {
    public static void fibonacci() {
        int n = 2;
        int f0 = 0, f1 = 1, fn = 1;
        System.out.println("F(0)" + " = " + f0);  //F(0), F(1) because i can't be bothered
        System.out.println("F(1)" + " = " + f1);

        while(true){
            f0 = f1; //f(n-2)
            f1 = fn;//f(n-1)
            fn = f0 + f1;//fn = f(n-1) + f(n-2);

            System.out.println("F(" + n + ")" + " = " + fn);
            if (Integer.MAX_VALUE - fn < f1) { //check the next f(n-2), f(n-1) to see if they are still in the int range
                System.out.println("F(" + (n + 1) + ")" + " is out of the range of int");
                break;
            }

            n++;
        }

    }
    public static void main(String[] args){
        FibonacciInt.fibonacci();
    }
}
