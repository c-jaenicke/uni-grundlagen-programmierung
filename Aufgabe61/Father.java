//package Aufgabe61;

/**
 * Father class, extends Person
 * Represents Father of a Person
 * 
 * @author Christoph Nicklas Jänicke
 */
public class Father extends Person {
    private Person child1;
    private Person child2;
    private Person child3;

    /**
     * Constructor for class Mother, contains super constructor for Person
     * 
     * @param name    as Name
     * @param age     as int
     * @param address as Address
     */
    public Father(Name name, int age, Address address) {
        super(name, age, address);
    }

    /**
     * 
     * @param child as Person
     */
    public void setChild1(Person child) {
        this.child1 = child;
    }

    /**
     * 
     * @return as Person
     */
    public Person getChild1() {
        return this.child1;
    }

    /**
     * 
     * @param child as Person
     */
    public void setChild2(Person child) {
        this.child2 = child;
    }

    /**
     * 
     * @return as Person
     */
    public Person getChild2() {
        return this.child2;
    }

    /**
     * 
     * @param child as Person
     */
    public void setChild3(Person child) {
        this.child3 = child;
    }

    /**
     * 
     * @return as Person
     */
    public Person getChild3() {
        return this.child3;
    }
}