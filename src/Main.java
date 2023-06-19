import java.time.LocalDate;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        //Usando LocalDate o un'altra classe Date calcola e stampa:
        //Quanti giorni rimangono alla fine del mese
        //Quanti giorni rimangono alla fine dell'anno usando il metodo "length()" da
        //java.time.Year.of();

        LocalDate dataCorrente = LocalDate.now();

        //Prendo il n. totale di giorni in questo mese:
        int giorniTotaleMese = dataCorrente.lengthOfMonth();

        //Prendo questo giorno del mese:
        int giornoCorrente = dataCorrente.getDayOfMonth();

        //Calcola il n. di giorni alla fine del mese:
        int giorniAFineMese = giorniTotaleMese - giornoCorrente;

        System.out.println("Giorni rimanenti alla fine del mese: " + giorniAFineMese);

        //Prendo l'anno corrente:
        int annoCorrente = dataCorrente.getYear();

        //Creo un oggetto rappresentando l'anno corrente:
        Year anno = Year.of(annoCorrente);

        //Prendo il numero totale di giorni in quest'anno:
        int giorniInAnno = dataCorrente.getDayOfYear();

        //Calcola il numero di giorni rimanenti alla fine dell'anno:
        int giorniAFineAnno = giorniInAnno - giornoCorrente;

        System.out.println("Giorni rimanenti alla fine dell'anno: " + giorniAFineAnno);

    }
}