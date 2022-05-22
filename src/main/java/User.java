public class User {
    String firstName;
    int age;

    public User(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        User Mati = new User("Mati", 28);
        User Martyna = new User("Martyna", 30);
        User Pawel = new User("Paweł", 29);
        User Anita = new User("Anita", 17);
        User Jan = new User("Jan", 56);

        User[] users = {Mati, Martyna, Pawel, Anita, Jan};
        int numberOfElements = users.length;
        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].age;
        }
        result = result / users.length;
        for (int i = 0; i < users.length; i++){
            if (users[i].age < result) {
                System.out.println(users[i].getFirstName());
            }
        }
    }
}

