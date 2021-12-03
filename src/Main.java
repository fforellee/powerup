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

                String acao;


                Enemy[] inimigos = new Enemy[5]; // One to rule them all

                // for(int i=0;i<inimigos.length;i++){
                //     inimigos[i] = new Enemy(12,12);
                // }
               
                int fase_atual = 1;

                System.out.println( "\nAo acordar, você se depara perdido no primeiro andar de um lugar que parece uma masmorra...");
                System.out.println( "\nA única coisa que você sabe é que deve lutar para sobreviver e escapar desse pesadelo!");

                Thread.sleep(3000); 

                System.out.println("\n[!] Em suas mãos aparecem misteriosamente sete cartas mágicas.");
                System.out.println("\nVocê consegue sentir que elas estão imbuídas com poderes inimagináveis...");

                Thread.sleep(3000); 

                while(fase_atual <= 1){
                    System.out.println("\n--------------- GAME START -----------------");
                    System.out.println("Você se encontra no " +fase_atual+ "° Andar!");

                    // switch acao{
                    //     case 1:
                    //         Hand.useCard(i,Global);
                    //         break;
                    // }
                    //Acoes: Atacar, usar ate 3 cartas
                    // Calcula o dano
                    // Decrementa da vida do espirito sombrio

                        // inimigo.vida -= sofreDano();

                    //Acao do inimigo
                    // Calcula o dano
                    // Decrementa da vida do jogador
                    
                        // vida -= inimigo.atacar();
                    
                        
                    //Morre ou mata, se vida do inimigo=0 proxima fase, se vida do jogador=0 GAME OVER

                    fase_atual++;
                }

        }
}
