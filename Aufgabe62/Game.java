//package Aufgabe62;

/**
 * Game class
 * 
 * Simulate game
 */
public class Game {
    public static void main(String[] args) {
        Player ping = new Player("Ping", 24);
        Player pong = new Player("Pong", 23);

        int countPing = 0;
        int countPong = 0;
        boolean game = true;

        ping.startGame(pong);
        pong.acceptGame(ping);

        while (game == true) {
            if ((countPing >= 25) && (countPong >= 25)) {
                System.out.println("Unentschieden");
                ping.drawGame();
                pong.drawGame();
                game = false;
            } else if (countPing >= 25) {
                System.out.println("Ping hat das Spiel mit " + countPing + " Punkten gewonnen!");
                ping.winGame();
                pong.looseGame();
                game = false;
            } else if (countPong >= 25) {
                System.out.println("Pong hat das Spiel mit " + countPong + " Punkten gewonnen!");
                pong.winGame();
                ping.looseGame();
                game = false;
            } else {
                countPing = countPing + ping.wurf();
                countPong = countPong + pong.wurf();
            }
        }
    }
}
