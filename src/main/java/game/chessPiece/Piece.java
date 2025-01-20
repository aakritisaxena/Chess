package main.java.game.chessPiece;

import java.util.ArrayList;
import java.util.List;
import main.java.game.exception.MoveNotPossibleException;

import main.java.game.util.ColumnNames;
import main.java.game.util.Coordinates;

public interface Piece {

    public  boolean isValidPosition(int n, int row, int column);


    default List<String> getMovesForAllCoordinates(int i, int row, int column, List<Coordinates>possibleCoordinates) throws MoveNotPossibleException {
        List<String> moves = new ArrayList<>();
        for (Coordinates coordinate : possibleCoordinates) {
            getAllMovesByCoordinates(row, column, coordinate.getRow(), coordinate.getCol(), moves);
        }
        return moves;
    }

    default void getAllMovesByCoordinates(int row, int column, int rowInc, int columnInc, List<String> finalTypeMoves) throws MoveNotPossibleException {
        List<Coordinates> typeMoveList = findAllMovesByCoordinates(8, row, column,rowInc,columnInc);
        addMovesToTheList(finalTypeMoves, typeMoveList);
    }

    public  List<Coordinates> findAllMovesByCoordinates(int n, int row, int column, int rowInc, int columnInc) throws MoveNotPossibleException ;


    default void addMovesToTheList(List<String> finalTypeMoves, List<Coordinates> typeList) {
        for (Coordinates coordinate :  typeList) {
            Integer columnMapping = coordinate.getCol();
            String  columnToMove =  new ColumnNames().getColumnMappings().get(columnMapping);
            System.out.println(columnToMove + coordinate.getRow());
            finalTypeMoves.add(columnToMove + coordinate.getRow());
        }
    }

    default List<Coordinates> getAllPossibleCoordinates(String pieceType) {
        List<Coordinates> allPossibleCordinates = new Coordinates().getListOfValidCoordinates();
        if (pieceType.equalsIgnoreCase("pawn")) {
            List<Coordinates> pawnCoridnates = new ArrayList<>();
            pawnCoridnates.add(allPossibleCordinates.get(0));
            return pawnCoridnates;
        }
        return allPossibleCordinates;
    }

}
