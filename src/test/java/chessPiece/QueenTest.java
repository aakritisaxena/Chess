package test.java.chessPiece;

import main.java.game.chessPiece.Piece;
import main.java.game.createPiece.PieceFactory;
import main.java.game.exception.MoveNotPossibleException;
import main.java.game.util.Coordinates;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class QueenTest {

    PieceFactory pieceFactory;
    Piece piece;
    List<Coordinates> possibleCordinates;

    @Before
    public void setUp() {
        pieceFactory = new PieceFactory();
        piece = pieceFactory.getPiece("Queen");
        possibleCordinates = new Coordinates().getListOfValidCoordinates();
    }

    @Test
    public void testQueenWhenAllSquaresArePossible() throws MoveNotPossibleException {
        List<String> result = new ArrayList<>();
        result = piece.getMovesForAllCoordinates(8,4,5,possibleCordinates);
        Assert.assertEquals(27, result.size());
    }

    @Test
    public void testQueenWhenItIsOn1Square() throws MoveNotPossibleException {
        List<String> result = new ArrayList<>();
        result = piece.getMovesForAllCoordinates(8,1,3,possibleCordinates);
        Assert.assertEquals(21, result.size());
    }

    @Test
    public void testQueenWhenItIsOn8Square() throws MoveNotPossibleException {
        List<String> result = new ArrayList<>();
        result = piece.getMovesForAllCoordinates(8,8,3,possibleCordinates);
        Assert.assertEquals(21, result.size());
    }

    @After
    public void tearDown() {
        piece = null;
        pieceFactory = null;
    }
}
