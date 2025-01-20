package main.java.game.chessPiece;

import main.java.game.exception.MoveNotPossibleException;
import main.java.game.util.PossibleDirections;

import java.util.ArrayList;
import java.util.List;

public class Queen implements Piece{

    @Override
    public List<PossibleDirections> findAllMovesByCoordinates(int n, int row, int column, int rowInc, int columnInc) throws MoveNotPossibleException {
        List<PossibleDirections> moves = new ArrayList<>();
        while (row <=n && row >=1 && column <=n && column >=1) {
            PossibleDirections c = new PossibleDirections();
            row+= rowInc;
            column+= columnInc;
            c.setRow(row);
            c.setCol(column);
            if(row<=n && column<=n && row>=1 && column>=1) {
                moves.add(c);
            }
        }
        return moves;
    }
}
