package TicTacToe.Interfaces;

import TicTacToe.models.Board;
import TicTacToe.models.BoardCell;

public interface PlayingStartegy {
    public BoardCell makemove(Board board);
}
