package com.zh.fake;


import com.github.javafaker.Faker;
import lombok.*;

import java.util.Arrays;
import java.util.Locale;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
class Person {
    String name;
    String lastName;
    String firstName;
    String streetAddress;
}

public class FakeName {

    public static void main(String[] args) {
        Faker faker = new Faker(Locale.CHINA);

        Person[] people = new Person[30];
        for (int i = 0; i < 30; i++) {
            Person.PersonBuilder builder = Person.builder()
                    .name(faker.name().name())
                    .firstName(faker.name().firstName())
                    .lastName(faker.name().lastName())
                    .streetAddress(faker.address().streetAddress());
            Person person = builder.build();
//            System.out.println("person = " + person);
            people[i] = person;
        }

        Arrays.stream(people).forEach(System.out::println);

    }
}
