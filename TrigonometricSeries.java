public class TrigonometricSeries {
    public static double sin(double x, int numTerms){
        double result = x, power = x, factorial = 1;
        int n = 2;
        while (n<=numTerms) {

            power = (power * x * x * -1); //- x^3 , x^5 ,-x^7,...
            factorial = (factorial * (n + 1)) * (n);//3!, 5!, 7!,....
            result = result + ((power/factorial )); // x - x^3/3! + ....

            n = n + 2;

        }
        return result;
    }

    public static double cos(double x, int numTerms){
        double result = 1, power = 1, factorial = 1;
        int n = 1;
        while (n<=numTerms) {

            power = (power * x * x * -1); //- x^2 , x^4 ,-x^6,...
            factorial = (factorial * (n + 1)) * (n);//2!, 4!, 6!,....
            result = result + ((power/factorial )); // x - x^3/3! + ....

            n = n + 2;

        }
        return result;
    }
}
