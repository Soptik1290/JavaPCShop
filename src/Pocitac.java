package SemestralniPrace;

/**
 * Tridada reprezentujici pocitac.
 *
 * @author Tomas Stark
 * version 2023 - 05 - 14
 */
public class Pocitac {

    /**
     * Značka pocitace.
     */
    protected String znacka;

    /**
     * Cena pocitace.
     */
    protected double cena;
    protected String grafika;

    /**
     * Konstruktor pro vytvoreni noveho pocitace s danou znackou a cenou.
     *
     * @param znacka Znacka pocitace.
     * @param cena   Cena pocitace.
     */
    public Pocitac(String znacka, double cena) {
        this.znacka = znacka;
        this.cena = cena;
    }

    /**
     * Vrátu značku pocitace.
     *
     * @return Znacka pocitace.
     */
    public String getZnacka() {
        return znacka;
    }

    /**
     * Nastavi značku pocitace.
     *
     * @param znacka Znacka pocitace.
     */
    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    /**
     * Vrati cenu pocitace.
     *
     * @return Cena pocitace.
     */
    public double getCena() {
        return cena;
    }

    /**
     * Naszavi cenu pocitace.
     *
     * @param cena Cena pocitace.
     */
    public void setCena(double cena) {
        this.cena = cena;
    }
}