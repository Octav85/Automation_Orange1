package com.octav.omd;

import com.github.javafaker.Faker;

public class AppMain {

    public static void main(String[] args) {

        Faker faker = new Faker();
          String randomMail = faker.internet().emailAddress();;
        System.out.println(randomMail);

        // Generate a random name
        String randomName = faker.name().fullName();
        System.out.println("Random Name: " + randomName);

        // Generate a random address
        String randomAddress = faker.address().fullAddress();
        System.out.println("Random Address: " + randomAddress);

        // Generate a random phone number
        String randomPhone = faker.phoneNumber().cellPhone();
        System.out.println("Random Phone Number: " + randomPhone);

    }



}
