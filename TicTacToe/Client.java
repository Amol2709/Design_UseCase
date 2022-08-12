package TicTacToe;

import TicTacToe.models.Board;
import TicTacToe.models.Bot;
import TicTacToe.models.Game;
import TicTacToe.models.GameSymbol;
import TicTacToe.models.HumanPlayer;
import TicTacToe.models.Player;
import TicTacToe.models.User;
import TicTacToe.strategies.EasyLevelStartegy;

public class Client {
    public static void main(String[] args) {
        Player player1 = new HumanPlayer(GameSymbol.X,new User("amol", "abc.gmailcom", "profpic"));
        Player player2 = new Bot(GameSymbol.O,new EasyLevelStartegy() );
        Game game = new Game();
        game.SetBoard(new Board(3, 3)).setPlayers(player1).setPlayers(player2);
        if (game.validateGame()){
            game.createGame();
        }
        else{
            System.out.println("Not a vlaid Game");
        }
        
    }
    
}
