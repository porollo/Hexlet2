package X0;

/**
 * Created by Spider on 03.02.2015.
 */
public class ThreePlayersGame extends TwoPlayersGame{

    private final String playerThreeName;

    public ThreePlayersGame(final String playerOneName, final String playerTwoName, final String playerThreeName ) {
        super(playerOneName,playerTwoName);
        this.playerThreeName = playerThreeName;
    }

    public void printPlayerThreeName (){
        System.out.println(playerThreeName);
    }




}
