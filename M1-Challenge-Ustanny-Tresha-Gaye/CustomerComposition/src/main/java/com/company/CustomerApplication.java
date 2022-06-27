package com.company;

public class CustomerApplication {

    public static void main(String[] args) {

        Customer subscriber1 = new Customer();

        subscriber1.setFirstName("Jay");
        subscriber1.setLastName("Leno");
        subscriber1.setEmail("jay@jayleno.com");
        subscriber1.setPhoneNumber("919-321-7654");
        subscriber1.setRewardsMember(true);

        Address sub1Address = new Address();

        sub1Address.setStreet1("123 Dream St");
        sub1Address.setStreet2("Apt 999");
        sub1Address.setCity("Palo Alto");
        sub1Address.setState("CA");
        sub1Address.setZip("94022");

        System.out.println(sub1Address);

        subscriber1.setBillingAddress(sub1Address);
        subscriber1.setShippingAddress(sub1Address);

        System.out.println(subscriber1);
    }
}
