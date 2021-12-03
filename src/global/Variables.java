package global;

import mechanics.Stage;

public class Variables {

  public int score = 0;
  public int playerHealth = 30;
  public int enemyHealth = 0;
  public int knightQuantity = 5;
  public int knightDamage = 1;
  public int usedCards = 0;

  /**
   * Retorna o dano total dos cavaleiros
   * @return
   */
  public int totalDamage() {
    return knightQuantity * knightDamage;
  }
/**
 * Retorna o HP do inimigo
 * @return
 */
  public int enemyHealth() {
    return enemyHealth;
  }

  /**
   * Aumenta o HP do inimigo baseado no andar que ele se encontra
   */
  public void increaseEnemyHealth() {
    Stage Stage = new Stage();
    int stage = Stage.currentStage();

  }

}
