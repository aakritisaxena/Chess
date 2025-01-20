package main.java.game.util;

import java.util.ArrayList;
import java.util.List;

public class PossibleDirections {
    int row;
    int col;
    public PossibleDirections() {

    }
    public PossibleDirections(int row, int col) {
        this.row = row;
        this.col = col;

    }
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public int getCol() {
        return col;
    }
    public void setCol(int col) {
        this.col = col;
    }

    public List<PossibleDirections> getListOfValidCoordinates(){
        List<PossibleDirections> coordinates = new ArrayList<>();
        coordinates.add(new PossibleDirections(1,0));
        coordinates.add(new PossibleDirections(1,1));
        coordinates.add(new PossibleDirections(1,-1));
        coordinates.add(new PossibleDirections(0,-1));
        coordinates.add(new PossibleDirections(0,1));
        coordinates.add(new PossibleDirections(-1,-1));
        coordinates.add(new PossibleDirections(-1,0));
        coordinates.add(new PossibleDirections(-1,1));
        return coordinates;
    }
}
