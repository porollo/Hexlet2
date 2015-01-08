package java2.lesson1;

/**
 * Created by Spider on 18.11.2014.
 */

public enum EStyle {

    DOLLAR_STYLE("$"),
    A_STYLE("@"),
    B_STYLE("#"),
    C_STYLE("%"),
    EMPTY_STYLE("");

    private final String styleString;

    EStyle(String styleString) {
        this.styleString = styleString;
    }

    public String getStyleString() {
        return styleString;
    }
}
