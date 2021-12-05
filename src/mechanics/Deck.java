package mechanics;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
  final int CARD_VARIETY = 5;
  final int CARD_QUANTITY = 7;

  private ArrayList<Card> Deck = new ArrayList<>(CARD_QUANTITY);

  public Deck() {
    for (int i = 1; i <= CARD_VARIETY; i++) {
      if (i <= 5) {
        for (int j = 0; j < CARD_QUANTITY; j++) {
          Deck.add(new Card(i));
        }
      }
    }
    this.shuffle();
  }

  public Card removeCard() {
    return Deck.remove(Deck.size() - 1);
  }

  private void shuffle() {
    Collections.shuffle(Deck);
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("[");

    for (int i = 0; i < Deck.size(); i++) {
      sb.append(Deck.get(i).name);

      if (i < Deck.size() - 1) {
        sb.append(", ");
      }
    }
    sb.append("]");
    return sb.toString();
  }
}