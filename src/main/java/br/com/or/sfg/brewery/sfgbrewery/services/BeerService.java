/*
 *  Copyright 2019 Spring Framework Guru (https://github.com/springframeworkguru).
 */

package br.com.or.sfg.brewery.sfgbrewery.services;

import br.com.or.sfg.brewery.sfgbrewery.web.model.BeerDto;
import br.com.or.sfg.brewery.sfgbrewery.web.model.BeerPagedList;
import br.com.or.sfg.brewery.sfgbrewery.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {
    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest);

    BeerDto findBeerById(UUID beerId);
}