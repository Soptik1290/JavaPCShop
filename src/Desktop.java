package SemestralniPrace;

/**
 * Trida reprezentujicc stolni pocitac.
 *
 * @author Tomas Stark
 * version 2023 - 05 - 14
 */
public class Desktop extends Pocitac {
    private double VelikostObrazovky;
    private int ram;
    private String processor;

    /**
     * Konstruktor tridy Desktop.
     *
     * @param znacka            znacka pocitace
     * @param cena              cena pocitace
     * @param VelikostObrazovky velikost obrazovky v palcich
     * @param ram               velikost operacni pameti v GB
     * @param processor         nazev procesoru
     * @param grafika           nazev grafiky
     */
    public Desktop(String znacka, double cena, double VelikostObrazovky, int ram, String processor, String grafika) {
        super(znacka, cena);
        this.VelikostObrazovky = VelikostObrazovky;
        this.ram = ram;
        this.processor = processor;
        this.grafika = grafika;
    }

    /**
     * Vrati velikost obrazovky pocitace.
     *
     * @return velikost obrazovky v palcich
     */
    public double getVelikostObrazovky() {
        return VelikostObrazovky;
    }

    /**
     * Nastavi velikost obrazovky pocitace.
     *
     * @param velikostObrazovky velikost obrazovky v palcich
     */
    public void setVelikostObrazovky(double velikostObrazovky) {
        this.VelikostObrazovky = velikostObrazovky;
    }

    /**
     * Vrati velikost operacni pameti pocitace.
     *
     * @return velikost operační paměti v GB
     */
    public int getRam() {
        return ram;
    }

    /**
     * Nastavi velikost operacni pameti pocitace.
     *
     * @param ram velikost operacni pameti v GB
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * Vrati nazev procesoru pocitace.
     *
     * @return nazev procesoru
     */
    public String getProcessor() {
        return processor;
    }

    /**
     * Nastavi nazev procesoru pocitace.
     *
     * @param processor nazev procesoru
     */
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    /**
     * Vrati nazev graficke karty pocitace.
     *
     * @return nazev grafiky
     */
    public String getGrafika() {
        return grafika;
    }
    /**
     * Nastavi nazev graficke karty pocitace.
     *
     * @param grafika nazev
     */
    public void setGrafika(String grafika) {
        this.processor = grafika;
    }
}