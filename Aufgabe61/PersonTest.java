//package Aufgabe61;

public class PersonTest {
    public static void main(String[] args) {
        // person 1
        Name nameP1 = new Name("Peter", "M", "", "");
        Address addressP1 = new Address("Berliner Str", 20, 12620, "Berlin", "Deutschland");
        Person p1 = new Person(nameP1, 20, addressP1);

        // person 2 Mutter
        Name nameP2 = new Name("Leonie", "Lange", "", "");
        Address addressP2 = new Address("Grolmanstraße", 77, 28199, "Bremen ", "Deutschland");
        Mother p2 = new Mother(nameP2, 82, addressP2);

        // person 3
        Name nameP3 = new Name("Kristin", "Grundwald", "", "");
        Address addressP3 = new Address("Lietzenburger Straße", 12, 49824, "Laar", "Deutschland");
        Person p3 = new Person(nameP3, 20, addressP3);

        // person 4
        Name nameP4 = new Name("Jan", "Schroeder", "", "");
        Address addressP4 = new Address("Schillerstrasse", 42, 12620, "Berlin", "Deutschland");
        Person p4 = new Person(nameP4, 19, addressP4);

        // person 5
        Name nameP5 = new Name("Mario", "Scholz", "", "");
        Address addressP5 = new Address("Bissingzeile", 76, 27446, "Sandbostel", "Deutschland");
        Person p5 = new Person(nameP5, 25, addressP5);

        // person 6 Vater
        Name nameP6 = new Name("Ulrich", "Blau", "", "");
        Address addressP6 = new Address("Rosenstrasse", 72, 81519, "München", "Deutschland");
        Father p6 = new Father(nameP6, 76, addressP6);

        // set mothers children
        p2.setChild1(p1);
        p2.setChild2(p3);
        p2.setChild3(p4);

        // set children mothers
        p1.setMother(p2);
        p3.setMother(p2);
        p4.setMother(p2);

        // set fathers children
        p6.setChild1(p1);
        p6.setChild2(p4);
        p6.setChild3(p5);

        // set children fathers
        p1.setFather(p6);
        p4.setFather(p6);
        p5.setFather(p6);

        // begin tests
        // check for siblings
        // expect true
        // p1.isSibling(p4);
        System.out.println(p1.isSibling(p4));
        // expect false
        // p1.isSibling(p6);
        // System.out.println(p1.isSibling(p6));

        // check for half siblings
        // expect false
        // p1.isHalfSibling(p4);
        // System.out.println(p1.isHalfSibling(p4));
        // expect true
        // p1.isHalfSibling(p6);
        System.out.println(p1.isHalfSibling(p3));

        // check for same city
        // expect true
        // p1.livesInTheSameCity(p4);
        System.out.println(p1.livesInTheSameCity(p4));
        // expect false
        // p1.livesInTheSameCity(p5);
        System.out.println(p1.livesInTheSameCity(p5));

        // check for age
        // expect younger
        p1.compareAge(p2);
        // expect same age
        p1.compareAge(p3);
        // expect older
        p1.compareAge(p4);

    }
}
