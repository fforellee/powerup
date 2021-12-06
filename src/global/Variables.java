package global;

public class Variables {

  public int score = 0;
  public int playerHealth = 30;
  public int knightQuantity = 5;
  public int knightDamage = 1;
  public int usedCards = 0;
  public int totalDamage = knightQuantity * knightDamage;

  public void printGlobalData() {
    System.out.println("\n----------- Informações do jogador -----------");
    System.out.println("Vida (HP): " + playerHealth);
    System.out.println("Quantidade de cavaleiros: " + knightQuantity);
    System.out.println("Dano de cada cavaleiro: " + knightDamage);
    System.out.println("Dano final: " + totalDamage);
    System.out.println("----------------------------------------------");
  }

  public void computeTotalDamage() {
    totalDamage = knightQuantity * knightDamage;
  }

}
