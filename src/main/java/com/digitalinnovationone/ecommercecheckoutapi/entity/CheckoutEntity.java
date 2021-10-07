package com.digitalinnovationone.ecommercekafkaproject.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class CheckoutEntity {

    @Id
    private Long id;

    @Column
    private String code;
}
