package main.java.game.createPiece;

import main.java.game.chessPiece.Piece;
import main.java.game.exception.PieceNotConfiguredException;

public class PieceFactory {

    public Piece getPiece(String pieceType) throws PieceNotConfiguredException {
        if (pieceType.equalsIgnoreCase("Pawn")) {
            return new CreatePawn().createPiece();
        } else if (pieceType.equalsIgnoreCase("King")) {
            return new CreateKing().createPiece();
        } else if(pieceType.equalsIgnoreCase("Queen")) {
            return new CreateQueen().createPiece();
        } else {
            throw new PieceNotConfiguredException("Invalid piece type");
        }

    }
}
