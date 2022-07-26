package com.trilogyed.gamestorecatalog.service;

import com.trilogyed.gamestorecatalog.viewModel.ConsoleViewModel;
import com.trilogyed.gamestorecatalog.viewModel.GameViewModel;
import com.trilogyed.gamestorecatalog.viewModel.TShirtViewModel;

import java.util.List;

public interface CatalogService {

    // games

    GameViewModel getGame(long id);

    GameViewModel createGame(GameViewModel gameViewModel);

    void updateGame(GameViewModel gameViewModel);

    void deleteGame(long id);

    List<GameViewModel> getGameByEsrb(String esrb);

    List<GameViewModel> getGameByTitle(String title);

    List<GameViewModel> getGameByStudio(String studio);

    List<GameViewModel> getAllGames();

    // consoles

    ConsoleViewModel createConsole(ConsoleViewModel consoleViewModel);

    ConsoleViewModel getConsoleById(long id);

    void updateConsole(ConsoleViewModel consoleViewModel);

    void deleteConsole(long id);

    List<ConsoleViewModel> getAllConsoles();

    // tShirt

    TShirtViewModel createTShirt(TShirtViewModel tShirtViewModel);

    TShirtViewModel getTShirt(long id);

    void updateTShirt(TShirtViewModel tShirtViewModel);

    void deleteTShirt(long id);

    List<TShirtViewModel> getTShirtByColor(String color);

    List<TShirtViewModel> getTShirtBySize(String size);

    List<TShirtViewModel> getAllTShirts();

}
