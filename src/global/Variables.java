package global;

import design.ConsoleColor;

public class Variables {

  public int score = 0;
  public int playerHealth = 50;
  public int knightQuantity = 5;
  public int knightDamage = 1;
  public int usedCards = 0;
  public int totalDamage = knightQuantity * knightDamage;

  ConsoleColor Color = new ConsoleColor();

  public void showGlobalData() {
    System.out.println("\n----------- Informações do jogador -----------");
    System.out.println(Color.setColor("red", "Vida: " + playerHealth));
    System.out.println(Color.setColor("cyan", "Quantidade de cavaleiros: " + knightQuantity));
    System.out.println(Color.setColor("purple", "Poder de cada cavaleiro: " + knightDamage));
    System.out.println(Color.setColor("green", "Poder final: " + totalDamage));
    System.out.println("----------------------------------------------");
  }

  public void computeTotalDamage() {
    totalDamage = knightQuantity * knightDamage;
  }
}
