//package Aufgabe52;

/**
 * VampireFamily
 * All attributes and methods for the VampireFamily class.
 * 
 * @author Christoph Nicklas Jaenicke, 584533
 */
public class VampireFamily {
    // attributes
    private String dynasty;
    private Vampire grandVampire;
    private Vampire firstDescendant;
    private Vampire[] familyMember = new Vampire[100];

    /**
     * Constructor for class VampireFamily
     * 
     * @param dynasty as String
     */
    public VampireFamily(String dynasty) {
        this.dynasty = dynasty;
    }

    /**
     * 
     * @return String, name of family
     */
    public String getDynasty() {
        return this.dynasty;
    }

    /**
     * 
     * @return Vampire, grand vampire
     */
    public Vampire getGrandVampire() {
        return this.grandVampire;
    }

    /**
     * 
     * @return Vampire, first descendant
     */
    public Vampire getFirstDescendant() {
        return this.firstDescendant;
    }

    /**
     * 
     * @return Vampire[], array of family members with length 100
     */
    public Vampire[] getFamilyMember() {
        return this.familyMember;
    }

    /**
     * 
     * @param grandVampire as Vampire
     */
    public void setGrandVampire(Vampire grandVampire) {
        this.grandVampire = grandVampire;
    }

    /**
     * 
     * @param firstDescendant as Vampire
     */
    public void setFirstDescendant(Vampire firstDescendant) {
        this.firstDescendant = firstDescendant;
    }

    /**
     * add vampire to array of familyMember at first free position
     * 
     * @param vampire as Vampire
     */
    public void addVampire(Vampire vampire) {
        for (int i = 0; i < 100; i++) {
            if (this.familyMember[i] == null) {
                this.familyMember[i] = vampire;
                break;
            }
        }
    }

    /**
     * remove first vampire where first and last name match specified from familyMember array
     * @param firstName as String
     * @param lastName  as String
     */
    public void deleteVampire(String firstName, String lastName) {
        for (int i = 0; i < 100; i++) {
            if ((this.familyMember[i].getFirstName() == firstName)
                    && (this.familyMember[i].getLastName() == lastName)) {
                this.familyMember[i] = null;
                break;
            }
        }
    }

    /**
     * print short sentence with information about the family
     */
    public void print() {
        String sentence = String.format(
                "Die Familie heißt %s und hat den Ur-Vampir %s %s und den ersten Abkömmling %s %s. ",
                this.dynasty,
                this.grandVampire.getFirstName(), this.grandVampire.getLastName(),
                this.firstDescendant.getFirstName(), this.firstDescendant.getLastName());
        System.out.print(sentence);
        System.out.print("Weitere Mitglieder sind");
        listVampires();
        System.out.print(".");

    }

    /**
     * print all current family members in familyMembers array
     */
    private void listVampires() {
        for (int i = 0; i < 100; i++) {
            if (this.familyMember[i] != null) {
                System.out.print(
                        " " + this.familyMember[i].getFirstName() + " " + this.familyMember[i].getLastName() + ",");

            }
        }
    }
}