//package Aufgabe61;

/**
 * Address class
 * represents address a person has
 * 
 * @author Christoph Nicklas Jänicke
 */
public class Address {
    private String strasse;
    private int hausnummer;
    private int postleitzahl;
    private String wohnort;
    private String land;

    public Address(String strasse, int hausnummer, int postleitzahl, String wohnort, String land) {
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.postleitzahl = postleitzahl;
        this.wohnort = wohnort;
        this.land = land;
    }

    /**
     * 
     * @param strasse as String
     */
    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    /**
     * 
     * @return as String
     */
    public String getStrasse() {
        return this.strasse;
    }

    /**
     * 
     * @param hausnummer as int
     */
    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    /**
     * 
     * @return as int
     */
    public int getHausnummer() {
        return this.hausnummer;
    }

    /**
     * 
     * @param postleitzahl as int
     */
    public void setPostleitzahl(int postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    /**
     * 
     * @return as int
     */
    public int getPostleitzahl() {
        return this.postleitzahl;
    }

    /**
     * 
     * @param wohnort as String
     */
    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

    /**
     * 
     * @return as String
     */
    public String getWohnort() {
        return this.wohnort;
    }

    /**
     * 
     * @param land as String
     */
    public void setLand(String land) {
        this.land = land;
    }

    /**
     * 
     * @return as String
     */
    public String getLand() {
        return this.land;
    }
}
