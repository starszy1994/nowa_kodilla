import java.util.Scanner;

public class Colorname {
    public static String getColorname() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select color - type first letter (B-blue, R-red, W-white, P-pink");
            String color = scanner.nextLine().trim().toUpperCase();
            switch(color) {
                case "B":
                    return "BLUE";
                case "R":
                    return "RED";
                case "W":
                    return "WHITE";
                case "P":
                    return "PINK";
                default:
                    System.out.println("Wrong first letter. Try again.");

            }
        }
    }
}
