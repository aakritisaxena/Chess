package main.java.game.util;

import java.util.HashMap;

public class ColumnNames {

    public HashMap<Integer, String> columnMappings = new HashMap<>();

    public HashMap<Integer, String> getColumnMappings() {

        columnMappings.put(1, "A");
        columnMappings.put(2, "B");
        columnMappings.put(3, "C");
        columnMappings.put(4, "D");
        columnMappings.put(5, "E");
        columnMappings.put(6, "F");
        columnMappings.put(7, "G");
        columnMappings.put(8, "H");

        return columnMappings;
    }
}
