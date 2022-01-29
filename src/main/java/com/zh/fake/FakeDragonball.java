package com.zh.fake;

import com.github.javafaker.Faker;

public class FakeDragonball {
    public static void main(String[] args) {
        Faker faker = new Faker();
        for (int i = 0; i < 20; i++) {
            String character = faker.dragonBall().character();
            System.out.println(character);
        }
    }
}

class FakeInternet {
    public static void main(String[] args) {
        Faker faker = FakerOne.getInstance();
        for (int i = 0; i < 20; i++) {
            String password = faker.internet().password(true);
            String avatar = faker.internet().avatar();
            String emailAddress = faker.internet().safeEmailAddress();
            System.out.println("password = " + password + ", avatar = " + avatar + " emailAddress = " + emailAddress);
        }
    }
}

class FakeWeather{
    public static void main(String[] args) {
        Faker faker = FakerOne.getInstance();
        for (int i = 0; i < 10; i++) {

            String description = faker.weather().description();
            String celsius = faker.weather().temperatureCelsius();
            String fahrenheit = faker.weather().temperatureFahrenheit();
            System.out.println("description = " + description + ", celsius = " + celsius + " fahrenheit = " + fahrenheit);
        }

    }
}