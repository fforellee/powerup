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
        this.description = "[!] Aumenta o dano total do jogador!";
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

  public void useCard(int id, Variables Global) {
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

  public void Curar(Variables Global) {
    if (Global.knightQuantity >= 4) {
      Global.playerHealth += 5;
      Global.knightQuantity -= 1;
    } else {
      System.out.println("\n[!] A carta não pôde ser usada, o número de cavaleiros é muito baixo.");
    }
  }

  public void Recrutar(Variables Global) {
    Global.knightQuantity += 2;
  }

  private void Reunir(Variables Global) {
    Global.totalDamage += Global.knightDamage + (Global.knightQuantity / 2);
  }

  public void Sacrificar(Variables Global) {
    if (Global.knightQuantity >= 3) {
      Global.knightQuantity -= 2;
      Global.knightDamage += Global.knightDamage * 1;
    } else {
      System.out.println("\n[!] A carta não pôde ser usada, o número de cavaleiros é muito baixo.");
    }
  }

  public void Treinar(Variables Global) {
    Global.knightDamage++;
  }

}
