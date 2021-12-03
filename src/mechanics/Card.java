package mechanics;

import global.Variables;

public class Card {

  public int id;
  public String name;
  public String description;

  public Card(int id) {
    this.id = id;

    switch (id) {
      case 1:
        this.name = "Curar";
        this.description = "[!] Cura 5 pontos da vida do jogador, mas elimina 3 de seus cavaleiros!";
        break;
      case 2:
        this.name = "Recrutar";
        this.description = "[!] Aumenta em 2 a quantidade total de cavaleiros do jogador!";
        break;
      case 3:
        this.name = "Reunir";
        this.description = "[!] Aumenta o dano total dos cavaleiros do jogador!";
        break;
      case 4:
        this.name = "Sacrificar";
        this.description = "[!] Sacrifica 2 cavaleiros, mas aumenta em 1 o dano de cada cavaleiro do jogador!";
        break;
      case 5:
        this.name = "Treinar";
        this.description = "[!] Aumenta em 1 ponto o dano de cada cavaleiro do jogador!";
        break;
    }
  }

  /**
   * Retorna a carta utilizada
   * 
   * @param Global interfere diretamente nas variáveis globais, dependendo da
   *               carta
   * @return a carta utilizada pelo jogador
   */

  /* public Object useCard(Variables Global) {
    switch (this.id) {
      case 1:
        return Curar(Global);
      case 2:
        return Recrutar(Global);
      case 3:
        return Reunir(Global);
      case 4:
        return Sacrificar(Global);
      case 5:
        return Treinar(Global);
    }
    return null;
  } */

  /**
   * Cartas comuns
   * 
   * @param Global interfere diretamente nas variáveis globais, dependendo da
   *               carta
   * @return novos valores das variáveis utilizadas
   */
  public Object Curar(Variables Global) {
    Global.playerHealth += 5;
    return Global.knightQuantity -= 3;
  }

  public Object Recrutar(Variables Global) {
    return Global.knightQuantity += 2;
  }

  public Object Reunir(Variables Global) {
    return Global.knightDamage += Global.totalDamage + (double) Global.knightQuantity / 2;
  }

  public Object Sacrificar(Variables Global) {
    Global.knightQuantity -= 2;
    return Global.knightDamage += Global.knightDamage * 1;
  }

  public Object Treinar(Variables Global) {
    return Global.knightDamage++;
  }
}