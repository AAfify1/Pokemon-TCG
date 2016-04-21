import java.util.Collections;
import java.util.Stack;


public class Deck {
	Card placeholder = new Card("Empty Deck","Placeholder");
	
    public Stack<Card> cards = new Stack();

	
	
    

    public void addCard(Card c) {
        if (c != null) {
            cards.push(c);
        }
    }

    public Card[] copyToArray() {
        return cards.toArray(new Card[cards.size()]);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card pop() {
        if (cards.empty()) {
            return placeholder;
        }
        return cards.pop();
    }

    public int size() {
        return cards.size();
    }

    public Card removeCardAt(int index) {
        return cards.remove(index);
    }
}