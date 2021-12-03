package mechanics;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
  final int CARD_VARIETY = 6;
  final int CARD_QUANTITY = 7;

  private ArrayList<Card> Deck = new ArrayList<>();

  /**
   * Cria um Deck com DECK_SIZE de tamanho. Esse Deck já estará embaralhado desde
   * o momento de sua criação
   */
  public Deck() {
    for (int i = 1; i <= CARD_VARIETY; i++) {
      // Adicionando cartas comuns ao Deck
      if (i <= 7) {
        for (int j = 0; j < CARD_QUANTITY; j++) {
          Deck.add(new Card(i));
        }
      }
    }
    this.shuffle();
  }
  
  /**
   * Retira uma Carta do topo do Deck, transformando-o em uma Pilha
   * 
   * @return Card
   */
  public Card removeCard() {
    return Deck.remove(Deck.size() - 1);
  }

  /**
   * Método para embaralhar o Deck, utilizando Collections.shuffle();
   */
  private void shuffle() {
    Collections.shuffle(Deck);
  }

  /**
   * Imprime o Deck no formato de uma Array
   */
  public String toString() {
    StringBuilder sb = new StringBuilder("[");

    for (int i = 0; i < Deck.size(); i++) {
      sb.append(Deck.get(i).nome);
      
      if (i < Deck.size() - 1) {
        sb.append(", ");
      }
    }
    sb.append("]");
    return sb.toString();
  }
}