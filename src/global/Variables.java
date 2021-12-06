package global;

public class Variables {

  public int score = 0;
  public int playerHealth = 30;
  public int knightQuantity = 5;
  public int knightDamage = 1;
  public int usedCards = 0;
  public int totalDamage = 0;

  public void printGlobalData() {
    System.out.println("\nHP do jogador = " + playerHealth);
    System.out.println("Qtd de cavaleiros = " + knightQuantity);
    System.out.println("Dano de cada cavaleiro = " + knightDamage);
    System.out.println("Dano total = " + totalDamage);
    System.out.println("Used cards = " + usedCards);
  }

  public void computeTotalDamage(){
    this.totalDamage = this.knightQuantity * this.knightDamage;
  }

}
