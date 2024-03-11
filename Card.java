/**
 * Diese Klasse repräsentiert eine Karte (Bsp. EICHELN ASS)
 * Sie soll Instanzvariablen von Typ "Suit" und "Rank" haben,
 * einen Konstruktor, eine Methode "toString()" zur Representation
 * als Zeichenkette, sowie eine "equals(Card other)" Methode, welche
 * zurückgibt, ob die aktuelle Karte gleichen Suit und Rank wie die
 * andere Karte hat.
 */
public class Card {
    Suit suit;
    Rank rank;

    

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }
    

    public String toString() {
        return "" + this.suit + " " + this.rank;
    }

    public boolean equals(Card card, Card other) {
        if (other == card) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
    }

    
}
