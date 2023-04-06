package src.projects.tictactoe;

import java.util.Arrays;

public class TicTacToe {

    private final char[][] gameBoard;
    private final int gameBoardSize;
    private char player;
    private int movesPlayed = 0;

    public TicTacToe(int gameBoardSize, char defaultPlayerValue) {

        this.gameBoard = new char[gameBoardSize][gameBoardSize];
        this.gameBoardSize = gameBoardSize;
        setPlayer(defaultPlayerValue);

        createEmptyBoard();

    }

    private void createEmptyBoard() {

        for (char[] rowValues : this.gameBoard) {

            Arrays.fill(rowValues, ' ');

        }

    }

    public boolean hasPlayerWon(char player) {

        int gameBoardSize = getGameBoard().length;

        for (int row = 0; row < gameBoardSize; row++) {
            if (getGameBoard()[row][0] == player && getGameBoard()[row][1] == player && getGameBoard()[row][2] == player)
                return true;
        }

        for (int col = 0; col < gameBoardSize; col++) {
            if (getGameBoard()[0][col] == player && getGameBoard()[1][col] == player && getGameBoard()[2][col] == player)
                return true;
        }


        if (getGameBoard()[0][0] == player && getGameBoard()[1][1] == player && getGameBoard()[2][2] == player)
            return true;

        return getGameBoard()[0][2] == player && getGameBoard()[1][1] == player && getGameBoard()[2][0] == player;
    }

    public boolean isDraw() {
        return (getMovesPlayed() == (Math.pow(getGameBoardSize(), 2)));
    }

    public void switchPlayerTurn() {
        setPlayer((getPlayer() == 'X') ? 'O' : 'X');
    }

    public void makePlayerMove(int move) {
        int rowPosition = (move - 1) / getGameBoardSize();
        int colPosition = (move - 1) % getGameBoardSize();
        setPlayerValueAt(rowPosition, colPosition);
    }

    public boolean isPlayerMoveValid(int move) {
        int rowPosition = (move - 1) / getGameBoardSize();
        int colPosition = (move - 1) % getGameBoardSize();
        return (move >= 1 && move <= 9 && getGameBoard()[rowPosition][colPosition] == ' ');
    }

    public void setPlayerValueAt(int rowPosition, int colPosition) {
        gameBoard[rowPosition][colPosition] = getPlayer();
        movesPlayed++;
    }

    public char[][] getGameBoard() {
        return gameBoard;
    }

    public char getPlayer() {
        return player;
    }

    public void setPlayer(char player) {
        this.player = player;
    }

    public int getMovesPlayed() {
        return movesPlayed;
    }

    public int getGameBoardSize() {
        return gameBoardSize;
    }

    public void printBoard() {

        for (int row = 0; row < this.gameBoardSize; row++) {

            for (int col = 0; col < getGameBoard()[row].length; col++) {
                if (col != (gameBoardSize - 1)) {
                    System.out.print(getGameBoard()[row][col] + " | ");
                } else {
                    System.out.print(getGameBoard()[row][col]);
                }
            }

            System.out.println();

            if (row != (getGameBoardSize() - 1)) {
                System.out.println("- + - + -");
            }

        }

    }

}
