import java.util.Scanner;

import global.Variables;
import mechanics.*;

public class Main {

        public static void main(String[] args) throws Exception {

                Scanner in = new Scanner(System.in);

                Variables Global = new Variables();
                Deck Deck = new Deck();
                Hand Hand = new Hand(Deck);

                // boolean fase_de_acao = true;
                int userChoice;

                Enemy[] inimigos = new Enemy[5]; // One to rule them all

                inimigos[0] = new Enemy("Morto-vivo", 5, 10);
                inimigos[1] = new Enemy("Espectro da Escuridão", 15, 8);
                inimigos[2] = new Enemy("Cavaleiro Legionário", 30, 10);
                inimigos[3] = new Enemy("Sentinela Real", 50, 12);
                inimigos[4] = new Enemy("Alma das Cinzas", 100, 20);

                /*
                 * for (int i = 0; i < inimigos.length; i++) {
                 * inimigos[i] = new Enemy(5, 5);
                 * }
                 */

                // System.out.println(" _______ _______ _ _ _______ ______ __ __ _______ __ ");
                // System.out.println(" | || || | _ | || || _ | | | | || | | | ");
                // System.out.println(" | _ || _ || || || || ___|| | || | | | || _ | | | ");
                // System.out.println(" | |_| || | | || || |___ | |_||_ | |_| || |_| | | | ");
                // System.out.println(" | ___|| |_| || || ___|| __ | | || ___| |__| ");
                // System.out.println(" | | | || _ || |___ | | | | | || | __ ");
                // System.out.println(" |___| |_______||__| |__||_______||___| |_|
                // |_______||___| |__| ");
                // System.out.println(" ");

                // Thread.sleep(3000);

                // System.out.println( "\nAo acordar, você se depara perdido no primeiro andar
                // de um lugar que parece uma masmorra...");
                // System.out.println( "\nA única coisa que você sabe é que deve lutar para
                // sobreviver e escapar desse pesadelo!");

                // Thread.sleep(3000);

                // System.out.println("\n[!] Em suas mãos aparecem misteriosamente sete cartas
                // mágicas.");
                // System.out.println("\nVocê consegue sentir que elas estão imbuídas com
                // poderes inimagináveis...");

                // Thread.sleep(3000);
                // System.out.println(Global.playerHealth);
                // Global.playerHealth = 10;
                // System.out.println(Global.playerHealth);

                /*
                 * (Sistema) O jogador utiliza 3 cartas, após 3 cartas serem utilizadas, o loop
                 * quebra,
                 * o dano total é computado e o inimigo sofre esse dano
                 * 
                 * if (dano total >= hp do inimigo) {
                 * avisa que o jogador derrotou o inimigo, aumenta seu score
                 * (baseado no hp do inimigo, 5 no primeiro andar) e o leva pro próximo andar
                 * }
                 * else {
                 * o inimigo da dano fixo (baseado em sua criação, 5 no primeiro andar) no hp do
                 * jogador
                 * e o jogo loopa o sistema acima até o inimigo ser derrotado, ou o
                 * hp do jogador chegar a 0
                 * }
                 */

                /**
                 * --------FUNCIONAL--------
                 * Enquanto a quantidade de cartas usadas for menor que 3, pede-se uma carta ao
                 * jogador
                 * Utiliza a carta e a remove da Mão
                 */
                while (Global.usedCards < 3) {
                        System.out.println("\nMão: " + Hand);
                        System.out.print("\nEscolha uma carta por seu número: ");
                        userChoice = in.nextInt();
                        Hand.chosenCard(userChoice).useCard(userChoice, Global);
                        Hand.useCard(userChoice, Global);
                }

                /**
                 * Loop principal do jogo (tentativa)
                 * Se o dano total do cavaleiro for maior ou igual ao HP do inimigo do andar
                 * atual, pula de andar
                 */

                /* int currentStage = 1;
                while (currentStage < inimigos.length) {

                }

                if (Global.totalDamage() >= inimigos[0].health) {
                        System.out.println("O espírito sombrio foi derrotado!");
                        System.out.println("Você é levado para o próximo andar.");
                        currentStage++;
                } else {
                        System.out.println(
                                        "Você deu dano ao inimigo, mas parece que não foi o suficiente");
                        System.out.println("Você tomou 5 de dano!");
                }

                System.out.println(currentStage); */

                /*
                 * while (fase_atual <= inimigos.length) {
                 * // System.out.println("\n--------------- GAME START -----------------");
                 * // System.out.println("Você se encontra no " +fase_atual+ "° Andar!");
                 * 
                 * // Thread.sleep(1500);
                 * 
                 * // System.out.println("Cuidado! Goblins se aproximam!
                 * // Vida:"+inimigos[fase_atual].health+ " Dano:"+
                 * inimigos[fase_atual].damage);
                 * 
                 * // Thread.sleep(1500);
                 * 
                 * System.out.println("\nMão: " + Hand);
                 * 
                 * System.out.println("\nQual carta deseja usar?");
                 * userChoice = in.nextInt();
                 * Hand.chosenCard(userChoice).useCard(userChoice, Global);
                 * 
                 * Global.printGlobalVariables();
                 * 
                 * // while(fase_de_acao){
                 * 
                 * // System.out.println("Digite A para atacar!");
                 * 
                 * // userChoice = in.nextInt();
                 * 
                 * // }
                 * 
                 * fase_atual++;
                 * }
                 * in.close();
                 */
        }
}
