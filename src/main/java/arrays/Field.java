package arrays;

/**
 * Created by Spider on 24.09.2014.
 */

public class Field {

    private final int fieldSize;
    private static final char DEFAULT_CELL_VALUE = ' ';
    private static final char DEFAULT_O_VALUE = 'O';
    private static final char DEFAULT_X_VALUE = 'X';
    private static final int DEFAULT_FIELD_SIZE = 3;
    private final char[][] field;

    public Field () {
        this(DEFAULT_FIELD_SIZE);
        System.out.println("In construsctor 1");
    }

    public Field(int size){
        fieldSize = size;
        field = new char[fieldSize] [fieldSize];
        System.out.println("In construsctor 2");
    }


    public void eraseCell() {
    for (int i = 0; i < fieldSize; i++) {
        eraseLine(i);
        }
    }

    public void showField () {
        System.out.println();
        for (int i = 0; i < fieldSize; i++) {
            showLine(i);
            System.out.println();
        }
        System.out.println();
    }

    private void eraseLine(int lineNumber) {
        for (int i = 0; i < fieldSize; i++){
            field[i][lineNumber] = DEFAULT_CELL_VALUE;
        }
    }

    private void showLine(int lineNumber) {
        for (int i = 0; i< fieldSize; i++) {
            showCell(i, lineNumber);
        }

    }


    private void showCell(int x, int y) {
        System.out.print("[" + field[x][y] + "]");
    }

}


// for (int i = 0; i < 100; i++) {}


