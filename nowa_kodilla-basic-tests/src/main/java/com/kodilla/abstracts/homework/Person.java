
package com.kodilla.abstracts.homework;

public class Person {

    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;

    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Person anna = new Person ("Anna", 28, teacher);
        Comedian comedian = new Comedian ();
        Person ricky = new Person ("Ricky", 48, comedian);
        Driver driver = new Driver ();
        Person joe = new Person ("Joe", 28, driver);
        Person[] person = {anna, ricky, joe};
        int numberOfElements = person.length;
        int result = 0;

        teacher.getResponsibilities();
        comedian.getResponsibilities();
        driver.getResponsibilities();
    }
}
