import java.util.Random;
import java.util.Scanner;

import global.Variables;
import mechanics.*;

public class Main {

        public static void main(String[] args) throws Exception {

                Random Random = new Random();
                Scanner in = new Scanner(System.in);

                Variables Global = new Variables();
                Stage Stage = new Stage();
                Deck Deck = new Deck();
                Hand Hand = new Hand(Deck);

                System.out.println("Você se encontra no " + Stage.currentStage() + "° Andar!");

                System.out.println("\nMão: " + Hand);

                Global.printar();

                System.out.println("\nQual carta deseja utilizar? ");
                int userChoice = in.nextInt();

                System.out.println("\nVocê utilizou a carta " + Hand.chosenCard(userChoice).name + "!");
                System.out.println("\n" + Hand.chosenCard(userChoice).description);

                Hand.useCard2(userChoice, Global);

                Global.printar();

                /* System.out.println(
                                "\nAo acordar, você se depara perdido no primeiro andar de um lugar que parece uma masmorra...");
                System.out.println(
                                "\nA única coisa que você sabe é que deve lutar para sobreviver e escapar desse pesadelo!");

                System.out.println("\n----- GAME START -----");

                System.out.println("\n[!] Em suas mãos aparecem misteriosamente sete cartas mágicas.");
                System.out.println("\nVocê consegue sentir que elas estão imbuídas com poderes inimagináveis...");

                System.out.println("\nMão: " + Hand);

                System.out.println(
                                "\n[!] Ao explorar a masmorra, você se depara com um inimigo assustador e fora desse mundo. ");

                System.out.println("\nVocê sente um fogo nostalgico em seu peito, e decide derrotar o inimigo. ");

                System.out.println("\n----- COMBAT START -----");

                System.out.println("\nQual carta deseja utilizar? ");
                int userChoice = in.nextInt();

                System.out.println("\nVocê utilizou a carta " + Hand.chosenCard(userChoice).nome + "!");
                System.out.println("\n" + Hand.chosenCard(userChoice).descricao);

                Hand.useCard(userChoice, Global);
                Hand.useCard(0, Global);
                Hand.useCard(2, Global);
                Hand.useCard(4, Global);

                // System.out.println("\nQtd Cartas Utilizadas: " + Global.cartasUsadas);

                System.out.println("\nO espírito maligno foi destruido!");

                System.out.println("\nMão: " + Hand);

                System.out.println(
                                "\nCom o inimigo derrotado, uma escada que parece o levar para o próximo andar aparece como se fosse mágica...");

                System.out.println("\n[...] Carregando novo andar, por favor aguarde.");

                System.out.println("\n----- 2° Andar -----");

                System.out.println("\n[!] Ao subir de andar, novas cartas surgem misteriosamente em suas mãos.");

                Hand.fillHand(Deck);

                System.out.println("\n...Você sente uma espécie de déjà vu, mas decide ignorar essa sensação.");

                System.out.println("\nMão: " + Hand);

                System.out.println("\n----- GAME START -----"); */

        }
}