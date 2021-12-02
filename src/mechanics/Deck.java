package mechanics;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
  final int TYPE_OF_CARDS = 13;
  final int QTD_COMUM = 4;
  final int QTD_ESPECIAL = 2;
  final int QTD_LENDARIA = 1;

  private ArrayList<Card> deck = new ArrayList<>();

  /**
   * Cria um Deck com DECK_SIZE de tamanho. Esse Deck já estará embaralhado desde
   * o momento de sua criação
   */
  public Deck() {
    for (int i = 1; i <= TYPE_OF_CARDS; i++) {
      // Adicionando cartas comuns ao Deck
      if (i <= 5) {
        for (int j = 0; j < QTD_COMUM; j++) {
          deck.add(new Card(i));
        }
      }
      // Adicionando cartas especiais ao Deck
      if (i > 5 && i <= 9) {
        for (int j = 0; j < QTD_ESPECIAL; j++) {
          deck.add(new Card(i));
        }
      }
      // Adicionando cartas lendárias ao Deck
      if (i > 9) {
        deck.add(new Card(i));
      }
    }
    this.shuffle();
  }

  /**
   * Retira uma Carta do topo do Deck, transformando-o em uma Pilha
   * 
   * @return Card
   */

  public Card getCard() { // <int> apenas para testes, trocar para <Card> futuramente
    return deck.remove(deck.size() - 1);
  }

  /**
   * Método para embaralhar o Deck, utilizando Collections.shuffle();
   */
  private void shuffle() {
    Collections.shuffle(deck);
  }

  /**
   * Imprime o Deck no formato de uma Array
   */
  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append("[");
    for (int i = 0; i < deck.size(); i++) {
      s.append(deck.get(i).nome);
      if (i < deck.size() - 1) {
        s.append(", ");
      }
    }
    s.append("]");
    return s.toString();
  }
}