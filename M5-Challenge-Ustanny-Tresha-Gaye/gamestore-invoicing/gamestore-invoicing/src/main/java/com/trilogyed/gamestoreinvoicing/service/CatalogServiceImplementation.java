package com.trilogyed.gamestoreinvoicing.service;

import com.trilogyed.gamestorecatalog.util.feign.GamestoreCatalogClient;
import com.trilogyed.gamestorecatalog.viewModel.GameViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class CatalogServiceImplementation implements CatalogService{

    @Autowired
    private GamestoreCatalogClient gamestoreCatalogClient;

    @Override
    public GameViewModel getGame(long id) {
        return CatalogService.getGame(id);
    }

    @Override
    public GameViewModel createGame(GameViewModel gameViewModel) {
        return CatalogService.createGame(gameViewModel);
    }
}
