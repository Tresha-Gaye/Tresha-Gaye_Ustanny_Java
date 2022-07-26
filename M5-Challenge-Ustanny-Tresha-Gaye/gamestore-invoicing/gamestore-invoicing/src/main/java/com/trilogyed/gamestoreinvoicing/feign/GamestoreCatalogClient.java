package com.trilogyed.gamestoreinvoicing.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "gamestore-catalog-service")
public interface GamestoreCatalogClient {

    @RequestMapping(value = "/game", method = RequestMethod.GET)
    public String getGames();

    @RequestMapping(method = RequestMethod.GET, value = "/game")
    List<Game> getStores();

    @RequestMapping(method = RequestMethod.POST, value = "/game/{gameId}", consumes = "application/json")
    Game update(@PathVariable("gameId") Long storeId, Game game);

    @RequestMapping(method = RequestMethod.DELETE, value = "/game/{gameId}")
    void delete(@PathVariable Long gameId);

}
