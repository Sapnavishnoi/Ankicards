package test.java.ankiDroidTest;

import ankiDroid.Card;
import ankiDroid.Deck;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnkiTest {

    @Test
    public void shouldGiveDeckName(){
        Deck programming = new Deck("programming");
        String expected = "programming";
        assertEquals(expected,programming.name);

    }@Test
    public void shouldGiveCards(){
        Card data = new Card("head command used for what","give begning lines of file");
        String expected = "head command used for what,give begning lines of file";
        assertEquals(expected,data.toString());
    }
    @Test
    public void cardsShouldBeAddInDeck(){
        Deck programming = new Deck("programming");
        List<Card> cards =new ArrayList<>();
        Card card = new Card("head command used for what","give begning lines of file");
        programming.addCards("head command used for what","give begning lines of file");
        assertEquals("[head command used for what,give begning lines of file]",programming.addcards().toString());

    }



}
