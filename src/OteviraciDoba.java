package SemestralniPrace;

/**
 * Abstraktni trida {@code OteviraciDoba} reprezentuje oteviraci dobu.
 * Tato trida slouzi jako nadrazena trida pro specificke tridy reprezentujici
 * @author Tomas Stark
 * version 2023 - 05 - 14
 */
public abstract class OteviraciDoba {
    /**
     * Urcuje, zda je podnik v aktualni dobe otevren.
     *
     * @return {@code true}, pokud je podnik otevren, jinak {@code false}
     */
    public abstract boolean jeOtevreno();

    /**
     * Vraci textovy retezec, ktery popisuje, zda je podnik otevren nebo zavren.
     *
     * @return textovy rezezec "Je otevreno." nebo "Je zavreno."
     */
    public String vypisOtevreni() {
        if (jeOtevreno()) {
            return "Je otevreno. Muzete si prohlednou aktualni nabidku";
        } else {
            return "Je zavreno. Prijde jindy. Oteviraci doba je od 9:00 - 17:00. Na aktualni nabidku se muzete podivat nize";
        }
    }
    /**
     * Vraci textovy retezec, otevreno nebo zavreno.
     * @return textovy rezezec "Je otevreno." nebo "Je zavreno."
     */
    public abstract boolean Otevreno();
}