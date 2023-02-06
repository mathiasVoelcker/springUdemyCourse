package com.springUdemyCourse.learnspringproject.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) { };

record Address (String street, String city) { };

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Mathias";
    }

    @Bean
    @Primary
    public int age() {
        return 28;
    }

    @Bean
    @Qualifier("age123Qualifier")
    public int age123() {
        return 50;
    }
    
    @Bean
    public Person person() {
        var person = new Person("Laura", 24);
        return person;
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age());
    }

    @Bean
    public Person person3Parameter(String name, int testing) {
        return new Person(name, testing);
    }

    @Bean
    public Person person4WithQualifier(String name, @Qualifier("age123Qualifier") int testing) {
        return new Person(name, testing);
    }

    @Bean(name = "theAddress")
    public Address address() {
        return new Address("Barham", "Burbank :)");
    }
}