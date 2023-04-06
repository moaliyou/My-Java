package src.projects.tictactoe;

import java.util.Scanner;

public class PlayerToPlayer {

    private final TicTacToe ticTacToe;

    public PlayerToPlayer() {
        this.ticTacToe = new TicTacToe(3, 'X');
    }

    public void start() {

        while (!ticTacToe.hasWon(ticTacToe.getPlayer()) && !ticTacToe.isDraw()) {

            ticTacToe.printBoard();

            Scanner input = new Scanner(System.in);

            System.out.print("Player " + ticTacToe.getPlayer() + " enter your position (1-9): ");
            int move = input.nextInt();

            if (!ticTacToe.isPlayerMoveValid(move)) {
                System.out.println("Invalid move :(. Please try again!");
                continue;
            }

            ticTacToe.makePlayerMove(move);

            if (ticTacToe.hasWon(ticTacToe.getPlayer())) {
                System.out.println();
                ticTacToe.printBoard();
                System.out.println("Player " + ticTacToe.getPlayer() + " has won :)");

            } else if (ticTacToe.isDraw()) {
                System.out.println();
                ticTacToe.printBoard();
                System.out.println("It's draw game :D");

            } else {

                ticTacToe.switchPlayerTurn();

            }

        }

    }

}
