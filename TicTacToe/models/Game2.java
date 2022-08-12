package TicTacToe.models;

import java.lang.module.ModuleDescriptor.Builder;
import java.util.ArrayList;
import java.util.List;

public class Game2 {
    private Board board;
    private List<Player> players = new ArrayList<>();

    private Game2(){}

    public void setBoard(Board board){
        this.board = board;
    }

    public void setPlayers(Player player){
        players.add(player);
    }
    public List<Player> getPlayers(){
        return players;
    }

    public static Builder getBuilder(){
        return new Builder();
    }


    public static class Builder{
        private Game2 game2;

        Builder(){
            this.game2 = new Game2();
        }

        public Builder withDimension(int row, int col){
            Board board = new Board(row, col);
            game2.setBoard(board);
            return this;

        }




        public Builder withPlayers(Player player){
            game2.getPlayers().add(player);
            //game2.setPlayers(player);
            return this;
        }

        public boolean validateGame(){
            List<Player> players = game2.getPlayers();
            if (players.size() > 2) {
                return false;
            }
            return true;
        }


        public Game2 build(){
            boolean isValid = validateGame();
            if (!isValid) {
                throw new RuntimeException("Game is not valid");
            }

            return this.game2;
        }
    }
}
