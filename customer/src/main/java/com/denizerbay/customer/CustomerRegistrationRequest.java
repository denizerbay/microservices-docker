package com.denizerbay.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
