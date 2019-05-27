package ankiDroid;

public class Card {
    String front;
    String back;

    @Override
    public String toString() {
        return front + ',' + back;
    }

    public Card(String front, String back) {
        this.front = front;
        this.back = back;
    }
}
