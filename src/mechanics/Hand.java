package mechanics;

import java.util.ArrayList;
import global.Variables;

public class Hand {

    final int HAND_SIZE = 7;
    ArrayList<Card> playerHand = new ArrayList<>(HAND_SIZE);

    public Hand(Deck Deck) {
        while (currentHand() < HAND_SIZE) {
            playerHand.add(Deck.removeCard());
        }
    }

    public void fillHand(Deck Deck) {
        while (currentHand() < HAND_SIZE) {
            playerHand.add(Deck.removeCard());
        }
    }

    public void useCard(int userChoice, Variables Global) {
        if (Global.usedCards < 3) {
            playerHand.remove(chosenCard(userChoice));
            Global.usedCards++;
        }
    }

    public Card chosenCard(int userChoice) {
        return playerHand.get(userChoice);
    }

    public int currentHand() {
        return playerHand.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < playerHand.size(); i++) {
            sb.append("(" + (i) + ") ");
            sb.append(playerHand.get(i).name);

            if (i < playerHand.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
