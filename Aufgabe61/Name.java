//package Aufgabe61;

/**
 * Name class, represents the name of a Person
 */
public class Name {
    String vorname;
    String nachname;
    String titel;
    String geburtsname;

    /**
     * Constructor
     * 
     * @param vorname
     * @param nachname
     * @param titel
     * @param geburtsname
     */
    public Name(String vorname, String nachname, String titel, String geburtsname) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.titel = titel;
        this.geburtsname = geburtsname;
    }

}