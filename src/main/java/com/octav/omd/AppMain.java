package com.octav.omd;

import com.github.javafaker.Faker;

public class AppMain {

    public static void main(String[] args) {

        Faker faker = new Faker();
          String randomMail = faker.internet().emailAddress();;
        System.out.println(randomMail);
    }

}
