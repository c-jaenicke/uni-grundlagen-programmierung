package Aufgabe52;

public class test {
   
    public static void main(String[] args) {
        Vampire alter = new Vampire("Klaus", "Dieter", 200);
        Vampire alter2 = new Vampire("Peter", "Asd", 300);

        VampireFamily fam = new VampireFamily("qwert");
        fam.setGrandVampire(alter);
        fam.setFirstDescendant(alter2);

        Vampire mem1 = new Vampire("eins", "Asd", 300);
        Vampire mem2 = new Vampire("zwei", "Asd", 300);
        Vampire mem3 = new Vampire("drei", "Asd", 300);
        Vampire mem4 = new Vampire("vier", "Asd", 300);
        Vampire mem5 = new Vampire("funf", "Asd", 300);

        fam.addVampire(mem1);
        fam.addVampire(mem2);
        fam.addVampire(mem3);
        fam.addVampire(mem4);
        fam.addVampire(mem5);
        //fam.listMembers();

        //System.out.println("");

        fam.deleteVampire("eins", "Asd");
        //fam.listMembers();
        fam.print();

    }
}
