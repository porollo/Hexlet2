package final_lesson_1;

/**
 * Created by Spider on 17.11.2014.
 */

public class Example8 {

    public static void main(String[] args) {

    String str = "RED";
        switch (str) {
            case "RED":
                System.out.println("RED");
            case "BLUE":
                System.out.println("BLUE");
                break;
            default:
                System.out.println("Default");
        }


        String str1 = "BLUE";
        switch (str1) {
            case "RED":
                System.out.println("RED");
            case "BLUE":
                System.out.println("BLUE");
                break;
            default:
                System.out.println("Default");
        }



    }


}
