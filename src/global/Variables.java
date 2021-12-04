package global;

import mechanics.Stage;

public class Variables {

  public int score = 0;
  public static int playerHealth = 30;
  public int knightQuantity = 5;
  public int knightDamage = 1;
  public int usedCards = 0;

  /**
   * Retorna o dano total dos cavaleiros
   * @return
   */
  public int totalDamage() {
    return this.knightQuantity * this.knightDamage;
  }
/**
 * Retorna o HP do inimigo
 * @return
 */
  public void print(){
        System.out.println("Vida "+this.playerHealth);
        System.out.println("Quantidade de cavaleiros "+this.knightQuantity);
        System.out.println("Dano total"+this.knightDamage);
  }
}
