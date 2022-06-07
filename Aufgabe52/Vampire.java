//package Aufgabe52;

/**
 * Vampire class
 * All attributes and methods for the Vampire class.
 * 
 * @author Christoph Nicklas Jaenicke, 584533
 */
public class Vampire {
    // attributes
    private String firstName;
    private String lastName;
    private String animalShape;
    private int yearOfBirth;
    private int humanLivesTaken = 0;

    /**
     * Constructor for class Vampires
     * 
     * @param firstName   as String
     * @param lastName    as String
     * @param yearOfBirth as int
     */
    public Vampire(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    /**
     * 
     * @return String, first name of vampire
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * 
     * @return String, last name of vampire
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * 
     * @return String, animal shape of vampire
     */
    public String getAnimalShape() {
        return this.animalShape;
    }

    /**
     * 
     * @return int, vampire year of birth
     */
    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    /**
     * 
     * @return int, number of lives taken
     */
    public int getHumanLivesTaken() {
        return this.humanLivesTaken;
    }

    /**
     * 
     * @param animalShape as String
     */
    public void setAnimalShape(String animalShape) {
        this.animalShape = animalShape;
    }

    /**
     * 
     * @param i as int, add lives taken to counter
     */
    public void addHumanLivesTaken(int i) {
        this.humanLivesTaken = this.humanLivesTaken + i;
    }

    /**
     * print all attributes of vampire as a short sentences
     */
    public void print() {
        String sentence = String.format(
                "Der Vampir %s %s wurde %s geboren. Er verwandelt sich in eine/n %s und hat %s Menschen verwandelt.",
                this.firstName, this.lastName, this.yearOfBirth, this.animalShape, this.humanLivesTaken);
        System.out.println(sentence);
    }
}