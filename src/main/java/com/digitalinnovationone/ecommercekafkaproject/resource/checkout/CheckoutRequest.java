package com.digitalinnovationone.ecommercekafkaproject.resource.checkout;

import lombok.Data;

@Data
public class CheckoutRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String complement;
    private String country;
    private String state;
    private String cep;
    private Boolean saveAddress;
    private Boolean saveInfo;
    private String paymentMethod;
    private String cardName;
    private String cardNumber;
    private String cardDate;
    private String cardCVV;
}
