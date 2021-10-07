package com.digitalinnovationone.ecommercecheckoutapi.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class CheckoutEntity {

    @Id
    private Long id;

    @Column
    private String code;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


}
