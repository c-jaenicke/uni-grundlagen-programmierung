//package Aufgabe61;

/**
 * Father class, extends Person
 * Represents Father of a Person
 */
public class Father extends Person {
    Person child1;
    Person child2;
    Person child3;

        /**
     * Constructor for class Mother, contains super constructor for Person
     * 
     * @param name
     * @param age
     * @param address
     */
    public Father(Name name, int age, Address address) {
        super(name, age, address);
    }

    /**
     * Set child
     * 
     * @param child
     */
    public void setChild1(Person child) {
        this.child1 = child;
    }

    /**
     * Set child
     * 
     * @param child
     */
    public void setChild2(Person child) {
        this.child2 = child;
    }

    /**
     * Set child
     * 
     * @param child
     */
    public void setChild3(Person child) {
        this.child3 = child;
    }
}