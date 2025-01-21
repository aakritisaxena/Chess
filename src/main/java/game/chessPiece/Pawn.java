package main.java.game.chessPiece;

import main.java.game.exception.MoveNotPossibleException;
import main.java.game.util.PossibleDirections;

import java.util.ArrayList;
import java.util.List;

public class Pawn implements Piece {


    @Override
    public List<PossibleDirections> findAllMovesByCoordinates(int n, int row, int column, int rowInc, int columnInc) throws MoveNotPossibleException {
        List<PossibleDirections> moves = new ArrayList<>();
        if (row <n && row >=1 && column <n && column >=1) {
            PossibleDirections c = new PossibleDirections();
            row += rowInc;
            column += columnInc;
            c.setRow(row);
            c.setCol(column);
            moves.add(c);
        }else{
            throw new MoveNotPossibleException("Pawn movement not possible");
        }
        return moves;
    }
}
