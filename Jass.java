import java.util.Arrays;

/**
 * Diese Klasse ist die Hauptklasse und enthält die main-Methode
 * In der main-Methode soll eine neues (vollstänidges) Deck erzeugt
 * und gemischt werden. Dann sollen von diesem Deck 30 Karten entfernt
 * werden und anschliessend das EICHELN ASS hinzugefügt werden
 * Danach sollen alle Karten auf der Konsole ausgegeben werden.
 */
public class Jass {


    public static void main(String[] args) {
        System.out.println("My Cards: ");
        Deck decky = new Deck();
        
        decky.shuffle();
        // System.out.println(Arrays.toString(decky.getDeck()));
        for (int i=0; i < 30; i++) {
            decky.pop();
            
        }
        // System.out.println(Arrays.toString(decky.getDeck()));
        Card card = new Card(Suit.EICHELN, Rank.ASS);
        decky.addCard(card);
        decky.cleanDeck();
        



    



    }
}
