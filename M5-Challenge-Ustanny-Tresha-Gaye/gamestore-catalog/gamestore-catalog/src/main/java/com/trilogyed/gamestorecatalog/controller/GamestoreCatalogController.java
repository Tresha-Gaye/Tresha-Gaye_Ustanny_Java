//package com.trilogyed.gamestorecatalog.controller;
//
//import com.trilogyed.gamestorecatalog.util.feign.GamestoreCatalogClient;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RefreshScope
//public class GamestoreCatalogController {
//
//    @Autowired
//    private final GamestoreCatalogClient client;
//
//    GamestoreCatalogController(GamestoreCatalogClient client) {
//        this.client = client;
//    }
//
//    @RequestMapping(value="/game", method = RequestMethod.GET)
//    public String getAllGames() {
////        return client.getRandomQuote();
//        return client.getGames();
//    }
//     @RequestMapping(value="/game/{gameId}", method = RequestMethod.GET)
//    public String getGameById(@PathVariable int gameId) {
//        return client.getGameById(gameId);
//    }
//
//    @RequestMapping(value="/game", method = RequestMethod.POST)
//    public String addGame(@RequestBody String game) {
//        return client.addGame(game);
//    }
//}
