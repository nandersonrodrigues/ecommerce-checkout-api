package com.digitalinnovationone.ecommercekafkaproject.service;

import com.digitalinnovationone.ecommercekafkaproject.entity.CheckoutEntity;
import com.digitalinnovationone.ecommercekafkaproject.repository.CheckoutRepository;
import com.digitalinnovationone.ecommercekafkaproject.resource.checkout.CheckoutRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor //constructor for all final fields
public class CheckoutServiceImpl implements CheckoutService{

    private final CheckoutRepository checkoutRepository;

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
        final CheckoutEntity checkoutEntity = CheckoutEntity.builder()
                .code(UUID.randomUUID().toString())
                .build();
        return Optional.of(checkoutRepository.save(checkoutEntity));
    }
}
