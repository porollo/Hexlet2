package X0;

/**
 * Created by Spider on 03.02.2015.
 */
public class TwoPlayersGame extends Game {

    private final String playerOneName;
    private final String playerTwoName;

    public TwoPlayersGame(final String playerOneName, final String playerTwoName ) {
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
    }

    public void printPlayerOneName (){
        System.out.println(playerOneName);
    }
    public void printPlayerTwoName (){
        System.out.println(playerTwoName);
    }



}
