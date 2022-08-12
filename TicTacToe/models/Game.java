package TicTacToe.models;

import java.util.ArrayList;
import java.util.List;




public class Game {
    private Board board;
    private List<Player> players = new ArrayList<>();

    public Game SetBoard(Board board){
        this.board = board;
        return this;
    }
    

    public Game setPlayers(Player player){
        this.players.add(player);
        return this;

    }
    public boolean  validateGame(){
        if (players.size()==2){
            return true;
        }
        else{
            return false;
        }
    }

    public Game createGame(){
        return this;
    }



    
}
