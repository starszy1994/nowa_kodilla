package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double averageOverForty = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPosts())
                .average()
                .getAsDouble();
        System.out.println("Users over 40 age: " + averageOverForty);

        Double averagePostsForUsersBelowForty = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPosts())
                .average()
                .getAsDouble();
        System.out.println("The average of posts for users below 40 age: " + averagePostsForUsersBelowForty);

    }
}