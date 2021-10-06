package com.digitalinnovationone.ecommercekafkaproject.resource.checkout;

import com.digitalinnovationone.ecommercekafkaproject.service.CheckoutService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/checkout")
@RequiredArgsConstructor
public class CheckoutResource {

    private final CheckoutService chekcoutService;

    public ResponseEntity<Void> create(CheckoutRequest checkoutRequest) {

        chekcoutService.create(checkoutRequest);

        return ResponseEntity.ok().build();
    }

}
