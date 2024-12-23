package app.guessnumber;

import app.Game;

public class GuessNumber implements Game {
    public static final int LOWEST_NUMBER = 1;
    public static final int HIGHEST_NUMBER = 1000;
    private final WinningNumberProvider winningNumberProvider;
    private final WinChecker winChecker;
    int winningNumber;
    String message;

    public GuessNumber(WinningNumberProvider winningNumberProvider, WinChecker winChecker) {
        this.winningNumberProvider = winningNumberProvider;
        this.winChecker = winChecker;
    }

    @Override
    public void startGame() {
        winningNumber = winningNumberProvider.returnWinningNumber();
        message = winChecker.checkWin(winningNumber);
    }
}
