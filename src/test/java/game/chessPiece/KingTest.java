package test.java.game.chessPiece;

import main.java.game.exception.MoveNotPossibleException;
import main.java.game.exception.PieceNotConfiguredException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.java.game.chessPiece.Piece;
import main.java.game.createPiece.PieceFactory;
import main.java.game.util.PossibleDirections;

import java.util.ArrayList;
import java.util.List;

public class KingTest {

    List<PossibleDirections> possibleCordinates;

    private PieceFactory pieceFactory;

    private Piece piece;

    @Before
    public void setUp() throws PieceNotConfiguredException {
        pieceFactory = new PieceFactory();
        piece = pieceFactory.getPiece("King");
        possibleCordinates = new PossibleDirections().getListOfValidCoordinates();
    }

    @Test
    public void testKingMovementWhereAllTheSquaresAreValid() throws MoveNotPossibleException {
        List<String> result = new ArrayList<>();
        result = piece.getMovesForAllCoordinates(8, 4, 5, possibleCordinates);
        Assert.assertEquals(8, result.size());
    }

    @Test
    public void testKingMovementWhereItIsOn8Square() throws MoveNotPossibleException {
        List<String> result = new ArrayList<>();
        result = piece.getMovesForAllCoordinates(8, 8, 5, possibleCordinates);
        Assert.assertEquals(5, result.size());
    }

    @Test
    public void testKingMovementWhereItIsOn1Square() throws MoveNotPossibleException {
        List<String> result = new ArrayList<>();
        result = piece.getMovesForAllCoordinates(8, 1, 5, possibleCordinates);
        Assert.assertEquals(5, result.size());
    }

    @After
    public void tearDown() {
        piece = null;
        possibleCordinates = null;
    }

}
