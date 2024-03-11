import java.util.Random;
import java.util.Arrays;

/**
 * Diese Klasse repräsentiert einen Kartenstapel mit einer variablen Anzahl
 * Karten
 * Sie soll ein Array von Typ Card als Instanzvariable haben,
 * - einen Konstruktor Deck(Card[] cards), welches eine Instanz bestehend aus
 * den gegebenen Karten kreiert,
 * - einen Konstruktor Deck(), welcher ein vollständiges Kartenset (4x9 Karten)
 * erzeugt,
 * - einen (trivialen) Getter getCards()
 * - eine Methode addCard(Card card), welche zum Deck eine Karte hinzufügt,
 * falls diese noch nicht im Deck enthalten ist und andernfalls eine Warnung auf
 * der Konsole ausgibt
 * - eine Methode pop(), welche die letzte Karte im Array aus dem Deck entfernt,
 * sofern Karten vorhanden sind
 * - eine Methode shuffle(), welche die Karten im Array durchmischt
 * 
 * Tipps:
 * - Um ein Array zu redimensionieren, verwende den Befehl "Arrays.copyOf" aus
 * java.util.Arrays
 * - Um eine zufällige Ganzzahl in einem gegebenen Bereich zu erzeugen, verwende
 * "rnd.nextInt", wobei "rnd" eine Instanz der Klasse "Random" aus
 * "java.util.Random" bezeichnet
 *
 */
public class Deck                           {
    Card[] deck                             ;

    public Deck(Card[] deck)                {
        this.deck = deck                    ;}
    
    public Deck(){
        int i = 0;
        this.deck = new Card[36];
        for (Rank rank : Rank.values()) {
                for (Suit suit : Suit.values()) {
                        this.deck[i] = new Card(suit, rank);
                        i++; }}}

    public Card[] getDeck() {
        return this.deck;
    }

    public Card[] pop() {
        if (this.deck.length != 0) {
            for (int i=0; i < deck.length; i++) {
                if (this.deck[this.deck.length -1 -i] != null) {
                    this.deck[this.deck.length -1 -i] = null;
                    return this.deck;
                } 
            }
        }
        return this.deck;
    }
    
    public Card[] addCard(Card card) {
        for (int i=0; i < this.deck.length; i++) {
            if (("" + this.deck[i]).equals("" + card)) {
                System.out.println("Error: Card already in deck");
                return this.deck;
            }
            if (this.deck[i] == null) {
                this.deck[i] = card;
                return this.deck;
            }
        }
        return this.deck;
    }

    public Card[] shuffle() {
        for (int i=0; i < this.deck.length; i++) {
            int random = (int)Math.floor(Math.random() * (this.deck.length));
            if (this.deck[i] != null && this.deck[random] != null) {
                Card card = this.deck[i];
                this.deck[i] = this.deck[random];
                this.deck[random] = card;
            }
        }
        return this.deck;
    }

    public void cleanDeck() {
        int i = 0;
        while (this.deck[i] != null) {
            System.out.println(this.deck[i]);
            i++;
        }
    }


}

        
        



    
    

