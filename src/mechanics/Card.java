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
    }
  }

  /**
   * Retorna a carta utilizada
   * 
   * @param Global interfere diretamente nas variáveis globais, dependendo da
   *               carta
   * @return a carta utilizada pelo jogador
   */
  public void useCard(int id,Variables Global) {
    switch (this.id) {
      case 1:
         Curar(Global);
         break;
      case 2:
         Recrutar(Global);
         break;
      case 3:
         Reunir(Global);
         break;
      case 4:
         Sacrificar(Global);
         break;
      case 5:
         Treinar(Global);
         break;
    }
  }

  /**
   * Cartas comuns
   * 
   * @param Global interfere diretamente nas variáveis globais, dependendo da
   *               carta
   * @return novos valores das variáveis utilizadas
   */
  public void Curar(Variables Global) {
     Global.playerHealth += 5;
     Global.knightQuantity -= 3;
  }

  public void Recrutar(Variables Global) {
     Global.knightQuantity += 2;
  }

  private void Reunir(Variables Global) {
     Global.knightDamage += Global.totalDamage() + (double) Global.knightQuantity / 2;
  }

  public void Sacrificar(Variables Global) {
    Global.knightQuantity -= 2;
     Global.knightDamage += Global.knightDamage * 1;
  }

  public void Treinar(Variables Global) {
     Global.knightDamage++;
  }

}
