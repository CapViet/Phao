import java.util.Scanner;

public class ExponentialSeries {
    public static double specialSeries(double x, int numTerms){
        double result = x, power = x, multiply1 = 1, multiply2 =1, denominator ;
        int n = 1;
        int m = 2;
        while (n<=numTerms && m <= numTerms) {

            power *=  (x * x); //x^3, x^5,.....
            denominator = n + 2; //3,5,7,..... (denominator for x)
            multiply1 *= n; //1, 1*3, 1*3*5 (nominator)
            multiply2 *= m; //2, 2*4, 2*4*6 (denominator)
            result = result + (multiply1/multiply2) * (power/denominator);
            n = n + 2;
            m = m + 2;
        }
        return result;
    }

    public static void main(String[] args){

        System.out.println("Calculate a special series");
        System.out.println("Enter an x value and the limit");
        System.out.print("x = ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        Scanner scan = new Scanner(System.in);
        System.out.print("limit = ");
        int numTerms = scan.nextInt();
        System.out.println("The result = " + specialSeries(x, numTerms));
    }
}
