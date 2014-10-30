package arrays;

/**
 * Created by Spider on 24.09.2014.
 */
public class Main {


    public static void main(String[] args) {
        Field field = new Field();
        field.eraseCell();
        field.showField();
        field = new Field(6);
        field.eraseCell();
        field.showField();
    }


}
