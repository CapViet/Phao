import java.util.Scanner;

public class NumberConversion {
    public static String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTVUWXYZ";
    public static String toRadix(String in, int inRadix , int outRadix){
        int dec = 0, power = 1;
        String out = " ";
        if(inRadix == outRadix){
            return in;
        }
        else {

            // Decimal equivalent = str[len-1]*1 + str[len-2]*radix + str[len-3]*(radix^2) + ...
            for (int i = in.length() - 1; i >= 0; i--) {
                int digit = Character.digit(in.charAt(i), inRadix);
                dec += digit * power;
                power = power * inRadix;
            }

            // Convert converted decimal above by repeatedly dividing it by the output radix and taking remainder
            while (dec > 0){
                out = alphabet.charAt(dec%outRadix) + out; //reversing the result
                dec /= outRadix;
            }
        }

        return out;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and radix: ");
        String in = sc.nextLine();

        Scanner scanInt = new Scanner(System.in);
        System.out.print("Enter the input radix: ");
        int inRadix = scanInt.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadix = scanInt.nextInt();

        System.out.println(in + " in radix " + inRadix + " is " + toRadix(in, inRadix, outRadix) + " in radix " + outRadix);
    }
}
