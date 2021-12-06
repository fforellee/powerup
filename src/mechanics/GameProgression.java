package mechanics;

import design.ConsoleColor;
import global.Variables;

public class GameProgression {

        public void welcomeToALonelyPlace(ConsoleColor Color) throws InterruptedException {
                System.out.println(Color.setColor("yellow",
                                "\n[?] Ao acordar, você se depara perdido e confuso em um lugar que parece um calabouço... "));

                Thread.sleep(3000);

                System.out.println(
                                "\n[!] A única coisa que você sabe é que deve lutar para sobreviver e escapar desse lugar abandonado pelos Deuses. ");

                Thread.sleep(3000);
        }

        public void gameStart(ConsoleColor Color) {

                System.out.println(Color.setColor("cyan", "\n------------------------------------------------"));
                System.out.println(Color.setColor("cyan", "------------------ GAME START ------------------"));
                System.out.println(Color.setColor("cyan", "------------------------------------------------"));
        }

        public void cardsHaveAppeared(ConsoleColor Color) throws InterruptedException {
                System.out.println("\n[!] Em suas mãos aparecem misteriosamente sete cartas mágicas.");

                Thread.sleep(3000);

                System.out.println(Color.setColor("purple",
                                "\n[!] Você consegue sentir que elas estão imbuídas com poderes inimagináveis."));

                Thread.sleep(3000);
        }

        public void newCardsHaveAppeared(ConsoleColor Color) throws InterruptedException {
                System.out.println("\n[!] Ao subir de andar, novas cartas surgem misteriosamente em suas mãos...");

                Thread.sleep(3000);

                System.out.println(Color.setColor("cyan",
                                "\n[?] Você sente uma espécie de déjà vu, mas decide ignorar essa sensação."));

                Thread.sleep(3000);
        }

        public void enemyHasBeenFound(ConsoleColor Color) throws InterruptedException {
                System.out.println(
                                "\n[!] Ao explorar o calabouço, você se depara com inimigos assustadores e sobrenaturais. ");

                Thread.sleep(3000);

                System.out.println(Color.setColor("red",
                                "\n[!] Você sente um ímpeto ardente como brasa em seu peito que o motiva a derrotar seus inimigos! "));

                Thread.sleep(3000);
        }

        public void enemyDestroyed(Hand Hand, Deck Deck, ConsoleColor Color) throws InterruptedException {
                System.out.println(Color.setColor("red", "\nO espírito sombrio foi destruído!"));

                Thread.sleep(3000);

                System.out.println(
                                "\n[!] Com o inimigo derrotado, uma escada que parece o levar para o próximo andar aparece como se fosse mágica...");

                Thread.sleep(3000);

                System.out.println(Color.setColor("yellow",
                                "\n[!] Sua determinação aumenta e o incendeia incandescentemente, como o Sol."));

                Thread.sleep(3000);

                System.out.println("\n[...] Carregando novo andar.");

                Thread.sleep(3000);
        }

        public void gameOver(Variables Global, ConsoleColor Color) throws InterruptedException {
                System.out.println("\n[...]");

                Thread.sleep(3000);

                System.out.println(Color.setColor("red",
                                "\n[X] O golpe do inimigo em seu peito reduziu seus últimos pontos de vida a zero..."));

                Thread.sleep(3000);

                System.out.println("\n[!] Você sucumbiu e chegou ao fim de sua aventura.");

                Thread.sleep(3000);

                System.out.println("\nO Game Master lhe deseja boa sorte em suas próximas tentativas!");

                Thread.sleep(3000);

                System.out.println(Color.setColor("green", "\nPontuação final: " + Global.score));
        }

        public void victoryAchieved(Variables Global, ConsoleColor Color) throws InterruptedException {
                System.out.println(Color.setColor("red", "\nO Senhor das Cinzas foi destruído!"));

                Thread.sleep(3000);

                System.out.println(
                                "\n[!] Ao derrotar o Senhor das Cinzas, um portal misterioso aparece embaixo de seus pés...");

                Thread.sleep(3000);

                System.out.println(Color.setColor("yellow",
                                "\n[?] Uma luz dourada e aconchegante emana do portal, como se estivesse lhe dizendo que está tudo bem agora."));

                Thread.sleep(3000);

                System.out.println(
                                "\nAo ser teleportado para fora do calabouço, você consegue ouvir uma voz lhe dizendo serenamente: ");

                Thread.sleep(3000);

                System.out.println(Color.setColor("cyan",
                                "\n<<< Muitos tentaram, mas diferente de você, nenhum deles foi capaz de chegar até aqui. Bom trabalho. >>>"));

                Thread.sleep(3000);

                System.out.println("\n[!] Você enfrentou as adversidades e saiu vitorioso!");

                Thread.sleep(3000);

                System.out.println(
                                "\nO Game Master olha nas profundezas de seus olhos e o parabeniza imensamente por jogar!");

                Thread.sleep(3000);

                System.out.println(Color.setColor("green", "\nPontuação final: " + Global.score));
        }
}