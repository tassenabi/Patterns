package com.patterns.builder;

public class Mandant
{
    private final String vorname; // required
    private final String nachname; // required
    private final int mandantenNummer; // optional
    private final String adresse; // optional

    private Mandant(MandantenBuilder mandantenBuilder) {
        this.vorname = mandantenBuilder.firstName;
        this.nachname = mandantenBuilder.lastName;
        this.mandantenNummer = mandantenBuilder.mandantenNummer;
        this.adresse = mandantenBuilder.address;
    }

    //Keine Setter wegen immutability
    public String getVorname() {return vorname;}
    public String getNachname() {
        return nachname;
    }
    public int getMandantenNummer() {
        return mandantenNummer;
    }
    public String getAdresse() {
        return adresse;
    }

    @Override
    public String toString() {
        return "User: "+this.vorname+", "+this.nachname+", "+this.mandantenNummer+", "+this.adresse;
    }

    public static class MandantenBuilder
    {
        private final String firstName;
        private final String lastName;
        private int mandantenNummer;
        private String address;

        public MandantenBuilder(String vorname, String nachname) {
            this.firstName = vorname;
            this.lastName = nachname;
        }

        public MandantenBuilder withMandantenNummer(int mandantenNummer) {
            this.mandantenNummer = mandantenNummer;
            return this;
        }
        public MandantenBuilder withAdresse(String address) {
            this.address = address;
            return this;
        }
        //Return the finally constructed User object
        public Mandant build() {

            Mandant mandant = new Mandant(this);
            MandantenValidator.validateMandant(mandant);
            return mandant;
        }
    }
}