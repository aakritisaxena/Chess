package main.java.game.chessPiece;

import java.util.ArrayList;
import java.util.List;
import main.java.game.exception.MoveNotPossibleException;

import main.java.game.util.ColumnNames;
import main.java.game.util.PossibleDirections;

public interface Piece {


    default List<String> getMovesForAllCoordinates(int i, int row, int column, List<PossibleDirections>possibleCoordinates) throws MoveNotPossibleException {
        List<String> moves = new ArrayList<>();
        for (PossibleDirections coordinate : possibleCoordinates) {
            getAllMovesByCoordinates(row, column, coordinate.getRow(), coordinate.getCol(), moves);
        }
        return moves;
    }

    default void getAllMovesByCoordinates(int row, int column, int rowInc, int columnInc, List<String> finalTypeMoves) throws MoveNotPossibleException {
        List<PossibleDirections> list = findAllMovesByCoordinates(8, row, column,rowInc,columnInc);
        addMovesToResult(finalTypeMoves, list);
    }

    public  List<PossibleDirections> findAllMovesByCoordinates(int n, int row, int column, int rowInc, int columnInc) throws MoveNotPossibleException ;


    default void addMovesToResult(List<String> finalTypeMoves, List<PossibleDirections> typeList) {
        for (PossibleDirections coordinate :  typeList) {
            Integer columnMapping = coordinate.getCol();
            String  columnToMove =  new ColumnNames().getColumnMappings().get(columnMapping);
            System.out.println(columnToMove + coordinate.getRow());
            finalTypeMoves.add(columnToMove + coordinate.getRow());
        }
    }

    default List<PossibleDirections> getAllPossibleMoves(String pieceType) {
        List<PossibleDirections> allPossibleCoordinates = new PossibleDirections().getListOfValidCoordinates();
        if (pieceType.equalsIgnoreCase("pawn")) {
            List<PossibleDirections> pawnCoordinates = new ArrayList<>();
            pawnCoordinates.add(allPossibleCoordinates.get(0));
            return pawnCoordinates;
        }
        return allPossibleCoordinates;
    }

}
