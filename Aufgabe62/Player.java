//package Aufgabe62;

/**
 * Player, represents player in the game
 * 
 * @author Christoph Nicklas Jänicke
 */
public class Player {
    private String name;
    private int age;
    private int gamesWon = 0;
    private int gamesLost = 0;
    private int gamesDraw = 0;

    /**
     * Constructor for Player class
     * 
     * @param name
     * @param age
     */
    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 
     * @param name as String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return as String
     */
    public String getName() {
        return this.name;
    }

    /**
     * 
     * @param age as int
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 
     * @return as int
     */
    public int getAge() {
        return this.age;
    }

    /**
     * 
     * @return as int
     */
    public int getGamesWon() {
        return gamesWon;
    }

    /**
     * 
     * @return as int
     */
    public int getGamesLost() {
        return this.gamesLost;
    }

    /**
     * 
     * @return as int
     */
    public int getGamesDraw() {
        return this.gamesDraw;
    }

    /**
     * Print line requesting start of game
     * 
     * @param p
     */
    public void startGame(Player p) {
        System.out.println(p.name + ", ich fordere Dich zum Spiel auf!");
    }

    /**
     * Print line accepting game
     * 
     * @param p
     */
    public void acceptGame(Player p) {
        System.out.println(p.name + ", ich nehme das Spiel an!");
    }

    /**
     * ??? throw ist nicht verfuerbar als name!
     * 
     * Simulate throw of player, random number between 0 and 5
     */
    public int wurf() {
        int random = (int) (Math.random() * 6) + 0;
        System.out.println(random);
        return random;
    }

    /**
     * add win to counter
     */
    public void winGame() {
        this.gamesWon = this.gamesWon + 1;
    }

    /**
     * add lose to counter
     */
    public void looseGame() {
        this.gamesLost = this.gamesLost + 1;
    }

    /**
     * add draw to counter
     */
    public void drawGame() {
        this.gamesDraw = this.gamesDraw + 1;
    }
}