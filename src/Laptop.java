package SemestralniPrace;

/**
 * Trida reprezentujici notebook.
 *
 * @author Tomas Stark
 * version 2023 - 05 - 14
 */
public class Laptop extends Pocitac {

    /**
     * Velikost obrazovky notebooku v palcích.
     */
    private double VelikostObrazovky;

    /**
     * Velikost RAM paměti notebooku v GB.
     */
    private int ram;

    /**
     * Typ procesoru notebooku.
     */
    private String processor;

    /**
     * Konstruktor pro vytvoření nového notebooku s danou značkou, cenou, velikostí obrazovky, RAM a procesorem.
     *
     * @param znacka            Značka notebooku.
     * @param cena              Cena notebooku.
     * @param VelikostObrazovky Velikost obrazovky notebooku v palcích.
     * @param ram               Velikost RAM paměti notebooku v GB.
     * @param processor         Typ procesoru notebooku.
     */
    public Laptop(String znacka, double cena, double VelikostObrazovky, int ram, String processor) {
        super(znacka, cena);
        this.VelikostObrazovky = VelikostObrazovky;
        this.ram = ram;
        this.processor = processor;
    }

    /**
     * Vrátí velikost obrazovky notebooku.
     *
     * @return Velikost obrazovky notebooku v palcích.
     */
    public double getVelikostObrazovky() {
        return VelikostObrazovky;
    }

    /**
     * Nastaví velikost obrazovky notebooku.
     *
     * @param velikostObrazovky Velikost obrazovky notebooku v palcích.
     */
    public void setVelikostObrazovky(double velikostObrazovky) {
        this.VelikostObrazovky = velikostObrazovky;
    }

    /**
     * Vrátí velikost RAM paměti notebooku.
     *
     * @return Velikost RAM paměti notebooku v GB.
     */
    public int getRam() {
        return ram;
    }

    /**
     * Nastaví velikost RAM paměti notebooku.
     *
     * @param ram Velikost RAM paměti notebooku v GB.
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * Vrátí typ procesoru notebooku.
     *
     * @return Typ procesoru notebooku.
     */
    public String getProcessor() {
        return processor;
    }

    /**
     * Nastaví typ procesoru notebooku.
     *
     * @param processor Typ procesoru notebooku.
     */
    public void setProcessor(String processor) {
        this.processor = processor;
    }
}