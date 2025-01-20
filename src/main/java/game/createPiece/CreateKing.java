package main.java.game.createPiece;


import main.java.game.chessPiece.King;

public class CreateKing implements PieceCreation{

    public King createPiece() {
        return new King();
    }
}
