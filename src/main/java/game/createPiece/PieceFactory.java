package main.java.game.createPiece;

import main.java.game.chessPiece.Piece;

public class PieceFactory {

    public Piece getPiece(String pieceType) {
        if (pieceType.equalsIgnoreCase("Pawn")) {
            return new CreatePawn().createPiece();
        } else if (pieceType.equalsIgnoreCase("King")) {
            return new CreateKing().createPiece();
        } else {
            return new CreateQueen().createPiece();
        }

    }
}
