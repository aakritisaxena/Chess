package main.java.game.createPiece;

import main.java.game.chessPiece.Queen;

public class CreateQueen implements PieceCreation {

    @Override
    public Queen createPiece() {
        return new Queen();
    }

}
