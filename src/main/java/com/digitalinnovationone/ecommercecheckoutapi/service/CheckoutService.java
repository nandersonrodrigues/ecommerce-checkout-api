package com.digitalinnovationone.ecommercekafkaproject.service;

import com.digitalinnovationone.ecommercekafkaproject.entity.CheckoutEntity;
import com.digitalinnovationone.ecommercekafkaproject.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}
