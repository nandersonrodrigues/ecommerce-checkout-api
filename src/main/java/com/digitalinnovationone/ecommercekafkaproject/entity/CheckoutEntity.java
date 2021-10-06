package com.digitalinnovationone.ecommercekafkaproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class CheckoutEntity {

    @Id
    private Long id;

    @Column
    private String code;
}
