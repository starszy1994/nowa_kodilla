public class SimpleArray {
    public static void main(String[] args) {
        String [] friends = new String[5];
        friends[0] = "Paweł";
        friends[1] = "Marek";
        friends[2] = "Tomasz";
        friends[3] = "Mateusz";
        friends[4] = "Sebastian";

        String friend = friends[2];

        System.out.println(friends[2]);

        int numberOfElements = friends.length;

        System.out.println("Moja tablica ma " + numberOfElements + " elementów!");
    }
}
