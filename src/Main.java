import java.util.Scanner;

import global.Variables;
import mechanics.*;

public class Main {

        public static void welcomeToALonelyPlace() {
                System.out.println(
                                "\n[!] Ao acordar, você se depara perdido em um lugar que parece um calabouço... ");

                System.out.println(
                                "\nA única coisa que você sabe é que deve lutar para sobreviver e escapar desse lugar abandonado pelos Deuses. ");
        }

        public static void gameStart() {
                System.out.println("\n------------------------");
                System.out.println("------ GAME START ------");
                System.out.println("------------------------");
        }

        public static void cardsHaveBeenAdded() {
                System.out.println("\n[!] Em suas mãos aparecem misteriosamente sete cartas mágicas.");

                System.out.println("\nVocê consegue sentir que elas estão imbuídas com poderes inimagináveis.");
        }

        public static void newCardsHaveBeenAdded() {
                System.out.println("\n[!] Ao subir de andar, novas cartas surgem misteriosamente em suas mãos...");

                System.out.println("\n[?] Você sente uma espécie de déjà vu, mas decide ignorar essa sensação.");
        }

        public static void enemyHasBeenFound() {
                System.out.println(
                                "\n[!] Ao explorar o calabouço, você se depara com um inimigo assustador e fora desse mundo. ");

                System.out.println(
                                "\n[?] Você sente um ímpeto nostalgico em seu peito, e isso o motiva a derrotar o inimigo. ");
        }

        public static void combatStart() {
                System.out.println("\n--------------------------");
                System.out.println("------ COMBAT START ------");
                System.out.println("--------------------------");
        }

        public static void enemyDestroyed(Hand Hand, Deck Deck) {
                System.out.println("\nO espírito sombrio foi destruído!");

                System.out.println(
                                "\n[!] Com o inimigo derrotado, uma escada que parece o levar para o próximo andar aparece como se fosse mágica...");

                System.out.println("\n[!] Sua determinação aumenta e queima incandescentemente, como o Sol.");

                System.out.println("\nAguarde enquanto o próximo andar é carregado.");
        }

        public static void gameOver(Variables Global, int currentStage) {
                System.out.println(
                                "\n[X] O golpe do inimigo em seu peito reduziu seus últimos pontos de vida a zero.");

                System.out.println("\n[!] Você sucumbiu e chegou ao fim de sua aventura.");

                System.out.println("\nO Game Master lhe deseja boa sorte em suas próximas tentativas!");

                System.out.println("\nPlacar final: " + Global.score);
        }

        public static void victoryAchieved(Variables Global, int currentStage) {
                System.out.println(
                                "\n[?] Ao derrotar o inimigo do quinto andar, um portal misterioso aparece em baixo de seus pés...");
                System.out.println(
                                "\n[!] Uma luz dourada e aconchegante emana do portal, como se estivesse lhe dizendo que está tudo bem agora.");

                System.out.println(
                                "\nAo ser teleportado para fora da masmorra, você consegue ouvir uma voz lhe dizendo serenamente: ");

                System.out.println(
                                "\n<<< Muitos tentaram, mas diferente de você, nenhum deles foi capaz de estar aqui. Bom trabalho. >>>");

                System.out.println("\n[!] Você enfrentou as adversidades e saiu vitorioso!");

                System.out.println("\nO Game Master olha nas profundezas de seus olhos e o parabeniza por jogar!");

                System.out.println("\nSeu placar final é: " + Global.score);
        }

