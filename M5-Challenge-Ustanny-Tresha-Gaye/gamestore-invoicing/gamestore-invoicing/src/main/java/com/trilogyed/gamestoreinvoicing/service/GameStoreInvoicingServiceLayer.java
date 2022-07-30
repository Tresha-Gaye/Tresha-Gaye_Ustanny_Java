package com.trilogyed.gamestoreinvoicing.service;

import com.trilogyed.gamestoreinvoicing.model.GameViewModel;
import com.trilogyed.gamestoreinvoicing.model.Invoice;
import com.trilogyed.gamestoreinvoicing.repository.InvoiceRepository;
import com.trilogyed.gamestoreinvoicing.repository.ProcessingFeeRepository;
import com.trilogyed.gamestoreinvoicing.repository.TaxRepository;
import com.trilogyed.gamestoreinvoicing.util.feign.GameStoreInvoicingClient;
import com.trilogyed.gamestoreinvoicing.viewModel.InvoiceViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.math.BigDecimal;
import java.util.List;

@Component
public class GameStoreInvoicingServiceLayer {

    private final BigDecimal PROCESSING_FEE = new BigDecimal("15.49");
    private final BigDecimal MAX_INVOICE_TOTAL = new BigDecimal("999.99");
    private final String GAME_ITEM_TYPE = "Game";
    private final String CONSOLE_ITEM_TYPE = "Console";
    private final String TSHIRT_ITEM_TYPE = "T-Shirt";

    InvoiceRepository invoiceRepo;
    TaxRepository taxRepo;
    ProcessingFeeRepository processingFeeRepo;

    @Autowired
    public GameStoreInvoicingServiceLayer(InvoiceRepository invoiceRepo, TaxRepository taxRepo, ProcessingFeeRepository processingFeeRepo) {
        this.invoiceRepo = invoiceRepo;
        this.taxRepo = taxRepo;
        this.processingFeeRepo = processingFeeRepo;
    }

    @Autowired
    GameStoreInvoicingClient client;

    // Game Feign methods
    public List<GameViewModel> getGames() {
        List<GameViewModel> gameList = this.client.getAllGames();
        return gameList;
    }

    public GameViewModel getGameById(@PathVariable("id") long gameId){
        return client.getGameInfo(gameId);
    }

    public List<GameViewModel> getGameTitle(@PathVariable("title") String title){
        return client.getGamesByTitle(title);
    }
    public List<GameViewModel> getGameRating(@PathVariable("esrb") String esrb){
        return client.getGamesByEsrbRating(esrb);
    }

    public List<GameViewModel> getGameStudio(@PathVariable("studio") String studio){
        return client.getGamesByStudio(studio);
    }


}