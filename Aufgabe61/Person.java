//package Aufgabe61;

/**
 * Person class, represents a person
 */
public class Person {
    Name name;
    int age;
    Address address;
    Father father;
    Mother mother;

    public Person(Name name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * set mother
     * 
     * @param mother
     */
    public void setMother(Mother mother) {
        this.mother = mother;
    }

    /**
     * set father
     * 
     * @param father
     */
    public void setFather(Father father) {
        this.father = father;
    }

    /**
     * Checks if two persons have the same father and mother, if yes, return true,
     * else false
     * 
     * @param p as Person
     * @return boolean
     */
    public boolean isSibling(Person p) {
        if ((this.father == p.father) && (this.mother == p.mother)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks if two persons have a matching mother XOR father
     * 
     * @param p as Person
     * @return boolean
     */
    public boolean isHalfSibling(Person p) {
        if ((this.father == p.father) ^ (this.mother == p.mother)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks if two persons have a matching wohnort and thus live in the same city
     * 
     * @param p as Person
     * @return boolean
     */
    public boolean livesInTheSameCity(Person p) {
        if (new String(this.address.wohnort).equals(p.address.wohnort)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Compares the two persons age and prints if the other person is younger, older
     * or the same ages
     * 
     * @param p as Person
     */
    public void compareAge(Person p) {
        if (this.age == p.age) {
            System.out.println("same age");
        } else if (this.age < p.age) {
            System.out.println("younger");
        } else {
            System.out.println("older");
        }
    }
}
