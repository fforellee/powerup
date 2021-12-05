package global;

public class Variables {

  public int score = 0;
  public int playerHealth = 30;
  public int knightQuantity = 5;
  public int knightDamage = 1;
  public int usedCards = 0;

  // O DANO TOTAL DOS CAVALEIROS NÃO ESTA SENDO ATUALIZADO QUANDO USA UMA CARTA
  public int totalDamage = knightDamage * knightQuantity;

  public void printGlobalData() {
    System.out.println("\nHP do jogador = " + playerHealth);
    System.out.println("Qtd de cavaleiros = " + knightQuantity);
    System.out.println("Dano de cada cavaleiro = " + knightDamage);
    System.out.println("Dano total = " + totalDamage);
  }

}
