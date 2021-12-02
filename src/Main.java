
// import mechanics.Scoreboard;
import java.util.ArrayList;
import java.util.Random;
import global.Variables;
import mechanics.Card;
import mechanics.Deck;

public class Main {

        public static int fase_atual;
        public static int[] inimigos = new int[20];

        

    public static void main(String[] args) throws Exception {
        Variables Global = new Variables();
        Random random = new Random();
        int a=0;

        for(int i=0;i<inimigos.length;i++){
            a+=5*i;

            inimigos[i] = a;

            System.out.println("Valor de i "+i);
            System.out.println("Valor de inimigos "+inimigos[i]);
        }
        
          // A logica do jogo roda entorno de uma iteracao 
          // atraves de uma lista de fases;
         
         
        while(fase_atual<inimigos.length){

            System.out.println(inimigos[fase_atual]);
            fase_atual++;

        }
            //Printar placar, fim do jogo

    }
}
