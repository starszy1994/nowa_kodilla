public class LeapYear {
    public static void main(String[] args) {
        int year = 2008;
        int leapYear;
        int yearNotLeap;

        if (year %4==0 && year%100!=0 || year%400==0) {
            System.out.println("Rok jest przestępny!");;
        } else {
            System.out.println("Rok nie jest przestępny!");
        }
    }
}
