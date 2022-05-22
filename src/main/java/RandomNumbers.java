import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random r = new Random();
        int min = 0;
        int max = 30;
        int sum = 0;
        while (sum < max) {
            int a = r.nextInt(5000);
            if (a>max) max = a;
            if (a<min) min = a;
            sum = sum + a;
        }
        System.out.println(sum);
        System.out.println("Najwieksza wylosowana liczba to: " + max);
        System.out.println("Najmniejsza wylosowania liczba to: " + min);
    }
}
