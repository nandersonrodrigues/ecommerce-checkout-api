package com.digitalinnovationone.ecommercecheckoutapi.service;

import com.digitalinnovationone.ecommercecheckoutapi.entity.CheckoutEntity;
import com.digitalinnovationone.ecommercecheckoutapi.repository.CheckoutRepository;
import com.digitalinnovationone.ecommercecheckoutapi.resource.checkout.CheckoutRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
//@RequiredArgsConstructor //constructor for all final fields
public class CheckoutServiceImpl implements CheckoutService{

    private final CheckoutRepository checkoutRepository;

    public CheckoutServiceImpl(CheckoutRepository checkoutRepository) {
        this.checkoutRepository = checkoutRepository;
    }

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
        /*final CheckoutEntity checkoutEntity = CheckoutEntity.builder()
                .code(UUID.randomUUID().toString())
                .build();
         */
        CheckoutEntity checkoutEntity = new CheckoutEntity();
        checkoutEntity.setCode(UUID.randomUUID().toString());
        return Optional.of(checkoutRepository.save(checkoutEntity));
    }
}
