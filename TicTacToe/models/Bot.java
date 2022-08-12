package TicTacToe.models;

import TicTacToe.Interfaces.PlayingStartegy;

public class Bot extends Player {
    private PlayingStartegy playingStartegy;
    
    public Bot(GameSymbol symbol, PlayingStartegy playingStartegy) {
        super(symbol);
        this.playingStartegy = playingStartegy;
        //TODO Auto-generated constructor stub
    }


   

    
    @Override
    public BoardCell makemove(Board board) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
