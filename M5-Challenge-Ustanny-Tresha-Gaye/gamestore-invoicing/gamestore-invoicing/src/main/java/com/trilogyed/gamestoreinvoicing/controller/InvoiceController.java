package com.trilogyed.gamestoreinvoicing.controller;

import com.trilogyed.gamestoreinvoicing.model.GameViewModel;
import com.trilogyed.gamestoreinvoicing.service.GameStoreInvoicingServiceLayer;
import com.trilogyed.gamestoreinvoicing.viewModel.InvoiceViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/invoice")
@CrossOrigin(origins = {"http://localhost:3000"})
public class InvoiceController {

    @Autowired
    GameStoreInvoicingServiceLayer service;

    @GetMapping("/game")
    public List<GameViewModel> getAllGames() {
        return service.getGames();
    }

    @GetMapping("/game/{id}")
    public GameViewModel getGameInfo(@PathVariable("id") long gameId) {
        return service.getGameById(gameId);
    }

    @GetMapping("game/title/{title}")
    public List<GameViewModel> getGamesByTitle(@PathVariable("title") String title){
        return service.getGameTitle(title);
    }

    @GetMapping("game/esrbrating/{esrb}")
    public List<GameViewModel> getGamesByEsrbRating(@PathVariable("esrb") String esrb){
        return service.getGameRating(esrb);
    }

    @GetMapping("game/studio/{studio}")
    public List<GameViewModel> getGamesByStudio(@PathVariable("studio") String studio){
        return service.getGameStudio(studio);
    }
}
