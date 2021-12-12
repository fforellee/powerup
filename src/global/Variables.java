package global;

import design.ConsoleColor;

public class Variables {

  public int score = 0;
  public int playerHealth = 50;
  public int knightQuantity = 5;
  public int knightPower = 1;
  public int usedCards = 0;
  public int finalDamage = knightQuantity * knightPower;

  ConsoleColor Color = new ConsoleColor();

  public void showGlobalData() {
    System.out.println("\n----------- Informações do jogador -----------");
    System.out.println(Color.setColor("red", "Vida: " + playerHealth));
    System.out.println(Color.setColor("cyan", "Quantidade de cavaleiros: " + knightQuantity));
    System.out.println(Color.setColor("purple", "Poder de cada cavaleiro: " + knightPower));
    System.out.println(Color.setColor("green", "Poder final: " + finalDamage));
    System.out.println("----------------------------------------------");
  }

  public void computeFinalDamage() {
    finalDamage = knightQuantity * knightPower;
  }
}
