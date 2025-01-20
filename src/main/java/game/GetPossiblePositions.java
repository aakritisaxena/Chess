package main.java.game;

import main.java.game.chessPiece.Piece;
import main.java.game.createPiece.PieceFactory;
import main.java.game.exception.MoveNotPossibleException;
import main.java.game.exception.PositionNotPossibleException;
import main.java.game.util.ColumnNames;

import java.util.Map;
import java.util.Scanner;

public class GetPossiblePositions {
    public static void main(String[] args) {

        int size = 8;
        //Inputs the type (For eg "Queen")
        Scanner inputType = new Scanner(System.in);
        System.out.println("Enter Type");
        String type = inputType.nextLine();

        //Inputs the position (For eg "K2")
        System.out.println("Enter Position");
        String position = inputType.nextLine();
        char[] posArray = position.toCharArray();

        //Converts the Alphabet to column
        Character columnAsChar = posArray[0];
        Integer columnAsInt = convertColumnFromCharToInteger(columnAsChar);
        int row = Integer.parseInt(String.valueOf(posArray[1]));

        if(row > size){
            throw new PositionNotPossibleException("Position is out of bounds");
        }

        PieceFactory pieceFactory = new PieceFactory();
        try {
            Piece piece = pieceFactory.getPiece(type);
            System.out.println("All possible moves for "+ type +" are: ");
            piece.getMovesForAllCoordinates(size, row, columnAsInt, piece.getAllPossibleMoves(type));
        } catch (MoveNotPossibleException e) {
            e.printStackTrace();
        }
        
    }

    private static Integer convertColumnFromCharToInteger(Character columnAsChar) throws PositionNotPossibleException {
        int columnAsInt = 0;
        for (Map.Entry<Integer, String> entry : new ColumnNames().getColumnMappings().entrySet()) {
            if (entry.getValue().equalsIgnoreCase(columnAsChar.toString())) {
                columnAsInt = entry.getKey();
                break;
            }
        }

        if (columnAsInt == 0) {
            throw new PositionNotPossibleException("Position not possible");
        }
        else {
            return columnAsInt;
        }
    }
}
