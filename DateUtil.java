public class DateUtil {
    public static String[] strMonths = {" Jan " , " Feb " , " Mar " , " Ap " , " May " , " Jun" , " Jul " , " Aug " , " Sep " , " Oct " , " Nov " , " Dec "} ;
    public static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year){
        boolean isLeapYear ;

        // divisible by 4
        isLeapYear = (year % 4 == 0) ;

        // divisible by 4 and not 100
        isLeapYear = isLeapYear && (year % 100 != 0) ;

        // divisible by 4 and not 100 unless divisible by 400
        isLeapYear = isLeapYear || (year % 400 == 0) ;
        return isLeapYear;
    }
    public static boolean isValidDate(int year, int month, int day){
        if(!(day > 0 && day < 32 && month > 0 && month < 13 && year > 0))
            return false;
        int day_num = 0;
        switch (month){
            case 4:
            case 6:
            case 9:
            case 11: day_num = 30; break;
            case 2: if(isLeapYear(year))
                day_num = 29;
            else day_num = 28; break;
            default: day_num = 31;
        }
        if (day > day_num) return false;
        return true;
    }
    public static int getDayOfWeek(int year, int month, int day) {
            int y0 = year - (14 - month)/12;
            int x = y0 + y0/4 - y0/100 + y0/400;
            int m0 = month + 12 * ((14 - month)/12) - 2;
            int d0 = (day + x + 31*m0/12) % 7;
        return d0;
    }
    public static String toString(int year, int month, int day){
        String dayOfWeek = switch (getDayOfWeek(year, month, day)) {
            case 0 -> "Sunday ";
            case 1 -> "Monday ";
            case 2 -> "Tuesday ";
            case 3 -> "Wednesday ";
            case 4 -> "Thursday ";
            case 5 -> "Friday ";
            case 6 -> "Saturday ";
            default -> null;
        };

        return dayOfWeek + day + strMonths[month-1] + year;
    }



    public static void main(String[] args){
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2011));
        System.out.println(isLeapYear(2012));

        System.out.println(isValidDate(2012, 2, 29));
        System.out.println(isValidDate(2011, 2, 29));
        System.out.println(isValidDate(2099, 12, 31));
        System.out.println(isValidDate(2099, 12, 32));

        System.out.println(getDayOfWeek(1982, 4, 24));
        System.out.println(getDayOfWeek(2000, 1, 1));
        System.out.println(getDayOfWeek(2054, 6, 19));
        System.out.println(getDayOfWeek(2012, 2, 17));

        System.out.println(toString(2012, 2, 14));
    }
}
