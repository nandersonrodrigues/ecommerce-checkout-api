package com.digitalinnovationone.ecommercecheckoutapi.service;

import com.digitalinnovationone.ecommercecheckoutapi.entity.CheckoutEntity;
import com.digitalinnovationone.ecommercecheckoutapi.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}
