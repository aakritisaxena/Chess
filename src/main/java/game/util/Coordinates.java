package main.java.game.util;

import java.util.ArrayList;
import java.util.List;

public class Coordinates {
    int row;
    int col;
    public Coordinates() {

    }
    public Coordinates(int row, int col) {
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

    public List<Coordinates> getListOfValidCoordinates(){
        List<Coordinates> coordinates = new ArrayList<>();
        coordinates.add(new Coordinates(1,0));
        coordinates.add(new Coordinates(1,1));
        coordinates.add(new Coordinates(1,-1));
        coordinates.add(new Coordinates(0,-1));
        coordinates.add(new Coordinates(0,1));
        coordinates.add(new Coordinates(-1,-1));
        coordinates.add(new Coordinates(-1,0));
        coordinates.add(new Coordinates(-1,1));
        return coordinates;
    }
}
