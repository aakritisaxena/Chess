package test.java.game.createPiece;

import main.java.game.chessPiece.King;
import main.java.game.chessPiece.Pawn;
import main.java.game.chessPiece.Piece;
import main.java.game.chessPiece.Queen;
import main.java.game.createPiece.PieceFactory;
import main.java.game.exception.PieceNotConfiguredException;
import org.junit.Assert;
import org.junit.Test;

public class PieceFactoryTest {

    @Test
    public void createPiece_Pawn() throws PieceNotConfiguredException {

        PieceFactory pieceFactory = new PieceFactory();
        Piece piece = pieceFactory.getPiece("Pawn");

        Assert.assertNotNull(piece);
        Assert.assertTrue(piece instanceof Pawn);

    }

    @Test
    public void createPiece_King() throws PieceNotConfiguredException {

        PieceFactory pieceFactory = new PieceFactory();
        Piece piece = pieceFactory.getPiece("King");

        Assert.assertNotNull(piece);
        Assert.assertTrue(piece instanceof King);

    }

    @Test
    public void createPiece_Queen() throws PieceNotConfiguredException {

        PieceFactory pieceFactory = new PieceFactory();
        Piece piece = pieceFactory.getPiece("Queen");

        Assert.assertNotNull(piece);
        Assert.assertTrue(piece instanceof Queen);

    }

    @Test(expected = PieceNotConfiguredException.class)
    public void createPiece_InvalidPiece() throws PieceNotConfiguredException {

        PieceFactory pieceFactory = new PieceFactory();
        Piece piece = pieceFactory.getPiece("Bishop");

    }


}
