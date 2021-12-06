import java.util.Scanner;

import global.Variables;
import mechanics.*;

public class Main {

        public static void welcomeToALonelyPlace() {
                System.out.println(
                                "\nAo acordar, você se depara perdido no primeiro andar de um lugar que parece uma masmorra... ");
                System.out.println(
                                "\nA única coisa que você sabe é que deve lutar para sobreviver e escapar desse pesadelo. ");
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
                                "\n[!] Ao explorar a masmorra, você se depara com um inimigo assustador e que parece fora desse mundo. ");

                System.out.println(
                                "\n[?] Você sente um ímpeto nostalgico em seu peito e isso te motiva a derrotar o inimigo. ");
        }

        public static void combatStart() {
                System.out.println("\n--------------------------");
                System.out.println("------ COMBAT START ------");
                System.out.println("--------------------------");
        }

        public static void enemyDestroyed(Hand Hand, Deck Deck) {
                System.out.println("\nO espírito sombrio foi destruido!");

                System.out.println(
                                "\n[!] Com o inimigo derrotado, uma escada que parece o levar para o próximo andar aparece como se fosse mágica...");

                System.out.println("\n[...] Carregando o novo andar, por favor aguarde...");

                Hand.fillHand(Deck);
        }

        public static void gameOver(Variables Global, int currentStage) {
                System.out.println(
                                "\n[!!!] O golpe do inimigo em seu peito reduziu seus últimos pontos de vida a zero...");

                System.out.println("\n[!] Você foi derrotado e chegou ao fim de sua aventura.");

                System.out.println("\n[!] O Game Master Boa sorte no seu próximo ciclo!");

                System.out.println("\nPlacar final: " + Global.score);

                Global.resetGlobalVariables();

                currentStage = 0;
        }

        public static void victoryAchieved(Variables Global, int currentStage) {
                System.out.println(
                                "\n[?] Ao derrotar o inimigo do quinto andar, um portal misterioso aparece em baixo de seus pés...");
                System.out.println(
                                "\n[!] Uma luz dourada e aconchegante emana do portal, como se estivesse dizendo que está tudo bem agora.");
                System.out.println("\nCarregando os créditos finais...");

                System.out.println(
                                "\nMuitos tentaram chegar até aqui, mas diferente de você, nenhum deles teve êxito.");

                System.out.println("\n[!] Parabéns, você enfrentou as adversidades e saiu vitorioso!");

                System.out.println("\nSeu placar final é: " + Global.score);

                currentStage = 0;
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
                                System.out.println(
                                                "\n<<<<< Você se encontra atualmente no " + (currentStage + 1)
                                                                + "° Andar! >>>>>");
                                System.out.println(
                                                "\nVocê colidiu com o " + Enemy[i].name
                                                                + " e a batalha foi iniciada!");

                                while (Enemy[i].health > 0) {
                                        while (Global.usedCards < 3) {

                                                System.out.println("\nMão: " + Hand);

                                                do {
                                                        System.out.print("\nEscolha a carta que deseja utilizar: ");
                                                        userChoice = in.nextInt();
                                                } while (userChoice < 0 || userChoice > Hand.currentHand() - 1);

                                                System.out.println("\nVocê utilizou a carta "
                                                                + Hand.chosenCard(userChoice).name + "!");
                                                System.out.println("\n" + Hand.chosenCard(userChoice).description);

                                                Hand.chosenCard(userChoice).useCard(Hand.chosenCard(userChoice).id,Global,userChoice,Hand);
                                                Global.printGlobalData();

                                        }

                                        Enemy[i].health -= Global.totalDamage;

                                        /*
                                         * if (Enemy[4].health <= 0) {
                                         * System.out.println("\nO espírito sombrio foi destruido!");
                                         * victoryAchieved(Global, currentStage);
                                         * break;
                                         * }
                                         */

                                        if (Enemy[i].health <= 0) {
                                                System.out.println(
                                                                "\n[!] Você utilizou todas as cartas que podia neste round, e atacou o inimigo. ");

                                                System.out.println("\n[!] O " + Enemy[i].name + " sofreu "
                                                                + Global.totalDamage + " de dano!");

                                                System.out.println("HP do inimigo: " + Enemy[i].health);

                                                if (Enemy[4].health <= 0) {
                                                        System.out.println("\nO espírito sombrio foi destruido!");
                                                        victoryAchieved(Global, currentStage);
                                                        System.exit();
                                                } else {
                                                        enemyDestroyed(Hand, Deck);
                                                        currentStage++;
                                                }
                                        } else {
                                                System.out.println(
                                                                "\n[!] Você utilizou todas as cartas que podia neste round, e atacou o inimigo. ");

                                                System.out.println("\n[!] O " + Enemy[i].name + " sofreu " +
                                                                Global.totalDamage
                                                                + " de dano!");

                                                System.out.println(
                                                                "\nO espírito sombrio sofreu dano, mas ainda possui "
                                                                                + Enemy[i].health
                                                                                + " de vida!");

                                                Global.playerHealth -= Enemy[i].damage;

                                                System.out.println("\nO " + Enemy[i].name
                                                                + " o ataca, causando "
                                                                + Enemy[i].damage + " de dano ao jogador!");

                                                System.out.println("\nHP do jogador: " + Global.playerHealth);

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
