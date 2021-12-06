import java.util.Scanner;

import design.ConsoleColor;
import design.Screen;
import global.Variables;
import mechanics.*;

public class Main {

        public static void main(String[] args) throws InterruptedException {

                Scanner in = new Scanner(System.in);

                ConsoleColor Color = new ConsoleColor();
                Screen Screen = new Screen();

                Variables Global = new Variables();
                Deck Deck = new Deck();
                Hand Hand = new Hand(Deck);
                GameProgression Progression = new GameProgression();

                int currentStage = 0;
                int userChoice = 0;

                Enemy[] Enemy = new Enemy[5];

                Enemy[0] = new Enemy("Morto-vivo", 5, 5);
                Enemy[1] = new Enemy("Espectro da Escuridão", 30, 10);
                Enemy[2] = new Enemy("Cavaleiro Legionário", 50, 15);
                Enemy[3] = new Enemy("Sentinela Real", 100, 20);
                Enemy[4] = new Enemy("Alma das Cinzas", 200, 40);

                Screen.gameStartup();

                Progression.welcomeToALonelyPlace(Color);
                Progression.gameStart(Color);
                Progression.cardsHaveAppeared(Color);

                while (currentStage < Enemy.length) {
                        for (int i = 0; i < Enemy.length; i++) {
                                Global.printGlobalData();

                                System.out.println(
                                                "\n<<< Você se encontra atualmente no " + (currentStage + 1)
                                                                + "° Andar >>>");
                                Thread.sleep(3000);

                                if (Enemy[i].equals(Enemy[0])) {
                                        Progression.enemyHasBeenFound(Color);
                                }

                                System.out.println("\nVocê colidiu com o <" + Enemy[i].name
                                                + "> e a batalha foi iniciada!");

                                System.out.println(Color.setColor("red",
                                                "\nVida do <" + Enemy[i].name + ">: " + Enemy[i].health));
                                System.out.println(Color.setColor("green",
                                                "Poder do <" + Enemy[i].name + ">: " + Enemy[i].damage));

                                Thread.sleep(3000);

                                while (Enemy[i].health > 0) {
                                        while (Global.usedCards < 3) {
                                                System.out.println(
                                                                "\nVocê possui as seguintes cartas em suas mãos: \n"
                                                                                + Hand);

                                                do {
                                                        System.out.print("\nEscolha a carta que deseja utilizar: ");
                                                        userChoice = in.nextInt();

                                                        if (userChoice < 0 || userChoice > Hand.currentHand() - 1) {
                                                                System.out.println(
                                                                                "\n[!] Você tentou utilizar uma carta inválida, mas algo o impediu.");
                                                        }
                                                } while (userChoice < 0 || userChoice > Hand.currentHand() - 1);

                                                System.out.println("\nVocê utilizou a carta "
                                                                + Hand.chosenCard(userChoice).name + "!");
                                                System.out.println("\n" + Hand.chosenCard(userChoice).description);

                                                Hand.chosenCard(userChoice).useCard(userChoice, Global);

                                                Hand.useCard(userChoice, Global);

                                                Thread.sleep(1000);
                                        }

                                        Global.printGlobalData();

                                        Enemy[i].health -= Global.totalDamage;

                                        if (Enemy[i].health <= 0) {
                                                System.out.println(
                                                                "\n[!] Você utilizou todas as cartas possíveis e seus cavaleiros golpearam o inimigo.");

                                                Thread.sleep(3000);

                                                System.out.println("\n[!] O <" + Enemy[i].name + "> sofreu ["
                                                                + Global.totalDamage + "] de dano!");

                                                Thread.sleep(3000);

                                                if (Enemy[4].health <= 0) {
                                                        Global.score += Global.totalDamage * 1.5;

                                                        Progression.victoryAchieved(Global, Color);
                                                        Screen.gameCredits();
                                                        System.exit(0);
                                                } else {
                                                        if (currentStage == 0) {
                                                                Progression.enemyDestroyed(Hand, Deck, Color);
                                                        } else {
                                                                System.out.println(Color.setColor("red",
                                                                                "\nO espírito sombrio foi destruído!"));

                                                                Thread.sleep(3000);

                                                                System.out.println("\n[...] Carregando novo andar.");

                                                                Thread.sleep(2000);
                                                        }
                                                        currentStage++;
                                                }

                                                Hand.fillHand(Deck);
                                        } else {
                                                System.out.println(
                                                                "\n[!] Você utilizou todas as cartas possíveis e seus cavaleiros golpearam o inimigo. ");

                                                Thread.sleep(3000);

                                                System.out.println("\n[!] O <" + Enemy[i].name + "> sofreu [" +
                                                                Global.totalDamage
                                                                + "] de dano, mas ainda possui [" + Enemy[i].health
                                                                + "] de vida!");

                                                Thread.sleep(3000);

                                                Global.playerHealth -= Enemy[i].damage;

                                                System.out.println(Color.setColor("yellow", "\n[!] O <" + Enemy[i].name
                                                                + "> o ataca, causando ["
                                                                + Enemy[i].damage + "] de dano ao jogador!"));

                                                Thread.sleep(3000);

                                                if (Global.playerHealth > 0) {
                                                        System.out.println(Color.setColor("red",
                                                                        "\nVida atual: " + Global.playerHealth));
                                                }

                                                Hand.fillHand(Deck);
                                        }

                                        Global.usedCards = 0;

                                        if (Global.playerHealth <= 0) {
                                                Progression.gameOver(Global, Color);
                                                System.exit(0);
                                        }
                                }

                                if (Global.playerHealth <= 0) {
                                        Progression.gameOver(Global, Color);
                                        System.exit(0);

                                }

                                Global.score += Global.totalDamage * 1.5;

                                System.out.println(Color.setColor("green", "\nPontuação atual: " + Global.score));

                                Thread.sleep(3000);

                                if (currentStage == 1) {
                                        Progression.newCardsHaveAppeared(Color);
                                }

                        }

                        if (Global.playerHealth <= 0) {
                                Progression.gameOver(Global, Color);
                                System.exit(0);
                        }
                }

                in.close();
        }
}
