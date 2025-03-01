package test.java.game.chessPiece;

import main.java.game.chessPiece.Piece;
import main.java.game.createPiece.PieceFactory;
import main.java.game.exception.MoveNotPossibleException;
import main.java.game.exception.PieceNotConfiguredException;
import main.java.game.util.PossibleDirections;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PawnTest {

    PieceFactory pieceFactory;
    Piece piece;
    List<PossibleDirections> possibleCordinates;

    @Before
    public void setUp() throws PieceNotConfiguredException {
        pieceFactory = new PieceFactory();
        piece = pieceFactory.getPiece("Pawn");
        possibleCordinates = new PossibleDirections().getListOfValidCoordinates();
    }

    @Test(expected = MoveNotPossibleException.class)
    public void testPawnAtLastSquare() throws MoveNotPossibleException {
        List<String> result = new ArrayList<>();
        result = piece.getMovesForAllCoordinates(8,8,1,possibleCordinates);

    }

    @Test
    public void testPawnAtValidSquare() throws MoveNotPossibleException {
        Assert.assertEquals("E5", piece.getMovesForAllCoordinates(8, 4, 5, possibleCordinates).get(0));

    }
}
