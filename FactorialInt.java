public class FactorialInt {

    public static void factorialInt(){
        int x = 1, factorial = 1;
        System.out.println("Int factorials: ");
        while (true) {
            factorial *= x;

            System.out.println("The factorial of " + x + " is " + factorial);
            if (Integer.MAX_VALUE / factorial < (x + 1)) {
                System.out.println("The factorial of " + (x + 1) + " is out of range ");
                break;
            }
            x++;
        }
    }

    public static void factorialLong(){
        long x = 1L, factorial = 1L;
        System.out.println("Long factorials: ");
        while (true) {
            factorial *= x;

            System.out.println("The factorial of " + x + " is " + factorial);
            if (Long.MAX_VALUE / factorial < (x + 1)) {
                System.out.println("The factorial of " + (x + 1) + " is out of range ");
                break;
            }
            x++;
        }
    }

    public static void main(String[] args){

        FactorialInt.factorialInt();
        System.out.println();
        FactorialInt.factorialLong();
    }
}
