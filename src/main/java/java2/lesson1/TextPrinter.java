package java2.lesson1;

/**
 * Created by Spider on 18.11.2014.
 */

public class TextPrinter {

    public static void showText(String text, EStyle style){

        System.out.println(style.getStyleString() + text + style.getStyleString());

        /*switch (style) {
            case DOLLAR_STYLE:
            System.out.println("$" + text + "$");
                break;
                case A_STYLE:
                default:
                System.out.println("@" + text + "@");
        }*/
    }

    public static void main(String[] args) {
        showText(" TEXT1 ", EStyle.valueOf("DOLLAR_STYLE"));
        showText(" TEXT2 ", EStyle.A_STYLE);
        //showText(" TEXT3 ", EStyle.valueOf("FFEee"));

        for (EStyle style : EStyle.values()){
            showText("ALL STYLES", style);
        }

    }

}
