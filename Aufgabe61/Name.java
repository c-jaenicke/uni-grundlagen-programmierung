//package Aufgabe61;

/**
 * Name class, represents the name of a Person
 * 
 * @author Christoph Nicklas Jänicke
 */
public class Name {
    private String vorname;
    private String nachname;
    private String titel;
    private String geburtsname;

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

    /**
     * 
     * @param vorname as String
     */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /**
     * 
     * @return as String
     */
    public String getVorname() {
        return this.vorname;
    }

    /**
     * 
     * @param nachname as String
     */
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    /**
     * 
     * @return as Strings
     */
    public String getNachname() {
        return this.nachname;
    }

    /**
     * 
     * @param titel as String
     */
    public void setTitel(String titel) {
        this.titel = titel;
    }

    /**
     * 
     * @return as Strings
     */
    public String getTitel() {
        return this.titel;
    }

    /**
     * 
     * @param geburtsname as String
     */
    public void setGeburtsname(String geburtsname) {
        this.geburtsname = geburtsname;
    }

    /**
     * 
     * @return as String
     */
    public String getGeburtsname(){
        return this.geburtsname;
    }
}