package global;

import mechanics.Stage;

public class Variables {

  public int score = 0;
  public int playerHealth = 30;
  public int knightQuantity = 5;
  public int knightDamage = 1;
  public int usedCards = 0;
  public int totalDamage = knightQuantity * knightDamage;


  public void printar() {
    System.out.println("\nHP = " + this.playerHealth);
    System.out.println("Qtd Cavaleiros = " + this.knightQuantity);
    System.out.println("Dano Único Cavaleiros = " + this.knightDamage);
    System.out.println("Dano Total Cavaleiros = " + this.totalDamage);
  }
}
