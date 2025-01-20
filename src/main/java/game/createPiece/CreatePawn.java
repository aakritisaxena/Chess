package main.java.game.createPiece;

import main.java.game.chessPiece.Pawn;

public class CreatePawn implements PieceCreation {


    public Pawn createPiece() {
        return new Pawn();
    }
}
