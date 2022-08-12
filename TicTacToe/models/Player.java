package TicTacToe.models;

public abstract class Player {
    private GameSymbol symbol;

    public Player(GameSymbol symbol){
        this.symbol = symbol;
    }

    public abstract BoardCell makemove(Board board);
}
