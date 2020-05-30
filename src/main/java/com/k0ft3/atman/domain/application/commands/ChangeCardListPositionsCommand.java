package com.k0ft3.atman.domain.application.commands;

import java.util.List;

public class ChangeCardListPositionsCommand extends UserCommand {

    private BoardId boardId;
    private List<CardListPosition> cardListPositions;

    public ChangeCardListPositionsCommand(BoardId boardId, List<CardListPosition> cardListPositions) {
        this.boardId = boardId;
        this.cardListPositions = cardListPositions;
    }

    public BoardId getBoardId() {
        return boardId;
    }

    public List<CardListPosition> getCardListPositions() {
        return cardListPositions;
    }
}