package TicTacToe;
import TicTacToe.models.Board;
import TicTacToe.models.Bot;
import TicTacToe.models.Game;
import TicTacToe.models.Game2;
import TicTacToe.models.GameSymbol;
import TicTacToe.models.HumanPlayer;
import TicTacToe.models.Player;
import TicTacToe.models.User;
import TicTacToe.strategies.EasyLevelStartegy;

public class Client2 {
    public static void main(String[] args) {
        Player player1 = new HumanPlayer(GameSymbol.X,new User("amol", "abc.gmailcom", "profpic"));
        Player player2 = new Bot(GameSymbol.O,new EasyLevelStartegy());

        Game2 game2  = Game2.getBuilder()
            .withDimension(3,3)
            .withPlayers(player1)
            .withPlayers(player2)
            .build();
    }
}
