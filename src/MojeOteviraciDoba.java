package SemestralniPrace;

import java.time.LocalTime;

/**
 * Trida {@code MojeOteviraciDoba} reprezentuje oteviraci dobu obchodu.
 * Oteviraci doba je od 9:00 do 17:00.
 *
 * @author Tomas Stark
 * version 2023 - 05 - 14
 */
public class MojeOteviraciDoba extends OteviraciDoba {
    /**
     * Urcuje, zda je obchod v aktualni dobe otevren.
     *
     * @return {@code true}, pokud je podnik otevren, jinak {@code false}
     */
    @Override
    public boolean jeOtevreno() {
        LocalTime aktualniCas = LocalTime.now();
        LocalTime oteviraOd = LocalTime.of(9, 0);
        LocalTime zaviraOd = LocalTime.of(17, 0);
        return aktualniCas.isAfter(oteviraOd) && aktualniCas.isBefore(zaviraOd);
    }

    /**
     * @return jeOtvreno
     */
    public boolean Otevreno() {
        return false;
    }
}
