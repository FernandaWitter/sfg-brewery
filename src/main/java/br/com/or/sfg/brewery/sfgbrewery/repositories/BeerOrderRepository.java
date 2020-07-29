/*
 *  Copyright 2019 Spring Framework Guru (https://github.com/springframeworkguru).
 */

package br.com.or.sfg.brewery.sfgbrewery.repositories;

import br.com.or.sfg.brewery.sfgbrewery.domain.BeerOrder;
import br.com.or.sfg.brewery.sfgbrewery.domain.Customer;
import br.com.or.sfg.brewery.sfgbrewery.domain.OrderStatusEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

/**
 * Created by jt on 2019-01-26.
 */
public interface BeerOrderRepository  extends JpaRepository<BeerOrder, UUID> {

    Page<BeerOrder> findAllByCustomer(Customer customer, Pageable pageable);

    List<BeerOrder> findAllByOrderStatus(OrderStatusEnum orderStatusEnum);
}
