package mechanics;

import global.Variables;
import design.ConsoleColor;

public class Card {
  ConsoleColor Color = new ConsoleColor();

  public int id;
  public String name;
  public String description;

  public Card(int id) {
    this.id = id;

    switch (id) {
      case 1:
        this.name = Color.setColor("yellow", "Curar");
        this.description = Color.setColor("yellow", "[!] Cura 5 pontos de vida, mas elimina 1 cavaleiro. ");
        break;
      case 2:
        this.name = Color.setColor("cyan", "Recrutar");
        this.description = Color.setColor("cyan", "[!] Aumenta em 2 a quantidade total de cavaleiros. ");
        break;
      case 3:
        this.name = Color.setColor("purple", "Reunir");
        this.description = Color.setColor("purple",
            "[!] Aumenta o poder de cada cavaleiro baseado na quantidade total. ");
        break;
      case 4:
        this.name = Color.setColor("red", "Sacrificar");
        this.description = Color.setColor("red",
            "[!] Sacrifica 2 cavaleiros, mas aumenta em 1 ponto o poder de cada cavaleiro remanescente. ");
        break;
      case 5:
        this.name = Color.setColor("green", "Treinar");
        this.description = Color.setColor("green", "[!] Aumenta em 1 ponto o poder de cada cavaleiro. ");
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
      System.out
          .println(Color.setColor("blue", "\n[?] A carta desapareceu de suas mãos ao utilizá-la, mas nada aconteceu."));
    }
    Global.computeTotalDamage();
  }

  public void Recrutar(Variables Global) {
    Global.knightQuantity += 2;
    Global.computeTotalDamage();
  }

  private void Reunir(Variables Global) {
    Global.knightDamage += (Global.knightQuantity / 3);
    Global.computeTotalDamage();
  }

  public void Sacrificar(Variables Global) {
    if (Global.knightQuantity >= 3) {
      Global.knightQuantity -= 2;
      Global.knightDamage += Global.knightDamage * 1;
    } else {
      System.out
          .println(Color.setColor("blue", "\n[?] A carta desapareceu de suas mãos ao utilizá-la, mas nada aconteceu."));
      Global.computeTotalDamage();
    }
  }

  public void Treinar(Variables Global) {
    Global.knightDamage++;
    Global.computeTotalDamage();
  }

}
