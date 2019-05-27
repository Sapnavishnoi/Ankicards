package ankiDroid;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    public String name;
    private final List<Card> cards = new ArrayList<>();

    public Deck(String name) {
        this.name = name;
    }


    public List<Card> addCards(String front, String back) {
        Card card = new Card(front, back);
        cards.add(card);
        return cards;
    }

//    public List<Card> addcards(){
//        return cards;
//    }
}