package com.trilogyed.gamestoreinvoicing.util.feign;

import com.trilogyed.gamestoreinvoicing.model.GameViewModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@FeignClient(name = "gamestore-catalog-service")
public interface GameStoreInvoicingClient {

    // Game
    @GetMapping("/game")
    @ResponseStatus(HttpStatus.OK)
    public List<GameViewModel> getAllGames();

    @GetMapping("/game/{id}")
    @ResponseStatus(HttpStatus.OK)
    public GameViewModel getGameInfo(@PathVariable("id") long gameId);

    @PutMapping("/game")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateGame(@RequestBody @Valid GameViewModel gameViewModel);

    @GetMapping("game/title/{title}")
    @ResponseStatus(HttpStatus.OK)
    public List<GameViewModel> getGamesByTitle(@PathVariable("title") String title);

    @GetMapping("game/esrbrating/{esrb}")
    @ResponseStatus(HttpStatus.OK)
    public List<GameViewModel> getGamesByEsrbRating(@PathVariable("esrb") String esrb);

    @GetMapping("game/studio/{studio}")
    @ResponseStatus(HttpStatus.OK)
    public List<GameViewModel> getGamesByStudio(@PathVariable("studio") String studio);





}
