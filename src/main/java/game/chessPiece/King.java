package main.java.game.chessPiece;

import main.java.game.exception.MoveNotPossibleException;
import main.java.game.util.Coordinates;

import java.util.ArrayList;
import java.util.List;

public class King implements Piece{
    @Override
    public boolean isValidPosition(int n, int row, int column) {
        return (row <=n && row >=1 && column <=n && column >=1);
    }

    @Override
    public List<Coordinates> findAllMovesByCoordinates(int n, int row, int column, int rowInc, int columnInc) throws MoveNotPossibleException {
        List<Coordinates> moves = new ArrayList<>();
        Coordinates c = new Coordinates();
        row += rowInc;
        column += columnInc;
        c.setRow(row) ;
        c.setCol(column);
        if (isValidPosition(n, row, column)) {
            moves.add(c);
        }
        return moves;
    }
}
