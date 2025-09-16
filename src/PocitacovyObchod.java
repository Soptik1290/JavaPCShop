package SemestralniPrace;

/**
 * Trida reprezentujici obchod s pocitaci.
 *
 * @author Tomas Stark
 * version 2023 - 05 - 14
 */
public class PocitacovyObchod {

    /**
     * Metoda main spousti aplikaci obchodu s pocitaci.
     * Vytvori instanci tridy Laptop a Desktop a vypise informace o nich.
     *
     * @param args argumenty prikazove radky (nevyuzito)
     */
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Apple", 64999.99, 16.2, 16, "Apple M1 Pro");
        Desktop desktop = new Desktop("Custom", 129999.99, 34.1, 32, "AMD Ryzen 9 5900x", "Nvidia RTX 4090");
        MojeOteviraciDoba oteviraciDoba = new MojeOteviraciDoba();

        final double prirazka = 21.0;
        double LaptopSprirazkou = laptop.getCena() + (laptop.getCena() * (prirazka / 100));
        double DesktopSprirazkou = desktop.getCena() + (desktop.getCena() * (prirazka / 100));

        System.out.println();
        System.out.println(oteviraciDoba.vypisOtevreni());
        System.out.println();
        System.out.println("Aktualni nabidka");
        System.out.println("Laptop:");
        System.out.println("Znacka: " + laptop.getZnacka());
        System.out.println("Cena: " + laptop.getCena() + " Kč");
        System.out.println("Cena s obchodni prirazkou: " + String.format("%.2f", LaptopSprirazkou) + " Kč");
        System.out.println("Velikost obrazovky: " + laptop.getVelikostObrazovky());
        System.out.println("RAM: " + laptop.getRam());
        System.out.println("Procesor: " + laptop.getProcessor());

        System.out.println();

        System.out.println("Desktop:");
        System.out.println("Znacka: " + desktop.getZnacka());
        System.out.println("Cena: " + desktop.getCena() + " Kč");
        System.out.println("Velikost obrazovky: " + desktop.getVelikostObrazovky());
        System.out.println("Cena s obchodni prirazkou: " + String.format("%.2f", DesktopSprirazkou) + " Kč");
        System.out.println("RAM: " + desktop.getRam());
        System.out.println("Processor: " + desktop.getProcessor());
        System.out.println("Grafická karta: " + desktop.getGrafika());

    }
}
