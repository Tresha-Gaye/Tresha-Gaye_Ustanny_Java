package com.trilogyed.gamestorecatalog.util.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "gamestore-catalog-service")
public interface GamestoreCatalogClient {

    @RequestMapping(value = "/game", method = RequestMethod.GET)
    public String getGames();

}
