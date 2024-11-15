import Lotek.LotekGame;
import Lotek.LotekRandomNumbersProvider;
import Lotek.LotekUserNumbersProvider;

import java.util.Scanner;

class GameSelector {

    public static void selectGame(){
    Scanner sc = new Scanner(System.in);
    int gamePicker = 0;
        while (gamePicker != 2) {
            System.out.println("\nWybierz grę:");
            System.out.println("1. - Lotek");
            System.out.println("2. - Zakończ program");
            gamePicker = sc.nextInt();
            switch (gamePicker) {
                case 1: {
                    LotekGame game = new LotekGame(new LotekUserNumbersProvider(), new LotekRandomNumbersProvider());
                    game.lotekGame();
                    break;
                }
                case 2: {
                    break;
                }
                default: {
                    System.out.println("Wprowadź poprawny numer gry");
                }
            }
        }
    }
}
