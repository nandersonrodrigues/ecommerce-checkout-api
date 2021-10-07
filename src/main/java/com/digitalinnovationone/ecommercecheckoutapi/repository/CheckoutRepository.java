package com.digitalinnovationone.ecommercecheckoutapi.repository;

import com.digitalinnovationone.ecommercecheckoutapi.entity.CheckoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutRepository  extends JpaRepository<CheckoutEntity, Long> {


}
