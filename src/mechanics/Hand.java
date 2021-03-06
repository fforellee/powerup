package mechanics;

import java.util.ArrayList;
import global.Variables;

public class Hand {

    final int HAND_SIZE = 7;
    ArrayList<Card> playerHand = new ArrayList<>(HAND_SIZE);
    Variables Global = new Variables();

    /**
     * Cria-se a Mão e a preenche com sete cartas
     * 
     * @param Deck
     */
    public Hand(Deck Deck) {
        while (currentHand() < HAND_SIZE) {
            playerHand.add(Deck.removeCard());
        }
    }

    /**
     * Preenche a mão do jogador com sete cartas
     * 
     * @param Deck
     */
    public void fillHand(Deck Deck) {
        while (currentHand() < HAND_SIZE) {
            playerHand.add(Deck.removeCard());
        }
    }

    /**
     * Utiliza uma carta escolhida pelo jogador na posição indicada
     * 
     * @param userChoice posição escolhida pelo jogador, de 0 a 6
     * @param Global     variável global que controla as cartas utilizadas
     */
    public void useCard(int userChoice, Variables Global) {
        if (Global.usedCards < 3) {
            playerHand.remove(chosenCard(userChoice));
            Global.usedCards++;
        } else {
            System.out.println(
                    "Ao tentar utilizar uma quarta carta, você sente um desconforto em sua mente... \nTalvez isso signifique que seu corpo chegou ao limite do cansaço... \nTente novamente no próximo andar.");
        }
    }

    public void useCard2(int userChoice, Variables Global) {

        switch (userChoice) {
            case 1:
                System.out.println("Curar");
                Global.playerHealth += 5;
                Global.knightQuantity -= 3;
                break;
            case 2:
                System.out.println("Recrutar");
                Global.knightQuantity += 2;
                break;
            case 3:
                System.out.println("Reunir");
                Global.knightDamage += Global.totalDamage + (double) Global.knightQuantity / 2;
                break;
            case 4:
                System.out.println("Sacrificar");
                Global.knightQuantity -= 2;
                Global.knightDamage += Global.knightDamage * 1;
                break;
            case 5:
                System.out.println("Treinar");
                Global.knightDamage++;
                break;
        }
    }

    /**
     * Mostra a carta escolhida pelo jogador na posição indicada
     * 
     * @param position posição escolhida pelo jogador, de 0 a 6
     * @return Carta encontrada na posição escolhida
     */
    public Card chosenCard(int userChoice) {
        return playerHand.get(userChoice);
    }

    /**
     * Verifica quantas cartas o jogador tem em sua mão em um momento específico
     * 
     * @return Quantidade de cartas na mão do jogador
     */
    public int currentHand() {
        return playerHand.size();
    }

    /**
     * Representação textual das cartas que o jogador possui em sua mão
     */
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
