import java.util.Scanner;

import global.Variables;
import mechanics.*;

public class Main {

        public static void welcomeToALonelyPlace() {
                System.out.println(
                                "\nAo acordar, você se depara perdido no primeiro andar de um lugar que parece uma masmorra...");
                System.out.println(
                                "\nA única coisa que você sabe é que deve lutar para sobreviver e escapar desse pesadelo!");
        }

        public static void gameStart() {
                System.out.println("\n------------------------");
                System.out.println("------ GAME START ------");
                System.out.println("------------------------");
        }

        public static void cardsHaveBeenAdded() {
                System.out.println("\n[!] Em suas mãos aparecem misteriosamente sete cartas mágicas.");
                System.out.println("\nVocê consegue sentir que elas estão imbuídas com poderes inimagináveis...");
        }

        public static void enemyHasBeenFound() {
                System.out.println(
                                "\n[!] Ao explorar a masmorra, você se depara com um inimigo assustador e fora desse mundo. ");

                System.out.println("\nVocê sente um fogo nostalgico em seu peito, e decide derrotar o inimigo. ");
        }

        public static void combatStart() {
                System.out.println("\n--------------------------");
                System.out.println("------ COMBAT START ------");
                System.out.println("--------------------------");
        }

        public static void enemyDestroyed(Hand Hand, Deck Deck) {
                System.out.println("\nO espírito sombrio foi destruido!");

                System.out.println(
                                "\nCom o inimigo derrotado, uma escada que parece o levar para o próximo andar aparece como se fosse mágica...");

                System.out.println("\nCarregando novo andar, por favor aguarde...");

                Hand.fillHand(Deck);
        }

        public static void main(String[] args) {

                Scanner in = new Scanner(System.in);

                Variables Global = new Variables();
                Deck Deck = new Deck();
                Hand Hand = new Hand(Deck);

                int userChoice = 0;
                int currentStage = 0;

                Enemy[] Enemy = new Enemy[5]; // One to rule them all

                Enemy[0] = new Enemy("Morto-vivo", 5, 5);
                Enemy[1] = new Enemy("Espectro da Escuridão", 10, 8); // 15, 8
                Enemy[2] = new Enemy("Cavaleiro Legionário", 10, 10); // 30, 10
                Enemy[3] = new Enemy("Sentinela Real", 10, 12); // 50, 12
                Enemy[4] = new Enemy("Alma das Cinzas", 10, 20); // 100, 20

                while (currentStage < Enemy.length) {
                        for (int i = 0; i < Enemy.length; i++) {
                                Global.usedCards = 0;
                                System.out.println("\n<<<<< Você se encontra atualmente no " + (currentStage + 1)
                                                + "° Andar! >>>>>");
                                System.out.println(
                                                "\nVocê colidiu com o " + Enemy[i].name + " e a batalha foi iniciada!");

                                do {
                                        while (Global.usedCards < 3) {
                                                System.out.println("\nMão: " + Hand);
                                                System.out.print("\nEscolha uma carta por seu número: ");
                                                userChoice = in.nextInt();

                                                System.out.println("\nVocê utilizou a carta "
                                                                + Hand.chosenCard(userChoice).name + "!");
                                                System.out.println("\n" + Hand.chosenCard(userChoice).description);

                                                Hand.chosenCard(userChoice).useCard(userChoice, Global);
                                                Hand.useCard(userChoice, Global);
                                        }
                                        
                                        Enemy[i].health -= Global.totalDamage;

                                        if (Global.totalDamage >= Enemy[i].health) {
                                                System.out.println(
                                                                "\n[!] Você utilizou todas as cartas que podia neste round, e atacou o inimigo. ");

                                                System.out.println("\n[!] O " + Enemy[i].name + " sofreu "
                                                                + Global.totalDamage + " de dano!");

                                                System.out.println("HP do inimigo: " + Enemy[i].health);

                                                enemyDestroyed(Hand, Deck);

                                                currentStage++;
                                        }
                                        /*
                                         * else {
                                         * Global.usedCards = 0;
                                         * 
                                         * System.out.println(
                                         * "\n[!] Você utilizou todas as cartas que podia neste round, e atacou o inimigo. "
                                         * );
                                         * 
                                         * System.out.println("\n[!] O " + Enemy[i].name + " sofreu " +
                                         * Global.totalDamage
                                         * + " de dano!");
                                         * 
                                         * System.out.println("HP do inimigo: " + Enemy[i].health);
                                         * 
                                         * System.out.println("\nO espírito sombrio sofreu dano, mas ainda possui "
                                         * + Enemy[i].health + " de vida!");
                                         * 
                                         * System.out.println("\nO " + Enemy[i].name + " o ataca, causando "
                                         * + Enemy[i].damage + " de dano ao jogador!");
                                         * 
                                         * Global.playerHealth -= Enemy[i].damage;
                                         * 
                                         * System.out.println("HP do jogador: " + Global.playerHealth);
                                         * 
                                         * Hand.fillHand(Deck);
                                         * }
                                         */

                                } while (Enemy[i].health > 0);
                        }
                }

                in.close();

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
                 * while (fase_atual <= Enemy.length) {
                 * // System.out.println("\n--------------- GAME START -----------------");
                 * // System.out.println("Você se encontra no " +fase_atual+ "° Andar!");
                 * 
                 * // Thread.sleep(1500);
                 * 
                 * // System.out.println("Cuidado! Goblins se aproximam!
                 * // Vida:"+Enemy[fase_atual].health+ " Dano:"+
                 * Enemy[fase_atual].damage);
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
                 * while(fase_de_acao){
                 * 
                 * System.out.println("Digite A para atacar!");
                 * 
                 * userChoice = in.nextInt();
                 * 
                 * }
                 * 
                 * fase_atual++;
                 * }
                 * in.close();
                 */
        }
}