        public static void main(String[] args) {

                Scanner in = new Scanner(System.in);

                Variables Global = new Variables();
                Deck Deck = new Deck();
                Hand Hand = new Hand(Deck);

                Enemy[] Enemy = new Enemy[5]; // One to rule them all

                Enemy[0] = new Enemy("Morto-vivo", 5, 5);
                Enemy[1] = new Enemy("Espectro da Escuridão", 15, 8); // 15, 8
                Enemy[2] = new Enemy("Cavaleiro Legionário", 30, 10); // 30, 10
                Enemy[3] = new Enemy("Sentinela Real", 50, 12); // 50, 12
                Enemy[4] = new Enemy("Alma das Cinzas", 100, 20); // 100, 20

                // Thread.sleep(3000);
                int userChoice = 0;
                int currentStage = 0;

                while (currentStage < Enemy.length) {
                        for (int i = 0; i < Enemy.length; i++) {
                                Global.printGlobalData();

                                System.out.println(
                                                "\n<<<<< Você se encontra atualmente no " + (currentStage + 1)
                                                                + "° Andar! >>>>>");
                                System.out.println(
                                                "\nVocê colidiu com o <" + Enemy[i].name
                                                                + "> e a batalha foi iniciada!");

                                System.out.println("\nHP do <" + Enemy[i].name + ">: " + Enemy[i].health);
                                System.out.println("Poder do <" + Enemy[i].name + ">: " + Enemy[i].damage);

                                while (Enemy[i].health > 0) {
                                        while (Global.usedCards < 3) {
                                                System.out.println(
                                                                "\nVocê possui as seguintes cartas em suas mãos: \n"
                                                                                + Hand);

                                                do {
                                                        System.out.print("\nEscolha a carta que deseja utilizar: ");
                                                        userChoice = in.nextInt();
                                                } while (userChoice < 0 || userChoice > Hand.currentHand() - 1);

                                                System.out.println("\nVocê utilizou a carta "
                                                                + Hand.chosenCard(userChoice).name + "!");
                                                System.out.println("\n" + Hand.chosenCard(userChoice).description);

                                                Hand.chosenCard(userChoice).useCard(userChoice, Global);

                                                Hand.useCard(userChoice, Global);
                                        }

                                        Global.printGlobalData();

                                        Enemy[i].health -= Global.totalDamage;

                                        if (Enemy[i].health <= 0) {
                                                System.out.println(
                                                                "\n[!] Você utilizou todas as cartas possíveis e golpeou o inimigo. ");

                                                System.out.println("\n[!] O <" + Enemy[i].name + "> sofreu ["
                                                                + Global.totalDamage + "] de dano!");

                                                if (Enemy[4].health <= 0) {
                                                        Global.score += Global.totalDamage * 1.5;

                                                        System.out.println("\nO espírito sombrio foi destruído!");

                                                        victoryAchieved(Global, currentStage);

                                                        System.exit(0);
                                                } else {
                                                        enemyDestroyed(Hand, Deck);

                                                        currentStage++;
                                                }

                                                Hand.fillHand(Deck);
                                        } else {
                                                System.out.println(
                                                                "\n[!] Você utilizou todas as cartas possíveis e golpeou o inimigo. ");

                                                System.out.println("\n[!] O <" + Enemy[i].name + "> sofreu [" +
                                                                Global.totalDamage
                                                                + "] de dano, mas ainda possui [" + Enemy[i].health
                                                                + "] de vida!");

                                                Global.playerHealth -= Enemy[i].damage;

                                                System.out.println("\nO <" + Enemy[i].name
                                                                + "> o ataca, causando ["
                                                                + Enemy[i].damage + "] de dano ao jogador!");

                                                System.out.println("\nVida (HP) do jogador: " + Global.playerHealth);

                                                Hand.fillHand(Deck);
                                        }

                                        Global.usedCards = 0;

                                        if (Global.playerHealth <= 0) {
                                                gameOver(Global, currentStage);
                                                break;
                                        }
                                }

                                if (Global.playerHealth <= 0) {
                                        gameOver(Global, currentStage);
                                        break;

                                }

                                Global.score += Global.totalDamage * 1.5;

                                System.out.println("\nScore atual: " + Global.score);
                        }

                        if (Global.playerHealth <= 0) {
                                gameOver(Global, currentStage);
                                break;
                        }
                }

                in.close();
        }
}
