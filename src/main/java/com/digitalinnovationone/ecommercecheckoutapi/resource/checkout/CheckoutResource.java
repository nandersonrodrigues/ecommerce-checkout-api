package com.digitalinnovationone.ecommercecheckoutapi.resource.checkout;

import com.digitalinnovationone.ecommercecheckoutapi.service.CheckoutService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/checkout")
//@RequiredArgsConstructor
public class CheckoutResource {

    private final CheckoutService checkoutService;

    public CheckoutResource(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    public ResponseEntity<Void> create(CheckoutRequest checkoutRequest) {

        checkoutService.create(checkoutRequest);

        return ResponseEntity.ok().build();
    }

}
