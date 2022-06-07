package Aufgabe51;
/**
 * VampireTest
 */
public class VampireTest {

    public static void main(String[] args) {
    
        Vampire vamp1 = new Vampire("Klaus", "Peter", 2000);
        vamp1.setAnimalShape("Fledermaus");
        vamp1.addHumanLivesTaken(10);
        vamp1.print();

    }
}