package com.digitalinnovationone.ecommercekafkaproject.repository;

import com.digitalinnovationone.ecommercekafkaproject.entity.CheckoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutRepository  extends JpaRepository<CheckoutEntity, Long> {


}
