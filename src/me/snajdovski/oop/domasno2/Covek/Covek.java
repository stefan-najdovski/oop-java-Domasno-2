package me.snajdovski.oop.domasno2.Covek;

/**
 * @author Stefan Najdovski
 * @version 1.0
 * @date 04-11-22
 * @description Klasata e nameneta za reprezentacija na covek so najosnovni atributi i metodite za pristap do niv.
 */


public class Covek {

    public String ime;
    public String prezime;
    public int godini;

    /***
     * @param ime Ime na covekot
     * @param prezime   Prezime na covekot
     * @param rasa  Rasa na covekot
     * @param godini   Godini na covekot
     * @param pol Pol na covekot, tip int za pol, 1 za masko, 2 za zensko, 3 za druga opredelba
     * @param tezina  Tezina na covekot izrazena vo kilogrami (float)
     * @param visina Visina na covekot izrazena vo centimetri (float)
     * @param ziv   Dali covekot e ziv, boolean vrednost (true/false) true = ziv, false = mrtov
     * @param datumNaRaganje Datum na raganje na covekot vo formatot "YYYY-MM-DD"
     * @param nacionalost   Nacionalnost na covekot
     *
     */
    public float tezina, visina;
    public boolean daliEziv;
    public String datumNaRaganje;
    nacionalost etnickaPripadnostEnum;
    pol polEnum;
    rasa rasaEnum;

    public Covek(String ime, String prezime, rasa rasaEnum, int godini, pol polEnum, float tezina, float visina, boolean daliEziv, String datumNaRaganje, nacionalost etnickaPripadnostEnum) {
        this.ime = ime;
        this.prezime = prezime;
        this.rasaEnum = rasaEnum;
        this.godini = godini;
        this.polEnum = polEnum;
        this.tezina = tezina;
        this.visina = visina;
        this.daliEziv = daliEziv;
        this.datumNaRaganje = datumNaRaganje;
        this.etnickaPripadnostEnum = etnickaPripadnostEnum;
    }

    public String getRasa() {
        return rasaEnum.toString();
    }

    public void setRasa(rasa rasaEnum) {
        this.rasaEnum = rasa.valueOf(rasaEnum.toString());
    }

    public String getPol() {
        return polEnum.toString();
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPol(String polEnum) {
        this.polEnum = pol.valueOf(polEnum);
    }

    public int getGodini() {
        return godini;
    }

    public nacionalost getEtnickaPripadnostEnum() {
        return etnickaPripadnostEnum;
    }

    public float getTezina() {
        return tezina;
    }

    public float getVisina() {
        return visina;
    }

    public boolean isDaliEziv() {
        return daliEziv;
    }

    public String getDatumNaRaganje() {
        return datumNaRaganje;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setEtnickaPripadnostEnum(nacionalost etnickaPripadnostEnum) {
        this.etnickaPripadnostEnum = etnickaPripadnostEnum;
    }

    public void setGodini(int godini) {
        this.godini = godini;
    }

    @Override
    public String toString() {
        return "Covek Object " + "ime= " + ime + ", prezime=" + prezime + " rasa= " + getRasa() + "  godini= " + godini + " pol=" + getPol() + " tezina=" + tezina + " visina=" + visina + " daliEziv=" + daliEziv + " datumNaRaganje=" + datumNaRaganje + " etnickaPripadnostEnum=" + getEtnickaPripadnostEnum();

    }

    public void setTezina(float tezina) {
        this.tezina = tezina;
    }

    public void setVisina(float visina) {
        this.visina = visina;
    }

    public void setDaliEziv(boolean daliEziv) {
        this.daliEziv = daliEziv;
    }

    public void setDatumNaRaganje(String datumNaRaganje) {
        this.datumNaRaganje = datumNaRaganje;
    }

    public enum pol {Masko, Zensko, Drugo}

    public enum nacionalost {Makedonska, Albanska, Srbska, Bosanska, Turska, Evrejska, Bugarska, Grcka, Druga}

    public enum rasa {Bela, Crna, Smega, Zolta, Crvena, Druga}
}
