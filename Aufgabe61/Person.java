//package Aufgabe61;

/**
 * Person class, represents a person
 * 
 * @author Christoph Nicklas Jänicke
 */
public class Person {
    private Name name;
    private int age;
    private Address address;
    private Father father;
    private Mother mother;

    public Person(Name name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 
     * @param name as Name
     */
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * 
     * @return as Name
     */
    public Name getName() {
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
     * @param address as Address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * 
     * @return as Address
     */
    public Address getAddress() {
        return this.address;
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
     * 
     * @return as mother
     */
    public Mother getMother() {
        return this.mother;
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
     * 
     * @return as father
     */
    public Father getFather() {
        return this.father;
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
        if (new String(this.address.getWohnort()).equals(p.address.getWohnort())) {
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
