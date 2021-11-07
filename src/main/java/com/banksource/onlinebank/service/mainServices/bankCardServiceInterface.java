package com.banksource.onlinebank.service.mainServices;

import com.banksource.onlinebank.components.BankCard;

import java.util.List;

public interface bankCardServiceInterface {
    void addCard(BankCard bankCard);
    List<BankCard> filterByClientId(Long id);
    BankCard getCardById(Long id);
    BankCard getCardByCode(String code);
    void deleteCardById(Long id);
    void deleteAllCards();
}
