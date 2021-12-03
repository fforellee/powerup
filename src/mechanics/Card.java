package mechanics;

import global.Variables;

public class Card {

  public int id;
  public String nome;
  public String descricao;

  public Card(int id) {
    this.id = id;

    switch (id) {
      case 1:
        this.nome = "Curar";
        this.descricao = "[!] Cura 5 pontos da vida do jogador, mas elimina 3 de seus cavaleiros!";
        break;
      case 2:
        this.nome = "Recrutar";
        this.descricao = "[!] Aumenta em 2 a quantidade total de cavaleiros do jogador!";
        break;
      case 3:
        this.nome = "Reunir";
        this.descricao = "[!] Aumenta o dano total dos cavaleiros do jogador!";
        break;
      case 4:
        this.nome = "Sacrificar";
        this.descricao = "[!] Sacrifica 2 cavaleiros, mas aumenta em 1 o dano de cada cavaleiro do jogador!";
        break;
      case 5:
        this.nome = "Treinar";
        this.descricao = "[!] Aumenta em 1 ponto o dano de cada cavaleiro do jogador!";
        break;
      case 6:
        this.nome = "Atacar";
        this.descricao = "[!] Ataca e inflige dano aos pontos de vida do inimigo!";
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
  public Object useCard(Variables Global) {
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
      case 6:
        return Atacar(Global);
    }
    return null;
  }

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

  private Object Reunir(Variables Global) {
    return Global.knightDamage += Global.totalDamage() + (double) Global.knightQuantity / 2;
  }

  public Object Sacrificar(Variables Global) {
    Global.knightQuantity -= 2;
    return Global.knightDamage += Global.knightDamage * 1;
  }

  public Object Treinar(Variables Global) {
    return Global.knightDamage++;
  }

  public Object Atacar(Variables Global) {
    return Global.totalDamage() - Global.enemyHealth();
  }
}