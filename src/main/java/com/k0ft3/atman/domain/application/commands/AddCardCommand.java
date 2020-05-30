package com.k0ft3.atman.domain.application.commands;

public class AddCardCommand extends UserCommand {

    private CardListId cardListId;
    private String title;
    private int position;

    public AddCardCommand(CardListId cardListId, String title, int position) {
        this.cardListId = cardListId;
        this.title = title;
        this.position = position;
    }

    public CardListId getCardListId() {
        return cardListId;
    }

    public String getTitle() {
        return title;
    }

    public int getPosition() {
        return position;
    }
}