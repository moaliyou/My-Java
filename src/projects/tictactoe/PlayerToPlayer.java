package src.projects.tictactoe;

import java.util.Scanner;

public class PlayerToPlayer {

    private final TicTacToe ticTacToe;

    public PlayerToPlayer() {
        this.ticTacToe = new TicTacToe(3, 'X');
    }

    public void start() {

        boolean gameOver = false;

        while (!gameOver) {

            ticTacToe.printBoard();

            Scanner input = new Scanner(System.in);

            System.out.print("Player " + ticTacToe.getPlayer() + " enter your position (1-9): ");
            int move = input.nextInt();

            if (!ticTacToe.isPlayerMoveValid(move)) {
                System.out.println("Invalid move :(. Please try again!");
                continue;
            }

            ticTacToe.makePlayerMove(move);
            gameOver = ticTacToe.hasPlayerWon(ticTacToe.getPlayer());

            if (gameOver) {
                System.out.println();
                ticTacToe.printBoard();
                System.out.println("Player " + ticTacToe.getPlayer() + " has won :)");

            } else if (ticTacToe.isDraw()) {
                gameOver = true;
                System.out.println();
                ticTacToe.printBoard();
                System.out.println("It's draw game :D");

            } else {

                ticTacToe.switchPlayerTurn();

            }

        }

    }

}
