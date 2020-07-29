/*
 *  Copyright 2019 Spring Framework Guru (https://github.com/springframeworkguru).
 */

package br.com.or.sfg.brewery.sfgbrewery.web.mappers;

import br.com.or.sfg.brewery.sfgbrewery.domain.Beer;
import br.com.or.sfg.brewery.sfgbrewery.domain.BeerOrder;
import br.com.or.sfg.brewery.sfgbrewery.domain.BeerOrderLine;
import br.com.or.sfg.brewery.sfgbrewery.web.model.BeerOrderDto;
import br.com.or.sfg.brewery.sfgbrewery.web.model.BeerOrderLineDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerOrderMapper {

    BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

    BeerOrder dtoToBeerOrder(BeerOrderDto dto);

    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    default BeerOrderLine dtoToBeerOrder(BeerOrderLineDto dto){
        return BeerOrderLine.builder()
                .orderQuantity(dto.getOrderQuantity())
                .beer(Beer.builder().id(dto.getBeerId()).build())
                .build();
    }
}
