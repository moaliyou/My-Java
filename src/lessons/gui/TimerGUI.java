package src.lessons.gui;

import javax.swing.*;
import java.util.Random;

public class TimerGUI extends JFrame {

    int[] generatedNumber;
    boolean started = false;

    private JPanel mainPanel, countersPanel, buttonPanel;
    private JLabel counterLabel6, counterLabel5,
            counterLabel4, counterLabel3,
            counterLabel2, counterLabel1,
            counterLabel7, counterLabel8, counterLabel9;
    private final JLabel[] counterLabels = {
            counterLabel1, counterLabel2,
            counterLabel3, counterLabel4,
            counterLabel5, counterLabel6,
            counterLabel7, counterLabel8, counterLabel9
    };
    private JButton startButton;
    private JLabel winnerLabel;
    private JLabel textWinnerLabel;

    private Timer mTimer;

    public TimerGUI() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setContentPane(mainPanel);
        this.setVisible(true);

        startTimer();

        startButton.addActionListener(e -> {
            if (!started) {
                textWinnerLabel.setText(null);
                winnerLabel.setText(null);
                startButton.setText("Tijaabi nasiibkaaga!");
                startTimer();
            } else {
                displayWinner();
                startButton.setText("Markale isku day!");
                mTimer.stop();
                started = false;
            }
        });

    }

    private void displayWinner() {
        textWinnerLabel.setText("GUULEYSTAHA :)");
        winnerLabel.setText(
                "%s%s%s%s%s%s%s%s%s".formatted(
                        counterLabel1.getText(), counterLabel2.getText(),
                        counterLabel3.getText(), counterLabel4.getText(),
                        counterLabel5.getText(), counterLabel6.getText(),
                        counterLabel7.getText(), counterLabel8.getText(),
                        counterLabel9.getText()));
    }

    private void startTimer() {
        mTimer = new Timer(40, e -> {
            generatedNumber = getRandomNumber();
            setCounterLabelsTo(generatedNumber);
        });
        mTimer.start();
        started = true;
    }

    private void setCounterLabelsTo(int[] pGeneratedNumber) {
        for (int position = 0; position < counterLabels.length; position++) {
            counterLabels[position].setText(String.valueOf(pGeneratedNumber[position]));
        }
    }

    /**
     * Waa method kusiinaayo lambaro qaab kala duwan.
     *
     * @return lambaro kala duwan
     */
    private int[] getRandomNumber() {
        int[][] listOfNumbers = {
                {6, 7, 8, 9, 9, 0, 9, 1, 0},
                {6, 1, 1, 2, 4, 7, 5, 2, 4},
                {6, 3, 4, 6, 6, 3, 9, 8, 5},
                {6, 2, 3, 5, 5, 4, 1, 1, 8},
                {6, 8, 9, 7, 6, 7, 6, 3, 1}
        };

        Random randomIndex = new Random();

        return listOfNumbers[randomIndex.nextInt(listOfNumbers.length)];
    }
}
