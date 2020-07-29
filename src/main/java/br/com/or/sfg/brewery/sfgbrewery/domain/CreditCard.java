/*
 *  Copyright 2019 Spring Framework Guru (https://github.com/springframeworkguru).
 */

package br.com.or.sfg.brewery.sfgbrewery.domain;

import lombok.Builder;

import javax.persistence.Column;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.UUID;

public class CreditCard extends BaseEntity {

    @Builder
    public CreditCard(UUID id, Long version, Timestamp createdDate, Timestamp lastModifiedDate, Integer cardNumber,
                      LocalDate expirationDate, Integer cvv, Boolean primary) {
        super(id, version, createdDate, lastModifiedDate);
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.primary = primary;
    }

    private Integer cardNumber;
    private LocalDate expirationDate;
    private Integer cvv;

    @Column(name = "PRIMARY_CARD") //'primary' is a SQL reserved word
    private Boolean primary;
}